package com.delice.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private Date add_date_product;

    private boolean shippable_product;

    @Id
    @GeneratedValue
    private Long id_product;

    private String description_long_product;

    private String description_short_product;

    private String details_product;

    private String img_product;

    @ManyToOne(optional = true, targetEntity = Category.class)
    private Category category;

    private String reference_product;
    
    private String name_product;
    private Double price;

    public String getName_product() {
		return name_product;
	}


	public Product() {

    }

    public Date getAdd_date_product() {
        return this.add_date_product;
    }

    public void setAdd_date_product(Date add_date_product) {
        this.add_date_product = add_date_product;
    }

    public boolean isShippable_product() {
        return this.shippable_product;
    }

    public void setShippable_product(boolean shippable_product) {
        this.shippable_product = shippable_product;
    }

    public Long getId_product() {
        return this.id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public String getDescription_long_product() {
        return this.description_long_product;
    }

    public void setDescription_long_product(String description_long_product) {
        this.description_long_product = description_long_product;
    }

    public String getDescription_short_product() {
        return this.description_short_product;
    }

    public void setDescription_short_product(String description_short_product) {
        this.description_short_product = description_short_product;
    }

    public String getDetails_product() {
        return this.details_product;
    }

    public void setDetails_product(String details_product) {
        this.details_product = details_product;
    }

    public String getImg_product() {
        return this.img_product;
    }

    public void setImg_product(String img_product) {
        this.img_product = img_product;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getReference_product() {
        return this.reference_product;
    }

    public void setReference_product(String reference_product) {
        this.reference_product = reference_product;
    }
    
	public void setName_product(String name_product) {
		this.name_product = name_product;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
