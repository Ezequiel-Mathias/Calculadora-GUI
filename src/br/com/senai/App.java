package br.com.senai;

import br.com.senai.ui.FrameTela;
import br.com.senai.ui.contas.ContasCalculadora;

public class App {

	public static void main(String[] args) {
		FrameTela minhatela = new FrameTela();
		minhatela.telacalculadora();
		
		ContasCalculadora t = new ContasCalculadora();
		t.setMultiplicador(10);
		t.setMultiplicando(8);
		
		ContasCalculadora t2 = new ContasCalculadora();
		t2.setMultiplicador(14);
		t2.setMultiplicando(30);
		
		
		String[] resultado = t.calcular();
		
		for (int contador = 0; contador < t.calcular().length; contador++) {
			System.out.println(resultado[contador]);
		}

	}

}
