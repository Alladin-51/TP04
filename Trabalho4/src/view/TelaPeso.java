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
	private JTextField fieldResultadoPeso;

	public TelaPeso() {
		
		
		Peso peso = new Peso();
		setBounds(200, 100, 400, 350);
		getContentPane().setLayout(null);
		
		
		JLabel lblTextoPeso1 = new JLabel("Digite o valor a ser convertido");
		lblTextoPeso1.setBounds(108, 11, 220, 14);
		getContentPane().add(lblTextoPeso1);
		
		fieldPeso = new JTextField();
		fieldPeso.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldPeso);
		fieldPeso.setColumns(10);
		
		JLabel lblTextoPeso2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoPeso2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoPeso2);
		
		JComboBox comboPeso1 = new JComboBox();
		comboPeso1.setModel(new DefaultComboBoxModel(new String[] {"Miligrama", "Grama", "Quilograma", "Libras", "Toneladas"}));
		comboPeso1.setBounds(122, 92, 130, 22);
		getContentPane().add(comboPeso1);
		
		JLabel lblTextoPeso3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoPeso3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoPeso3);
		
		JComboBox comboPeso2 = new JComboBox();
		comboPeso2.setModel(new DefaultComboBoxModel(new String[] {"Miligrama", "Grama", "Quilograma", "Libras", "Toneladas"}));
		comboPeso2.setBounds(122, 150, 130, 22);
		getContentPane().add(comboPeso2);
		
		fieldResultadoPeso = new JTextField();
		fieldResultadoPeso.setBounds(117, 280, 146, 20);
		getContentPane().add(fieldResultadoPeso);
		fieldResultadoPeso.setColumns(10);
		fieldResultadoPeso.setVisible(false);
		
		JLabel lblTextoPeso4 = new JLabel("Resultado");
		lblTextoPeso4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoPeso4.setBounds(151, 255, 79, 14);
		getContentPane().add(lblTextoPeso4);
		lblTextoPeso4.setVisible(false);
		
		JButton btnBotaoPeso = new JButton("Converter");
		btnBotaoPeso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(fieldPeso.getText().toString());
				
				// Aqui é feita a converção
				peso.convertePeso(valor, comboPeso1.getSelectedIndex());
			
				// Exibição do resultado
				
				lblTextoPeso4.setVisible(true);
				fieldResultadoPeso.setVisible(true);
				fieldResultadoPeso.setText(peso.getPeso(comboPeso2.getSelectedIndex()));
				
				
				
			}
		});
		btnBotaoPeso.setBounds(132, 193, 113, 23);
		getContentPane().add(btnBotaoPeso);
		
		JButton btnBotaoVoltarPeso = new JButton("Voltar");
		btnBotaoVoltarPeso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new TelaPrincipal().setVisible(true);
			}
		});
		btnBotaoVoltarPeso.setBounds(10, 279, 70, 23);
		getContentPane().add(btnBotaoVoltarPeso);
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		
		
	}
}