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
		
		// Instancia��o da classe Velocidade do pacote converter
		Velocidade velocidade = new Velocidade();
		
		
		// Coordenadas  do frame
		setBounds(100, 200, 400, 350);
		getContentPane().setLayout(null);
		setTitle("Velocidade");
		
		
		// Codifica��o do primeiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoVel1 = new JLabel("Digite o valor a ser convertido");
		lblTextoVel1.setBounds(108, 11, 220, 14);
		getContentPane().add(lblTextoVel1);
		
		
		// Codifica��o do primeiro JTextField com suas coordenadas.
		// Este � o textField que recebe o n�mero digitado pelo usu�rio.
		fieldVel = new JTextField();
		fieldVel.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldVel);
		fieldVel.setColumns(10);
		
		
		// Codifica��o do segundo JLabel , suas coordenadas e seu texto.
		JLabel lblTextoVel2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoVel2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoVel2);
		
		
		// Codifica��o da primeira JComboBox com suas coordenadas e seus componentes.
		// Nessa ComboBox o usu�rio escolhe a unidade de medida do n�mero que ele digitou no Jtextfield acima.
		JComboBox comboVel1 = new JComboBox();
		comboVel1.setModel(new DefaultComboBoxModel(new String[] {"Pes por segundo", "Metros por segundo", "Quilometros por segundo", "Metros por minuto", "Quilometros por minuto", "Quilometros por hora", "Milhas por hora"}));
		comboVel1.setBounds(122, 92, 130, 22);
		getContentPane().add(comboVel1);
		
		
		// Codifica��o do terceiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoVel3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoVel3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoVel3);
		
		
		// Codifica��o da segunda JComboBox com suas coordenadas e seus componentes.
		// Nesta ComboBox o usu�rio escolhe a unidade para qual ele deseja converter o n�mero por ele digitado.
		JComboBox comboVel2 = new JComboBox();
		comboVel2.setModel(new DefaultComboBoxModel(new String[] {"Pes por segundo", "Metros por segundo", "Quilometros por segundo", "Metros por minuto", "Quilometros por minuto", "Quilometros por hora", "Milhas por hora"}));
		comboVel2.setBounds(122, 150, 130, 22);
		getContentPane().add(comboVel2);
		
		
		
		// Codifica��o do segundo JTextField com suas coordenadas.
		// Este � o TextField que printa o resultado para o usu�rio
		fieldResultadoVel = new JTextField();
		fieldResultadoVel.setBounds(117, 280, 146, 20);
		getContentPane().add(fieldResultadoVel);
		fieldResultadoVel.setColumns(10);
		fieldResultadoVel.setVisible(false);  // Esse m�todo faz com que o TextField n�o fique vis�vel para o usu�rio.
		
		
		// Codifica��o do quarto JLabel , suas coordenadas e seu texto.
		JLabel lblTextoVel4 = new JLabel("Resultado");
		lblTextoVel4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoVel4.setBounds(151, 255, 79, 14);
		getContentPane().add(lblTextoVel4);
		lblTextoVel4.setVisible(false);   // Esse m�todo faz com que o Label n�o fique vis�vel para o usu�rio.
		
		
		
		// Codifica��o do primeiro JButton.
		// Este Button serve para converter a unidade de medida.
		JButton btnBotaoVeloc = new JButton("OK");
		
		// A��o criada ao clicar no Button(btnBotaoVeloc).
		btnBotaoVeloc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldVel.getText().toString());/* Essa variavel serve para armazenar o valor do
                																		fieldVel (string) em forma de Double  */
				
				// Aqui � feita a conver��o
				velocidade.converteVelo(valor, comboVel1.getSelectedIndex());
			
				// Exibi��o do resultado
				lblTextoVel4.setVisible(true); // Torna o lblTextoVel4 vis�vel para o usu�rio.
				fieldResultadoVel.setVisible(true); // Torna o fieldResultadoVel vis�vel para o usu�rio.
				fieldResultadoVel.setText(velocidade.getVelocidade(comboVel2.getSelectedIndex()));/* Exibi��o do resultado no
				 																						fieldResultadoVel*/
				
			}
		});
		
		// Coordenadas do btnBotaoVeloc.
		btnBotaoVeloc.setBounds(146, 190, 89, 23);
		getContentPane().add(btnBotaoVeloc);
		
		
		// Codifica��o do segundo JButton.
		// Este Button serve para voltar para a TelaPrincipal.
		JButton btnBotaoVoltarVel = new JButton("Voltar");
		
		// A��o criada ao clicar no Button(btnBotaoVoltarVel).
		btnBotaoVoltarVel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false); // Esse m�todo deixa a TelaVelocidade invis�vel para o usu�rio.
				new TelaPrincipal().setVisible(true); // Este m�todo deixa a TelaPrincipal vis�vel para o usu�rio.
			}
		});
		
		// Coordenadas do btnBotaoBoltarVel.
		btnBotaoVoltarVel.setBounds(10, 279, 70, 23);
		getContentPane().add(btnBotaoVoltarVel);
		
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);

	}

}