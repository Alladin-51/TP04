package view;
import converter.Tempo;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaTempo extends JFrame {
	private JTextField fieldTempo;
	private JTextField fieldResultadoTempo;

	public TelaTempo() {
		
		// Instanciação da classe Tempo do pacote converter.
		Tempo tempo = new Tempo();
		
		// Coordenadas do frame
		setBounds(200, 100, 400, 350);
		getContentPane().setLayout(null);
		setTitle("Tempo");
		
		
		// Codificação do primeiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoTempo1 = new JLabel("Digite o valor a ser convertido");
		lblTextoTempo1.setBounds(108, 11, 220, 14);
		getContentPane().add(lblTextoTempo1);
		
		
		// Codificação do primeiro JTextField com suas coordenadas.
		// Este é o textField que recebe o número digitado pelo usuário.
		fieldTempo = new JTextField();
		fieldTempo.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldTempo);
		fieldTempo.setColumns(10);
		
		
		// Codificação do segundo JLabel , suas coordenadas e seu texto.
		JLabel lblTextoTempo2 = new JLabel("Selecione a unidade de medida do numero deigitado acima");
		lblTextoTempo2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoTempo2);
		
		
		// Codificação da primeira JComboBox com suas coordenadas e seus componentes.
		// Nessa ComboBox o usuário escolhe a unidade de medida do número que ele digitou no Jtextfield acima.
		JComboBox comboTempo1 = new JComboBox();
		comboTempo1.setModel(new DefaultComboBoxModel(new String[] {"Milisegundo", "Segundo", "Minuto", "Hora", "Dia", "Semana", "Mes", "Ano"}));
		comboTempo1.setBounds(122, 92, 130, 22);
		getContentPane().add(comboTempo1);
		
		
		// Codificação do terceiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoTempo3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoTempo3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoTempo3);
		
		
		// Codificação da segunda JComboBox com suas coordenadas e seus componentes.
		// Nesta ComboBox o usuário escolhe a unidade para qual ele deseja converter o número por ele digitado.
		JComboBox comboTempo2 = new JComboBox();
		comboTempo2.setModel(new DefaultComboBoxModel(new String[] {"Milisegundo", "Segundo", "Minuto", "Hora", "Dia", "Semana", "Mes", "Ano"}));
		comboTempo2.setBounds(122, 150, 130, 22);
		getContentPane().add(comboTempo2);
		
		
		
		// Codificação do segundo JTextField com suas coordenadas.
		// Este é o TextField que printa o resultado para o usuário
		fieldResultadoTempo = new JTextField();
		fieldResultadoTempo.setBounds(117, 280, 146, 20);
		getContentPane().add(fieldResultadoTempo);
		fieldResultadoTempo.setColumns(10);
		fieldResultadoTempo.setVisible(false);  // Esse método faz com que o TextField não fique visível para o usuário.
		
		
		// Codificação do quarto JLabel , suas coordenadas e seu texto.
		JLabel lblTextoTempo4 = new JLabel("Resultado");
		lblTextoTempo4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoTempo4.setBounds(151, 255, 79, 14);
		getContentPane().add(lblTextoTempo4);
		lblTextoTempo4.setVisible(false);  // Esse método faz com que o Label não fique visível para o usuário.
		
		
		
		// Codificação do primeiro JButton.
		// Este Button serve para converter a unidade de medida.
		JButton btnBotaoTempo = new JButton("Converter");
		
		// Ação criada ao clicar no Button(btnBotaoTempo).
		btnBotaoTempo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldTempo.getText().toString());/* Essa variavel serve para armazenar o valor do
                																		 fieldTempo (string) em forma de Double  */
				
				// Aqui é feita a converção
				tempo.converteTempo(valor, comboTempo1.getSelectedIndex());
			
				// Exibição do resultado
				
				lblTextoTempo4.setVisible(true); // Torna o lblTextoTempo4 visível para o usuário.
				fieldResultadoTempo.setVisible(true);// Torna o fieldResultadoTempo visível para o usuário.
				fieldResultadoTempo.setText(tempo.getTempo(comboTempo2.getSelectedIndex()));/* Exibição do resultado no 
																								fieldResultadoTempo */
			}
		});
		
		// Coordenadas do btnBotaoTempo
		btnBotaoTempo.setBounds(132, 193, 113, 23);
		getContentPane().add(btnBotaoTempo);
		
		
		// Codificação do segundo JButton.
		// Este Button serve para voltar para a TelaPrincipal.
		JButton btnBotaoVoltarTempo = new JButton("Voltar");
		
		// Ação criada ao clicar no Button(btnBotaoVoltarTempo).
		btnBotaoVoltarTempo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false); // Esse método deixa a TelaTempo invisível para o usuário.
				new TelaPrincipal().setVisible(true); // Este método deixa a TelaPrincipal visível para o usuário.
				
			}
		});
		
		// Coordenadas do btnBotaoVoltarTempo.
		btnBotaoVoltarTempo.setBounds(10, 279, 70, 23);
		getContentPane().add(btnBotaoVoltarTempo);
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);

	}
}