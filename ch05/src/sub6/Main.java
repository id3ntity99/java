package sub6;

public class Main {
  public static void printSound(Pet pet) {
    pet.makeSound();
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    // or
    // Pet dog = new Dog();
    // Cat cat = new Cat();

    printSound(dog);
    printSound(cat);
  }
}
