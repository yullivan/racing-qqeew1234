package racing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;


public class Application {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int 이동예정횟수 = 10;

        List<String> 차량이름목록 = 차량리스트입력();
//        toCars(차량이름목록) = 차량리스트입력(); ERROR!


//        List<Car> 차량이동횟수 = List.of(new Car(0, "현대"), new Car(0, "테슬라"), new Car(0, "포르쉐"));
//        Car 자동차A = cars.get(0);
//        Car 자동차B = cars.get(1);
//        Car 자동차C = cars.get(2);
        List<Car> cars = toCars(차량이름목록);
        for (int i = 0; i < 차량이름목록.size(); i++) {
            Car 자동차 = cars.get(i);
            자동차.전진();
        }
        System.out.println(cars);

        List<Car> 우승자목록 = winCars(cars);
        System.out.println("우승자 = " + 우승자목록);

    }

    private static List<Car> toCars(List<String> 이름목록) {
        ArrayList<Car> objects = new ArrayList<>();
        for (int i = 0; i < 이름목록.size(); i++) {
            String 이름 = 이름목록.get(i);
            objects.add(new Car(이름));
        }
        return objects;
    }

    private static List<String> 차량리스트입력() {

        System.out.print("차량 이름 : ");
        String 차이름 = scanner.nextLine();

        String[] 이름배열 = 차이름.split(",");
        List<String> 이름리스트 = List.of(이름배열);

        return 이름리스트;
    }

    static List<Car> winCars(List<Car> 자동차목록) {
        List<Integer> 이동횟수목록 = 자동차목록.stream()
                .map(car -> car.이동횟수)
                .toList();

        int 최대이동 = Collections.max(이동횟수목록);

        ArrayList<Car> 우승자목록 = new ArrayList<>();
        for (int i = 0; i < 자동차목록.size(); i++) {
            Car 자동차 = 자동차목록.get(i);
            if (자동차.이동횟수 == 최대이동) {
                우승자목록.add(자동차);
            }
        }

        return 자동차목록;
    }
}