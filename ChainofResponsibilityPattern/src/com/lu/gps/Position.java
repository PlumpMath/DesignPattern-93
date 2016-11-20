package com.lu.gps;

/**
 * 位置
 * 
 * @author lusm
 *
 */
public class Position {

	private String address;
	private Float longitude;
	private Float latitude;

	public Position(Float longitude, Float latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "Position [address=" + address + ", longitude=" + longitude + ", latitude=" + latitude + "]";
	}
	
	

}
