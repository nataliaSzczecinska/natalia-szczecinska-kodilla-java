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
            Shape shape = new Circle(1.0);
            shapeCollector.addFigure(shape);

            //then
            Assertions.assertEquals(1, shapeCollector.getShapeCollectorQuantity());
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
            Shape shape = new Circle(1.0);
            shapeCollector.addFigure(shape);

            //when
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //then
            Assertions.assertEquals(shape, retrievedShape);

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
