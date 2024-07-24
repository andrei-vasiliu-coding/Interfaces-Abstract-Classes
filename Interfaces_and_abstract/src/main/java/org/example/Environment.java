package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Environment<T> {

    protected List<T> traffic = new ArrayList<>();

    public abstract void checkTraffic();

    public void addTraffic(T traffic) {
        this.traffic.add(traffic);
    }

    public void checkVehicles(){
        for (T item: traffic){
            if (item instanceof Vehicle){
                ((Vehicle) item).move();
            }
        }
    }

    int maxSpeed;
}
