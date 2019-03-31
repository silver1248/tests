package types;

public class Point {
    private final int x;
    private final int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return String.format("x = %s, y = %s",  x, y);
    }

    public static final Point zero = new Point(0,0);
    public double distanceFrom0() {
        return distanceFrom(zero);
    }
    public double distanceFrom(Point other) {
        return Math.sqrt(square(x - other.x) + square(y - other.y));
    }
    
    private static int square(int in) {
        return in * in;
    }
    
    public Point addTo(Point other) {
        return new Point(x+other.x, y+other.y);
    }
    
    public static void main(String[] args) {
        Point p1 = new Point(1,3);
        Point p2 = new Point(5,8);
        
        System.out.println(p1 + "  " + p1.distanceFrom0());
        System.out.println(p2 + "  " + p2.distanceFrom0());
        System.out.println(p1.distanceFrom(p2));
        System.out.println(p2.distanceFrom(p1));
        
        System.out.println(p1.addTo(p2));
        
        System.out.println(new Point(-3, -1).distanceFrom0());
    }
}
