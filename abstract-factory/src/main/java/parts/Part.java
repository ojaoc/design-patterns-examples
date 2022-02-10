package parts;

import models.Model;

abstract class Part implements Cloneable {
    private Model model;

    public Part(Model model) {
        this.model = model;
    }

    @Override
    public Part clone() {
        Part clone = null;
        try {
            clone = (Part)super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return model.name();
    }
}
