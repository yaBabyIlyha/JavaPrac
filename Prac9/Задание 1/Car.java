public class Car implements Nameable{
    public String name;
    public Car(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println("Название машины: " + name);
    }

}
