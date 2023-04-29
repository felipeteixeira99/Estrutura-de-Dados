
public class TestarGetElemento {

	public static void main(String[] args) {
		ListaSimplesmenteLigada lista = new ListaSimplesmenteLigada();
		System.out.println(lista.getElemento(0)); //printar na tela o elemento da posicao 0, vai retornar null
		// nao existe nenhum elemento nessa posicao
		System.out.println(lista.estaVazia());
		// entao a expressao boolean é true 
		lista.adicionar("Elemento 1"); //adicionei um elemento - este elemento é o primeiro elemento da lista 
		System.out.println(lista.estaVazia()); //a lista nao esta mais vazia e vai retornar false 
		System.out.println(lista.getElemento(0) + " na posicao 0 "); //printar na tela o elemento da posicao 0
		System.out.println(lista.getUltimo()); //mostra o endereco da memoria
		
	}

}
