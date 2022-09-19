package cc.buckler.dnf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CashCeraPoint {
    private String account;
    private Integer ceraPoint;
    private Date regDate;
    private Date modDate;
}