package org.example;

import java.util.Arrays;

public class Sky extends Environment<Flyable>{
    @Override
    public void checkTraffic() {
        for (Flyable flyable : traffic) {
            flyable.fly();
        }
    }
}
