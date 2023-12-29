public abstract class Dish{
    public String name;
    public String material;
    public String color;
    public String getColor() {return color;}
    public String getName() {return name;}
    public String getMaterial() {return material;}
    public Dish(String name, String material, String color){
        this.name = name;
        this.material = material;
        this.color = color;
    }
    public abstract void displayInfo();
}
