package racing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.print("이름을 입력해 주세요: ");
        String 이름들 = scanner.nextLine();
        List<String> 이름목록 = List.of(이름들.split(","));

//        Car xxxx = new Car(0, ?????);
//        xxxx.이동횟수 = 7;

        // List<String> -> List<Car> 새로 만들어 내기
//        new Car(0, 이름목록.get(0));
//        new Car(0, 이름목록.get(1));
//        new Car(0, 이름목록.get(2));
        ;
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1,"좋은차"));



        System.out.print("횟수를 입력해 주세요: ");
        int 횟수 = Integer.parseInt(scanner.nextLine());

        // 랜덤값이 3이상이면 전진, 아니면 정지
        int 전진횟수 = 0;

        전진횟수 = 전진(전진횟수);
        System.out.println("전진횟수 = " + 전진횟수);
        전진횟수 = 전진(전진횟수);
        System.out.println("전진횟수 = " + 전진횟수);
        전진횟수 = 전진(전진횟수);
        System.out.println("전진횟수 = " + 전진횟수);
        전진횟수 = 전진(전진횟수);
        System.out.println("전진횟수 = " + 전진횟수);
        전진횟수 = 전진(전진횟수);
        System.out.println("전진횟수 = " + 전진횟수);

    }

    static int 전진(int 함수내부에서사용하는_전진횟수) {
        int 주사위값 = random.nextInt(6) + 1;
        if (주사위값 >= 3) {
            return 함수내부에서사용하는_전진횟수 + 1;
        }
        return 함수내부에서사용하는_전진횟수;
    }

}
