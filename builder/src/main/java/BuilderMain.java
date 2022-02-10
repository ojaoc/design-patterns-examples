public class BuilderMain {
    public static void main(String[] args) {
        MenuBuilder menuBuilder = new MenuBuilder();

        Menu menu = menuBuilder
                        .setEntry("Garlic Bread")
                        .setMainCourse("Pizza Carnivora")
                        .setDrink("Beer")
                        .setDesert("Chocolate Mousse")
                        .getMenu();

        System.out.println(menu);

    }
}
