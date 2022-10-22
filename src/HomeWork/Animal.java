package HomeWork;

public class Animal {
    void makeNoise(){
        System.out.println("I am just an Animal");
    }
}


class Dog extends Animal{

    @Override
    void makeNoise(){
        System.out.println("Woof Woof..");
        }

        void growl(){
            System.out.println("Grrrrrrr...");
    }
}

class Cat extends Animal{
    @Override
    void makeNoise(){
        System.out.println("Mew meaw ..");

    }
}

class test{
    public static void main(String[] args) {
       /* Animal[] myanimal= {new Dog(), new Cat()};
for (Animal animal: myanimal){
    animal.makeNoise();

}*/

        Animal myCat= new Cat();
        checksound(myCat);

    }

    static void checksound(Animal animal) {
        animal.makeNoise();
        Dog myDog = (Dog)animal;
    }
}