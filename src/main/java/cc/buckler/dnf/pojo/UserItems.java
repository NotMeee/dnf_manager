package cc.buckler.dnf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
}