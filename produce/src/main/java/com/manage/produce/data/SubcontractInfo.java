package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "subcontract_info")
public class SubcontractInfo {
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
    String wbs;

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
    String signDate;

    @Column
    String startDate;

    @Column
    String endDate;

    @Column
    Double contractMoney;

    @Column
    Double APP; //累计支付进度款

    @Column
    Double AABSS; //分包结算前预提金额

    @Column
    String SAOSS;   //分包结算总金额

    @Column
    String performance;
}
