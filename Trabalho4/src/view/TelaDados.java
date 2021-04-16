
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
		
		
		// Instancia��o da classe Dados do pacote converter.
		Dados dados = new Dados();
		
		
		// Coordenadas do frame.
		setBounds(200, 100, 400, 350);
		getContentPane().setLayout(null);
		
		
		// Codifica��o do primeiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoDado1 = new JLabel("DIgite o valor a ser convertido");
		lblTextoDado1.setBounds(109, 11, 220, 14);
		getContentPane().add(lblTextoDado1);
		setTitle("Dados");
		
		
		// Codifica��o do primeiro JTextField com suas coordenadas.
		// Este � o textField que recebe o n�mero digitado pelo usu�rio.
		fieldDado = new JTextField();
		fieldDado.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldDado);
		fieldDado.setColumns(10);
		
		
		// Codifica��o do segundo JLabel , suas coordenadas e seu texto.
		JLabel lblTextoDado2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoDado2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoDado2);
		
		
		// Codifica��o da primeira JComboBox com suas coordenadas e seus componentes.
		// Nessa ComboBox o usu�rio escolhe a unidade de medida do n�mero que ele digitou no Jtextfield acima.
		JComboBox comboDado1 = new JComboBox();
		comboDado1.setModel(new DefaultComboBoxModel(new String[] {"Bit", "Byte", "Kilobyte", "Kibibyte", "Kibibit", "Megabit", "Gigabit"}));
		comboDado1.setBounds(122, 92, 130, 22);
		getContentPane().add(comboDado1);
		
		
		// Codifica��o do terceiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoDado3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoDado3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoDado3);
		
		
		// Codifica��o da segunda JComboBox com suas coordenadas e seus componentes.
		// Nesta ComboBox o usu�rio escolhe a unidade para qual ele deseja converter o n�mero por ele digitado.
		JComboBox comboDado2 = new JComboBox();
		comboDado2.setModel(new DefaultComboBoxModel(new String[] {"Bit", "Byte", "Kilobyte", "Kibibyte", "Kibibit", "Megabit", "Gigabit"}));
		comboDado2.setBounds(120, 150, 130, 22);
		getContentPane().add(comboDado2);
		
		
		
		// Codifica��o do segundo JTextField com suas coordenadas.
		// Este � o TextField que printa o resultado para o usu�rio
		fieldResultadoDado = new JTextField();
		fieldResultadoDado.setBounds(117, 280, 146, 20);
		getContentPane().add(fieldResultadoDado);
		fieldResultadoDado.setColumns(10);
		fieldResultadoDado.setVisible(false);  // Esse m�todo faz com que o TextField n�o fique vis�vel para o usu�rio.
		
		
		// Codifica��o do primeiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoDado4 = new JLabel("Resultado");
		lblTextoDado4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoDado4.setBounds(151, 255, 70, 14);
		getContentPane().add(lblTextoDado4);
		lblTextoDado4.setVisible(false);   // Esse m�todo faz com que o Label n�o fique vis�vel para o usu�rio.
		
		
		
		// Codifica��o do primeiro JButton.
		// Este Button serve para converter a unidade de medida.
		JButton btnBotaoDado = new JButton("OK");
		
		// A��o criada ao clicar no Button(btnBotaoDado).
		btnBotaoDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldDado.getText().toString()); /* Essa variavel serve para armazenar o valor do
                																		 fieldDado (string) em forma de Double  */
				
				// Aqui � feita a conver��o
				dados.converteDado(valor, comboDado1.getSelectedIndex());
			
				// Exibi��o do resultado
				lblTextoDado4.setVisible(true); // Torna o lblTextoDado4 vis�vel para o usu�rio.
				fieldResultadoDado.setVisible(true); // Torna o fieldResultadoDado vis�vel para o usu�rio.
				fieldResultadoDado.setText(dados.getDados(comboDado2.getSelectedIndex()));//Exibi��o do resultado no fieldResultadoDado
				
			}
		});
		
		// Coordenadas do btnBotaoDado.
		btnBotaoDado.setBounds(146, 200, 89, 23);
		getContentPane().add(btnBotaoDado);
		
		
		// Codifica��o do segundo JButton.
		// Este Button serve para voltar para a TelaPrincipal.
		JButton btnBotaoVoltarDado = new JButton("Voltar");
		
		// A��o criada ao clicar no Button(btnBotaoVoltarDado).
		btnBotaoVoltarDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false); // Esse m�todo deixa a TelaDados invis�vel para o usu�rio.
				new TelaPrincipal().setVisible(true); // Este m�todo deixa a TelaPrincipal vis�vel para o usu�rio.
			}
		});
		
		// Coordenadas do btnBotaoVolatrDado.
		btnBotaoVoltarDado.setBounds(10, 279, 70, 23);
		getContentPane().add(btnBotaoVoltarDado);
		
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);

	}

}