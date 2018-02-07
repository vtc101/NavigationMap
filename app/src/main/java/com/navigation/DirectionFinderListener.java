package com.navigation;

import java.util.List;

interface DirectionFinderListener {

    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
