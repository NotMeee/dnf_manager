package cc.buckler.dnf.pojo;

import java.util.Date;

public class CharacInfo {
    private Integer characNo;

    private Integer mId;

    private String characName;

    private Byte village;

    private Byte job;

    private Byte lev;

    private Integer exp;

    private Byte growType;

    private Byte hp;

    private Short maxhp;

    private Short maxmp;

    private Short phyAttack;

    private Short phyDefense;

    private Short magAttack;

    private Short magDefense;

    private Integer invenWeight;

    private Short hpRegen;

    private Short mpRegen;

    private Short moveSpeed;

    private Short attackSpeed;

    private Short castSpeed;

    private Short hitRecovery;

    private Short jump;

    private Integer characWeight;

    private Short fatigue;

    private Short maxFatigue;

    private Short premiumFatigue;

    private Short maxPremiumFatigue;

    private Date createTime;

    private Date lastPlayTime;

    private Integer dungeonClearPoint;

    private Date deleteTime;

    private Byte deleteFlag;

    private Integer guildId;

    private Byte guildRight;

    private Byte memberFlag;

    private Byte sex;

    private Byte expertJob;

    private Byte skillTreeIndex;

    private Integer linkCharacNo;

    private Byte eventCharacLevel;

    private Byte guildSecede;

    private Integer startTime;

    private Integer finishTime;

    private Byte competitionArea;

    private Byte competitionPeriod;

    private Integer mercenaryStartTime;

    private Integer mercenaryFinishTime;

    private Byte mercenaryArea;

    private Byte mercenaryPeriod;

    private String vip;

    private byte[] elementResist;

    private byte[] specProperty;

    public Integer getCharacNo() {
        return characNo;
    }

    public void setCharacNo(Integer characNo) {
        this.characNo = characNo;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getCharacName() {
        return characName;
    }

    public void setCharacName(String characName) {
        this.characName = characName == null ? null : characName.trim();
    }

    public Byte getVillage() {
        return village;
    }

    public void setVillage(Byte village) {
        this.village = village;
    }

    public Byte getJob() {
        return job;
    }

    public void setJob(Byte job) {
        this.job = job;
    }

    public Byte getLev() {
        return lev;
    }

    public void setLev(Byte lev) {
        this.lev = lev;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Byte getGrowType() {
        return growType;
    }

    public void setGrowType(Byte growType) {
        this.growType = growType;
    }

    public Byte getHp() {
        return hp;
    }

    public void setHp(Byte hp) {
        this.hp = hp;
    }

    public Short getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(Short maxhp) {
        this.maxhp = maxhp;
    }

    public Short getMaxmp() {
        return maxmp;
    }

    public void setMaxmp(Short maxmp) {
        this.maxmp = maxmp;
    }

    public Short getPhyAttack() {
        return phyAttack;
    }

    public void setPhyAttack(Short phyAttack) {
        this.phyAttack = phyAttack;
    }

    public Short getPhyDefense() {
        return phyDefense;
    }

    public void setPhyDefense(Short phyDefense) {
        this.phyDefense = phyDefense;
    }

    public Short getMagAttack() {
        return magAttack;
    }

    public void setMagAttack(Short magAttack) {
        this.magAttack = magAttack;
    }

    public Short getMagDefense() {
        return magDefense;
    }

    public void setMagDefense(Short magDefense) {
        this.magDefense = magDefense;
    }

    public Integer getInvenWeight() {
        return invenWeight;
    }

    public void setInvenWeight(Integer invenWeight) {
        this.invenWeight = invenWeight;
    }

    public Short getHpRegen() {
        return hpRegen;
    }

    public void setHpRegen(Short hpRegen) {
        this.hpRegen = hpRegen;
    }

    public Short getMpRegen() {
        return mpRegen;
    }

    public void setMpRegen(Short mpRegen) {
        this.mpRegen = mpRegen;
    }

    public Short getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(Short moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public Short getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(Short attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public Short getCastSpeed() {
        return castSpeed;
    }

    public void setCastSpeed(Short castSpeed) {
        this.castSpeed = castSpeed;
    }

    public Short getHitRecovery() {
        return hitRecovery;
    }

    public void setHitRecovery(Short hitRecovery) {
        this.hitRecovery = hitRecovery;
    }

    public Short getJump() {
        return jump;
    }

    public void setJump(Short jump) {
        this.jump = jump;
    }

    public Integer getCharacWeight() {
        return characWeight;
    }

    public void setCharacWeight(Integer characWeight) {
        this.characWeight = characWeight;
    }

    public Short getFatigue() {
        return fatigue;
    }

    public void setFatigue(Short fatigue) {
        this.fatigue = fatigue;
    }

    public Short getMaxFatigue() {
        return maxFatigue;
    }

    public void setMaxFatigue(Short maxFatigue) {
        this.maxFatigue = maxFatigue;
    }

    public Short getPremiumFatigue() {
        return premiumFatigue;
    }

    public void setPremiumFatigue(Short premiumFatigue) {
        this.premiumFatigue = premiumFatigue;
    }

    public Short getMaxPremiumFatigue() {
        return maxPremiumFatigue;
    }

    public void setMaxPremiumFatigue(Short maxPremiumFatigue) {
        this.maxPremiumFatigue = maxPremiumFatigue;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastPlayTime() {
        return lastPlayTime;
    }

    public void setLastPlayTime(Date lastPlayTime) {
        this.lastPlayTime = lastPlayTime;
    }

    public Integer getDungeonClearPoint() {
        return dungeonClearPoint;
    }

    public void setDungeonClearPoint(Integer dungeonClearPoint) {
        this.dungeonClearPoint = dungeonClearPoint;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getGuildId() {
        return guildId;
    }

    public void setGuildId(Integer guildId) {
        this.guildId = guildId;
    }

    public Byte getGuildRight() {
        return guildRight;
    }

    public void setGuildRight(Byte guildRight) {
        this.guildRight = guildRight;
    }

    public Byte getMemberFlag() {
        return memberFlag;
    }

    public void setMemberFlag(Byte memberFlag) {
        this.memberFlag = memberFlag;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Byte getExpertJob() {
        return expertJob;
    }

    public void setExpertJob(Byte expertJob) {
        this.expertJob = expertJob;
    }

    public Byte getSkillTreeIndex() {
        return skillTreeIndex;
    }

    public void setSkillTreeIndex(Byte skillTreeIndex) {
        this.skillTreeIndex = skillTreeIndex;
    }

    public Integer getLinkCharacNo() {
        return linkCharacNo;
    }

    public void setLinkCharacNo(Integer linkCharacNo) {
        this.linkCharacNo = linkCharacNo;
    }

    public Byte getEventCharacLevel() {
        return eventCharacLevel;
    }

    public void setEventCharacLevel(Byte eventCharacLevel) {
        this.eventCharacLevel = eventCharacLevel;
    }

    public Byte getGuildSecede() {
        return guildSecede;
    }

    public void setGuildSecede(Byte guildSecede) {
        this.guildSecede = guildSecede;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Integer finishTime) {
        this.finishTime = finishTime;
    }

    public Byte getCompetitionArea() {
        return competitionArea;
    }

    public void setCompetitionArea(Byte competitionArea) {
        this.competitionArea = competitionArea;
    }

    public Byte getCompetitionPeriod() {
        return competitionPeriod;
    }

    public void setCompetitionPeriod(Byte competitionPeriod) {
        this.competitionPeriod = competitionPeriod;
    }

    public Integer getMercenaryStartTime() {
        return mercenaryStartTime;
    }

    public void setMercenaryStartTime(Integer mercenaryStartTime) {
        this.mercenaryStartTime = mercenaryStartTime;
    }

    public Integer getMercenaryFinishTime() {
        return mercenaryFinishTime;
    }

    public void setMercenaryFinishTime(Integer mercenaryFinishTime) {
        this.mercenaryFinishTime = mercenaryFinishTime;
    }

    public Byte getMercenaryArea() {
        return mercenaryArea;
    }

    public void setMercenaryArea(Byte mercenaryArea) {
        this.mercenaryArea = mercenaryArea;
    }

    public Byte getMercenaryPeriod() {
        return mercenaryPeriod;
    }

    public void setMercenaryPeriod(Byte mercenaryPeriod) {
        this.mercenaryPeriod = mercenaryPeriod;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip == null ? null : vip.trim();
    }

    public byte[] getElementResist() {
        return elementResist;
    }

    public void setElementResist(byte[] elementResist) {
        this.elementResist = elementResist;
    }

    public byte[] getSpecProperty() {
        return specProperty;
    }

    public void setSpecProperty(byte[] specProperty) {
        this.specProperty = specProperty;
    }
}