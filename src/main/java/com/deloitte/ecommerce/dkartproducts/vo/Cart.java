package com.deloitte.ecommerce.dkartproducts.vo;

// Generated Nov 12, 2017 11:53:48 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cart generated by hbm2java
 */
@Entity
@Table(name = "cart")
public class Cart implements java.io.Serializable {

	private Integer cartid;
	private Date creationdate;
	private Date modificationdate;
	private Set<Cartdetails> cartdetailses = new HashSet<Cartdetails>(0);

	public Cart() {
	}

	public Cart(Date creationdate, Date modificationdate,
			Set<Cartdetails> cartdetailses) {
		this.creationdate = creationdate;
		this.modificationdate = modificationdate;
		this.cartdetailses = cartdetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cartid", unique = true, nullable = false)
	public Integer getCartid() {
		return this.cartid;
	}

	public void setCartid(Integer cartid) {
		this.cartid = cartid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creationdate", length = 19)
	public Date getCreationdate() {
		return this.creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modificationdate", length = 19)
	public Date getModificationdate() {
		return this.modificationdate;
	}

	public void setModificationdate(Date modificationdate) {
		this.modificationdate = modificationdate;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cart")
	public Set<Cartdetails> getCartdetailses() {
		return this.cartdetailses;
	}

	public void setCartdetailses(Set<Cartdetails> cartdetailses) {
		this.cartdetailses = cartdetailses;
	}

}
