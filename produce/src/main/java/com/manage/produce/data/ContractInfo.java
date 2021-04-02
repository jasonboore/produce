package com.manage.produce.data;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "contract_info")
public class ContractInfo {
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
    String contractNum;

    @Column
    Double contractMoney;

    @Column
    String signDate;

    @Column
    String startDate;

    @Column
    String endDate;

    @Column
    String performance;
}
