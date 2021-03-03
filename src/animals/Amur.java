package animals;

import food.Food;
import utils.EnclosureSize;
import utils.WrongFoodException;

public class Amur extends Herbivore implements Swim {

    public Amur() {
        super();
    }

    public Amur(EnclosureSize rightEnclosureSize) {
        this.rightEnclosureSize = rightEnclosureSize;
    }

    @Override
    public void swim() {
        System.out.println("Я рыба амур. Умею плавать!");
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        System.out.print("Я амур. Мне дали " + food.toString() + ". ");
        super.eat(food);
    }
}
