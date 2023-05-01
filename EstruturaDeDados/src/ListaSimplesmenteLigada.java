
public class ListaSimplesmenteLigada implements Lista {
	
	private Celula primeira; //variavel do tipo celula - ponteiro para a primeira celula da lista 
	
	private Celula getInicio() {
		return primeira;
	}

	
	private Celula getUltimo() { //metodo que retorna o ultimo elemento da lista
		if(estaVazia()) { //Verifica se a lista está vazia //quando o valor é boolean não precisa comparar
			return null;
		}
		Celula atual = primeira; //segnifica que enquanto atual for diferente de null, atual vai receber o proximo elemento da lista
		while(atual.getProximo() != null) { //quando atual for == null / atual não recebe mais o proximo elemento
			atual = atual.getProximo(); 
		}
		return atual; //ele vai retornar a atual quando a expressao falsa
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
	public void adicionar(String valor, int posicao) {
		//TODO adiciona elemento em uma posicao especifica
		
		if(posicao > getTamanho()) return;
		
		Celula novaCelula = new Celula();
		novaCelula.setValor(valor);
		if(posicao == 0) {
			novaCelula.setProximo(primeira);
			primeira = novaCelula;
		}
		else {
			Celula anterior = getCelula(posicao - 1);
			Celula proxima = anterior.getProximo();
			anterior.setProximo(novaCelula);
			novaCelula.setProximo(proxima);
		}
	}

	@Override //significa que esta sobrescrevendo de uma classe ou interface
	public void remover(String valor) {
		
		// int posicao = getPosicao(valor);
		// if(posicao != -1) {
		// 	remover(posicao);
		// }

		if(!estaVazia()) { //ele so vai ser executado se a lista não estiver vazia
			Celula elementoParaRemover = null; 
			for(int i = 0; i < getTamanho(); i++) { //varrendo a lista de 0 ate o final dela 
				if(getElemento(i).equals(valor)) {
					elementoParaRemover = getCelula(i);
					break;
				}
			}
			
			if(elementoParaRemover == null) return; //quando o bloco tiver so uma linha para ser executada
			
			if(elementoParaRemover == primeira) {
				primeira = primeira.getProximo();
				return;
			}
			
			Celula elementoAnterior = null;
			
			for(int i = 0; i < getTamanho(); i++) {
				if(getCelula(i).getProximo() == elementoParaRemover)  {
					elementoAnterior = getCelula(i);
					break;
				}
			}
			elementoAnterior.setProximo(elementoParaRemover.getProximo());
		}	
	}

	@Override
	public void remover(int posicao) {
		if(posicao < getTamanho()) {
			if(posicao == 0) {
				primeira = primeira.getProximo();
			}
			
			else {
				
				Celula elementoParaRemover = getCelula(posicao);
				Celula elementoAnteriorAoRemovido = getCelula(posicao - 1);
				Celula elementoPosteriorAoRemovido = elementoParaRemover.getProximo();
				elementoAnteriorAoRemovido.setProximo(elementoPosteriorAoRemovido);
				
				//getCelula(posicao - 1).setProximo(getCelula(posicao).getProximo());
			}
		}
	}
	
	private Celula getCelula(int posicao){ //este metodo pega um elemento de acordo com a sua posicao
		// 0 retorna o primeiro elemento 0 = 1 (mesma tratativa de um array)
		if(estaVazia()) { //verifica se esta vazia se for true vai retorna "null"
			return null;
		}
		else {
			if(posicao > getTamanho()-1) {
				return null; // o elemento nao existe, pois a posicao nao existe
			}
			else {
				Celula atual = primeira; 
				for(int i = 0; i < posicao; i++) { //aqui eu especifiquei uma posicao e o laco vai se repetir ate o contador for = essa posicao
					atual = atual.getProximo();    //e vai apresentar o proximo elemento enquanto é feito o incremento nele 
				}
				return atual; // e vai retornar esse elemento
			}
		}
	}
		

	@Override
	public String getElemento(int posicao) { 
		Celula celula = getCelula(posicao);
		if(celula != null) {
			return celula.getValor();
		} 
		else {
			return null;
		}
	}

	@Override
	public int getPosicao(String valor) {
		for(int i = 0; i < getTamanho(); i++) {
			if(getElemento(i).equals(valor)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean estaVazia() {
		return primeira == null;
	}

	@Override
	public void limparLista() {		
		primeira = null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < getTamanho(); i++) {
			sb.append(getElemento(i));
			sb.append("[");
			sb.append(i);
			sb.append("]    ");
		}
		return sb.toString();
	}
	
}
