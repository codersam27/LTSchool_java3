package humans;

import animals.*;
import food.Food;
import utils.WrongFoodException;

public class Worker {
    public void feed(Animal animal, Food food) throws WrongFoodException {
        animal.eat(food);
    }

    public void getVoice(Animal animal) {
        Voice voiceAnimal = (Voice) animal;
        System.out.println(voiceAnimal.voice());
    }
}
