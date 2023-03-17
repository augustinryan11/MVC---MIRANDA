import java.util.Scanner;

public class CarView {
  private Scanner scanner = new Scanner(System.in);

  public String getCarMake() {
    System.out.print("Enter car make: ");
    return scanner.nextLine();
  }

  public String getCarModel() {
    System.out.print("Enter car model: ");
    return scanner.nextLine();
  }

  public int getCarYear() {
    System.out.print("Enter car year: ");
    return scanner.nextInt();
  }

  public void displayCarDetails(String make, String model, int year) {
    System.out.println("Car details:");
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
  }
}