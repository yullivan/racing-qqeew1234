package racing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static racing.Application.random;

public class Car {

    String 차량이름;
    int 이동횟수;

    public Car(int 이동횟수) {
        this.이동횟수 = 이동횟수;
    }

    public Car(String 차량이름) {
        this.차량이름 = 차량이름;
    }



    void 전진() {
        int 주사위값 = random.nextInt(6) + 1;
        if (주사위값 >= 3) {
            이동횟수 = 이동횟수 + 1;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "차량이름='" + 차량이름 + '\'' +
                ", 이동횟수=" + 이동횟수 +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return 이동횟수 == car.이동횟수 && Objects.equals(차량이름, car.차량이름);
    }

    @Override
    public int hashCode() {
        return Objects.hash(차량이름, 이동횟수);
    }

    public Car(int 이동횟수, String 차량이름) {
        this.이동횟수 = 이동횟수;
        this.차량이름 = 차량이름;
    }

}




