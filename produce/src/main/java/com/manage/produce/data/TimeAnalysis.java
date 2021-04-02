package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "time_analysis")
public class TimeAnalysis {
    @Id
    @GeneratedValue
    Long pid;

    @Column
    String engineerName;

    @Column
    String numOfItem;

    @Column
    String workUnit;

    @Column
    Long engineerTime;

    @Column
    String isPostContract;

    @Column
    String isAbnormalSubcontractDate;

    @Column
    String isSettlementLaggingBehind;

}
