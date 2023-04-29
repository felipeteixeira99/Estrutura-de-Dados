
public class ListaSimplesmenteLigada implements Lista {
	
	private Celula primeira; 
	
	@Override
	public Celula getInicio() {
		return primeira;
	}

	@Override
	public Celula getUltimo() { //metodo que retorna o ultimo elemento da lista
		if(estaVazia()) { //Verifica se a lista está vazia //quando o valor é boolean não precisa comparar
			return null;
		}
		Celula atual = primeira; //segnifica que enquanto atual for diferente de null, atual vai receber o proximo elemento da lista
		while(atual.getProximo() != null) { //quando atual for == null / atual não recebe mais o proximo elemento
			atual = atual.getProximo(); 
		}
		return atual; //ele vai retornar a atual quando a expressao 
	}

	@Override
	public int getTamanho() { //metodo que retorna o tamanho da lista
		if(estaVazia()) { //se a lista tiver vazia, não faz nada e retorna 
			return 0;
		} 
		else { //se não ele vai comecar a contar e retornar o valor do contador C
			int c = 1; //se a lista não estiver vazia, significa que tem pelo menos um elemento
			Celula atual = primeira;
			while(atual.getProximo() != null) {
				atual = atual.getProximo();
				c++; //se a expressao acima for verdadeira ele vai incrementar +1 no contador C 
			}
			return c; //vai me retornar o valor de C 
		}
	}

	@Override
	public void adicionar(String valor) { //metodo que adiciona um elemento na lista
		Celula celula = new Celula(); //contrutor - criando um novo objeto do tipo celula
		celula.setValor(valor); //o objeto celula esta recebendo a variavel local "valor" como valor
		if(estaVazia()) {  //verifica se a lista esta vazia e se for verdade ela atribui o valor de celula como primeiro elemento da lista
			primeira = celula;
		}
		else { 
			getUltimo().setProximo(celula);
			// se nao, ela atribui o valor da variavel valor como ultimo elemento da lista
		}
		
	}
	
	@Override 
	public void adicionar(String celula, int posicao) {
		//TODO adiciona elemento em uma posicao especifica
	}

	@Override //significa que esta sobrescrevendo de uma classe ou interface
	public void remover(String celula) {
		//TODO remover elemento
	}

	@Override
	public void remover(int posicao) {
		//TODO Remover pela a posicao
	}

	@Override
	public String getElemento(int posicao) { //este metodo pega um elemento de acordo com a sua posicao
		// 0 retorna o primeiro elemento 0 = 1 (mesma tratativa de um array)
		if(estaVazia()) { //verifica se esta vazia se for true vai retorna "null"
			return null;
		}
		else {
			if(posicao > getTamanho()-1) {
				return null; // o elemento nao existe, pois a posicao nao existe
			}
			else {
				Celula atual = primeira; //TODO tirar as duvidas do que esta linha está fazendo
				for(int i = 0; i < posicao; i++) { //aqui eu especifiquei uma posicao e o laco vai se repetir ate o contador for = essa posicao
					atual = atual.getProximo();    //e vai apresentar o proximo elemento enquanto é feito o incremento nele 
				}
				return atual.getValor(); // e vai retornar o o valor que esta dentro desse elemento
			}
		}
	}

	@Override
	public int getPosicao(String celula) {
		//TODO GetPosicao
		return 0;
	}

	@Override
	public boolean estaVazia() {
		return primeira == null;
	}

	@Override
	public void limparLista() {		
		primeira = null;
	}
	
}
