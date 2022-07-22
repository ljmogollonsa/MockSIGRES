package com.services.sigres.model;

import java.io.Serializable;

public class SIGRESModelRequest implements Serializable {

	
	private String AddressNormalized;
	private String AddressComplement;
	private String LocationID;
	private String CoordinateX;
	private String CoordinateY;
	private String ResourceAccess;
	
	public String getAddressNormalized() {
		return AddressNormalized;
	}
	public void setAddressNormalized(String addressNormalized) {
		AddressNormalized = addressNormalized;
	}
	public String getAddressComplement() {
		return AddressComplement;
	}
	public void setAddressComplement(String addressComplement) {
		AddressComplement = addressComplement;
	}
	public String getLocationID() {
		return LocationID;
	}
	public void setLocationID(String locationID) {
		LocationID = locationID;
	}
	public String getCoordinateX() {
		return CoordinateX;
	}
	public void setCoordinateX(String coordinateX) {
		CoordinateX = coordinateX;
	}
	public String getCoordinateY() {
		return CoordinateY;
	}
	public void setCoordinateY(String coordinateY) {
		CoordinateY = coordinateY;
	}
	public String getResourceAccess() {
		return ResourceAccess;
	}
	public void setResourceAccess(String resourceAccess) {
		ResourceAccess = resourceAccess;
	}
	
}
	