package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private static final int CARS_MIN_SIZE = 1;
    private static final String CARS_SIZE_ERROR = "[ERROR] 자동차 대수는 1이상이어야 합니다.";

    private List<Car> cars;

    public Cars(List<Car> cars) {
        validateCarsSize(cars);
        this.cars = new ArrayList<>(cars);
    }

    private void validateCarsSize(List<Car> cars) {
        if (cars.size() < CARS_MIN_SIZE) {
            throw new IllegalArgumentException(CARS_SIZE_ERROR);
        }
    }

    public void move(NumberGenerator numberGenerator) {
        for (Car car : cars) {
            car.move(numberGenerator.generate());
        }
    }

    public List<Car> findAllWinner() {
        Car maxPositionCar = findMaxPositionCar();
        return cars.stream()
                .filter(car -> car.isSamePosition(maxPositionCar))
                .collect(Collectors.toList());
    }

    private Car findMaxPositionCar() {
        cars.sort(Car::compareTo);
        return cars.get(0);
    }

    public List<Car> getCars() {
        return cars;
    }
}
