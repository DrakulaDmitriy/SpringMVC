package web.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.year = price;
    }
}
