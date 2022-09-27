package cc.buckler.dnf.service;

import cc.buckler.dnf.pojo.HoutaiItem;

import java.util.List;

public interface IHoutaiItem {
    void createItemTable();

    int addItem(HoutaiItem houtaiItem);

    List<HoutaiItem> findAllItem();
}
