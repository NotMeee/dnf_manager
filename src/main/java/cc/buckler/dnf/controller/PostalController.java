package cc.buckler.dnf.controller;

import cc.buckler.dnf.pojo.HoutaiItem;
import cc.buckler.dnf.pojo.Postal;
import cc.buckler.dnf.service.IHoutaiItem;
import cc.buckler.dnf.service.IPostal;
import cc.buckler.dnf.utils.CharSetUtil;
import cc.buckler.dnf.utils.result.HttpResult;
import cc.buckler.dnf.utils.result.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: buckler
 * @Date: 2022/9/25 14:03
 * @Describe:
 */
@RestController
@Slf4j
public class PostalController {
    @Autowired
    private IPostal iPostal;
    @Autowired
    private IHoutaiItem iHoutaiItem;

    /**
     * 删除邮件
     *
     * @param characNo 角色ID
     * @return
     */
    @GetMapping("/postal/delete")
    public HttpResult delPostal(int characNo) {
        int result = iPostal.delPostal(characNo);
        if (result >= 0) {
            log.info(String.format("角色ID【%d】邮件已清理", characNo));
            return HttpResult.success(1);
        } else {
            return HttpResult.failure(ResultCodeEnum.CASH_ERROR);
        }
    }

    /**
     * 获取物品列表
     *
     * @return 物品列表
     */
    @GetMapping("/postal/itemlist")
    public HttpResult itemList(int range) {
        List<HoutaiItem> list = iHoutaiItem.findItemByLimit(range);
        return HttpResult.success(list);
    }

    @GetMapping("/postal/search")
    public HttpResult itemSerach(String keyword) {
        List<HoutaiItem> list = iHoutaiItem.itemSearch(keyword);
        return HttpResult.success(list);
    }

    /**
     * @param characNo        角色ID
     * @param amplifyOption   是否红字 0-无，1-体力，2-精神，3-力量，4-智力
     * @param amplifyValue    附加值
     * @param seperateUpgrade 锻造等级
     * @param sealFlag        是否封装 0-无，1-封装
     * @param itemId          物品ID
     * @param num             数量
     * @param upgrade         强化等级
     * @return
     */
    @GetMapping("/postal/send")
    public HttpResult sendPostal(int characNo, byte amplifyOption, int amplifyValue, byte seperateUpgrade, byte sealFlag, int itemId, int num, byte upgrade) {
        Postal postal = new Postal();
        // 日期
        postal.setOccTime(new Date());
        // 发送人
        postal.setSendCharacName("GM");
        // 角色ID
        postal.setReceiveCharacNo(characNo);
        // 是否红字
        postal.setAmplifyOption(amplifyOption);
        // 附加值
        postal.setAmplifyValue(amplifyValue);
        // 锻造等级
        postal.setSeperateUpgrade(seperateUpgrade);
        // 是否封装
        postal.setSealFlag(sealFlag);
        // 物品ID
        postal.setItemId(itemId);
        // 数量
        postal.setAddInfo(num);
        // 强化等级
        postal.setUpgrade(upgrade);
        // 金币数量
        postal.setGold(0);
        // 最后的letter_id
        postal.setLetterId(iPostal.letterId() + 1);
        int result = iPostal.sendMail(postal);
        if (result == 1) {
            return HttpResult.success(result);
        } else {
            return HttpResult.failure(ResultCodeEnum.NOT_FOUND);
        }
    }

    /**
     * 上传道具，会覆盖
     *
     * @param file PVF导出的道具txt，格式为 name----code
     * @return
     */
    @PostMapping("/postal/upload/item")
    public HttpResult uploadItem(MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                // local
                String path = ResourceUtils.getFile("/Users/buckler/Documents/JavaProject/dnf_manager").getPath();
                // linux
                // String path = ResourceUtils.getFile("/root").getPath();
                String fileName = file.getOriginalFilename();
                File uploadFile = new File(path, fileName);
                file.transferTo(uploadFile);
                iHoutaiItem.createItemTable();
                readFile(path + "/" + fileName);
                return HttpResult.success(1);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return HttpResult.failure(ResultCodeEnum.SERVER_ERROR);
    }

    /**
     * 读取TXT文件，并将信息添加到数据库中
     *
     * @param path 文件路径
     */
    private void readFile(String path) {
        String pathname = path; // 绝对路径或相对路径都可以，写入文件时演示相对路径,读取以上路径的input.txt文件
        //防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw;
        //不关闭文件会导致资源的泄露，读写文件都同理
        //Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
        try (FileReader reader = new FileReader(pathname); BufferedReader br = new BufferedReader(reader)) {// 建立一个对象，它把文件内容转成计算机能读懂的语言
            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
//                System.out.println(line);
                try {
                    String itemName = line.split("----")[0];
                    String itemCode = line.split("----")[1];
                    HoutaiItem item = new HoutaiItem();
                    item.setItemcode(itemCode);
                    item.setItemname(itemName);
                    iHoutaiItem.addItem(item);
                } catch (ArrayIndexOutOfBoundsException e) {
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
