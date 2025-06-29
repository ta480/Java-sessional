public class Shape {
static void Area(int a, int b) {
System.out.println("Area of Rectangle is: " + a * b);
}
static void Area(double r) {
System.out.println("Area of Circle is: " + 3.1416 * r * r);
}
public static void main(String[] args) {
Area(5, 6);
Area(5.8);
}
}