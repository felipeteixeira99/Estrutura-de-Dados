
public class TestarAdcionarElemento {

	public static void main(String[] args) {
		ListaSimplesmenteLigada lista = new ListaSimplesmenteLigada();
		lista.estaVazia(); //vai retornar true 
		System.out.println(lista.estaVazia());
		lista.adicionar("Primeiro"); // como a minha lista não esta mais vaiza, este agora é o primeiro elemento
		System.out.println(lista.estaVazia()); //retornar false 
		System.out.println(lista.getUltimo()); //retorna o endereco de memoria do ultimo elemento
		lista.adicionar("Segundo");
		System.out.println(lista.getUltimo()); //retorna o endereco de memoria  do ultimo elemento
	
	}

}
