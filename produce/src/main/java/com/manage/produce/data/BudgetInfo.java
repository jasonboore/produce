package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "budget_info")
public class BudgetInfo {
    @Id
    @GeneratedValue
    Long pid;

    @Column
    String engineerName;

    @Column
    String numOfItem;

    @Column
    String constructionUnit;

    @Column
    String workUnit;

    @Column
    Long engineerTime;

    @Column
    Double budgetMoney;

    @Column
    Double laborCost;

    @Column
    Double AMaterialCost;

    @Column
    Double BMaterialCost;

    @Column
    Double consumptionCost;

    @Column
    Double mechanicsCost;

    @Column
    Double takeCost;

    @Column
    Double finalBudget;

}
