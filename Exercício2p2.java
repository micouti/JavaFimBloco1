package br.com.generation.javaplataforma0707;

public class Exerc�cio2p2 {

	public static void main(String[] args) {
		//objeto
		Exerc�cio2 aviao = new Exerc�cio2();
		
		//adicionando conte�do na vari�vel aviao
		aviao.altura = "Avi�o tem tres metros de altura";
		aviao.comprimento = "20 metros de comprimento";
		aviao.passageiros = 200;
		
		System.out.println(aviao.altura);
		System.out.println(aviao.comprimento);
		System.out.println("Porta " + aviao.passageiros + " passageiros");
	
		aviao.voo();
		aviao.destino();
	}

}
