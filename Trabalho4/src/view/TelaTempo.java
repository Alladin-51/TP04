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

	public TelaTempo() {
		
		Tempo tempo = new Tempo();
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTextoTempo1 = new JLabel("Digite o valor a ser convertido");
		lblTextoTempo1.setBounds(120, 11, 220, 14);
		getContentPane().add(lblTextoTempo1);
		
		fieldTempo = new JTextField();
		fieldTempo.setBounds(148, 36, 86, 20);
		getContentPane().add(fieldTempo);
		fieldTempo.setColumns(10);
		
		JLabel lblTextoTempo2 = new JLabel("Selecione a unidade de medida do numero deigitado acima");
		lblTextoTempo2.setBounds(62, 68, 362, 14);
		getContentPane().add(lblTextoTempo2);
		
		JComboBox comboTempo1 = new JComboBox();
		comboTempo1.setModel(new DefaultComboBoxModel(new String[] {"Milisegundo", "Segundo", "Minuto", "Hora", "Dia", "Semana", "Mes", "Ano"}));
		comboTempo1.setBounds(134, 93, 117, 22);
		getContentPane().add(comboTempo1);
		
		JLabel lblTextoTempo3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoTempo3.setBounds(90, 126, 334, 14);
		getContentPane().add(lblTextoTempo3);
		
		JComboBox comboTempo2 = new JComboBox();
		comboTempo2.setModel(new DefaultComboBoxModel(new String[] {"Milisegundo", "Segundo", "Minuto", "Hora", "Dia", "Semana", "Mes", "Ano"}));
		comboTempo2.setBounds(134, 151, 117, 22);
		getContentPane().add(comboTempo2);
		
		JButton btnBotaoTempo = new JButton("OK");
		btnBotaoTempo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldTempo.getText().toString());
				
				// Aqui é feita a converção
				tempo.converteTempo(valor, comboTempo1.getSelectedIndex());
			
				// Exibição do resultado
				JFrame frame = new JFrame("Resultado");
				frame.setSize(150, 150);
				JLabel labelT = new JLabel(tempo.getTempo(comboTempo2.getSelectedIndex()));
				labelT.setFont( new Font("Arial", Font.PLAIN, 20));
				labelT.setBounds(100, 70, 150, 150);
				frame.getContentPane().add(labelT);
				frame.setVisible(true);
				setLocationRelativeTo(null);
				setVisible(true);
				
			}
		});
		btnBotaoTempo.setBounds(145, 194, 89, 23);
		getContentPane().add(btnBotaoTempo);
		setLocationRelativeTo(null);
		setVisible(true);

	}

}