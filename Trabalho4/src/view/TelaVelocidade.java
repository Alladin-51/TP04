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
	private JTextField fieldResultadoVel;

	public TelaVelocidade() {
		
		Velocidade velocidade = new Velocidade();
		
		setBounds(100, 200, 400, 350);
		getContentPane().setLayout(null);
		
		JLabel lblTextoVel1 = new JLabel("Digite o valor a ser convertido");
		lblTextoVel1.setBounds(108, 11, 220, 14);
		getContentPane().add(lblTextoVel1);
		
		fieldVel = new JTextField();
		fieldVel.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldVel);
		fieldVel.setColumns(10);
		
		JLabel lblTextoVel2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoVel2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoVel2);
		
		JComboBox comboVel1 = new JComboBox();
		comboVel1.setModel(new DefaultComboBoxModel(new String[] {"Pes por segundo", "Metros por segundo", "Quilometros por segundo", "Metros por minuto", "Quilometros por minuto", "Quilometros por hora", "Milhas por hora"}));
		comboVel1.setBounds(122, 92, 130, 22);
		getContentPane().add(comboVel1);
		
		JLabel lblTextoVel3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoVel3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoVel3);
		
		JComboBox comboVel2 = new JComboBox();
		comboVel2.setModel(new DefaultComboBoxModel(new String[] {"Pes por segundo", "Metros por segundo", "Quilometros por segundo", "Metros por minuto", "Quilometros por minuto", "Quilometros por hora", "Milhas por hora"}));
		comboVel2.setBounds(122, 150, 130, 22);
		getContentPane().add(comboVel2);
		
		fieldResultadoVel = new JTextField();
		fieldResultadoVel.setBounds(117, 280, 146, 20);
		getContentPane().add(fieldResultadoVel);
		fieldResultadoVel.setColumns(10);
		fieldResultadoVel.setVisible(false);
		
		JLabel lblTextoVel4 = new JLabel("Resultado");
		lblTextoVel4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoVel4.setBounds(151, 255, 79, 14);
		getContentPane().add(lblTextoVel4);
		lblTextoVel4.setVisible(false);
		
		JButton btnBotaoVeloc = new JButton("OK");
		btnBotaoVeloc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldVel.getText().toString());
				
				// Aqui é feita a converção
				velocidade.converteVelo(valor, comboVel1.getSelectedIndex());
			
				// Exibição do resultado
				lblTextoVel4.setVisible(true);
				fieldResultadoVel.setVisible(true);
				fieldResultadoVel.setText(velocidade.getVelocidade(comboVel2.getSelectedIndex()));
				
			}
		});
		btnBotaoVeloc.setBounds(146, 190, 89, 23);
		getContentPane().add(btnBotaoVeloc);
		
		JButton btnBotaoVoltarVel = new JButton("Voltar");
		btnBotaoVoltarVel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new TelaPrincipal().setVisible(true);
			}
		});
		btnBotaoVoltarVel.setBounds(10, 279, 70, 23);
		getContentPane().add(btnBotaoVoltarVel);
		
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);

	}

}