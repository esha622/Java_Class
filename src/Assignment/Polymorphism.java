package Assignment;

class Animals {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pigs extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Main {
    public static void main(String[] args) {
        Animals myAnimal = new Animals();
        Animal myPig = new Pigs();
        Animal myDog = new Dog();
        myAnimal.animalSound();    //The animal makes a sound
        myPig.animalSound();      //The pig says: wee wee
        myDog.animalSound();     //The dog says: bow wow
    }
}