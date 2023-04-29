
public class TestarTamanhoLista {

	public static void main(String[] args) {
		ListaSimplesmenteLigada lista = new ListaSimplesmenteLigada();
		System.out.println("Tamanho atual: " + lista.getTamanho()); //vai retornar o valor 0 pois a lista não tem nenhum elemento
		lista.adicionar("Primeiro Elemento"); //adicionei um elemento 
		System.out.println("Tamanho atual: " + lista.getTamanho()); //vai retornar um, pois a lista agora tem um elemento
		lista.adicionar("Segundo elemento");
		System.out.println("Tamanho atual: " + lista.getTamanho());

	}

}
