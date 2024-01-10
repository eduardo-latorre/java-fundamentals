public class J01Variables {

    /*
    Primitives:
        - Integer:
            - int       4 bytes
            - long      8 bytes specify l
            - short     2 bytes
            - byte      1 byte = 8 bits
        - Float:
            - double    4 bytes
            - float     2 bytes, must specify f at the end
        - Char:
            - char      2 bytes, UNICODE, uses only ''
        - Boolean:
            - boolean   true or false, not (0, 1)
    */
    public static void main(String args[]){
        // Primitive variables
        int integer = 1;
        char character = 'a';
        long longValue = 200l;
        double doubleValue = 5.6;
        float floatValue = 5.6f;

        // Increase char
        char c1 = 'a';
        character++;
        System.out.println("increasing character: " + character);
        int result = character + 1;
        System.out.println("character + 1: " + result); // Prints the ASCII value
    }

}