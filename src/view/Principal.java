package view;

import java.util.Random;
import br.com.leandrocolevati.pilhaint.*;
import controller.OperacaoController;

public class Principal {

	public static void main(final String[] args) throws Exception {
		
		Pilha pilhaCriada = new Pilha();
		
		Random gerador = new Random();
		
		for (int i = 0; i < 15; i++) {
			pilhaCriada.push(gerador.nextInt(50) + 1);
		}
		
		System.out.println(OperacaoController.maiorValor(pilhaCriada));
		
	}
}