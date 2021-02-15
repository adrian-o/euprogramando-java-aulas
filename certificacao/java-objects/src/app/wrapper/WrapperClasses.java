package app.wrapper;

import java.util.ArrayList;
import java.util.List;

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


        // Autoboxing
        //List<double> dp = new ArrayList<>();
        
        List<Double> ds = new ArrayList<>();
        ds.add(new Double("3"));
        ds.add(50.1);
        // ds.add(new Integer(50)); ERRO
        // ds.add(50); // ERRO
        // ds.add(new Double(50)); // CERTO

        System.out.println("ANTES DE REMOVER");
        ds.forEach(System.out::println);
        
        ds.remove(3.0);

        System.out.println("DEPOIS DE REMOVER");
        ds.forEach(System.out::println);


        List<Integer> li = new ArrayList<>();
        li.add(1); // 0
        li.add(2); // 1
        li.add(8); // 2
        li.add(25);// 3
        li.add(12);// 4

        li.remove(3);

        li.forEach(System.out::println);

    }

}