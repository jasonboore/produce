package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "cost_info")
public class CostInfo {
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
    Double engineerIncome;

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
    String fillingDate;

}
