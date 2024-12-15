package racing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

import static racing.Car.winCars;

public class Application {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int 이동예정횟수 = 10;

        List<String> 차량이름목록 = 차량리스트입력();
        toCars(차량이름목록) = 차량리스트입력();





//        List<Car> 차량이동횟수 = List.of(new Car(0, "현대"), new Car(0, "테슬라"), new Car(0, "포르쉐"));

        Car 자동차A = 차량이동횟수.get(0);
        Car 자동차B = 차량이동횟수.get(1);
        Car 자동차C = 차량이동횟수.get(2);
        for (int i = 0; i < 이동예정횟수; i++) {
            자동차A.전진();
            System.out.println("A이동횟수 = " + 자동차A.이동횟수);


            자동차B.전진();
            System.out.println("B이동횟수 = " + 자동차B.이동횟수);


            자동차C.전진();
            System.out.println("C이동횟수 = " + 자동차C.이동횟수);


        }

        List<Car> 이동횟수목록 = winCars(차량이동횟수);
        System.out.println("우승자 = "+이동횟수목록);

    }

    private static List<String> toCars(List<Car> 차량이름목록) {
        List<String> 차량이름목록 = 차량리스트입력();
        List<Car> 차량목록 = toCars(차량이름목록);
    }

    private static List<String> 차량리스트입력() {

        System.out.print("차량 이름 : ");
        String 차이름 = scanner.nextLine();

        String[] 이름배열 = 차이름.split(",");
        List<String> 이름리스트 = List.of(이름배열);

        return 이름리스트;
    }






}