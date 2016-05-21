package com.delice.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;


    @Id
    private Long id_category;

    private String code_category;

    private String name_category;

    @ManyToOne(optional = true, targetEntity = Catalogue.class)
    private Catalogue catalogue;

    public Category() {

    }

    public Long getId_category() {
        return this.id_category;
    }

    public void setId_category(Long id_category) {
        this.id_category = id_category;
    }

    public String getCode_category() {
        return this.code_category;
    }

    public void setCode_category(String code_category) {
        this.code_category = code_category;
    }

    public String getName_category() {
        return this.name_category;
    }

    public void setName_category(String name_category) {
        this.name_category = name_category;
    }

    public Catalogue getCatalogue() {
        return this.catalogue;
    }

    public void setCatalogue(Catalogue catalogue) {
        this.catalogue = catalogue;
    }
}
