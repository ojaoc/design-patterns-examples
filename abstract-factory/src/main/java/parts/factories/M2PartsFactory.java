package parts.factories;

import models.Model;
import parts.Door;
import parts.Hood;
import parts.Wheel;

public class M2PartsFactory extends AbstractPartsFactory {
    Model m2 = Model.M2;

    public M2PartsFactory() {
        doorPrototype = new Door(m2);
        hoodPrototype = new Hood(m2);
        wheelPrototype = new Wheel(m2);
    }
}
