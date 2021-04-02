package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private String userName;

    @Column
    private String password;

    @Column
    private String loginName;

    @Column
    private String loginIP;

    @Column
    private String loginMachineName;
}
