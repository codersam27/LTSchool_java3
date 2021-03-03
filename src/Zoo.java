import animals.*;
import food.*;
import humans.Worker;
import utils.Enclosure;
import utils.EnclosureSize;
import utils.WrongFoodException;

public class Zoo {
    public static void main(String[] args) throws WrongFoodException {
        Carnivorous wolf = new Wolf(EnclosureSize.BIG);
        Herbivore horse = new Horse(EnclosureSize.BIG);
        Herbivore amur = new Amur();
        Carnivorous duck = new Duck(EnclosureSize.MEDIUM);
        Carnivorous lynx = new Lynx(EnclosureSize.BIG);
        Herbivore hamster = new Hamster(EnclosureSize.SMALL);

        Food rabbit = new Rabbit();
        Food corn = new Corn();
        Food beef = new Beef();
        Food avena = new Avena();
        Worker worker = new Worker();

        Enclosure<Herbivore> herbivoreGroup = new Enclosure<>(EnclosureSize.SMALL);
        Enclosure<Carnivorous> carnivorousGroup = new Enclosure<>(EnclosureSize.BIG);

        herbivoreGroup.addAnimal(horse.getUniqueId(), horse, horse.getRightEnclosureSize());
        herbivoreGroup.addAnimal(hamster.getUniqueId(), hamster, hamster.getRightEnclosureSize());
        herbivoreGroup.addAnimal(amur.getUniqueId(), amur, amur.getRightEnclosureSize());

        carnivorousGroup.addAnimal(lynx.getUniqueId(), lynx, lynx.getRightEnclosureSize());
        carnivorousGroup.addAnimal(duck.getUniqueId(), duck, duck.getRightEnclosureSize());
        carnivorousGroup.addAnimal(wolf.getUniqueId(), wolf, wolf.getRightEnclosureSize());

        herbivoreGroup.printAnimals();
        carnivorousGroup.printAnimals();

        worker.feed(wolf, corn);
    }
}
