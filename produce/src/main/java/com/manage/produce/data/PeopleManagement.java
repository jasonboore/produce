package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "people_manage")
public class PeopleManagement {
    @Id
    @GeneratedValue
    private Long pid;

    @Column
    private String ppName;

    @Column
    private String userName;

    @Column
    private String gender;

    @Column
    private String canUse;

    @Column
    private String telNum;

    @Column
    private String rankNum;

    @Column
    private String userRole;

    @Column
    private String remarks;

    @Column
    private String affiliatedUnits;


}
