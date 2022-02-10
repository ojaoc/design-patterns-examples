package parts.factories;

import parts.Door;
import parts.Hood;
import parts.Wheel;

public abstract class AbstractPartsFactory {
    protected Door doorPrototype;
    protected Hood hoodPrototype;
    protected Wheel wheelPrototype;

    public Door getDoor() {
        return (Door) doorPrototype.clone();
    }

    public Hood getHood() {
        return (Hood) hoodPrototype.clone();
    }

    public Wheel getWheel() {
        return (Wheel) wheelPrototype.clone();
    }
}
