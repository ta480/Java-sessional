class Shape {
void draw() {
System.out.println("Drawing shape");
}
}
class Circle extends Shape {
@Override
void draw() {
System.out.println("Drawing Circle");
}
}
class Rectangle extends Shape {
@Override
void draw() {
System.out.println("Drawing Rectangle");
}
}
public class Main {
public static void main(String[] args) {
Shape shape = new Shape();
Circle circle = new Circle();
Rectangle rectangle = new Rectangle();
shape.draw();
circle.draw();
rectangle.draw();
}
}
