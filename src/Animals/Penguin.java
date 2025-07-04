package Animals;

import Interfaces.Swimming;
import Interfaces.Walking;

public class Penguin extends Animal implements Walking, Swimming {

    public Penguin() {
    }

    public Penguin(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String eat() {
        return Name + " is eating a fish!";
    }

    @Override
    public String swim() {
       return Name + " is swimming!";
    }

    @Override
    public String walk() {
        return Name + " is walking!";

    }
}
