import models.Model;
import parts.factories.AbstractPartsFactory;
import parts.factories.M1PartsFactory;
import parts.factories.M2PartsFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
    /*
        We're going to make a simple program
        that creates car objects of different
        models.
    */

        AbstractPartsFactory partsFactory;

        if (args.length > 0) {
            partsFactory = new M1PartsFactory();
        } else {
            partsFactory = new M2PartsFactory();
        }

        System.out.println(partsFactory.getDoor());
        System.out.println(partsFactory.getHood());
        System.out.println(partsFactory.getWheel());

    }
}
