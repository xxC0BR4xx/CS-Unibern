package auf3;

//enum with names for the materials and each price for the
//different materials
public enum Material {
    EICHE("Eiche", 10),
    BUCHE("Buche", 20),
    ESCHE("Esche", 30);

    public String name;
    public double materialCost;

    Material(String name, double materialCost) {
        this.name = name;
        this.materialCost = materialCost;
    }
}