package com.delice.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shop implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String name_shop;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Time Hour_withdrawal_shop;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Id
    private Long id_shop;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Date date_withdrawal_shop;

    public Shop() {

    }

    public String getName_shop() {
        return this.name_shop;
    }

    public void setName_shop(String name_shop) {
        this.name_shop = name_shop;
    }

    public Time getHour_withdrawal_shop() {
        return this.Hour_withdrawal_shop;
    }

    public void setHour_withdrawal_shop(Time Hour_withdrawal_shop) {
        this.Hour_withdrawal_shop = Hour_withdrawal_shop;
    }

    public Long getId_shop() {
        return this.id_shop;
    }

    public void setId_shop(Long id_shop) {
        this.id_shop = id_shop;
    }

    public Date getDate_withdrawal_shop() {
        return this.date_withdrawal_shop;
    }

    public void setDate_withdrawal_shop(Date date_withdrawal_shop) {
        this.date_withdrawal_shop = date_withdrawal_shop;
    }
}
