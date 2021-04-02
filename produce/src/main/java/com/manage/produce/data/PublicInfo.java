package com.manage.produce.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "public_info")
public class PublicInfo {
    @Id
    @GeneratedValue
    Long pid;
    @Column
    String engeenirName;
    @Column
    String companyType;
    @Column
    String buildCompany;
    @Column
    String numOfItem;
    @Column
    String wbs;
    @Column
    Double money;
    @Column
    String workCompany;
    @Column
    Long workYear;
    @Column
    String isFin;
    @Column
    String originalNum;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getEngeenirName() {
        return engeenirName;
    }

    public void setEngeenirName(String engeenirName) {
        this.engeenirName = engeenirName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getBuildCompany() {
        return buildCompany;
    }

    public void setBuildCompany(String buildCompany) {
        this.buildCompany = buildCompany;
    }

    public String getNumOfItem() {
        return numOfItem;
    }

    public void setNumOfItem(String numOfItem) {
        this.numOfItem = numOfItem;
    }

    public String getWbs() {
        return wbs;
    }

    public void setWbs(String wbs) {
        this.wbs = wbs;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public void setWorkCompany(String workCompany) {
        this.workCompany = workCompany;
    }

    public Long getWorkYear() {
        return workYear;
    }

    public void setWorkYear(Long workYear) {
        this.workYear = workYear;
    }

    public String getIsFin() {
        return isFin;
    }

    public void setIsFin(String isFin) {
        this.isFin = isFin;
    }

    public String getOriginalNum() {
        return originalNum;
    }

    public void setOriginalNum(String originalNum) {
        this.originalNum = originalNum;
    }
}
