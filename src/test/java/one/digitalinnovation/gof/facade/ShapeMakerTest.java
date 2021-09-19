package one.digitalinnovation.gof.facade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ShapeMakerTest {

    ShapeMaker shapeMaker;

    @BeforeAll
    public void createInstanceShapeMaker(){
        shapeMaker = new ShapeMaker();
    }

    @Test
    public void testDrawRectangle(){
        assertEquals("Rectangle::draw()", shapeMaker.drawRectangle());
    }

    @Test
    public void testDrawSquare(){
        assertEquals("Square::draw()", shapeMaker.drawSquare());
    }
}
