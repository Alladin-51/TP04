package view;
import converter.Area;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaArea extends JFrame {
	private JTextField fieldArea;

	private JPanel contentPane;

	public TelaArea() {
		
		Area area = new Area();
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTextoArea1 = new JLabel("Digite o valor a ser convertido");
		lblTextoArea1.setBounds(128, 11, 209, 14);
		getContentPane().add(lblTextoArea1);
		
		fieldArea = new JTextField();
		fieldArea.setBounds(159, 36, 86, 20);
		getContentPane().add(fieldArea);
		fieldArea.setColumns(10);
		
		JLabel lblTextoArea2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoArea2.setBounds(65, 67, 333, 14);
		getContentPane().add(lblTextoArea2);
		
		JComboBox comboArea1 = new JComboBox();
		comboArea1.setModel(new DefaultComboBoxModel(new String[] {"Milimetro quadrado", "Centimetro quadrado", "Decimetro quadrado", "Metro quadrado", "Quilometro quadrado", "Milha quadrada", "Pes quadrados"}));
		comboArea1.setBounds(128, 92, 144, 22);
		getContentPane().add(comboArea1);
		
		JLabel lblTextoArea3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoArea3.setBounds(97, 125, 286, 14);
		getContentPane().add(lblTextoArea3);
		
		JComboBox comboArea2 = new JComboBox();
		comboArea2.setModel(new DefaultComboBoxModel(new String[] {"Milimetro quadrado", "Centimetro quadrado", "Decimetro quadrado", "Metro quadrado", "Quilometro quadrado", "Milha quadrada", "Pes quadrados"}));
		comboArea2.setBounds(128, 150, 144, 22);
		getContentPane().add(comboArea2);
		
		JButton btnBotaoArea = new JButton("OK");
		btnBotaoArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldArea.getText().toString());
				
				// Aqui é feita a converção
				area.converteArea(valor, comboArea1.getSelectedIndex());
			
				// Exibição do resultado
				JFrame frame = new JFrame("Resultado");
				frame.setSize(150, 150);
				JLabel labelT = new JLabel(area.getArea(comboArea2.getSelectedIndex()));
				labelT.setFont( new Font("Arial", Font.PLAIN, 20));
			//	contentPane.add(labelT);
				labelT.setBounds(50, 50, 50, 50);
				frame.getContentPane().add(labelT);
				frame.setVisible(true);
				setLocationRelativeTo(null);
				setVisible(true);
			
				
				
			}
		});
		btnBotaoArea.setBounds(159, 193, 89, 23);
		getContentPane().add(btnBotaoArea);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		

	}
	}


