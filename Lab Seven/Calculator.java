public class Calculator {
static int add(int a, int b) {
return a + b;
}
static double add(double a, double b) {
return a + b;
}
static int add(int a, int b, int c) {
return a + b + c;
}
public static void main(String[] args) {
int x = add(5,6);
System.out.println(x);
double y = add(5.8,6.8);
System.out.println(y);
int z = add(5,20);
System.out.println(z);
}
}