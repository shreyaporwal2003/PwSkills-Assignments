public class MethodOverloadingDemo {
    // Method with one integer parameter
    public void display(int num) {
        System.out.println("Integer: " + num);
    }

    // Method with one double parameter
    public void display(double num) {
        System.out.println("Double: " + num);
    }

    // Method with one string parameter
    public void display(String message) {
        System.out.println("String: " + message);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();
        demo.display(10);         // Calls the method with an integer parameter
        demo.display(10.5);       // Calls the method with a double parameter
        demo.display("Hello!");   // Calls the method with a string parameter
    }
}
