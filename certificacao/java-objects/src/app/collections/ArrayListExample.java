package app.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        nomes.add("Adriano");

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Adriano");
        
        System.out.println("Igualdade com == -> " + (nomes == nomes2));
        System.out.println("Usando método equals -> " + nomes.equals(nomes2));

        nomes2 = nomes;

        System.out.println("Igualdade com == -> " + (nomes == nomes2));
        System.out.println("Usando método equals -> " + nomes.equals(nomes2));

        // nomes.add("Carlos");
        // nomes.add("Jhonatan");
        // nomes.add("João");

        // System.out.println("Lista nomes contém a String Adriano -> " + nomes.contains("Adriano"));

        // //nomes.clear();

        // System.out.println("Lista nomes contém a String Adriano -> " + nomes.contains("Adriano"));
        // System.out.println("Lista é vazia -> " + nomes.isEmpty());
        // System.out.println("Tamanho da lista -> " + nomes.size());


        /*
        ArrayList<Object> lista = new ArrayList<>(); // ArrayList(5); 
        lista.add("O canal ");
        lista.add("Eu Programando ");
        lista.add("completa hoje ");
        lista.add(1);
        lista.add(" ano de existência. ");
        lista.add("É ");
        lista.add(true);
        lista.add(new ArrayListExample());

        for (Object s : lista) {
            if (s instanceof String) {
                System.out.println(((String)s).toUpperCase());
            }
        }

        ArrayList lista2 = new ArrayList(lista);
        lista2.remove(2);
        
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Lista: " + lista);
        System.out.println("Lista2: " + lista2);

        List<String> lista3 = new ArrayList<>();
        lista3.add("A"); //0 
        lista3.add("B"); //1
        lista3.add("F"); //2
        lista3.add("C"); //3
        lista3.add("D"); //4 
        lista3.add("E"); //5
        lista3.add("F"); //6

        System.out.println(lista3);

        boolean removed = lista3.remove("F");

        if (removed)
            System.out.println(lista3);
        else 
            System.out.println("Nada foi removido do ArrayList");

        // String removedObj = lista3.remove(5);

        // System.out.println(lista3 + " Removido o objeto " + removedObj);

        String myStr = lista3.get(1);

        System.out.println("Posição 1 -> " + myStr);

        //lista3.set(1, removedObj);

        System.out.println(lista3);


        List<String> lista4 = new ArrayList<>();
        lista4.add(null);
        lista4.add("");
        lista4.add("");

        System.out.println("Tamanho da lista4 -> " + lista4.size());
        
        if (lista4.size() > 0) {
            System.out.println("Lista 4 está vazia? R = " + lista4.isEmpty());
        }
        */
        //lista4.size() == 0;
        //lista4.isEmpty();
    }
}