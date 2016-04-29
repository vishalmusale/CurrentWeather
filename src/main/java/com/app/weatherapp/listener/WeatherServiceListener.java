package com.app.weatherapp.listener;

import net.digitalphantom.app.weatherapp.data.Channel;

public interface WeatherServiceListener {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
