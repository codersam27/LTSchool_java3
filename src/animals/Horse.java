package animals;

import food.Food;
import utils.EnclosureSize;
import utils.WrongFoodException;

public class Horse extends Herbivore implements Run, Swim, Voice {

    public Horse() {
        super();
    }

    public Horse(EnclosureSize rightEnclosureSize) {
        this.rightEnclosureSize = rightEnclosureSize;
    }

    @Override
    public void run() {
        System.out.println("Я конь. Умею бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Я конь. Умею плавать!");
    }

    @Override
    public String voice() {
        return "Фыр-ф-р-р";
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        System.out.print("Я конь. Мне дали " + food.toString() + ". ");
        super.eat(food);
    }
}
