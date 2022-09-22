package cc.buckler.dnf.pojo;

import java.util.Date;

public class UserItems {
    private Integer uiId;

    private Integer characNo;

    private Integer slot;

    private Integer itId;

    private Date expireDate;

    private Byte obtainFrom;

    private Date regDate;

    private String ipgAgencyNo;

    private Byte abilityNo;

    private Byte stat;

    private Integer clearAvatarId;

    private Byte itemLockKey;

    private String toIpgAgencyNo;

    private Date mTime;

    private Short hiddenOption;

    private Short emblemEndurance;

    private Integer color1;

    private Integer color2;

    private Integer tradeRestrict;

    private byte[] jewelSocket;

    public Integer getUiId() {
        return uiId;
    }

    public void setUiId(Integer uiId) {
        this.uiId = uiId;
    }

    public Integer getCharacNo() {
        return characNo;
    }

    public void setCharacNo(Integer characNo) {
        this.characNo = characNo;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Integer getItId() {
        return itId;
    }

    public void setItId(Integer itId) {
        this.itId = itId;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Byte getObtainFrom() {
        return obtainFrom;
    }

    public void setObtainFrom(Byte obtainFrom) {
        this.obtainFrom = obtainFrom;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getIpgAgencyNo() {
        return ipgAgencyNo;
    }

    public void setIpgAgencyNo(String ipgAgencyNo) {
        this.ipgAgencyNo = ipgAgencyNo == null ? null : ipgAgencyNo.trim();
    }

    public Byte getAbilityNo() {
        return abilityNo;
    }

    public void setAbilityNo(Byte abilityNo) {
        this.abilityNo = abilityNo;
    }

    public Byte getStat() {
        return stat;
    }

    public void setStat(Byte stat) {
        this.stat = stat;
    }

    public Integer getClearAvatarId() {
        return clearAvatarId;
    }

    public void setClearAvatarId(Integer clearAvatarId) {
        this.clearAvatarId = clearAvatarId;
    }

    public Byte getItemLockKey() {
        return itemLockKey;
    }

    public void setItemLockKey(Byte itemLockKey) {
        this.itemLockKey = itemLockKey;
    }

    public String getToIpgAgencyNo() {
        return toIpgAgencyNo;
    }

    public void setToIpgAgencyNo(String toIpgAgencyNo) {
        this.toIpgAgencyNo = toIpgAgencyNo == null ? null : toIpgAgencyNo.trim();
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }

    public Short getHiddenOption() {
        return hiddenOption;
    }

    public void setHiddenOption(Short hiddenOption) {
        this.hiddenOption = hiddenOption;
    }

    public Short getEmblemEndurance() {
        return emblemEndurance;
    }

    public void setEmblemEndurance(Short emblemEndurance) {
        this.emblemEndurance = emblemEndurance;
    }

    public Integer getColor1() {
        return color1;
    }

    public void setColor1(Integer color1) {
        this.color1 = color1;
    }

    public Integer getColor2() {
        return color2;
    }

    public void setColor2(Integer color2) {
        this.color2 = color2;
    }

    public Integer getTradeRestrict() {
        return tradeRestrict;
    }

    public void setTradeRestrict(Integer tradeRestrict) {
        this.tradeRestrict = tradeRestrict;
    }

    public byte[] getJewelSocket() {
        return jewelSocket;
    }

    public void setJewelSocket(byte[] jewelSocket) {
        this.jewelSocket = jewelSocket;
    }
}