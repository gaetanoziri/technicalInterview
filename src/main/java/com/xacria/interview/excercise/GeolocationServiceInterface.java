package com.xacria.interview.excercise;

import java.util.Optional;

import com.xacria.interview.excercise.beans.geolocation.Location;

/**
 * Created by fre on 21/07/17.
 */
public interface GeolocationServiceInterface {
    Optional<Location> geolocate(String address);
}
