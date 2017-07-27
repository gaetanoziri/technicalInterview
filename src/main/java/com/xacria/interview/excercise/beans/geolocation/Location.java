
package com.xacria.interview.excercise.beans.geolocation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

	@SerializedName("lat")
	@Expose
	private float lat;
	@SerializedName("lng")
	@Expose
	private float lng;

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public Location withLat(float lat) {
		this.lat = lat;
		return this;
	}

	public float getLng() {
		return lng;
	}

	public void setLng(float lng) {
		this.lng = lng;
	}

	public Location withLng(float lng) {
		this.lng = lng;
		return this;
	}
	
    public Location(float lat, float lon){
        this.lat = lat;
        this.lng = lon;
    }

}
