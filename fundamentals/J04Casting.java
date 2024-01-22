package fundamentals;

public class J04Casting {
    /*
        To convert a value types into others
        - Implicit, when a value is converted into a higher range byte value, no need to ()
        - Explicit, when a value is converted into a shorted range byte value, () is needed
    * */
    public static void main (String[] a){
        // Implicit casting
        byte b = 127;
        int i = b;
        System.out.println(i);

        // Explicit casting
        int i2 = 128;
        byte b2 = (byte) i2;
        System.out.println(b2);

        float f = 250f;
        int d = (int) f;
        System.out.println(d);

        // Promoting values, even if these two byte variable exceeds their byte range, result will be promoted to an integer
        byte b4 = 100, b5 = 127;
        int result = b4 + b5;
        System.out.println("result is: " + result);
    }
}
