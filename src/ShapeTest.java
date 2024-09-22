class ShapeTest {
    public static void main(String[] args) {
        // Створюємо об'єкти різних фігур
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape ellipse = new Ellipse();

        // Створюємо принтер для виведення назв фігур
        ShapePrinter printer = new ShapePrinter();

        // Виводимо назви фігур
        printer.printShapeName(circle);     // Виведе: Shape: Circle
        printer.printShapeName(square);     // Виведе: Shape: Square
        printer.printShapeName(triangle);   // Виведе: Shape: Triangle
        printer.printShapeName(rectangle);  // Виведе: Shape: Rectangle
        printer.printShapeName(ellipse);    // Виведе: Shape: Ellipse
    }
}