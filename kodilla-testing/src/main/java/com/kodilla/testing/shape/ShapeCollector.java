package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private List<Shape> figureList = new ArrayList<>();

    public void addFigure(Shape shape) {
        figureList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figureList.contains(shape)) {
            figureList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < figureList.size()) {
            return figureList.get(n);
        }
        return null;
    }

    public String showFigures() {
        String text = new String();
        for (int i = 0; i < figureList.size(); i++) {
            if (i == figureList.size() - 1) {
                text += figureList.get(i);
            } else {
                text += figureList.get(i) + "\n";
            }
        }
        return text;
    }

    public int getShapeCollectorQuantity() {
        return figureList.size();
    }
}
