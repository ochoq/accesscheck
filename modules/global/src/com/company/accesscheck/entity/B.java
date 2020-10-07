package com.company.accesscheck.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "ACCESSCHECK_B")
@Entity(name = "accesscheck_B")
@NamePattern("%s|name")
public class B extends StandardEntity {
    private static final long serialVersionUID = 6990353840339756634L;

    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}