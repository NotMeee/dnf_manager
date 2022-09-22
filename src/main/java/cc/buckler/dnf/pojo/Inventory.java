package cc.buckler.dnf.pojo;

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

    public Integer getCharacNo() {
        return characNo;
    }

    public void setCharacNo(Integer characNo) {
        this.characNo = characNo;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Integer getPayCoin() {
        return payCoin;
    }

    public void setPayCoin(Integer payCoin) {
        this.payCoin = payCoin;
    }

    public Integer getEventCoin() {
        return eventCoin;
    }

    public void setEventCoin(Integer eventCoin) {
        this.eventCoin = eventCoin;
    }

    public Byte getCreatureFlag() {
        return creatureFlag;
    }

    public void setCreatureFlag(Byte creatureFlag) {
        this.creatureFlag = creatureFlag;
    }

    public Integer getInventoryCapacity() {
        return inventoryCapacity;
    }

    public void setInventoryCapacity(Integer inventoryCapacity) {
        this.inventoryCapacity = inventoryCapacity;
    }

    public Integer getAvatarCoin() {
        return avatarCoin;
    }

    public void setAvatarCoin(Integer avatarCoin) {
        this.avatarCoin = avatarCoin;
    }

    public byte[] getInventory() {
        return inventory;
    }

    public void setInventory(byte[] inventory) {
        this.inventory = inventory;
    }

    public byte[] getEquipslot() {
        return equipslot;
    }

    public void setEquipslot(byte[] equipslot) {
        this.equipslot = equipslot;
    }

    public byte[] getCreature() {
        return creature;
    }

    public void setCreature(byte[] creature) {
        this.creature = creature;
    }

    public byte[] getKatagaki() {
        return katagaki;
    }

    public void setKatagaki(byte[] katagaki) {
        this.katagaki = katagaki;
    }
}