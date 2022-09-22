package cc.buckler.dnf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatureItems {
    private Integer uiId;

    private Integer characNo;

    private Byte slot;

    private Integer itId;

    private Date regDate;

    private String name;

    private Integer stomach;

    private Integer exp;

    private Byte endurance;

    private Byte creatureType;

    private Byte noCharge;

    private Byte stat;

    private Byte itemLockKey;

    private String ipgAgencyNo;

    private Date expireDate;

    private Date deleteDate;
}