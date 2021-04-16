package view;
import converter.Temperatura;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaTemperatura extends JFrame {
	private JTextField fieldTemp;

	private JPanel contentPane;
	private JTextField fieldResultadoTemp;

	public TelaTemperatura() {
		
		
		// Instanciação da classe Temperatura do pacote converter
		Temperatura temperatura = new Temperatura();
		
		
		// Coordenadas do frame
		setTitle("Temperatura");
		setBounds(200, 100, 400, 350);
		getContentPane().setLayout(null);
		
		
		// Codificação do primeiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoTemp1 = new JLabel("Digite o valor a ser convertido");
		lblTextoTemp1.setBounds(108, 11, 220, 14);
		getContentPane().add(lblTextoTemp1);
		
		
		// Codificação do primeiro JTextField com suas coordenadas.
		// Este é o textField que recebe o número digitado pelo usuário.
		fieldTemp = new JTextField();
		fieldTemp.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldTemp);
		fieldTemp.setColumns(10);
		
		
		// Codificação do segundo JLabel , suas coordenadas e seu texto.
		JLabel lblTextoTemp2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoTemp2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoTemp2);
		
		
		// Codificação da primeira JComboBox com suas coordenadas e seus componentes.
		// Nessa ComboBox o usuário escolhe a unidade de medida do número que ele digitou no Jtextfield acima.
		JComboBox comboTemp = new JComboBox();
		comboTemp.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Fahrenheit", "Kelvin", "Rankine", "Reamur"}));
		comboTemp.setBounds(122, 92, 130, 22);
		getContentPane().add(comboTemp);
		
		
		// Codificação do terceiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoTemp3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoTemp3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoTemp3);
		
		
		// Codificação da segunda JComboBox com suas coordenadas e seus componentes.
		// Nesta ComboBox o usuário escolhe a unidade para qual ele deseja converter o número por ele digitado.
		JComboBox comboTemp2 = new JComboBox();
		comboTemp2.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Fahrenheit", "Kelvin", "Rankine", "Reamur"}));
		comboTemp2.setBounds(122, 150, 130, 22);
		getContentPane().add(comboTemp2);
		
		
		
		// Codificação do segundo JTextField com suas coordenadas.
		// Este é o TextField que printa o resultado para o usuário
		fieldResultadoTemp = new JTextField();
		fieldResultadoTemp.setBounds(117, 280, 146, 20);
		getContentPane().add(fieldResultadoTemp);
		fieldResultadoTemp.setColumns(10);
		fieldResultadoTemp.setVisible(false);    // Esse método faz com que o TextField não fique visível para o usuário.
		
		
		// Codificação do quarto JLabel , suas coordenadas e seu texto.
		JLabel lblTextoTemp4 = new JLabel("Resultado");
		lblTextoTemp4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoTemp4.setBounds(151, 255, 79, 14);
		getContentPane().add(lblTextoTemp4);
		lblTextoTemp4.setVisible(false);  // Esse método faz com que o Label não fique visível para o usuário.
		
		
		
		// Codificação do primeiro JButton.
		// Este Button serve para converter a unidade de medida.
		JButton btnBotaoTemperatura = new JButton("Converter");
		
		// Ação criada ao clicar no Button(btnBotaoTemp).
		btnBotaoTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldTemp.getText().toString()); /* Essa variavel serve para armazenar o valor do
                																		 fieldTemp (string) em forma de Double  */
				
				// Aqui é feita a converção
				temperatura.converteTemperatura(valor, comboTemp.getSelectedIndex());
			
				// Exibição do resultado
				
				lblTextoTemp4.setVisible(true); // Torna o lblTextoTemp4 visível para o usuário.
				fieldResultadoTemp.setVisible(true);// Torna o fieldResultadoTemp visível para o usuário.
				fieldResultadoTemp.setText(temperatura.getTemperatura(comboTemp2.getSelectedIndex()));/* Exibição do resultado no 
																											fieldResultadoTemp */
			}
		});
		
		// Coordenadas do btnBotaoTemp.
		btnBotaoTemperatura.setBounds(132, 193, 113, 23);
		getContentPane().add(btnBotaoTemperatura);
		
		
		// Codificação do segundo JButton.
		// Este Button serve para voltar para a TelaPrincipal.
		JButton btnBotaoVoltarTemp = new JButton("Voltar");
		
		// Ação criada ao clicar no Button(btnBotaoVoltarArea).
		btnBotaoVoltarTemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false); // Esse método deixa a TelaTemperatura invisível para o usuário.
				new TelaPrincipal().setVisible(true); // Este método deixa a TelaPrincipal visível para o usuário.
				
			}
		});
		
		// Coordenada do btnBotaoVoltarTemp.
		btnBotaoVoltarTemp.setBounds(10, 279, 70, 23);
		getContentPane().add(btnBotaoVoltarTemp);
		
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

}
