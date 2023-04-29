
public class Celula {

	private String valor; 
	private Celula proximo;

	public String getValor() { //retorna o valor atribuido dentro do atributo valor
		return valor;
	}

	public void setValor(String valor) { //recebe um valor do tipo String e o adiciona no atributo valor
		this.valor = valor;
	}

	public Celula getProximo() { //retorna o valor atribuido dentro do atributo proximo
		return proximo;
	}

	public void setProximo(Celula proximo) { //recebe um valor do tipo Celula e o adiciona no atributo proximo
		this.proximo = proximo;
	}
}
