package parts.factories;

import models.Model;
import parts.Door;
import parts.Hood;
import parts.Wheel;

public class M1PartsFactory extends AbstractPartsFactory {
    Model m1 = Model.M1;

    public M1PartsFactory() {
        doorPrototype = new Door(m1);
        hoodPrototype = new Hood(m1);
        wheelPrototype = new Wheel(m1);
    }
}
