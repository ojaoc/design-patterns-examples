package tshirts.factories;

import colors.Color;
import tshirts.TShirt;

public class GreenTShirtFactory implements TShirtFactoryInterface {
    @Override
    public TShirt makeTShirt() {
        return new TShirt(Color.GREEN);
    }
}
