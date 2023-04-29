
public class TestarLista {
	public static void main(String[] args) {
		ListaSimplesmenteLigada lista = new ListaSimplesmenteLigada();
		System.out.println(lista.estaVazia());
		lista.adicionar("Primeiro");
		lista.adicionar("Segundo");
		lista.adicionar("Terceiro");
		
		
		System.out.println(lista.estaVazia());
		System.out.println("Tamanho da lista: " + lista.getTamanho());
		System.out.println(lista.getElemento(0));
		System.out.println(lista.getElemento(1));
		System.out.println(lista.getElemento(2));
	
		System.out.println(lista.getUltimo());
		System.out.println(lista.estaVazia());
	}
}
