/**
 * 
 */
package com.guru.myapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author bgurunath
 *
 */
@Entity
@Table(name = "T_ADDRESS")
public class Address {

	@Id
	@Column(name = "ADDRESS_ID")
	private Long addressId;

	@Column(name = "ADDRESS_TOWN")
	private String addressTown;

	@Column(name = "ADDRESS_STATE")
	private String addressState;

	@Column(name = "ADDRESS_PINCODE")
	private Integer addressPincode;

	@OneToOne(mappedBy = "empAddress")
	@JsonIgnore
	private Employee employee;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddressTown() {
		return addressTown;
	}

	public void setAddressTown(String addressTown) {
		this.addressTown = addressTown;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public Integer getAddressPincode() {
		return addressPincode;
	}

	public void setAddressPincode(Integer addressPincode) {
		this.addressPincode = addressPincode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
