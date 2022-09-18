package cc.buckler.dnf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accounts {
    private Integer uid;

    private String accountname;

    private String password;

    private String qq;

    private String vip;
}