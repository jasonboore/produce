package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "login_log")
public class LoginLog {
    @Id
    @GeneratedValue
    private Long pid;

    @Column
    private String loginName;

    @Column
    private String userName;

    @Column
    private String loginTime;

    @Column
    private String loginIP;

    @Column
    private String loginMachineName;

}
