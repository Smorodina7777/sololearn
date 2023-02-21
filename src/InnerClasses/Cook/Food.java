package InnerClasses.Cook;

public class Food {
    Cookable pasta = new Cookable() {
        @Override
        public void cook(String str) {
            System.out.println("Cook pasta");
        }
    };
    public void prepare(Cookable c, String str) {
        c.cook(str);
    }

    public static void main(String[] args) {
        Food dish = new Food();
        dish.prepare(dish.pasta, "My dish: ");
    }
}
