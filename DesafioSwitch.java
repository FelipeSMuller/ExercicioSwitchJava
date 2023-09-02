package senaiprojetos;

import javax.swing.JOptionPane;
import java.lang.Exception;

public class DesafioSwitch {

	public static void main(String[] args) {

		String resposta = null;
		int numero1, numero2;
		String[] operacoes = { "Multiplicação", "Divisão", "Soma", "Subtração" };

		JOptionPane.showMessageDialog(null, "Seja bem vindo a calculadora!!!");
		JOptionPane.showMessageDialog(null, "Operações disponíveis em nossa calculadora  : ");

		for (int i = 0; i < operacoes.length; i++) {

			JOptionPane.showMessageDialog(null, operacoes[i]);

		}

		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));

		try {
			resposta = JOptionPane.showInputDialog(null, "Digite a operação para continuar : ");

			int numero = Integer.parseInt(resposta);

		} catch (Exception e) {
			if (resposta == null || resposta.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Você não selecionou nenhuma operação, reinicie o processo!");
			} else {
				JOptionPane.showMessageDialog(null, "Dados obtidos com sucesso !! ");

			}
		}

		switch (resposta) {
		case "*":
			JOptionPane.showMessageDialog(null, " Multiplicação entre : " + numero1 + " e " + numero2
					+ " resultado final = " + (numero1 * numero2));
			break;

		case "+":
			JOptionPane.showMessageDialog(null,
					" Soma entre : " + numero1 + " e " + numero2 + " resultado final = " + (numero1 + numero2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null,
					" Subtração entre : " + numero1 + " e " + numero2 + " resultado final = " + (numero1 - numero2));
			break;
		case "/":
			if (numero1 == 0 || numero2 == 0) {
				JOptionPane.showMessageDialog(null, "Não é possível dividir por 0 ");
			}

			JOptionPane.showMessageDialog(null,
					" Divisão entre : " + numero1 + " e " + numero2 + " resultado final = " + (numero1 / numero2));
			break;

		default:
			JOptionPane.showMessageDialog(null, "Nenhuma operação foi realizada!!!");
			break;

		}

	}

}
