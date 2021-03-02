package humans;

import animals.*;
import food.Food;

public class Worker {
    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public void getVoice(Animal animal) {
        Voice voiceAnimal = (Voice) animal;
        System.out.println(voiceAnimal.voice());
    }
}
