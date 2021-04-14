package view;
import converter.Peso;

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
import javax.swing.JInternalFrame;

public class TelaPeso extends JFrame {

	private JPanel contentPane;
	private JTextField fieldPeso;

	public TelaPeso() {
		
		
		Peso peso = new Peso();
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		
		JLabel lblTextoPeso1 = new JLabel("Digite o valor a ser convertido");
		lblTextoPeso1.setBounds(128, 11, 195, 14);
		getContentPane().add(lblTextoPeso1);
		
		fieldPeso = new JTextField();
		fieldPeso.setBounds(157, 36, 86, 20);
		getContentPane().add(fieldPeso);
		fieldPeso.setColumns(10);
		
		JLabel lblTextoPeso2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoPeso2.setBounds(70, 67, 332, 14);
		getContentPane().add(lblTextoPeso2);
		
		JComboBox comboPeso1 = new JComboBox();
		comboPeso1.setModel(new DefaultComboBoxModel(new String[] {"Miligrama", "Grama", "Quilograma", "Libras", "Toneladas"}));
		comboPeso1.setBounds(145, 92, 115, 22);
		getContentPane().add(comboPeso1);
		
		JLabel lblTextoPeso3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoPeso3.setBounds(95, 125, 277, 14);
		getContentPane().add(lblTextoPeso3);
		
		JComboBox comboPeso2 = new JComboBox();
		comboPeso2.setModel(new DefaultComboBoxModel(new String[] {"Miligrama", "Grama", "Quilograma", "Libras", "Toneladas"}));
		comboPeso2.setBounds(145, 150, 115, 22);
		getContentPane().add(comboPeso2);
		
		
		JButton btnBotaoPeso = new JButton("OK");
		btnBotaoPeso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(fieldPeso.getText().toString());
				
				// Aqui é feita a converção
				peso.convertePeso(valor, comboPeso1.getSelectedIndex());
			
				// Exibição do resultado
				JFrame frame = new JFrame("Resultado");
				frame.setSize(150, 150);
				JLabel labelT = new JLabel(peso.getPeso(comboPeso2.getSelectedIndex()));
				labelT.setFont( new Font("Arial", Font.PLAIN, 20));
				labelT.setBounds(100, 70, 150, 150);
				frame.getContentPane().add(labelT);
				frame.setVisible(true);
				setLocationRelativeTo(null);
				setVisible(true);
				
				
				
				
			}
		});
		btnBotaoPeso.setBounds(154, 183, 89, 23);
		getContentPane().add(btnBotaoPeso);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		
		
	}
}