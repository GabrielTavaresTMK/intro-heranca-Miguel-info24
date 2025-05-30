public class Main {
    public static void main(String[] args) {
        Car car = new Car("fiat", "uno", 1998, 2);
        Motorcycle motorcycle = new Motorcycle("honda", "cg titan 160", 2014, "simples");
        
        System.out.println("veiculos antes da alteração");
        car.displayDetails();
        motorcycle.displayDetails();

        car.setMark("volkswagen");
        car.setModel("gol");
        car.setYear(2007);
        car.setNumberOfDoors(4);

        motorcycle.setMark("Yamaha");
        motorcycle.setModel("Fazer");
        motorcycle.setYear(2020);
        motorcycle.setTypeOfHandlebar("avantajado");

        System.out.println("veiculos depois da alteração");
        car.displayDetails();
        motorcycle.displayDetails();
    }
    
}