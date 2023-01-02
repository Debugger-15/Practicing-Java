package com.ronak.interfaces;

public interface Car {
    float calculateDistance(int speed, int daysUsed);

    default double fuelBurned(float fuelUsed){
        return fuelUsed * 2.3;
    }
    void giveName(String name);
}
