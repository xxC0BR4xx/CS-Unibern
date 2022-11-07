package auf3;



public class Furniture {
    public Material material;
    protected double pricePerHour;
    protected double workedHours;

    public Furniture(Material material, double pricePerHour, double workedHours) {
        this.material = material;
        this.pricePerHour = pricePerHour;
        this.workedHours = workedHours;
    }

    //calculate Effort with workedHours times the price per hour
    public double calculateEffort() {
        return workedHours * pricePerHour;
    }
}