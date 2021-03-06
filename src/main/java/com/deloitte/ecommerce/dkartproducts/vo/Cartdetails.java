package com.deloitte.ecommerce.dkartproducts.vo;

// Generated Nov 12, 2017 11:53:48 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Cartdetails generated by hbm2java
 */
@Entity
@Table(name = "cartdetails")
public class Cartdetails implements java.io.Serializable {

	private Integer cartdetailsid;
	private Cart cart;
	private Product product;
	private Integer quantity;
	private String size;
	private Double originalprice;
	private Double discountprice;

	public Cartdetails() {
	}

	public Cartdetails(Cart cart) {
		this.cart = cart;
	}

	public Cartdetails(Cart cart, Product product, Integer quantity,
			String size, Double originalprice, Double discountprice) {
		this.cart = cart;
		this.product = product;
		this.quantity = quantity;
		this.size = size;
		this.originalprice = originalprice;
		this.discountprice = discountprice;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cartdetailsid", unique = true, nullable = false)
	public Integer getCartdetailsid() {
		return this.cartdetailsid;
	}

	public void setCartdetailsid(Integer cartdetailsid) {
		this.cartdetailsid = cartdetailsid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cartid", nullable = false)
	public Cart getCart() {
		return this.cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "productid")
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name = "quantity")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "size", length = 5)
	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "originalprice", precision = 22, scale = 0)
	public Double getOriginalprice() {
		return this.originalprice;
	}

	public void setOriginalprice(Double originalprice) {
		this.originalprice = originalprice;
	}

	@Column(name = "discountprice", precision = 22, scale = 0)
	public Double getDiscountprice() {
		return this.discountprice;
	}

	public void setDiscountprice(Double discountprice) {
		this.discountprice = discountprice;
	}

}
