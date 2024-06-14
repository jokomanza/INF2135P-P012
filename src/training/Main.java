package training;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        exception1();
        exception2();
        exception3();
    }

    private static void exception1() {
        String name = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");

        try {
            name = reader.readLine();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Hello, " + name);
    }

    private static void exception2() {
        try {
            throw new Exception("This is an intentional exception.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void exception3() throws Exception {
        TryThrows tryThrows = new TryThrows();
        try {
            tryThrows.throwsException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class TryThrows {
    public void throwsException() throws Exception {
        throw new Exception("This is an intentional exception.");
    }
}
