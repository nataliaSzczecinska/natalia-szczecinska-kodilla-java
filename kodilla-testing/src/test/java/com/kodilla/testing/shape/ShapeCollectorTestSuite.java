package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import com.kodilla.testing.shape.*;


@DisplayName("TDD Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Adding and removing tests")
    class AddAndRemoveTest {
        @DisplayName("Adding test")
        @Test
        void testAddFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();

            //when
            Shape shape1 = new Circle(1.0);
            Shape shape2 = new Square(1.0);
            Shape shape3 = new Triangle(2.0, 4.5);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            shapeCollector.addFigure(shape3);

            //then
            Assertions.assertEquals(3, shapeCollector.getShapeCollectorQuantity());
        }

        @DisplayName("Removing test if figure does not exist")
        @Test
        void testRemoveFigureNotExisting() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(1.0);

            //when
            boolean result = shapeCollector.removeFigure(shape);

            //then
            Assertions.assertFalse(result);
            Assertions.assertEquals(0, shapeCollector.getShapeCollectorQuantity());
        }

        @DisplayName("Removing test if figure exists")
        @Test
        void testRemoveFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(1.0);
            shapeCollector.addFigure(shape);

            //when
            boolean result = shapeCollector.removeFigure(shape);

            //then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapeCollectorQuantity());
        }
    }

    @Nested
    @DisplayName("Getting and display tests")
    class GettingAndDisplayTests {
        @DisplayName("GetFigure test")
        @Test
        void testGetFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Circle(1.0);
            Shape shape2 = new Square(1.0);
            Shape shape3 = new Triangle(2.0, 4.5);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            shapeCollector.addFigure(shape3);

            //when
            Shape retrievedShape1, retrievedShape2, retrievedShape3;
            retrievedShape1 = shapeCollector.getFigure(0);
            retrievedShape2 = shapeCollector.getFigure(1);
            retrievedShape3 = shapeCollector.getFigure(2);


            //then
            Assertions.assertEquals(shape1, retrievedShape1);
            Assertions.assertEquals(shape2, retrievedShape2);
            Assertions.assertEquals(shape3, retrievedShape3);

        }

        @DisplayName("Display figures test")
        @Test
        void testShowFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(1.0);
            shapeCollector.addFigure(shape);
            String text = shape.toString();

            //when
            String allFigures;
            allFigures = shapeCollector.showFigures();

            //then
            Assertions.assertEquals(text, allFigures);
        }
    }
}
