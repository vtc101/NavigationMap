package com.navigacia;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

class Route {
    Distance distance;
    Duration duration;
    String endAddress;
    LatLng endLocation;
    String startAddress;
    LatLng startLocation;
    List<LatLng> points;
}
