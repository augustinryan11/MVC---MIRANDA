public class Main {
  public static void main(String[] args) {
    // Create a model
    Car car = new Car("", "", 0);

    // Create a view
    CarView view = new CarView();

    // Create a controller
    CarController controller = new CarController(car, view);

    // Input the car details
    controller.inputCarDetails();

    // Update the view
    controller.updateView();
    
  }
}
