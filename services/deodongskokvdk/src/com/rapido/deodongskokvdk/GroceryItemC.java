/*Copyright (c) 2019-2020 voyy.com All Rights Reserved.
 This software is the confidential and proprietary information of voyy.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with voyy.com*/
package com.rapido.deodongskokvdk;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * GroceryItemC generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`grocery_item__c`", schema = "`public`")
public class GroceryItemC implements Serializable {

    private Long pkid;
    private String groupIdC;
    private String name;
    private String upcC;
    private String brandC;

    @Id
    @SequenceGenerator(name = "generator", sequenceName = "`grocery_item__c_id_seq`" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @Column(name = "`pkid`", nullable = false, scale = 0, precision = 19)
    public Long getPkid() {
        return this.pkid;
    }

    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    @Column(name = "`group_id__c`", nullable = true, length = 65535)
    public String getGroupIdC() {
        return this.groupIdC;
    }

    public void setGroupIdC(String groupIdC) {
        this.groupIdC = groupIdC;
    }

    @Column(name = "`name`", nullable = true, length = 65535)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`upc__c`", nullable = true, length = 65535)
    public String getUpcC() {
        return this.upcC;
    }

    public void setUpcC(String upcC) {
        this.upcC = upcC;
    }

    @Column(name = "`brand__c`", nullable = true, length = 65535)
    public String getBrandC() {
        return this.brandC;
    }

    public void setBrandC(String brandC) {
        this.brandC = brandC;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroceryItemC)) return false;
        final GroceryItemC groceryItemC = (GroceryItemC) o;
        return Objects.equals(getPkid(), groceryItemC.getPkid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPkid());
    }
}