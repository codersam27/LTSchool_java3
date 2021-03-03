package animals;

import food.Food;
import utils.EnclosureSize;
import utils.WrongFoodException;

import java.util.Objects;

public abstract class Animal {
    public static int totalCount = 0;
    protected String uniqueId = "";
    protected int satiety = 0;
    protected EnclosureSize rightEnclosureSize;

    public Animal() {
        rightEnclosureSize = EnclosureSize.SMALL;
        uniqueId += ++totalCount;
    }
    public abstract String getUniqueId();
    public abstract void eat(Food food) throws WrongFoodException;
    public void showSatiety() {
        System.out.println("Я сыт на: " + satiety);
    }

    public EnclosureSize getRightEnclosureSize() {
        return rightEnclosureSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return uniqueId.equals(animal.uniqueId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueId);
    }
}
