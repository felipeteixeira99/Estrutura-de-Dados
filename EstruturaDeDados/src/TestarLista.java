
public class TestarLista {
	public static void main(String[] args) {
		ListaSimplesmenteLigada lista = new ListaSimplesmenteLigada();
		System.out.println(lista.estaVazia());
		lista.adicionar("Primeiro");
		lista.adicionar("Segundo");
		lista.adicionar("Terceiro");
		
		System.out.println(lista.estaVazia());
		System.out.println(lista.getTamanho());
		System.out.println(lista.getElemento(1));
		System.out.println(lista.getElemento(0));
		System.out.println(lista.getElemento(2));
	}
}
