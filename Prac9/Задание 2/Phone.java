public class Phone implements Priceable{
    public int price;
    public Phone(int price){
        this.price = price;
    }
    public void getPrice(){
        System.out.println("Цена телефона: " + price);
    }
}
