package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "statistic_info")
public class StatisticInfo {
    @Id
    @GeneratedValue
    Long pid;

    @Column
    String engineerName;

    @Column
    String numOfItem;

    @Column
    String wbs;

    @Column
    String workUnit;

    @Column
    String startDate;

    @Column
    String endDate;

    @Column
    String measurementUnit;

    @Column
    int amountNum;

    @Column
    Double monthProduceVal;

    @Column
    Double monthAMaterial;

    @Column
    Double monthAdBeforeIncome;

    @Column
    Double monthAdBehindIncome;

    @Column
    Double yearProduceVal;

    @Column
    Double yearAMaterial;

    @Column
    Double yearAdBeforeIncome;

    @Column
    Double yearAdBehindIncome;

    @Column
    String currentMonthProcess;

    @Column
    String totalProcess;

    @Column
    String fillingDate;
}
