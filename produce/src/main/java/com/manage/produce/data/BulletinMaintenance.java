package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "bulletin_maintenance")
public class BulletinMaintenance {
    @Id
    @GeneratedValue
    private Long pid;

    @Column
    private String title;

    @Column
    private String isSeen;

    @Column
    private String isTop;

    @Column
    private String visibleRange;

    @Column
    private String releaseTime;

    @Column
    private String releasePeople;

    @Column
    private Integer readTime;

    @Column
    private String bulletinContent;
}
