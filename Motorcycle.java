public class Motorcycle extends Auto {
    private String typeOfHandlebar;

    public Motorcycle(String mark, String model, int year, String typeOfHandlebar) 
    {
        super(mark, model, year);
        this.typeOfHandlebar = typeOfHandlebar;
    }

    public String getTypeOfHandlebar()
    {
        return typeOfHandlebar;
    }
    public void setTypeOfHandlebar(String typeOfHandlebar)
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
