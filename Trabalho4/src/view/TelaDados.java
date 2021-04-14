
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

	public TelaDados() {
		
		Dados dados = new Dados();
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTextoDado1 = new JLabel("DIgite o valor a ser convertido");
		lblTextoDado1.setBounds(120, 11, 293, 14);
		getContentPane().add(lblTextoDado1);
		
		fieldDado = new JTextField();
		fieldDado.setBounds(149, 36, 86, 20);
		getContentPane().add(fieldDado);
		fieldDado.setColumns(10);
		
		JLabel lblTextoDado2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoDado2.setBounds(63, 67, 361, 14);
		getContentPane().add(lblTextoDado2);
		
		JComboBox comboDado1 = new JComboBox();
		comboDado1.setModel(new DefaultComboBoxModel(new String[] {"Bit", "Byte", "Kilobyte", "Kibibyte", "Kibibit", "Megabit", "Gigabit"}));
		comboDado1.setBounds(120, 92, 146, 22);
		getContentPane().add(comboDado1);
		
		JLabel lblTextoDado3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoDado3.setBounds(89, 125, 335, 14);
		getContentPane().add(lblTextoDado3);
		
		JComboBox comboDado2 = new JComboBox();
		comboDado2.setModel(new DefaultComboBoxModel(new String[] {"Bit", "Byte", "Kilobyte", "Kibibyte", "Kibibit", "Megabit", "Gigabit"}));
		comboDado2.setBounds(120, 150, 146, 22);
		getContentPane().add(comboDado2);
		
		JButton btnBotaoDado = new JButton("OK");
		btnBotaoDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldDado.getText().toString());
				
				// Aqui é feita a converção
				dados.converteDado(valor, comboDado1.getSelectedIndex());
			
				// Exibição do resultado
				JFrame frame = new JFrame("Resultado");
				frame.setSize(150, 150);
				JLabel labelT = new JLabel(dados.getDados(comboDado2.getSelectedIndex()));
				labelT.setFont( new Font("Arial", Font.PLAIN, 20));
				labelT.setBounds(100, 70, 150, 150);
				frame.add(labelT);
				frame.setVisible(true);
				setLocationRelativeTo(null);
				setVisible(true);
				
			}
		});
		btnBotaoDado.setBounds(146, 200, 89, 23);
		getContentPane().add(btnBotaoDado);
		
		setLocationRelativeTo(null);
		setVisible(true);

	}

}