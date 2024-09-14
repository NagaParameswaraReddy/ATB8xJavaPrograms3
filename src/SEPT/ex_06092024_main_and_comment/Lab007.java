package SEPT.ex_06092024_main_and_comment;

public class Lab007 {
    // Correctly defined main method - JVM entry point
    public static void main(String[] args) {
        System.out.println("Hello world!"); // This line will be executed
    }

    // Incorrect main method - JVM does not recognize this as the entry point
    public static void main(String args) {
        System.out.println("Hello world!"); // This line will not be executed
    }

    // Incorrect main method - JVM does not recognize this as the entry point
    public void main(int args) {
        System.out.println("Hello world!"); // This line will not be executed
    }
}
