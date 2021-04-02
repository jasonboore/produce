package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "opration_log")
public class OprationLog {
    @Id
    @GeneratedValue
    private Long pid;

    @Column
    private String oprationName;

    @Column
    private String userName;

    @Column
    private String logTime;

    @Column
    private String logType;

    @Column
    private String logOrigin;

    @Column
    private String logContent;
}
