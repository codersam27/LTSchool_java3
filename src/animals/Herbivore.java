package animals;

import food.Food;
import food.Grass;
import utils.WrongFoodException;

public abstract class Herbivore extends Animal {
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println("Спасибо, поел!");
            satiety += food.getFoodValue();
        } else {
            throw new WrongFoodException("Я такое не ем!");
        }
    }
}
