public class MenuBuilder {
    private String entry;
    private String mainCourse;
    private String drink;
    private String desert;


    public MenuBuilder setEntry(String entry) {
        this.entry = entry;
        return this;
    }

    public MenuBuilder setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
        return this;
    }

    public MenuBuilder setDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public MenuBuilder setDesert(String desert) {
        this.desert = desert;
        return this;
    }

    public Menu getMenu() {
        return new Menu(entry, mainCourse, drink, desert);
    }
}
