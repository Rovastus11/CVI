public class Coffee implements CoffeeI {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double getCost() {
        return 1.50;
    }
}