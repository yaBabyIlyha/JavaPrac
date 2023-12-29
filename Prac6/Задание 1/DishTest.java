public class DishTest {
    public static void main(String args[]){
        Dish knife1 = new Knife("Нож обычный", "Металл/дерево", "Черный", 44, "Cредняя");
        knife1.displayInfo();
        Dish plate1 = new Plate("Тарелка", "Форфор", "Белый", 21);
        plate1.displayInfo();
    }
}
