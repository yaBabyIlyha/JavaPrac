class Plate extends Dish{
    public int Diametr;
    public Plate(String name, String material, String color, int Diametr){
        super(name, material, color);
        this.Diametr = Diametr;
    }
    public void displayInfo(){
        System.out.println("Тип прибора: " + super.getName());
        System.out.println("Материал: " + super.getMaterial());
        System.out.println("Цвет: " + super.getColor());
        System.out.println("Диаметр тарелки: " + Diametr);
    }
}