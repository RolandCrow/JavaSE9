package interfaceAndLambdas.pixels;

import java.awt.*;

@FunctionalInterface
public interface PixelFunction {
    Color apply(int x, int y);
}


