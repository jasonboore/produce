package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "performance_manage")
public class PerformanceManage {
    @Id
    @GeneratedValue
    private Long pid;

    @Column
    private String rankNum;

    @Column
    private String performanceName;

    @Column
    private String remarks;

    @Column
    private String isUsed;
}
