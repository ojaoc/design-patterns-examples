import tshirts.TShirt;
import tshirts.factories.GreenTShirtFactory;
import tshirts.factories.RedTShirtFactory;
import tshirts.factories.TShirtFactoryInterface;

public class FactoryMethodMain {
    public static void main(String[] args) {
    /*
        We're going to make a simple program
        that creates t-shirt objects of different
        colors.
    */

        TShirtFactoryInterface tShirtFactory;

        if (args.length > 0) {
            tShirtFactory = new RedTShirtFactory();
        } else {
            tShirtFactory = new GreenTShirtFactory();
        }

        TShirt tShirt = tShirtFactory.makeTShirt();

        System.out.println(tShirt.getColor());

    }
}
