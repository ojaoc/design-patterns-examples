public class Menu {
    private String entry;
    private String mainCourse;
    private String drink;
    private String desert;

    public Menu(String entry, String mainCourse, String drink, String desert) {
        this.entry = entry;
        this.mainCourse = mainCourse;
        this.drink = drink;
        this.desert = desert;
    }

    @Override
    public String toString() {
        return "Menu [entry=" + entry + ", mainCourse=" + mainCourse + ", drink=" + drink + ", desert=" + desert;
    }

}
