package animals;

import food.Food;
import utils.EnclosureSize;
import utils.WrongFoodException;

public class Wolf extends Carnivorous implements Run, Swim, Voice {

    public Wolf() {
        super();
    }

    public Wolf(EnclosureSize rightEnclosureSize) {
        this.rightEnclosureSize = rightEnclosureSize;
    }

    @Override
    public void run() {
        System.out.println("Я волк. Умею бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Я волк. Умею плавать!");
    }

    @Override
    public String voice() {
        return "Р-р-р-р";
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        System.out.print("Я волк. Мне дали " + food.toString() + ". ");
        super.eat(food);
    }
}
