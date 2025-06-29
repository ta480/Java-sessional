
public class Main {
    public static void main(String[] args) {
       
        String name = "Jeshan Nath";
        String studentId = "YourStudentID"; 
        int age = 20;
        String email = "yourEmail@example.com"; 
        String phone = "+8801XXXXXXXXX"; 
        String address = "Your Address, Your Area, Your City"; 

     
        System.out.println("Personal Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);

      
        System.out.printf("\nFormatted Information:\nName: %s\nStudent ID: %s\nAge: %d\nEmail: %s\nPhone: %s\nAddress: %s\n", name, studentId, age, email, phone, address);
    }
}
