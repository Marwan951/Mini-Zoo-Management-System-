package Animals;

import Interfaces.Walking;

public class Tiger extends Animal implements Walking {
    public Tiger() {
    }

    public Tiger(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
        public String eat(){
            return Name + " is eating moose!";
    }

        @Override
        public String walk() {
            return Name + " is walking!";
        }
}
