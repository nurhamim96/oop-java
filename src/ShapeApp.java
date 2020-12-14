public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getConner());
        var rectangle = new Rectangle();
        System.out.println("INI GET CHILD " + rectangle.getConner());
        System.out.println("INI GET PARENT DENGAN KEYWORD SUPER PADA OVERRIDE " + rectangle.getParentConner());
    }
}
