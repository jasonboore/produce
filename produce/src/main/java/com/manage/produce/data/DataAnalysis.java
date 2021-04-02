package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "data_analysis")
public class DataAnalysis {
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
    String isAbnormalIncome;

    @Column
    String isAbnormalMarginalProfit;

    @Column
    String isAbnormalMaterialCost;
}
