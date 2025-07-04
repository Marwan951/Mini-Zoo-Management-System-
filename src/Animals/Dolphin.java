package Animals;

import Interfaces.Swimming;

public class Dolphin extends Animal implements Swimming {
    public Dolphin() {
    }

    public Dolphin(String Name, int age, double weight)  {
        super(Name, age, weight);
    }

    @Override
    public String  eat() {
       return Name + " is eating a salmon!";
    }

    @Override
    public String swim() {
       return Name + " is swimming!";
    }
}
