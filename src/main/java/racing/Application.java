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

    public static void main(Car[] args) {

        ArrayList<Car> 차량이름목록 = new ArrayList<>();

        // 3번 반복 받는 부분,
        for (int i = 0; i < 3; i++) {
            System.out.print("차량 이름을 입력해 주세요: ");
            String 차이름 = scanner.nextLine();

            //10자초과 오류출력
            if (차이름.length()>10){
                throw new IllegalArgumentException("10글자이상 불가");
            }

            차량이름목록.add(new Car(차이름));
        }


        //주사위 굴릴 횟수 입력
        System.out.println("횟수를 입력해 주세요: ");
        int count = Integer.parseInt(scanner.nextLine());

        DiceGame game = new DiceGame();
        for (int i = 0; i < count; i++) {
            game.play(count);

            //자사위에 따라 이동
            for (Car.차이름)

        }



    }





}
