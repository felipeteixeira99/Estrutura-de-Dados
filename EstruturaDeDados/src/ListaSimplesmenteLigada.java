
public class ListaSimplesmenteLigada implements Lista {
	
	private Celula primeira; 
	
	@Override
	public Celula getInicio() {
		return primeira;
	}

	@Override
	public Celula getUltimo() {
		if(estaVazia()) { //quando o valor é boolean não precisa comparar
			return null;
		}
		Celula atual = primeira;
		while(atual.getProximo() != null) {
			atual = atual.getProximo();
		}
		return atual;
	}

	@Override
	public int getTamanho() {
		if(estaVazia()) {
			return 0;
		}
		else {
			int c = 1;
			Celula atual = primeira;
			while(atual.getProximo() != null) {
				atual = atual.getProximo();
				c++;
			}
			return c;
		}
	}

	@Override
	public void adicionar(String valor) {
		Celula celula = new Celula();
		celula.setValor(valor);
		if(estaVazia()) {
			primeira = celula;

		}
		else {
			getUltimo().setProximo(celula);
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
	public String getElemento(int posicao) {
		// 0 retorna o primeiro elemento 
		if(estaVazia()) {
			return null;
		}
		else {
			if(posicao > getTamanho()-1) {
				return null; // o elemento nao existe, pois a posicao nao existe
			}
			else {
				Celula atual = primeira;
				for(int i = 0; i < posicao; i++) {
					atual = atual.getProximo();
				}
				return atual.getValor(); // o retorno desse metodo é Str
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
