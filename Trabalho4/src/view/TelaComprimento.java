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
	private JTextField fieldResultado;

	
	public TelaComprimento() {
		setTitle("Comprimento");
		
		// Aqui é feito a instanciação da classe comprimento 
		Comprimento comprimento = new Comprimento();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 400, 350);
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
		lblTextoComp2.setBounds(29, 67, 331, 14);
		contentPane.add(lblTextoComp2);
		
		JComboBox comboComp1 = new JComboBox();
		comboComp1.setModel(new DefaultComboBoxModel(new String[] {"Milimetro", "Centimetro", "Decimetro", "Metro", "Quilometro", "Milha", "Pes"}));
		comboComp1.setBounds(118, 90, 134, 22);
		contentPane.add(comboComp1);
		
		JLabel lblTextoComp3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoComp3.setBounds(51, 123, 295, 14);
		contentPane.add(lblTextoComp3);
		
		JComboBox comboComp2 = new JComboBox();
		comboComp2.setModel(new DefaultComboBoxModel(new String[] {"Milimetro", "Centimetro", "Decimetro", "Metro", "Quilometro", "Milha", "Pes"}));
		comboComp2.setBounds(122, 150, 130, 22);
		contentPane.add(comboComp2);
		
		fieldResultado = new JTextField();
		fieldResultado.setBounds(142, 280, 86, 20);
		contentPane.add(fieldResultado);
		fieldResultado.setColumns(10);
		fieldResultado.setVisible(false);
		
		JLabel lblTextoComp4 = new JLabel("Resultado");
		lblTextoComp4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoComp4.setBounds(149, 255, 79, 14);
		contentPane.add(lblTextoComp4);
		lblTextoComp4.setVisible(false);
		
		
		JButton btnBotaoComp = new JButton("Converter");
		btnBotaoComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//setVisible(false);
				
				double valor = Double.parseDouble(fieldComp.getText().toString());
				
				// Aqui é feita a converção
				comprimento.converteComp(valor, comboComp1.getSelectedIndex());
			
				// Exibição do resultado
				
				 lblTextoComp4.setVisible(true);
				 fieldResultado.setVisible(true);
			     fieldResultado.setText(comprimento.getComp(comboComp2.getSelectedIndex()));	
				
				
			}
		});
		btnBotaoComp.setBounds(132, 193, 113, 23);
		contentPane.add(btnBotaoComp);
		
		JButton btnBotaoVoltarComp = new JButton("Voltar");
		btnBotaoVoltarComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			new	TelaPrincipal().setVisible(true);
				setVisible(false);
				
			}
		});
		btnBotaoVoltarComp.setBounds(10, 279, 89, 23);
		contentPane.add(btnBotaoVoltarComp);
		
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
}
