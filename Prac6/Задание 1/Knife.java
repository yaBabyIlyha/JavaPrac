class Knife extends Dish{
    public int knifeLenght;
    public String sharpness;
    public Knife(String name, String material, String color, int knifeLenght, String sharpness){
        super(name, material, color);
        this.knifeLenght = knifeLenght;
        this.sharpness = sharpness;
    }
    public void displayInfo(){
        System.out.println("Тип прибора: " + super.getName());
        System.out.println("Материал: " + super.getMaterial());
        System.out.println("Цвет: " + super.getColor());
        System.out.println("Длина ножа: " + knifeLenght);
        System.out.println("Острота ножа: " + sharpness);
    }
}