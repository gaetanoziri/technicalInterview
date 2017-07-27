
package com.xacria.interview.excercise.beans.geolocation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Southwest {

	@SerializedName("lat")
	@Expose
	private double lat;
	@SerializedName("lng")
	@Expose
	private double lng;

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public Southwest withLat(double lat) {
		this.lat = lat;
		return this;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public Southwest withLng(double lng) {
		this.lng = lng;
		return this;
	}

}
