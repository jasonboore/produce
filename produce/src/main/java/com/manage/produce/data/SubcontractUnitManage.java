package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "subcontract_unit_manege")
public class SubcontractUnitManage {
    @Id
    @GeneratedValue
    private Long pid;

    @Column
    private String unitName;

    @Column
    private String remarks;

    @Column
    private String isUsed;
}
