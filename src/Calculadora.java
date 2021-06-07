import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
	// Creando formulario
	JPanel base = (JPanel) this.getContentPane();
	// creando la pantalla
	JTextField pantalla = new JTextField();
	// creando botones n
	JButton buno = new JButton("1");
	JButton bdos = new JButton("2");
	JButton btres = new JButton("3");
	JButton bborrar = new JButton("Borrar");
	JButton bcuatro = new JButton("4");
	JButton bcinco = new JButton("5");
	JButton bseis = new JButton("6");
	JButton bmas = new JButton("+");
	JButton bsiete = new JButton("7");
	JButton bocho = new JButton("8");
	JButton bnueve = new JButton("9");
	JButton bmenos = new JButton("-");
	JButton bpor = new JButton("*");
	JButton bcero = new JButton("0");
	JButton bentre = new JButton("/");
	JButton bigual = new JButton("=");
	JButton bpunto = new JButton(".");

	public Calculadora() {

		// propiedades al formulario
		base.setLayout(null); // para acomodar manualmente
		setSize(350, 500);
		setTitle("Calculadora Geo ");
		setVisible(true);
		// propiedades de pantalla
		pantalla.setBounds(22, 8, 282, 70);
		pantalla.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(pantalla);
		// propiedades de botones
		buno.setBounds(22, 83, 60, 60);
		buno.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(buno);
		buno.addActionListener(this);

		bdos.setBounds(87, 83, 60, 60);
		bdos.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(bdos);
		bdos.addActionListener(this);

		btres.setBounds(152, 83, 60, 60);
		btres.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(btres);
		btres.addActionListener(this);

		bborrar.setBounds(217, 83, 85, 60);
		bborrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		bborrar.setBackground(Color.YELLOW);
		add(bborrar);
		bborrar.addActionListener(this);

		bcuatro.setBounds(22, 150, 60, 60);
		bcuatro.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(bcuatro);
		bcuatro.addActionListener(this);

		bcinco.setBounds(87, 150, 60, 60);
		bcinco.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(bcinco);
		bcinco.addActionListener(this);

		bseis.setBounds(152, 150, 60, 60);
		bseis.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(bseis);
		bseis.addActionListener(this);

		bmas.setBounds(217, 150, 85, 60);
		bmas.setFont(new Font("Tahoma", Font.BOLD, 20));
		bmas.setBackground(Color.YELLOW);
		add(bmas);
		bmas.addActionListener(this);

		bsiete.setBounds(22, 217, 60, 60);
		bsiete.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(bsiete);
		bsiete.addActionListener(this);

		bocho.setBounds(87, 217, 60, 60);
		bocho.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(bocho);
		bocho.addActionListener(this);

		bnueve.setBounds(152, 217, 60, 60);
		bnueve.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(bnueve);
		bnueve.addActionListener(this);

		bmenos.setBounds(217, 217, 85, 60);
		bmenos.setFont(new Font("Tahoma", Font.BOLD, 20));
		bmenos.setBackground(Color.YELLOW);
		add(bmenos);
		bmenos.addActionListener(this);

		bpor.setBounds(22, 284, 60, 60);
		bpor.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(bpor);
		bpor.addActionListener(this);

		bcero.setBounds(87, 284, 60, 60);
		bcero.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(bcero);
		bcero.addActionListener(this);

		bentre.setBounds(152, 284, 60, 60);
		bentre.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(bentre);
		bentre.addActionListener(this);

		bpunto.setBounds(217, 284, 85, 60);
		bpunto.setFont(new Font("Tahoma", Font.BOLD, 20));
		bpunto.setBackground(Color.YELLOW);
		add(bpunto);
		bpunto.addActionListener(this);

		bigual.setBounds(22, 351, 280, 70);
		bigual.setBackground(Color.CYAN);
		add(bigual);
		bigual.addActionListener(this);

	}

	public static void main(String[] args) {
		new Calculadora();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buno) {
			if (pantalla.getText() == "") {
				pantalla.setText("1");
			} else {
				pantalla.setText(pantalla.getText() + 1);
			}
		}
		if (e.getSource() == bdos) {
			if (pantalla.getText() == "") {
				pantalla.setText("2");
			} else {
				pantalla.setText(pantalla.getText() + 2);
			}
		}
		if (e.getSource() == btres) {
			if (pantalla.getText() == "") {
				pantalla.setText("3");
			} else {
				pantalla.setText(pantalla.getText() + 3);
			}
		}
		if (e.getSource() == bcuatro) {
			if (pantalla.getText() == "") {
				pantalla.setText("4");
			} else {
				pantalla.setText(pantalla.getText() + 4);
			}
		}
		if (e.getSource() == bcinco) {
			if (pantalla.getText() == "") {
				pantalla.setText("5");
			} else {
				pantalla.setText(pantalla.getText() + 5);
			}
		}
		if (e.getSource() == bseis) {
			if (pantalla.getText() == "") {
				pantalla.setText("6");
			} else {
				pantalla.setText(pantalla.getText() + 6);
			}
		}
		if (e.getSource() == bsiete) {
			if (pantalla.getText() == "") {
				pantalla.setText("7");
			} else {
				pantalla.setText(pantalla.getText() + 7);
			}
		}
		if (e.getSource() == bocho) {
			if (pantalla.getText() == "") {
				pantalla.setText("8");
			} else {
				pantalla.setText(pantalla.getText() + 8);
			}
		}
		if (e.getSource() == bnueve) {
			if (pantalla.getText() == "") {
				pantalla.setText("9");
			} else {
				pantalla.setText(pantalla.getText() + 9);
			}
		}
		if (e.getSource() == bcero) {
			if (pantalla.getText() == "") {
				pantalla.setText("0");
			} else {
				pantalla.setText(pantalla.getText() + 0);
			}
		}
		if (e.getSource() == bmenos) {
			if (pantalla.getText() == "") {
				pantalla.setText("-");
			} else {
				pantalla.setText(pantalla.getText() + "-");
			}
		}
		if (e.getSource() == bmas) {
			if (pantalla.getText() == "") {
				pantalla.setText("+");
			} else {
				pantalla.setText(pantalla.getText() + "+");
			}
		}
		if (e.getSource() == bpor) {
			if (pantalla.getText() == "") {
				pantalla.setText("*");
			} else {
				pantalla.setText(pantalla.getText() + "*");
			}
		}
		if (e.getSource() == bentre) {
			if (pantalla.getText() == "") {
				pantalla.setText("/");
			} else {
				pantalla.setText(pantalla.getText() + "/");
			}
		}
		if (e.getSource() == bpunto) {
			if (pantalla.getText() == "") {
				pantalla.setText(".");
			} else {
				pantalla.setText(pantalla.getText() + ".");
			}
		}
		if (e.getSource() == bborrar) {
			pantalla.setText("");
		}
		if (e.getSource() == bigual) {
			String cadena = pantalla.getText();
			for (int i = 0; i < cadena.length(); i++) {
				char caracter = cadena.charAt(i);
				if (caracter == '+') {
					String operandoA = cadena.substring(0, i);
					String operandoB = cadena.substring(i + 1, cadena.length());
					double resultado = Double.parseDouble(operandoA) + Double.parseDouble(operandoB);
					pantalla.setText(Double.toString(resultado));
				}
				if (caracter == '*') {
					String operandoA = cadena.substring(0, i);
					String operandoB = cadena.substring(i + 1, cadena.length());
					double resultado = Double.parseDouble(operandoA) * Double.parseDouble(operandoB);
					pantalla.setText(Double.toString(resultado));
				}
				if (caracter == '-') {
					String operandoA = cadena.substring(0, i);
					String operandoB = cadena.substring(i + 1, cadena.length());
					double resultado = Double.parseDouble(operandoA) - Double.parseDouble(operandoB);
					pantalla.setText(Double.toString(resultado));
				}
				if (caracter == '/') {
					String operandoA = cadena.substring(0, i);
					String operandoB = cadena.substring(i + 1, cadena.length());
					double cero = Double.parseDouble(operandoB);
					if (cero == 0) {

						JOptionPane.showMessageDialog(null, "no se puede dividir entre  0");
						pantalla.setText("no se divide por 0 imbécil");
					} else {
						double resultado = Double.parseDouble(operandoA) / Double.parseDouble(operandoB);
						pantalla.setText(Double.toString(resultado));
					}
				}
			}
		}
	}

}
