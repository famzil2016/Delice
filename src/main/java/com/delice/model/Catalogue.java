package com.delice.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Catalogue implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String name_catalogue;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Id
    private Long id_catalogue;

    public Catalogue() {

    }

    public String getName_catalogue() {
        return this.name_catalogue;
    }

    public void setName_catalogue(String name_catalogue) {
        this.name_catalogue = name_catalogue;
    }

    public Long getId_catalogue() {
        return this.id_catalogue;
    }

    public void setId_catalogue(Long id_catalogue) {
        this.id_catalogue = id_catalogue;
    }
}
