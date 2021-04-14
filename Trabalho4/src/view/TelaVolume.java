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

	public TelaVolume() {
		
		Volume volume = new Volume();
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTextoVol1 = new JLabel("Digite o valor a ser convertido");
		lblTextoVol1.setBounds(128, 11, 214, 14);
		getContentPane().add(lblTextoVol1);
		
		fieldVol = new JTextField();
		fieldVol.setBounds(159, 36, 86, 20);
		getContentPane().add(fieldVol);
		fieldVol.setColumns(10);
		
		JLabel lblTextoVol2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoVol2.setBounds(70, 67, 314, 14);
		getContentPane().add(lblTextoVol2);
		
		JComboBox comboVol1 = new JComboBox();
		comboVol1.setModel(new DefaultComboBoxModel(new String[] {"Mililitros", "Litros", "Milimetros cubicos", "Centimetros cubicos", "Decimetros cubicos", "Metros cubicos", "Pes cubicos"}));
		comboVol1.setBounds(142, 92, 126, 22);
		getContentPane().add(comboVol1);
		
		JLabel lblTextoVol3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoVol3.setBounds(94, 125, 290, 14);
		getContentPane().add(lblTextoVol3);
		
		JComboBox comboVol2 = new JComboBox();
		comboVol2.setModel(new DefaultComboBoxModel(new String[] {"Mililitros", "Litros", "Milimetros cubicos", "Centimetros cubicos", "Decimetros cubicos", "Metros cubicos", "Pes cubicos"}));
		comboVol2.setBounds(142, 150, 130, 22);
		getContentPane().add(comboVol2);
		
		JButton btnBotaoVol = new JButton("OK");
		btnBotaoVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldVol.getText().toString());
				
				// Aqui é feita a converção
				volume.converteVol(valor, comboVol1.getSelectedIndex());
			
				// Exibição do resultado
				JFrame frame = new JFrame("Resultado");
				frame.setSize(150, 150);
				JLabel labelT = new JLabel(volume.getVol(comboVol2.getSelectedIndex()));
				labelT.setFont( new Font("Arial", Font.PLAIN, 20));
				labelT.setBounds(100, 70, 150, 150);
				frame.add(labelT);
				frame.setVisible(true);
				setLocationRelativeTo(null);
				setVisible(true);
				
			}
		});
		btnBotaoVol.setBounds(156, 195, 89, 23);
		getContentPane().add(btnBotaoVol);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
