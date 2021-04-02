package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "code_manage")
public class CodeManage {
    @Id
    @GeneratedValue
    private Long pid;

    @Column
    private String codeName;

    @Column
    private String remarks;

    @Column
    private String isUsed;
}
