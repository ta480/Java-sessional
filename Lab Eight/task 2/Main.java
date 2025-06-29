class Animal {
void sound() {
System.out.println("Animal Sound");
}
}
class Dog extends Animal {
@Override
void sound() {
System.out.println("Dog bark");
}
}
class Cat extends Animal {
@Override
void sound() {
System.out.println("Cat meows");
}
}
public class Main {
public static void main(String[] args) {
Animal animal = new Animal();
Dog dog = new Dog();
Cat cat = new Cat();
animal.sound();
dog.sound();
cat.sound();
}
}
