package app.wrapper;

public class WrapperClasses {
    public static void main(String[] args) {
        int inteiroPrimitivo = 1;
        // inteiroPrimitivo.
        // int intPrim2 = inteiroPrimitivo + 1;

        // Wrapper Integer
        Integer inteiro = 1; // Autoboxing
        Integer inteiro2 = new Integer(1);
        Integer inteiro3 = new Integer("1");
        Integer inteiro4 = Integer.valueOf(1);
        Integer inteiro5 = Integer.valueOf("1");

        System.out.println("int -> " + inteiroPrimitivo);
        System.out.println("inteiro -> " + inteiro);
        System.out.println("inteiro2 -> " + inteiro2);
        System.out.println("inteiro3 -> " + inteiro3);
        System.out.println("inteiro4 -> " + inteiro4);
        System.out.println("inteiro5 -> " + inteiro5);

        System.out.println("Quero um numero float a partir de um int -> " + inteiro.floatValue());

        Byte b = Byte.valueOf((byte)1); // byte
        Short s = Short.valueOf((short)1); // short
        Long l = Long.valueOf(1); // long

        Float f = Float.valueOf(1.0f); // float
        Double d = Double.valueOf(1.0); // double
        d.intValue();

        Character c = Character.valueOf('a'); // char

        Boolean bo = Boolean.valueOf("True"); // boolean
    }

}