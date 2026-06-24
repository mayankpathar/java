package lab11;

interface Transport {
    void deliver();
}

abstract class Animal {
    abstract void makeSound();
}

class Tiger extends Animal {
    void makeSound() {
        System.out.println("Tiger");
    }
}

class Camel extends Animal implements Transport {
    void makeSound() {
        System.out.println("Camel");
    }

    public void deliver() {
        System.out.println("Camel delivers");
    }
}

class Deer extends Animal {
    void makeSound() {
        System.out.println("Deer");
    }
}

class Donkey extends Animal implements Transport {
    void makeSound() {
        System.out.println("Donkey");
    }

    public void deliver() {
        System.out.println("Donkey delivers");
    }
}

public class B3 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Tiger();
        animals[1] = new Camel();
        animals[2] = new Deer();
        animals[3] = new Donkey();

        animals[0].makeSound();
        animals[1].makeSound();
        animals[2].makeSound();     
        animals[3].makeSound();
        
        for (Animal animal : animals) {
            if (animal instanceof Transport) {
                ((Transport) animal).deliver();
            }
        }
        

    }
}
