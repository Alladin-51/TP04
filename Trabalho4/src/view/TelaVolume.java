package view;
import converter.Volume;

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

public class TelaVolume extends JFrame {
	private JTextField fieldVol;
	private JTextField fieldResultadoVol;

	public TelaVolume() {
		
		Volume volume = new Volume();
		
		setBounds(200, 100, 400, 350);
		getContentPane().setLayout(null);
		
		JLabel lblTextoVol1 = new JLabel("Digite o valor a ser convertido");
		lblTextoVol1.setBounds(108, 11, 220, 14);
		getContentPane().add(lblTextoVol1);
		
		fieldVol = new JTextField();
		fieldVol.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldVol);
		fieldVol.setColumns(10);
		
		JLabel lblTextoVol2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoVol2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoVol2);
		
		JComboBox comboVol1 = new JComboBox();
		comboVol1.setModel(new DefaultComboBoxModel(new String[] {"Mililitros", "Litros", "Milimetros cubicos", "Centimetros cubicos", "Decimetros cubicos", "Metros cubicos", "Pes cubicos"}));
		comboVol1.setBounds(122, 92, 130, 22);
		getContentPane().add(comboVol1);
		
		JLabel lblTextoVol3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoVol3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoVol3);
		
		JComboBox comboVol2 = new JComboBox();
		comboVol2.setModel(new DefaultComboBoxModel(new String[] {"Mililitros", "Litros", "Milimetros cubicos", "Centimetros cubicos", "Decimetros cubicos", "Metros cubicos", "Pes cubicos"}));
		comboVol2.setBounds(122, 150, 130, 22);
		getContentPane().add(comboVol2);
		
		fieldResultadoVol = new JTextField();
		fieldResultadoVol.setBounds(117, 280, 146, 20);
		getContentPane().add(fieldResultadoVol);
		fieldResultadoVol.setColumns(10);
		fieldResultadoVol.setVisible(false);
		
		JLabel lblTextoVol4 = new JLabel("Resultado");
		lblTextoVol4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoVol4.setBounds(151, 255, 79, 14);
		getContentPane().add(lblTextoVol4);
		lblTextoVol4.setVisible(false);
		
		
		JButton btnBotaoVol = new JButton("Converter");
		btnBotaoVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldVol.getText().toString());
				
				// Aqui é feita a converção
				volume.converteVol(valor, comboVol1.getSelectedIndex());
			
				// Exibição do resultado
				
				lblTextoVol4.setVisible(true);
				fieldResultadoVol.setVisible(true);
				fieldResultadoVol.setText(volume.getVol(comboVol2.getSelectedIndex()));
				
			}
		});
		btnBotaoVol.setBounds(132, 193, 113, 23);
		getContentPane().add(btnBotaoVol);
		
		JButton btnBotaoVoltarVol = new JButton("Voltar");
		btnBotaoVoltarVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new TelaPrincipal().setVisible(true);
				
			}
		});
		btnBotaoVoltarVol.setBounds(10, 279, 70, 23);
		getContentPane().add(btnBotaoVoltarVol);
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
