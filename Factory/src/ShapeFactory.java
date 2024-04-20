public class ShapeFactory {

    Shape getShape(String shape) {
        return switch (shape) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
