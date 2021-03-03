package animals;

import food.Food;
import utils.EnclosureSize;
import utils.WrongFoodException;

public class Lynx extends Carnivorous implements Run, Swim, Voice {

    public Lynx() {
        super();
    }

    public Lynx(EnclosureSize rightEnclosureSize) {
        this.rightEnclosureSize = rightEnclosureSize;
    }

    @Override
    public void run() {
        System.out.println("Я рысь. Умею бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Я рысь. Умею плавать!");
    }

    @Override
    public String voice() {
        return "Мяу";
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        System.out.print("Я рысь. Мне дали " + food.toString() + ". ");
        super.eat(food);
    }
}
