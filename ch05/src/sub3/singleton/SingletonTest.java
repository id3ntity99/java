package sub3.singleton;

public class SingletonTest {
  public static void main(String[] args) {
    CarSingleton car = CarSingleton.getInstance("Tuscon", "black", 4);
    System.out.println("Name of car: " + car.getName());

    CarSingleton newCar = CarSingleton.getInstance("Mustang GT", "white", 2);
    System.out.println("car == newCar?: " + newCar.equals(car));

    System.out.println("Name of newCar: " + newCar.getName());
  }
}
