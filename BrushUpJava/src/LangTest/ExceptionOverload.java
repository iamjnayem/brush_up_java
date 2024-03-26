package LangTest;


public class ExceptionOverload {

    public static void method(int value) throws NullPointerException {
        if (value < 0) {
            throw new NullPointerException("Value cannot be negative");
        }
        // Some code that might throw a NullPointerException
    }

    public static void method(double value) throws IllegalArgumentException {
        if (value == 0.0) {
            throw new IllegalArgumentException("Value cannot be zero");
        }
        // Some code that might throw an IllegalArgumentException
    }

    // Overloaded method that throws a different type of exception
    public static void method(String value) throws ArrayIndexOutOfBoundsException {
        if (value == null) {
            throw new ArrayIndexOutOfBoundsException("Value cannot be null");
        }
        // Some code that might throw an ArrayIndexOutOfBoundsException
    }
}