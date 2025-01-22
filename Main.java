public class Main {
    public static void main(String[] args) {
        CoffeeI coffee = new Coffee();
        System.out.println(printCoffee(coffee));

        CoffeeI coffeeWithMilk = new MilkDecorator(new Coffee());
        System.out.println(printCoffee(coffeeWithMilk));

        CoffeeI coffeeWithSuggar = new Cukor(new Coffee());
        System.out.println(printCoffee(coffeeWithSuggar));
    }

    private static String printCoffee(CoffeeI coffee) {
        return coffee.getDescription() + "\n" + "Drahota: " + coffee.getCost() + "Bilionov" + "\n";
    }
}