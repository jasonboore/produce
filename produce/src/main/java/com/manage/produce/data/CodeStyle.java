package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "code_style")
public class CodeStyle {
    @Id
    @GeneratedValue
    private Long pid;

    @Column
    private String columnField;

    @Column
    private String columnTitle;

    @Column
    private Integer columnWidth;

    @Column
    private String alignment;

    @Column
    private String dataType;

    @Column
    private String isSeen;

    @Column
    private String isLock;

    @Column
    private String isEdit;

    @Column
    private String checkBox;

    @Column
    private String selectCondition;

    @Column
    private Integer conditionWidth;

    @Column
    private String listSetences;

    @Column
    private String codeName;

}
