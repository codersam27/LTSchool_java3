package animals;

import food.Food;
import food.Meat;
import utils.WrongFoodException;

public abstract class Carnivorous extends Animal {
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println("Спасибо, поел!");
            satiety += food.getFoodValue();
        } else {
            throw new WrongFoodException("Я такое не ем!");
        }
    }
}
