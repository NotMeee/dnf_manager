package cc.buckler.dnf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CashCera {
    private String account;
    private Integer cera;
    private Long modTran;
    private Date modDate;
    private Date regDate;
}