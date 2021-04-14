package view;
import converter.Comprimento;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaComprimento extends JFrame {

	private JPanel contentPane;
	private JTextField fieldComp;

	
	public TelaComprimento() {
		
		Comprimento comprimento = new Comprimento();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTextoComp1 = new JLabel("Digite o n\u00FAmero a ser convertido");
		lblTextoComp1.setBounds(108, 11, 220, 14);
		contentPane.add(lblTextoComp1);
		
		fieldComp = new JTextField();
		fieldComp.setBounds(142, 36, 86, 20);
		contentPane.add(fieldComp);
		fieldComp.setColumns(10);
		
		JLabel lblTextoComp2 = new JLabel("Selecione a unidade de medida do n\u00FAmero digitado acima");
		lblTextoComp2.setBounds(53, 65, 331, 14);
		contentPane.add(lblTextoComp2);
		
		JComboBox comboComp1 = new JComboBox();
		comboComp1.setModel(new DefaultComboBoxModel(new String[] {"Milimetro", "Centimetro", "Decimetro", "Metro", "Quilometro", "Milha", "Pes"}));
		comboComp1.setBounds(118, 90, 134, 22);
		contentPane.add(comboComp1);
		
		JLabel lblTextoComp3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoComp3.setBounds(79, 123, 295, 14);
		contentPane.add(lblTextoComp3);
		
		JComboBox comboComp2 = new JComboBox();
		comboComp2.setModel(new DefaultComboBoxModel(new String[] {"Milimetro", "Centimetro", "Decimetro", "Metro", "Quilometro", "Milha", "Pes"}));
		comboComp2.setBounds(122, 150, 130, 22);
		contentPane.add(comboComp2);
		
		JButton btnBotaoComp = new JButton("OK");
		btnBotaoComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	double valor = Double.parseDouble(fieldComp.getText().toString());
				
				// Aqui é feita a converção
				comprimento.converteComp(valor, comboComp1.getSelectedIndex());
			
				// Exibição do resultado
				JFrame frame = new JFrame("Comprimento");
				frame.setSize(150, 150);
				JLabel labelT = new JLabel(comprimento.getComp(comboComp2.getSelectedIndex()));
				labelT.setFont( new Font("Arial", Font.PLAIN, 20));
				labelT.setBounds(100, 70, 150, 150);
				frame.getContentPane().add(labelT);
				frame.setVisible(true);
				setLocationRelativeTo(null);
				setVisible(true);
				
				
				
			}
		});
		btnBotaoComp.setBounds(139, 183, 89, 23);
		contentPane.add(btnBotaoComp);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

}
