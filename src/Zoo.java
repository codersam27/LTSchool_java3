import animals.*;
import food.*;
import humans.Worker;

public class Zoo {
    public static void main(String[] args) {
        Animal wolf = new Wolf();
        Animal horse = new Horse();
        Animal amur = new Amur();
        Animal duck = new Duck();
        Animal Lynx = new Lynx();
        Animal hamster = new Hamster();

        Food rabbit = new Rabbit();
        Food corn = new Corn();
        Food beef = new Beef();
        Food avena = new Avena();

        Worker worker = new Worker();

        worker.feed(horse, beef);
        worker.getVoice(horse);

        worker.feed(wolf, rabbit);
        worker.feed(wolf, rabbit);
        worker.feed(wolf, rabbit);
        worker.getVoice(wolf);
        wolf.showSatiety();

        worker.feed(hamster, avena);
        worker.getVoice(hamster);

        worker.feed(Lynx, corn);
        worker.feed(Lynx, beef);
        worker.getVoice(Lynx);
        Lynx.showSatiety();

        Animal[] pond = { amur, duck } ;
        for (Animal animal: pond) {
            Swim swimAnimal = (Swim) animal;
            swimAnimal.swim();
        }
    }
}
