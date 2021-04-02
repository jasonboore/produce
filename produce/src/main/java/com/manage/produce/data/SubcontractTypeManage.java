package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "subcontract_type_manege")
public class SubcontractTypeManage {
    @Id
    @GeneratedValue
    private Long pid;

    @Column
    private String rankNum;

    @Column
    private String subcontractName;

    @Column
    private String remarks;

    @Column
    private String isUsed;
}
