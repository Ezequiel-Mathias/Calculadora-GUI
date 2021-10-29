package br.com.senai.ui.contas;

import br.com.senai.ui.FrameTela;

public class ContasCalculadora {
	
	private int multiplicando;
	private int Maxmultiplicador;
	
	public void setMultiplicando(int multiplicando) {
		this.multiplicando = multiplicando;
	}
	public int getMultiplicando() {
		return multiplicando;
	}
	public void setMultiplicador(int multiplicador) {
		this.Maxmultiplicador = multiplicador;
	}
	public int getMultiplicador() {
		return Maxmultiplicador;
	}
	
	public String[] calcular() {
		
		String[] tabuada = new String[Maxmultiplicador + 1];
		
		for (int index =0; index <= Maxmultiplicador; index++) {
			
			int resultado = multiplicando * index;
			tabuada[index] = multiplicando + " x " + index + " = " + resultado;
			
		}
		
		
		return tabuada;
		
	}
	

}
	
		

	

