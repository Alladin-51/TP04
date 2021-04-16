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
		
		Temperatura temperatura = new Temperatura();
		
		setBounds(200, 100, 400, 350);
		getContentPane().setLayout(null);
		
		JLabel lblTextoTemp1 = new JLabel("Digite o valor a ser convertido");
		lblTextoTemp1.setBounds(108, 11, 220, 14);
		getContentPane().add(lblTextoTemp1);
		
		fieldTemp = new JTextField();
		fieldTemp.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldTemp);
		fieldTemp.setColumns(10);
		
		JLabel lblTextoTemp2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoTemp2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoTemp2);
		
		JComboBox comboTemp = new JComboBox();
		comboTemp.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Fahrenheit", "Kelvin", "Rankine", "Reamur"}));
		comboTemp.setBounds(122, 92, 130, 22);
		getContentPane().add(comboTemp);
		
		JLabel lblTextoTemp3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoTemp3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoTemp3);
		
		JComboBox comboTemp2 = new JComboBox();
		comboTemp2.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Fahrenheit", "Kelvin", "Rankine", "Reamur"}));
		comboTemp2.setBounds(122, 150, 130, 22);
		getContentPane().add(comboTemp2);
		
		fieldResultadoTemp = new JTextField();
		fieldResultadoTemp.setBounds(142, 280, 86, 20);
		getContentPane().add(fieldResultadoTemp);
		fieldResultadoTemp.setColumns(10);
		fieldResultadoTemp.setVisible(false);
		
		JLabel lblTextoTemp4 = new JLabel("Resultado");
		lblTextoTemp4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoTemp4.setBounds(149, 255, 79, 14);
		getContentPane().add(lblTextoTemp4);
		lblTextoTemp4.setVisible(false);
		
		JButton btnBotaoTemperatura = new JButton("Converter");
		btnBotaoTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldTemp.getText().toString());
				
				// Aqui é feita a converção
				temperatura.converteTemperatura(valor, comboTemp.getSelectedIndex());
			
				// Exibição do resultado
				
				lblTextoTemp4.setVisible(true);
				fieldResultadoTemp.setVisible(true);
				fieldResultadoTemp.setText(temperatura.getTemperatura(comboTemp2.getSelectedIndex()));
				
			}
		});
		btnBotaoTemperatura.setBounds(132, 193, 113, 23);
		getContentPane().add(btnBotaoTemperatura);
		
		JButton btnBotaoVoltarTemp = new JButton("Voltar");
		btnBotaoVoltarTemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new TelaPrincipal().setVisible(true);
				
			}
		});
		btnBotaoVoltarTemp.setBounds(10, 279, 89, 23);
		getContentPane().add(btnBotaoVoltarTemp);
		
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

}
