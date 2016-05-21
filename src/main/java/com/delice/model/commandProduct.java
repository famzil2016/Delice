package com.delice.model;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class commandProduct implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private String quantity_commandproduct;

    @OneToOne(optional = true, targetEntity = Product.class)
    private Product product;

    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Id
    private Long id_command_product;

    @OneToOne(optional = true, targetEntity = Command.class)
    private Command command;

    public commandProduct() {

    }

    public String getQuantity_commandproduct() {
        return this.quantity_commandproduct;
    }

    public void setQuantity_commandproduct(String quantity_commandproduct) {
        this.quantity_commandproduct = quantity_commandproduct;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getId_command_product() {
        return this.id_command_product;
    }

    public void setId_command_product(Long id_command_product) {
        this.id_command_product = id_command_product;
    }

    public Command getCommand() {
        return this.command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
