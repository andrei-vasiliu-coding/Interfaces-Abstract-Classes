package org.example;

public class Road extends Environment<Car>{
    @Override
    public void checkTraffic() {
        for (Car car : traffic) {
            System.out.println(car + " is driving!");
        }
    }
}
