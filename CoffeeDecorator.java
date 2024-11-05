public abstract class CoffeeDecorator implements CoffeeI {
    protected CoffeeI decoratedCoffee;

    public CoffeeDecorator(CoffeeI decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}