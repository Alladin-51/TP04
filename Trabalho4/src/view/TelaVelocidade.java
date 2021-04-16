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
		
		// Instanciação da classe Velocidade do pacote converter
		Velocidade velocidade = new Velocidade();
		
		
		// Coordenadas  do frame
		setBounds(100, 200, 400, 350);
		getContentPane().setLayout(null);
		setTitle("Velocidade");
		
		
		// Codificação do primeiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoVel1 = new JLabel("Digite o valor a ser convertido");
		lblTextoVel1.setBounds(108, 11, 220, 14);
		getContentPane().add(lblTextoVel1);
		
		
		// Codificação do primeiro JTextField com suas coordenadas.
		// Este é o textField que recebe o número digitado pelo usuário.
		fieldVel = new JTextField();
		fieldVel.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldVel);
		fieldVel.setColumns(10);
		
		
		// Codificação do segundo JLabel , suas coordenadas e seu texto.
		JLabel lblTextoVel2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoVel2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoVel2);
		
		
		// Codificação da primeira JComboBox com suas coordenadas e seus componentes.
		// Nessa ComboBox o usuário escolhe a unidade de medida do número que ele digitou no Jtextfield acima.
		JComboBox comboVel1 = new JComboBox();
		comboVel1.setModel(new DefaultComboBoxModel(new String[] {"Pes por segundo", "Metros por segundo", "Quilometros por segundo", "Metros por minuto", "Quilometros por minuto", "Quilometros por hora", "Milhas por hora"}));
		comboVel1.setBounds(122, 92, 130, 22);
		getContentPane().add(comboVel1);
		
		
		// Codificação do terceiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoVel3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoVel3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoVel3);
		
		
		// Codificação da segunda JComboBox com suas coordenadas e seus componentes.
		// Nesta ComboBox o usuário escolhe a unidade para qual ele deseja converter o número por ele digitado.
		JComboBox comboVel2 = new JComboBox();
		comboVel2.setModel(new DefaultComboBoxModel(new String[] {"Pes por segundo", "Metros por segundo", "Quilometros por segundo", "Metros por minuto", "Quilometros por minuto", "Quilometros por hora", "Milhas por hora"}));
		comboVel2.setBounds(122, 150, 130, 22);
		getContentPane().add(comboVel2);
		
		
		
		// Codificação do segundo JTextField com suas coordenadas.
		// Este é o TextField que printa o resultado para o usuário
		fieldResultadoVel = new JTextField();
		fieldResultadoVel.setBounds(117, 280, 146, 20);
		getContentPane().add(fieldResultadoVel);
		fieldResultadoVel.setColumns(10);
		fieldResultadoVel.setVisible(false);  // Esse método faz com que o TextField não fique visível para o usuário.
		
		
		// Codificação do quarto JLabel , suas coordenadas e seu texto.
		JLabel lblTextoVel4 = new JLabel("Resultado");
		lblTextoVel4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoVel4.setBounds(151, 255, 79, 14);
		getContentPane().add(lblTextoVel4);
		lblTextoVel4.setVisible(false);   // Esse método faz com que o Label não fique visível para o usuário.
		
		
		
		// Codificação do primeiro JButton.
		// Este Button serve para converter a unidade de medida.
		JButton btnBotaoVeloc = new JButton("OK");
		
		// Ação criada ao clicar no Button(btnBotaoVeloc).
		btnBotaoVeloc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldVel.getText().toString());/* Essa variavel serve para armazenar o valor do
                																		fieldVel (string) em forma de Double  */
				
				// Aqui é feita a converção
				velocidade.converteVelo(valor, comboVel1.getSelectedIndex());
			
				// Exibição do resultado
				lblTextoVel4.setVisible(true); // Torna o lblTextoVel4 visível para o usuário.
				fieldResultadoVel.setVisible(true); // Torna o fieldResultadoVel visível para o usuário.
				fieldResultadoVel.setText(velocidade.getVelocidade(comboVel2.getSelectedIndex()));/* Exibição do resultado no
				 																						fieldResultadoVel*/
				
			}
		});
		
		// Coordenadas do btnBotaoVeloc.
		btnBotaoVeloc.setBounds(146, 190, 89, 23);
		getContentPane().add(btnBotaoVeloc);
		
		
		// Codificação do segundo JButton.
		// Este Button serve para voltar para a TelaPrincipal.
		JButton btnBotaoVoltarVel = new JButton("Voltar");
		
		// Ação criada ao clicar no Button(btnBotaoVoltarVel).
		btnBotaoVoltarVel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false); // Esse método deixa a TelaVelocidade invisível para o usuário.
				new TelaPrincipal().setVisible(true); // Este método deixa a TelaPrincipal visível para o usuário.
			}
		});
		
		// Coordenadas do btnBotaoBoltarVel.
		btnBotaoVoltarVel.setBounds(10, 279, 70, 23);
		getContentPane().add(btnBotaoVoltarVel);
		
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);

	}

}