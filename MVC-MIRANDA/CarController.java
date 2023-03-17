public class CarController {
  private Car model;
  private CarView view;

  public CarController(Car model, CarView view) {
    this.model = model;
    this.view = view;
  }

  public void setCarMake(String make) {
    model.setMake(make);
  }

  public void setCarModel(String model) {
    this.model.setModel(model);
  }

  public void setCarYear(int year) {
    this.model.setYear(year);
  }

  public void updateView() {
    view.displayCarDetails(model.getMake(), model.getModel(), model.getYear());
  }

  public void inputCarDetails() {
    String make = view.getCarMake();
    String modelName = view.getCarModel();
    int year = view.getCarYear();
    model.setMake(make);
    model.setModel(modelName);
    model.setYear(year);
}
}
