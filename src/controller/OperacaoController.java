package controller;

import br.com.leandrocolevati.pilhaint.*;

public class OperacaoController {
	
	public static int maiorValor(Pilha pilha) throws Exception {
		
		Pilha novaPilha = pilha;
		
		while(novaPilha.size() != 1){
			
			int ultimoElemento;
			int penultimoElemento;
			
			ultimoElemento = novaPilha.pop();	
			penultimoElemento = novaPilha.pop();
			
			if(ultimoElemento > penultimoElemento) {
				novaPilha.push(ultimoElemento);
			}else {
				novaPilha.push(penultimoElemento);
			}
			
		}
		
		return novaPilha.top();
	}

}