package mischelleneous;

import com.ronak.abstractClasses.Road;
import com.ronak.interfaces.Car;

public class Override extends Road implements Car {
    @java.lang.Override
    public float calculateDistance(int speed, int daysUsed) {
        return 0;
    }

    @java.lang.Override
    public void giveName(String name) {

    }
    @java.lang.Override
    public void setCurvature(float curve){
        System.out.println("curve is :- "+ curve);
    }
}
