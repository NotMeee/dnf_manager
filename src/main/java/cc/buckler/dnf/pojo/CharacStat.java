package cc.buckler.dnf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacStat {
    private Integer characNo;

    private Byte village;

    private Integer exp;

    private Byte hp;

    private Short fatigue;

    private Short usedFatigue;

    private Short premiumFatigue;

    private Integer dungeonClearPoint;

    private Date lastPlayTime;

    private String forbiddenToPlay;

    private Date forbiddenDueTo;

    private Integer tutorialFlag;

    private Integer tradeGoldTotal;

    private Short tradeGoldTotalBillion;

    private Integer tradeGoldDaily;

    private Integer dungeonMapPassCnt;

    private Integer dungeonMapHelpPassCnt;

    private Integer helpAbusePoint;

    private Integer chaosPoint;

    private Integer chaosExp;

    private Integer chaosModeCount;

    private Integer chaosKillCount;

    private Integer chaosDieCount;

    private Date chaosDieTime;

    private Date chaosKillTime;

    private Integer assaultCount;

    private Integer luckPoint;

    private Integer dungeonPlayCount;

    private Integer helpAbuseRatio;

    private Integer helpAbuseExp;

    private Integer expertJobExp;

    private Integer fatigueBatteryCharging;

    private String escaladeTutorialFlag;

    private Short powerWarPoint;

    private Integer powerWarAssaultCount;

    private Integer powerWarAssaultVictoryCount;

    private Integer fatigueGrownupBuff;

    private Byte villagePrev;

    private Date lastPlayTimePowerwar;

    private Short emotion;

    private Byte addSlotFlag;

    private Byte memberDungeonFlag;

    private Byte openFlag;

    private Byte memberBonusFatigue;

    private Date birthdayEffectTime;

    private Byte visibleFlags;

    private Byte addEquipslotFlag;

    private Byte channelEquipslotSwitch;

    private Byte expandEquipslotSwitch;

    private Byte growthPowerReward;

    private Date chaosResponTime;

    private Integer lastPlayDungeonIndex;

    private Integer totalPlayTime;
}