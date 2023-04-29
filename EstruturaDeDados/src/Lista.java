//Definicao de assinatura 

public interface Lista {
	//so tem metodos
	//so tem assinatura dos metodos
	
	
	//Tem varios elementos
	//Tem inicio 
	//Tem um fim
	//Tem um tamanho 
	//E possivel adicionar elementos
	//E possivel adicionar elementos em posicoes especificas
	//E possivel remover elementos
	//E possivel remover elementos de acordo com a posicao
	//E possivel pegar um elemento de acordo com a posicao
	//E possivel pegar a posicao de acordo com o elemento
	//E possivel saber se a lista esta vazia
	//E possivel esvaziar a lista
	
	public Celula getInicio(); //é um metodo que retorna a primeira celula
	
	public Celula getUltimo(); //é um metodo que retorna o ultimo elemento da lista;
	
	public int getTamanho(); //é um metodo que retorna o tamanho da lista
	
	public void adicionar(String celula); //é um metodo que adiciona um novo elemento na lista
	
	public void adicionar(String celula, int posicao);
	
	public void remover(String celula); // é um metodo que remove um elemento da lista se ele estiver dentro dela 
	
	public void remover(int posicao); //remove um elemento da lista pela a sua posicao 
	
	public String getElemento(int posicao); //pega um elemento da celula de acordo com a sua posicao 
	
	public int getPosicao(String celula); //pega a posicao de um elemento. e retorna -1 se ele nao existir na lista 
	
	//public boolean isEmpty(); 
	
	public boolean estaVazia(); //verifica se está vazia 
	
	public void limparLista(); //limpa a lista 
}
