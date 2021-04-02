package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "code_list")
public class CodeList {
    @Id
    @GeneratedValue
    private Long pid;

    @Column
    private String codeName;

    @Column
    private String sqlSetence;

    @Column
    private String topSelect;

    @Column
    private String exportModel;

}
