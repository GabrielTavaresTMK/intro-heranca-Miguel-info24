public class Car extends Auto {
    private int numberOfDoors;
    public Car(String mark, String model, int year, int numberOfDoors) 
    {
        super(mark, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors)
    {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("numberOfDoors: " + numberOfDoors);
    }
}
