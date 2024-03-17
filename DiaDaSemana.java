import javax.swing.JOptionPane;

public class DiaDaSemana {

	public static void main(String[] args) {
		
		String DiaStr = JOptionPane.showInputDialog("Digite um dia da semana: ");
		
		if (DiaStr.equalsIgnoreCase("domingo")) {
			JOptionPane.showMessageDialog(null,"Dia 1.");
		}else if (DiaStr.equalsIgnoreCase("segunda")) {
			JOptionPane.showMessageDialog(null,"Dia 2.");
		}else if (DiaStr.equalsIgnoreCase("terça" ) || DiaStr.equalsIgnoreCase("terca")) {
			JOptionPane.showMessageDialog(null,"Dia 3.");
		}else if (DiaStr.equalsIgnoreCase("quarta")) {
			JOptionPane.showMessageDialog(null, "Dia 4.");
		}else if (DiaStr.equalsIgnoreCase("Quinta")) {
			JOptionPane.showMessageDialog(null, "Dia 5");
		}else if (DiaStr.equalsIgnoreCase("sexta")) {
			JOptionPane.showMessageDialog(null, "Dia 6.");
		}else if (DiaStr.equalsIgnoreCase("sabado") || DiaStr.equalsIgnoreCase("sabado")) {
			JOptionPane.showMessageDialog(null, "Dia 7.");
		}else {
			JOptionPane.showMessageDialog(null, "Dia Inválido!");
		}
		
	}
}
