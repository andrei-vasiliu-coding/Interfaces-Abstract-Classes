package org.example;

public class Road extends Environment<Driveable>{
    @Override
    public void checkTraffic() {
        for (Driveable driveable : traffic) {
            driveable.drive();
        }
    }
}
