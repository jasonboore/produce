package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "active_user")
public class ActiveUser {
    @Id
    @GeneratedValue
    private Long pid;

    @Column
    private String activeTime;

    @Column
    private String activeName;

    @Column
    private String userName;

    @Column
    private String unitName;

}
