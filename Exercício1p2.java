package br.com.generation.javaplataforma0707;

public class Exercício1p2 {

	public static void main(String[] args) {
		Exercício1 cliente = new Exercício1();
		
		cliente.nome = "Milena";
		cliente.idade = 19;
		
		System.out.println(cliente.nome);
		System.out.println(cliente.idade);
		cliente.agradecimento();
	}

}
