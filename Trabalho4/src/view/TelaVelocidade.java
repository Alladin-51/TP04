package view;
import converter.Velocidade;

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

public class TelaVelocidade extends JFrame {
	private JTextField fieldVel;

	public TelaVelocidade() {
		
		Velocidade velocidade = new Velocidade();
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTextoVel1 = new JLabel("Digite o valor a ser convertido");
		lblTextoVel1.setBounds(120, 11, 215, 14);
		getContentPane().add(lblTextoVel1);
		
		fieldVel = new JTextField();
		fieldVel.setBounds(149, 36, 86, 20);
		getContentPane().add(fieldVel);
		fieldVel.setColumns(10);
		
		JLabel lblTextoVel2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoVel2.setBounds(63, 67, 361, 14);
		getContentPane().add(lblTextoVel2);
		
		JComboBox comboVel1 = new JComboBox();
		comboVel1.setModel(new DefaultComboBoxModel(new String[] {"Pes por segundo", "Metros por segundo", "Quilometros por segundo", "Metros por minuto", "Quilometros por minuto", "Quilometros por hora", "Milhas por hora"}));
		comboVel1.setBounds(121, 92, 154, 22);
		getContentPane().add(comboVel1);
		
		JLabel lblTextoVel3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoVel3.setBounds(89, 125, 335, 14);
		getContentPane().add(lblTextoVel3);
		
		JComboBox comboVel2 = new JComboBox();
		comboVel2.setModel(new DefaultComboBoxModel(new String[] {"Pes por segundo", "Metros por segundo", "Quilometros por segundo", "Metros por minuto", "Quilometros por minuto", "Quilometros por hora", "Milhas por hora"}));
		comboVel2.setBounds(120, 150, 155, 22);
		getContentPane().add(comboVel2);
		
		JButton btnBotaoVeloc = new JButton("OK");
		btnBotaoVeloc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldVel.getText().toString());
				
				// Aqui é feita a converção
				velocidade.converteVelo(valor, comboVel1.getSelectedIndex());
			
				// Exibição do resultado
				JFrame frame = new JFrame("Resultado");
				frame.setSize(150, 150);
				JLabel labelT = new JLabel(velocidade.getVelocidade(comboVel2.getSelectedIndex()));
				labelT.setFont( new Font("Arial", Font.PLAIN, 20));
				labelT.setBounds(100, 70, 150, 150);
				frame.add(labelT);
				frame.setVisible(true);
				setLocationRelativeTo(null);
				setVisible(true);
				
			}
		});
		btnBotaoVeloc.setBounds(146, 190, 89, 23);
		getContentPane().add(btnBotaoVeloc);
		
		setLocationRelativeTo(null);
		setVisible(true);

	}

}