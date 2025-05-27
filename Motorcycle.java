public class Motorcycle extends Auto {
    private int typeOfHandlebar;

    public Motorcycle(String mark, String model, int year, int typeOfHandlebar) 
    {
        super(mark, model, year);
        this.typeOfHandlebar = typeOfHandlebar;
    }

    public int getTypeOfHandlebar()
    {
        return typeOfHandlebar;
    }
    public void setTypeOfHandlebar(int typeOfHandlebar)
    {
        this.typeOfHandlebar = typeOfHandlebar;
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("type of Handlebar: " + typeOfHandlebar);
    }
}
