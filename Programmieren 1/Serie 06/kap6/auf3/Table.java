package auf3;

public class Table extends Furniture{

    private double area;

    //constructor for a table
    public Table(Material material, double pricePerHour, double workedHours, double area) {
        super(material, pricePerHour, workedHours);
        this.area = area;
    }

    // calculate the total price for a table
    public double totalPrice() {
        return super.calculateEffort() + area * material.materialCost;
    }
}