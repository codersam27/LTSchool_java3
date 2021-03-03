package animals;

import food.Food;
import utils.EnclosureSize;
import utils.WrongFoodException;

public class Hamster extends Herbivore implements Run, Voice {

    public Hamster() {
        super();
    }

    public Hamster(EnclosureSize rightEnclosureSize) {
        this.rightEnclosureSize = rightEnclosureSize;
    }

    @Override
    public void run() {
        System.out.println("Я хомяк. Умею бегать!");
    }

    @Override
    public String voice() {
        return "Пи-пи-пи";
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        System.out.print("Я хомяк. Мне дали " + food.toString() + ". ");
        super.eat(food);
    }
}
