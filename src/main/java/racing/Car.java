package racing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static racing.Application.random;

public class Car {
    @Override
    public String toString() {
        return "Car{" +
                "차량이름='" + 차량이름 + '\'' +
                ", 이동횟수=" + 이동횟수 +
                '}';
    }

    String 차량이름;
    int 이동횟수;

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

    public Car(int 이동횟수) {
        this.이동횟수 = 이동횟수;
    }

    public Car(String 차량이름) {
        this.차량이름 = 차량이름;
    }


    static List<Car> winCars(List<Car> 우승자목록) {
        List<Integer> 이동횟수목록 = 우승자목록.stream()
                .map(car -> car.이동횟수)
                .toList();

        int 최대이동 = Collections.max(이동횟수목록);

        ArrayList<Car> cars1 = new ArrayList<>();
        for (int i = 0; i < 우승자목록.size(); i++) {
            Car 자동차 = 우승자목록.get(i);
            if (자동차.이동횟수 == 최대이동) {
                cars1.add(자동차);
            }
        }

        return 우승자목록;
    }

    void 전진() {
        int 주사위값 = random.nextInt(6) + 1;
        if (주사위값 >= 3) {
            이동횟수 = 이동횟수 + 1;
        }


    }

}




