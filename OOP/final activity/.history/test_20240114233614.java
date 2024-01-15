// Shape class
class Shape {
    public void displayShapeName() {
        System.out.println("This is a generic shape");
    }
}

// Circle class, extends Shape
class Circle extends Shape {
    @Override
    public void displayShapeName() {
        System.out.println("This is a circle");
    }
}

// Square class, extends Shape
class Square extends Shape {
    @Override
    public void displayShapeName() {
        System.out.println("This is a square");
    }
}

// Main class
class ShapeDemo {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape genericShape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();

        // Displaying shape names using polymorphism
        displayShapeName(genericShape);
        displayShapeName(circle);
        displayShapeName(square);
    }

    // Polymorphic method to display the shape name
    public static void displayShapeName(Shape shape) {
        shape.displayShapeName();
    }
}
