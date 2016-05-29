package com.delice.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Entity
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class Customer implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "newsletter")
    @Basic
    private boolean newsletter;
    
	@Column(name = "gender_customer")
    @Basic
    private String gender_customer;

	@Id
	@Column(name = "id_customer")
    @GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
    private Long id_customer;

	@Column(name = "name_customer")
    @Basic
    private String name_customer;

	@Column(name = "password_customer")
    @Basic
    private String password_customer;

	@Column(name = "email_customer")
    @Basic
    private String email_customer;
    
	@Column(name = "birthdate_customer")
    @Basic
    private String birthdate_customer;
	
	@Column(name = "company_customer")
    @Basic
    private String company_customer;
	

    @Basic
	private String salt_customer;
    
    public Customer() {

    }
    
	public String getSalt_customer() {
		return this.salt_customer;
	}

	public void setSalt_customer(String salt_customer) {
		this.salt_customer = salt_customer;
	}

    public boolean isNewsletter() {
        return this.newsletter;
    }

    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }

    public String getGender_customer() {
        return this.gender_customer;
    }

    public void setGender_customer(String gender_customer) {
        this.gender_customer = gender_customer;
    }

    public Long getId_customer() {
        return this.id_customer;
    }

    public void setId_customer(Long id_customer) {
        this.id_customer = id_customer;
    }


    public String getPassword_customer() {
        return this.password_customer;
    }

    public void setPassword_customer(String password_customer) {
        this.password_customer = password_customer;
    }

    public String getEmail_customer() {
        return this.email_customer;
    }

    public void setEmail_customer(String email_customer) {
        this.email_customer = email_customer;
    }

    public String getBirthdate_customer() {
        return this.birthdate_customer;
    }

    public void setBirthdate_customer(String birthdate_customer) {
        this.birthdate_customer = birthdate_customer;
    }

    public String getName_customer() {
        return this.name_customer;
    }

    public void setName_customer(String name_customer) {
        this.name_customer = name_customer;
    }

    public String getCompany_customer() {
        return this.company_customer;
    }

    public void setCompany_customer(String company_customer) {
        this.company_customer = company_customer;
    }
}
