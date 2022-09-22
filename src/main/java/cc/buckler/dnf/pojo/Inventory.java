package cc.buckler.dnf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
    private Integer characNo;

    private Integer money;

    private Integer coin;

    private Integer payCoin;

    private Integer eventCoin;

    private Byte creatureFlag;

    private Integer inventoryCapacity;

    private Integer avatarCoin;

    private byte[] inventory;

    private byte[] equipslot;

    private byte[] creature;

    private byte[] katagaki;
}