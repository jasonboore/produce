package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "produce_info")
public class ProduceInfo {
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
    Double investMoney;

    @Column
    String startDate;

    @Column
    String endDate;

    @Column
    String planEndperiod;

    @Column
    String engineerMainMessage;

    @Column
    String thisWeekCompleteProcess;

    @Column
    String engineerTotalProcess;

    @Column
    String restProcess;

    @Column
    String nextWeekPlan;

    @Column
    String signPerformence;

    @Column
    Double contractMoney;

    @Column
    Double imageProcess;

    @Column
    String HREquipment;

    @Column
    String remarks;

    @Column
    String fillingDate;


}
