package com.company.accesscheck.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "ACCESSCHECK_A")
@Entity(name = "accesscheck_A")
@NamePattern("%s|name")
public class A extends StandardEntity {
    private static final long serialVersionUID = -4179434351452290922L;

    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}