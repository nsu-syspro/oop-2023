public record Point(int x) {
    public static Point zero() {
        return new Point(0);
    }
}