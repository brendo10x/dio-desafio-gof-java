package one.digitalinnovation.gof.facade;

import lombok.Data;

@Data
public class ShapeMaker {

    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        rectangle = new Rectangle();
        square = new Square();
    }

    public String drawRectangle() {
       return rectangle.draw();
    }

    public String drawSquare() {
       return square.draw();
    }
}
