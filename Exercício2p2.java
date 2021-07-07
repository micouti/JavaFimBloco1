package br.com.generation.javaplataforma0707;

public class Exercício2p2 {

	public static void main(String[] args) {
		//objeto
		Exercício2 aviao = new Exercício2();
		
		//adicionando conteúdo na variável aviao
		aviao.altura = "Avião tem tres metros de altura";
		aviao.comprimento = "20 metros de comprimento";
		aviao.passageiros = 200;
		
		System.out.println(aviao.altura);
		System.out.println(aviao.comprimento);
		System.out.println("Porta " + aviao.passageiros + " passageiros");
	
		aviao.voo();
		aviao.destino();
	}

}
