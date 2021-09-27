package mods.gym.main.model;

public class address {
	String streetAddress; 
	String postalCode; 
	long addressId;
public address(String streetAddress, String postalCode, long addressId) {
		super();
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.addressId = addressId;
	}


public String getStreetAddress() {
	return streetAddress;
}
public void setStreetAddress(String streetAddress) {
	this.streetAddress = streetAddress;
}
public String getPostalCode() {
	return postalCode;
}
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}
public long getAddressId() {
	return addressId;
}
public void setAddressId(long addressId) {
	this.addressId = addressId;
}
}
