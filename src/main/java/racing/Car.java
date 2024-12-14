package racing;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Car {

    String 차이름;
    int 이동횟수;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return 이동횟수 == car.이동횟수 && Objects.equals(차이름, car.차이름);
    }

    @Override
    public int hashCode() {
        return Objects.hash(차이름, 이동횟수);
    }

    public Car(int 이동횟수) {
        this.이동횟수 = 이동횟수;
    }

    public Car(String 차이름) {
        this.차이름 = 차이름;
    }
}

