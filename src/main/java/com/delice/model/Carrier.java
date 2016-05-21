package com.delice.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Carrier implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2243887850962471829L;

	@Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Id
    private Long id_carrier;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String name_carrier;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private long duration_carrier;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String price_carrier;

    public Carrier() {

    }

    public Long getId_carrier() {
        return this.id_carrier;
    }

    public void setId_carrier(Long id_carrier) {
        this.id_carrier = id_carrier;
    }

    public String getName_carrier() {
        return this.name_carrier;
    }

    public void setName_carrier(String name_carrier) {
        this.name_carrier = name_carrier;
    }

    public long getDuration_carrier() {
        return this.duration_carrier;
    }

    public void setDuration_carrier(long duration_carrier) {
        this.duration_carrier = duration_carrier;
    }

    public String getPrice_carrier() {
        return this.price_carrier;
    }

    public void setPrice_carrier(String price_carrier) {
        this.price_carrier = price_carrier;
    }
}
