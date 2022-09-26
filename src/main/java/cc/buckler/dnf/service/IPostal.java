package cc.buckler.dnf.service;

import cc.buckler.dnf.pojo.Postal;

/**
 * @Author: buckler
 * @Date: 2022/9/25 13:50
 * @Describe:
 */
public interface IPostal {
    int delPostal(int receiveCharacNo);

    int sendMail(Postal postal);

    int letterId();
}
