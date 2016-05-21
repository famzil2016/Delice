package com.delice.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Command implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(optional=true,targetEntity = Shop.class)
    private Shop shop;

    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private float price_ttc_command;

    @OneToOne(optional=true,targetEntity = Adresse.class)
    private Adresse adresse_delivery;

    @OneToOne(optional=true,targetEntity = Adresse.class)
    private Adresse adresse_invoice;

    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private float price_base_command;

    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Date date_command;

    @ManyToOne(optional=true,targetEntity = Carrier.class)
    private Carrier carrier;

    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Id
    private Long id_command;

    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private String reference_command;

    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private String comment_command;

    @OneToOne(optional=true,targetEntity = Payment.class)
    private Payment payment;

    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private float total_product_command;

    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private String gift_message_command;

    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private boolean gift_command;

    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private String delivery_mode_command;

    @Column(unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Time time_command;

    @ManyToOne(optional=true,targetEntity = Customer.class)
    private Customer customer;

    public Command() {

    }
   
    public Shop getShop() {
        return this.shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
   
    public float getPrice_ttc_command() {
        return this.price_ttc_command;
    }

    public void setPrice_ttc_command(float price_ttc_command) {
        this.price_ttc_command = price_ttc_command;
    }
   
    public Adresse getAdresse_delivery() {
        return this.adresse_delivery;
    }

    public void setAdresse_delivery(Adresse adresse_delivery) {
        this.adresse_delivery = adresse_delivery;
    }
   
    public Adresse getAdresse_invoice() {
        return this.adresse_invoice;
    }

    public void setAdresse_invoice(Adresse adresse_invoice) {
        this.adresse_invoice = adresse_invoice;
    }
   
    public float getPrice_base_command() {
        return this.price_base_command;
    }

    public void setPrice_base_command(float price_base_command) {
        this.price_base_command = price_base_command;
    }
   
    public Date getDate_command() {
        return this.date_command;
    }

    public void setDate_command(Date date_command) {
        this.date_command = date_command;
    }
   
    public Carrier getCarrier() {
        return this.carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }
   
    public Long getId_command() {
        return this.id_command;
    }

    public void setId_command(Long id_command) {
        this.id_command = id_command;
    }
   
    public String getReference_command() {
        return this.reference_command;
    }

    public void setReference_command(String reference_command) {
        this.reference_command = reference_command;
    }
   
    public String getComment_command() {
        return this.comment_command;
    }

    public void setComment_command(String comment_command) {
        this.comment_command = comment_command;
    }
   
    public Payment getPayment() {
        return this.payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
   
    public float getTotal_product_command() {
        return this.total_product_command;
    }

    public void setTotal_product_command(float total_product_command) {
        this.total_product_command = total_product_command;
    }
   
    public String getGift_message_command() {
        return this.gift_message_command;
    }

    public void setGift_message_command(String gift_message_command) {
        this.gift_message_command = gift_message_command;
    }
    
    public boolean isGift_command() {
        return this.gift_command;
    }

    public void setGift_command(boolean gift_command) {
        this.gift_command = gift_command;
    }
   
    public String getDelivery_mode_command() {
        return this.delivery_mode_command;
    }

    public void setDelivery_mode_command(String delivery_mode_command) {
        this.delivery_mode_command = delivery_mode_command;
    }
   
    public Time getTime_command() {
        return this.time_command;
    }

    public void setTime_command(Time time_command) {
        this.time_command = time_command;
    }
   
    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
