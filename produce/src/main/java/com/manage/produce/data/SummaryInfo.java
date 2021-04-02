package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "summary_info")
public class SummaryInfo {
    @Id
    @GeneratedValue
    Long pid;

    @Column
    String engineerName;

    @Column
    String constructionUnit;

    @Column
    String numOfItem;

    @Column
    Double investMoney;

    @Column
    String workUnit;

    @Column
    String isFin;

    @Column
    String contractNum;

    @Column
    Double contractMoney;

    @Column
    String signDate;

    @Column
    String contractStartDate;

    @Column
    String contractEndDate;

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
    String workStartDate;

    @Column
    String workEndDate;

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
    String HREquipment;

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
    String CostTotal;

    @Column
    String BMaterial;

    @Column
    Double transpotCost;    //运费

    @Column
    Double fuelCost;    //燃料费用

    @Column
    Double laborSubcontracting;     //力工分包

    @Column
    Double earthworkServices;       //土方劳务

    @Column
    Double antiCorrosionService;    //防腐劳务

    @Column
    Double localEarthwork;          //地方土方

    @Column
    Double mechanicServices;        //技工劳务

    @Column
    Double professionalSubcontracting;//专业分包

    @Column
    Double otherSubcontracting;        //其他分包

    @Column
    Double anticorrosionTeamCost;       //防腐队费用

    @Column
    Double MetalWorkshopCost;           //金属车间费用

    @Column
    Double AnsanAntiCorrosionAndPrefabrication; //安三防腐及预制

    @Column
    Double municipalAdministration;           //市政

    @Column
    Double other;

    @Column
    Double CostAdjustment;

    @Column
    Double marginalProfit;           //边际利润

    @Column
    Double marginalProfitRate;

    @Column
    Double settlementPreparationAmount;

    @Column
    String notReportedReview;       //未报审

    @Column
    String reportConstructionUnit;  //报建设单位

    @Column
    String reportBudgetDepartment;  //报概预算部

    @Column
    String reportAudit;             //报审计

    @Column
    String pendingAccountAfterAudit;    //审完待挂账

    @Column
    String account;                 //挂账

    @Column
    Double postAuditAmount;         //审后金额

    @Column
    Double invoiceAmount;           //发票金额

    @Column
    String subcontractNo;   //分包合同编号

    @Column
    String ERPServicePurchaseOrderNumber;   //ERP服务采购订单号

    @Column
    String subcontractor;       //分包单位

    @Column
    String subcontractContent;  //分包内容

    @Column
    String subcontractingType;  //分包类型

    @Column
    String subcontractSignDate;

    @Column
    String startDate;

    @Column
    String endDate;

    @Column
    Double subcontractContractMoney;

    @Column
    Double APP; //累计支付进度款

    @Column
    Double AABSS; //分包结算前预提金额

    @Column
    String SAOSS;   //分包结算总金额

    @Column
    String performance;
}
