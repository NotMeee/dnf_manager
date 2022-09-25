package cc.buckler.dnf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Postal {
    private Integer postalId;

    private Date occTime;

    private Integer sendCharacNo;

    private String sendCharacName;

    private Integer receiveCharacNo;

    private Integer itemId;

    private Integer addInfo;

    private Short endurance;

    private Byte upgrade;

    private Byte amplifyOption;

    private Integer amplifyValue;

    private Integer gold;

    private Date receiveTime;

    private Byte deleteFlag;

    private Byte avataFlag;

    private Byte unlimitFlag;

    private Byte sealFlag;

    private Byte creatureFlag;

    private Integer postal;

    private Integer letterId;

    private Integer extendInfo;

    private Byte ipgDbId;

    private Integer ipgTransactionId;

    private String ipgNexonId;

    private Long auctionId;

    private Byte seperateUpgrade;

    private Byte type;

    private byte[] randomOption;

    private byte[] itemGuid;
}