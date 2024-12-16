package racing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    void winnnn() {
        List<Car> cars = List.of(
                new Car("현대", 4),
                new Car( "테슬라", 4),
                new Car("벤틀리", 2));

        List<Car> 우승자목록 = Application.winCars(cars);
        List<Car> 기대하는우승자목록 = List.of(
                new Car("현대", 4),
                new Car( "테슬라", 4));

        assertThat(우승자목록).isEqualTo(기대하는우승자목록);
    }
}
