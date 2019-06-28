// Essa foi a Aula 1.1 do Canal.

public class MeusArrays {
	public static void main(String[] args) {
		String[] listaCompras = new String[4];

		listaCompras[0] = "Arroz";
		listaCompras[3] = "Feijão";
		listaCompras[1] = "Milho";
		listaCompras[0] = "Adriano";
		listaCompras[1] = "Farinha";
		listaCompras[2] = "*";

		listaCompras[4] = "Ultimo";
		
		System.out.println("Lista: ");

		for (int i = 0; i < listaCompras.length; i++) {
			System.out.print("[" + listaCompras[i] + "]");
		}

		System.out.println();
	}
}

// {["Adriano"],["Farinha"],[null],["Feijão"]}
