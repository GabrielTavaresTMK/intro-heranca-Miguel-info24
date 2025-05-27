public class Auto {
    
    private String mark;
    private String model;
    private int year;
    public Auto(String mark, String model, int year)
    {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    public String  getMark()
    {
        return mark;
    }

    public String  getModel()
    {
        return model;
    }

    public int  getYear()
    {
        return year;
    }

    public void setMark(String mark)
    {
        this.mark = mark;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void displayDetails()
    {
        System.out.println("Details of this auto:");
        System.out.println("Mark: " + mark);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
