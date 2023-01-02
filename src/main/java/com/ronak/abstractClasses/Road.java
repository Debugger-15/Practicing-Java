package com.ronak.abstractClasses;

public abstract class Road {
    private String roadName;
    private String roadType;
    public float curvature;

   protected abstract void giveName(String name);

    private void changeType(String type) {
        roadType = type;
    }

    public void setCurvature(float curve) {
        curvature = curve;
    }
}
