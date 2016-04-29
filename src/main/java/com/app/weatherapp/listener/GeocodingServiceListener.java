package com.app.weatherapp.listener;

import net.digitalphantom.app.weatherapp.data.LocationResult;

public interface GeocodingServiceListener {
    void geocodeSuccess(LocationResult location);

    void geocodeFailure(Exception exception);
}
