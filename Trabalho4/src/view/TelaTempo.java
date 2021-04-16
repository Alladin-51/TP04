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
	private JTextField fieldResultadoTempo;

	public TelaTempo() {
		
		Tempo tempo = new Tempo();
		
		setBounds(200, 100, 400, 350);
		getContentPane().setLayout(null);
		
		JLabel lblTextoTempo1 = new JLabel("Digite o valor a ser convertido");
		lblTextoTempo1.setBounds(108, 11, 220, 14);
		getContentPane().add(lblTextoTempo1);
		
		fieldTempo = new JTextField();
		fieldTempo.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldTempo);
		fieldTempo.setColumns(10);
		
		JLabel lblTextoTempo2 = new JLabel("Selecione a unidade de medida do numero deigitado acima");
		lblTextoTempo2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoTempo2);
		
		JComboBox comboTempo1 = new JComboBox();
		comboTempo1.setModel(new DefaultComboBoxModel(new String[] {"Milisegundo", "Segundo", "Minuto", "Hora", "Dia", "Semana", "Mes", "Ano"}));
		comboTempo1.setBounds(122, 92, 130, 22);
		getContentPane().add(comboTempo1);
		
		JLabel lblTextoTempo3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoTempo3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoTempo3);
		
		JComboBox comboTempo2 = new JComboBox();
		comboTempo2.setModel(new DefaultComboBoxModel(new String[] {"Milisegundo", "Segundo", "Minuto", "Hora", "Dia", "Semana", "Mes", "Ano"}));
		comboTempo2.setBounds(122, 150, 130, 22);
		getContentPane().add(comboTempo2);
		
		fieldResultadoTempo = new JTextField();
		fieldResultadoTempo.setBounds(117, 280, 146, 20);
		getContentPane().add(fieldResultadoTempo);
		fieldResultadoTempo.setColumns(10);
		fieldResultadoTempo.setVisible(false);
		
		JLabel lblTextoTempo4 = new JLabel("Resultado");
		lblTextoTempo4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoTempo4.setBounds(151, 255, 79, 14);
		getContentPane().add(lblTextoTempo4);
		lblTextoTempo4.setVisible(false);
		
		JButton btnBotaoTempo = new JButton("Converter");
		btnBotaoTempo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldTempo.getText().toString());
				
				// Aqui é feita a converção
				tempo.converteTempo(valor, comboTempo1.getSelectedIndex());
			
				// Exibição do resultado
				
				lblTextoTempo4.setVisible(true);
				fieldResultadoTempo.setVisible(true);
				fieldResultadoTempo.setText(tempo.getTempo(comboTempo2.getSelectedIndex()));
				
			}
		});
		btnBotaoTempo.setBounds(132, 193, 113, 23);
		getContentPane().add(btnBotaoTempo);
		
		JButton btnBotaoVoltarTempo = new JButton("Voltar");
		btnBotaoVoltarTempo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new TelaPrincipal().setVisible(true);
				
			}
		});
		btnBotaoVoltarTempo.setBounds(10, 279, 70, 23);
		getContentPane().add(btnBotaoVoltarTempo);
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);

	}
}