package animals;

import food.Food;
import utils.EnclosureSize;
import utils.WrongFoodException;

public class Duck extends Carnivorous implements Fly, Swim, Voice, Run {

    public Duck() {
        super();
    }

    public Duck(EnclosureSize rightEnclosureSize) {
        this.rightEnclosureSize = rightEnclosureSize;
    }

    @Override
    public void fly() {
        System.out.println("Я утка. Умею летать!");
    }

    @Override
    public void run() {
        System.out.println("Я утка. Умею бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Я утка. Умею плавать!");
    }

    @Override
    public String voice() {
        return "Кря-Кря";
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        System.out.print("Я утка. Мне дали " + food.toString() + ". ");
        super.eat(food);
    }
}
