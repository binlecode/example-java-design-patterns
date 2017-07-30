package sample.designpattern.builder;

/**
 * Builder is useful for taking a strategic way of composing a complex class instance.
 * This is normally simpler and safer than implementing a variety of overloaded constructors of the target class.
 */
public class MealBuilder {
    private static MealBuilder instance = new MealBuilder();
    private MealBuilder() {}
    public static MealBuilder getInstance() {
        return instance;
    }

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public static void main(String[] args) {
        MealBuilder mb = MealBuilder.getInstance();

        System.out.println("Veg Meal : ");
        Meal vegMeal = mb.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("  total cost : " + vegMeal.cost());

        System.out.println("Non Veg Meal : ");
        Meal nonVegMeal = mb.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println("  total cost : " + nonVegMeal.cost());
    }
}
