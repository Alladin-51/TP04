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

	public TelaTemperatura() {
		
		Temperatura temperatura = new Temperatura();
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTextoTemp1 = new JLabel("Digite o valor a ser convertido");
		lblTextoTemp1.setBounds(120, 11, 222, 14);
		getContentPane().add(lblTextoTemp1);
		
		fieldTemp = new JTextField();
		fieldTemp.setBounds(152, 36, 86, 20);
		getContentPane().add(fieldTemp);
		fieldTemp.setColumns(10);
		
		JLabel lblTextoTemp2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoTemp2.setBounds(70, 67, 354, 14);
		getContentPane().add(lblTextoTemp2);
		
		JComboBox comboTemp = new JComboBox();
		comboTemp.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Fahrenheit", "Kelvin", "Rankine", "Reamur"}));
		comboTemp.setBounds(138, 92, 115, 22);
		getContentPane().add(comboTemp);
		
		JLabel lblTextoTemp3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoTemp3.setBounds(97, 124, 327, 14);
		getContentPane().add(lblTextoTemp3);
		
		JComboBox comboTemp2 = new JComboBox();
		comboTemp2.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Fahrenheit", "Kelvin", "Rankine", "Reamur"}));
		comboTemp2.setBounds(138, 149, 115, 22);
		getContentPane().add(comboTemp2);
		
		JButton btnBotaoTemperatura = new JButton("OK");
		btnBotaoTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldTemp.getText().toString());
				
				// Aqui é feita a converção
				temperatura.converteTemperatura(valor, comboTemp.getSelectedIndex());
			
				// Exibição do resultado
				JFrame frame = new JFrame("Reultado");
				frame.setSize(150, 150);
				JLabel labelT = new JLabel(temperatura.getTemperatura(comboTemp2.getSelectedIndex()));
				labelT.setFont( new Font("Arial", Font.PLAIN, 20));
				labelT.setBounds(100, 70, 150, 150);
				frame.getContentPane().add(labelT);
				frame.setVisible(true);
				setLocationRelativeTo(null);
				setVisible(true);
				
				
			}
		});
		btnBotaoTemperatura.setBounds(149, 195, 89, 23);
		getContentPane().add(btnBotaoTemperatura);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

}
