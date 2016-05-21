package com.delice.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adresse implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String name_pers_adresse;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String company_adresse;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String phone_adresse;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String region_adresse;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String zip_code_adresse;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String country_adresse;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String adresse;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Id
    private Long id_adresse;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String city_adresse;

    @OneToOne(optional = true, targetEntity = Customer.class)
    private Customer customer;

    public Adresse() {

    }

    public String getName_pers_adresse() {
        return this.name_pers_adresse;
    }

    public void setName_pers_adresse(String name_pers_adresse) {
        this.name_pers_adresse = name_pers_adresse;
    }

    public String getCompany_adresse() {
        return this.company_adresse;
    }

    public void setCompany_adresse(String company_adresse) {
        this.company_adresse = company_adresse;
    }

    public String getPhone_adresse() {
        return this.phone_adresse;
    }

    public void setPhone_adresse(String phone_adresse) {
        this.phone_adresse = phone_adresse;
    }

    public String getRegion_adresse() {
        return this.region_adresse;
    }

    public void setRegion_adresse(String region_adresse) {
        this.region_adresse = region_adresse;
    }

    public String getZip_code_adresse() {
        return this.zip_code_adresse;
    }

    public void setZip_code_adresse(String zip_code_adresse) {
        this.zip_code_adresse = zip_code_adresse;
    }

    public String getCountry_adresse() {
        return this.country_adresse;
    }

    public void setCountry_adresse(String country_adresse) {
        this.country_adresse = country_adresse;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Long getId_adresse() {
        return this.id_adresse;
    }

    public void setId_adresse(Long id_adresse) {
        this.id_adresse = id_adresse;
    }

    public String getCity_adresse() {
        return this.city_adresse;
    }

    public void setCity_adresse(String city_adresse) {
        this.city_adresse = city_adresse;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
