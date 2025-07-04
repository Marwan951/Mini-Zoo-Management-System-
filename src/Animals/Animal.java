package Animals;

import Interfaces.Eating;

public abstract class Animal implements Eating {
    String Name;
    int age;
    double weight;

    public Animal() {
    }

    public Animal(String name, int age, double weight) {
        Name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String drink() {
        return Name + " is drinking a water!";
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
