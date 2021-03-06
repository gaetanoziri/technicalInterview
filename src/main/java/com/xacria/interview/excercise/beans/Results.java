
package com.xacria.interview.excercise.beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xacria.interview.excercise.beans.geolocation.Result;

public class Results {

	@SerializedName("results")
	@Expose
	private List<Result> results = null;
	@SerializedName("status")
	@Expose
	private String status;

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Results withResults(List<Result> results) {
		this.results = results;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Results withStatus(String status) {
		this.status = status;
		return this;
	}

}
