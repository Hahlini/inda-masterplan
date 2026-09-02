public class Example {
    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate(1, 2);
        Coordinate origo = new Coordinate(0, 0);

        System.out.println(coordinate.isZero());
        System.out.println(origo.isZero());
    }
}
