public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(CoffeeI decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.25;
    }
}