package com.xacria.interview.excercise;

import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

import org.apache.http.client.utils.URIBuilder;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.xacria.interview.excercise.beans.Results;
import com.xacria.interview.excercise.beans.geolocation.Location;

public class GoogleGeolocationService implements GeolocationServiceInterface {

	private final static String HOST_PROT = "http";
	private final static String HOST_NAME = "maps.googleapis.com";
	private final static String SERVICE_API = "/maps/api/geocode/json";

	@Override
	public Optional<Location> geolocate(String address) {
		Optional<Location> result = Optional.empty();
				
		URI uri;
		try {
			uri = new URIBuilder().setScheme(HOST_PROT).setHost(HOST_NAME).setPath(SERVICE_API).addParameter("address", address).build();
			InputStreamReader response = RESTClient.executeGet(uri);
			
			Results results = new GsonBuilder().create().fromJson(response, Results.class);
			if (results.getStatus().compareToIgnoreCase("OK") == 0) {
				result = Optional.of(results.getResults().get(0).getGeometry().getLocation());
			} else {
				System.err.println("Invalid response");
				result = Optional.of(new Location(0, 0));
			}
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (JsonIOException e) {
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return result;
	}
	
	public static void main(String[] args) {
		GeolocationServiceInterface service = new GoogleGeolocationService();
		Optional<Location> location = null;
		
		location = service.geolocate("Via Camillo Rosalba, 55, Bari, Italia");
		System.out.println(location.get().getLat() + ", " + location.get().getLng());
		
		location = service.geolocate("Via Giovanni Falcone, 121, Canosa di Puglia, Italia");
		System.out.println(location.get().getLat() + ", " + location.get().getLng());
	}

}
