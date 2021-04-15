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
	private JTextField fieldResultadoArea;

	public TelaArea() {
		
		Area area = new Area();
		
		setBounds(200, 100, 400, 350);
		getContentPane().setLayout(null);
		
		JLabel lblTextoArea1 = new JLabel("Digite o valor a ser convertido");
		lblTextoArea1.setBounds(108, 11, 220, 14);
		getContentPane().add(lblTextoArea1);
		
		fieldArea = new JTextField();
		fieldArea.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldArea);
		fieldArea.setColumns(10);
		
		JLabel lblTextoArea2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoArea2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoArea2);
		
		JComboBox comboArea1 = new JComboBox();
		comboArea1.setModel(new DefaultComboBoxModel(new String[] {"Milimetro quadrado", "Centimetro quadrado", "Decimetro quadrado", "Metro quadrado", "Quilometro quadrado", "Milha quadrada", "Pes quadrados"}));
		comboArea1.setBounds(122, 92, 130, 22);
		getContentPane().add(comboArea1);
		
		JLabel lblTextoArea3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoArea3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoArea3);
		
		JComboBox comboArea2 = new JComboBox();
		comboArea2.setModel(new DefaultComboBoxModel(new String[] {"Milimetro quadrado", "Centimetro quadrado", "Decimetro quadrado", "Metro quadrado", "Quilometro quadrado", "Milha quadrada", "Pes quadrados"}));
		comboArea2.setBounds(122, 150, 130, 22);
		getContentPane().add(comboArea2);
		
		fieldResultadoArea = new JTextField();
		fieldResultadoArea.setBounds(142, 280, 86, 20);
		getContentPane().add(fieldResultadoArea);
		fieldResultadoArea.setColumns(10);
		fieldResultadoArea.setVisible(false);
		
		JLabel lblTextoArea4 = new JLabel("Resultado");
		lblTextoArea4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoArea4.setBounds(149, 255, 79, 14);
		getContentPane().add(lblTextoArea4);
		lblTextoArea4.setVisible(false);
		
		JButton btnBotaoArea = new JButton("Converter");
		btnBotaoArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldArea.getText().toString());
				
				// Aqui é feita a converção
				area.converteArea(valor, comboArea1.getSelectedIndex());
			
				// Exibição do resultado
				
				lblTextoArea4.setVisible(true);
				fieldResultadoArea.setVisible(true);
				fieldResultadoArea.setText(area.getArea(comboArea2.getSelectedIndex()));
				
			}
		});
		btnBotaoArea.setBounds(132, 193, 113, 23);
		getContentPane().add(btnBotaoArea);
		
		JButton btnBotaoVoltarArea = new JButton("Voltar");
		btnBotaoVoltarArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new TelaPrincipal().setVisible(true);
			}
		});
		btnBotaoVoltarArea.setBounds(10, 279, 89, 23);
		getContentPane().add(btnBotaoVoltarArea);
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		

	}
	}


