package dhoni;

public class pizzaMain {
    public static void main(String[] args) {
        pizzaConstructor pizza = new pizzaConstructor("Garlic","Tomato","mozzarella","pepperoni",750 );
        System.out.println("Here are your pizza details ");
        System.out.println("your choice of bread is: " + pizza.bread);
        System.out.println("your choice of sauce is: " + pizza.sauce);
        System.out.println("your choice of cheese is: " + pizza.cheese);
        System.out.println("your topping for pizza is: " + pizza.topping);
        System.out.println("your pizza amount total is: " +pizza.amount);

    }
}