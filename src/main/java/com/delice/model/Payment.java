package com.delice.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Id
    private Long id_payment;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String expires_at_payment;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String num_card_payment;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String CVV_card_payment;

    public Payment() {

    }

    public Long getId_payment() {
        return this.id_payment;
    }

    public void setId_payment(Long id_payment) {
        this.id_payment = id_payment;
    }

    public String getExpires_at_payment() {
        return this.expires_at_payment;
    }

    public void setExpires_at_payment(String expires_at_payment) {
        this.expires_at_payment = expires_at_payment;
    }

    public String getNum_card_payment() {
        return this.num_card_payment;
    }

    public void setNum_card_payment(String num_card_payment) {
        this.num_card_payment = num_card_payment;
    }

    public String getCVV_card_payment() {
        return this.CVV_card_payment;
    }

    public void setCVV_card_payment(String CVV_card_payment) {
        this.CVV_card_payment = CVV_card_payment;
    }
}
