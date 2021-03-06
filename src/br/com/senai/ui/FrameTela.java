package br.com.senai.ui;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;



public class FrameTela {
	
	

	public void telacalculadora() {
		JFrame teladacalculadora = new JFrame();
		teladacalculadora.setSize(600, 600);
		teladacalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		teladacalculadora.setTitle(" Exercicio Calculadora ");
		teladacalculadora.setLayout(null);

		// componentes da tela !!

		JLabel titulo = new JLabel();
		titulo.setText(" Tabuada ");
		teladacalculadora.getContentPane().add(titulo);
		titulo.setBounds(10, 20, 150, 30);
		titulo.setForeground(Color.blue);
		titulo.setFont(new FontUIResource(" Tabuada", 1, 20));
		titulo.setBounds(20, 10, 150, 30);

		JLabel multiplicando = new JLabel();
		multiplicando.setText(" Multiplicando : ");
		teladacalculadora.getContentPane().add(multiplicando);
		multiplicando.setBounds(75, 60, 150, 30);

		JLabel maximomultiplicador = new JLabel();
		maximomultiplicador.setText("M?ximo Multiplicando : ");
		teladacalculadora.getContentPane().add(maximomultiplicador);
		maximomultiplicador.setBounds(30, 100, 150, 30);

		JTextField multiplicandotexto = new JTextField();
		multiplicandotexto.setText("");
		teladacalculadora.getContentPane().add(multiplicandotexto);
		multiplicandotexto.setBounds(165, 60, 80, 30);

		JTextField maximomultiplicandotexto = new JTextField();
		maximomultiplicandotexto.setText("kkkkk");
		teladacalculadora.getContentPane().add(maximomultiplicandotexto);
		maximomultiplicandotexto.setBounds(165, 100, 80, 30);

		JLabel resultado = new JLabel();
		resultado.setText("Resultado : ");
		teladacalculadora.getContentPane().add(resultado);
		resultado.setBounds(340, 50, 150, 30);
		resultado.setFont(new FontUIResource("Resultado : ", 1, 15));
		resultado.setForeground(Color.blue);


		JButton btnAdd = new JButton();
		btnAdd.setText("Calcular");
		teladacalculadora.getContentPane().add(btnAdd);
		btnAdd.setBounds(100, 200, 150, 40);
		
		JButton bntDel = new JButton();
		bntDel.setText("Limpar");
		bntDel.setBounds(100, 250, 150, 40);

		// jlist
		// presisamos de um JScrollPane

		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(300, 90, 150, 200);
		teladacalculadora.getContentPane().add(scroll);
	

		DefaultListModel cidadeModel = new DefaultListModel();
		

		JList cidadelist = new JList();
		scroll.getViewport().add(cidadelist);

		cidadelist.setModel(cidadeModel);
		scroll.getViewport().add(cidadelist);

		teladacalculadora.getContentPane().add(bntDel);
		teladacalculadora.getContentPane().add(scroll);

		teladacalculadora.setVisible(true);

		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int numerador = Integer.parseInt(multiplicandotexto.getText());
				int denominador = Integer.parseInt(maximomultiplicandotexto .getText());
				for(int contador = 0 ; contador <= denominador; contador++) {
					int resultado = contador * numerador;
					cidadeModel.addElement((numerador + " x "  +  contador + " = " + resultado));
				}

			}
		});

		bntDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int i = cidadelist.getSelectedIndex();
				System.out.println(i);
				int denominador = Integer.parseInt(maximomultiplicandotexto .getText());
				int maxmultiplicando = denominador + 1;
				cidadeModel.removeRange(0, denominador );
				multiplicandotexto.setText("");
				multiplicandotexto.requestFocus();
				maximomultiplicandotexto.setText("");
				maximomultiplicandotexto.requestFocus();

			}
		});

	}
}
