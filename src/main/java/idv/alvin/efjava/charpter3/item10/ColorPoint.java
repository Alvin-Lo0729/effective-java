package idv.alvin.efjava.charpter3.item10;

import java.awt.*;
import java.awt.Point;

/**
 * @author Alvin
 */
public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }
}