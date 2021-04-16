
package view;
import converter.Dados;


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

public class TelaDados extends JFrame {
	private JTextField fieldDado;
	private JTextField fieldResultadoDado;

	public TelaDados() {
		
		Dados dados = new Dados();
		
		setBounds(200, 100, 400, 350);
		getContentPane().setLayout(null);
		
		JLabel lblTextoDado1 = new JLabel("DIgite o valor a ser convertido");
		lblTextoDado1.setBounds(109, 11, 220, 14);
		getContentPane().add(lblTextoDado1);
		
		fieldDado = new JTextField();
		fieldDado.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldDado);
		fieldDado.setColumns(10);
		
		JLabel lblTextoDado2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoDado2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoDado2);
		
		JComboBox comboDado1 = new JComboBox();
		comboDado1.setModel(new DefaultComboBoxModel(new String[] {"Bit", "Byte", "Kilobyte", "Kibibyte", "Kibibit", "Megabit", "Gigabit"}));
		comboDado1.setBounds(122, 92, 130, 22);
		getContentPane().add(comboDado1);
		
		JLabel lblTextoDado3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoDado3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoDado3);
		
		JComboBox comboDado2 = new JComboBox();
		comboDado2.setModel(new DefaultComboBoxModel(new String[] {"Bit", "Byte", "Kilobyte", "Kibibyte", "Kibibit", "Megabit", "Gigabit"}));
		comboDado2.setBounds(120, 150, 130, 22);
		getContentPane().add(comboDado2);
		
		fieldResultadoDado = new JTextField();
		fieldResultadoDado.setBounds(117, 280, 146, 20);
		getContentPane().add(fieldResultadoDado);
		fieldResultadoDado.setColumns(10);
		fieldResultadoDado.setVisible(false);
		
		JLabel lblTextoDado4 = new JLabel("Resultado");
		lblTextoDado4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoDado4.setBounds(151, 255, 70, 14);
		getContentPane().add(lblTextoDado4);
		lblTextoDado4.setVisible(false);
		
		JButton btnBotaoDado = new JButton("OK");
		btnBotaoDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldDado.getText().toString());
				
				// Aqui é feita a converção
				dados.converteDado(valor, comboDado1.getSelectedIndex());
			
				// Exibição do resultado
				lblTextoDado4.setVisible(true);
				fieldResultadoDado.setVisible(true);
				fieldResultadoDado.setText(dados.getDados(comboDado2.getSelectedIndex()));
				
			}
		});
		btnBotaoDado.setBounds(146, 200, 89, 23);
		getContentPane().add(btnBotaoDado);
		
		JButton btnBotaoVoltarDado = new JButton("Voltar");
		btnBotaoVoltarDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new TelaPrincipal().setVisible(true);
			}
		});
		btnBotaoVoltarDado.setBounds(10, 279, 70, 23);
		getContentPane().add(btnBotaoVoltarDado);
		
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);

	}

}