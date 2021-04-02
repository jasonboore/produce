package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "constraction_unit_manage")
public class ConstructionUnitManage {
    @Id
    @GeneratedValue
    private Long pid;

    @Column
    private String rankNum;

    @Column
    private String unitType;

    @Column
    private String unitName;

    @Column
    private String remarks;

    @Column
    private String isUsed;
}
