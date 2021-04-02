package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "settlement_info")
public class SettlementInfo {
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

}
