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
		
		// Instancia��o da classe Volume do pacote converter
		Volume volume = new Volume();
		
		// Coordenadas do frame
		setBounds(200, 100, 400, 350);
		getContentPane().setLayout(null);
		setTitle("Volume");
		
		
		// Codifica��o do primeiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoVol1 = new JLabel("Digite o valor a ser convertido");
		lblTextoVol1.setBounds(108, 11, 220, 14);
		getContentPane().add(lblTextoVol1);
		
		
		// Codifica��o do primeiro JTextField com suas coordenadas.
		// Este � o textField que recebe o n�mero digitado pelo usu�rio.
		fieldVol = new JTextField();
		fieldVol.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldVol);
		fieldVol.setColumns(10);
		
		
		// Codifica��o do segundo JLabel , suas coordenadas e seu texto.
		JLabel lblTextoVol2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoVol2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoVol2);
		
		
		// Codifica��o da primeira JComboBox com suas coordenadas e seus componentes.
		// Nessa ComboBox o usu�rio escolhe a unidade de medida do n�mero que ele digitou no Jtextfield acima.
		JComboBox comboVol1 = new JComboBox();
		comboVol1.setModel(new DefaultComboBoxModel(new String[] {"Mililitros", "Litros", "Milimetros cubicos", "Centimetros cubicos", "Decimetros cubicos", "Metros cubicos", "Pes cubicos"}));
		comboVol1.setBounds(122, 92, 130, 22);
		getContentPane().add(comboVol1);
		
		
		// Codifica��o do terceiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoVol3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoVol3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoVol3);
		
		
		// Codifica��o da segunda JComboBox com suas coordenadas e seus componentes.
		// Nesta ComboBox o usu�rio escolhe a unidade para qual ele deseja converter o n�mero por ele digitado.
		JComboBox comboVol2 = new JComboBox();
		comboVol2.setModel(new DefaultComboBoxModel(new String[] {"Mililitros", "Litros", "Milimetros cubicos", "Centimetros cubicos", "Decimetros cubicos", "Metros cubicos", "Pes cubicos"}));
		comboVol2.setBounds(122, 150, 130, 22);
		getContentPane().add(comboVol2);
		
		
		
		// Codifica��o do segundo JTextField com suas coordenadas.
		// Este � o TextField que printa o resultado para o usu�rio
		fieldResultadoVol = new JTextField();
		fieldResultadoVol.setBounds(117, 280, 146, 20);
		getContentPane().add(fieldResultadoVol);
		fieldResultadoVol.setColumns(10);
		fieldResultadoVol.setVisible(false);  // Esse m�todo faz com que o TextField n�o fique vis�vel para o usu�rio.
		
		
		// Codifica��o do quarto JLabel , suas coordenadas e seu texto.
		JLabel lblTextoVol4 = new JLabel("Resultado");
		lblTextoVol4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoVol4.setBounds(151, 255, 79, 14);
		getContentPane().add(lblTextoVol4);
		lblTextoVol4.setVisible(false);  // Esse m�todo faz com que o Label n�o fique vis�vel para o usu�rio.
		
		
		
		// Codifica��o do primeiro JButton.
		// Este Button serve para converter a unidade de medida.
		JButton btnBotaoVol = new JButton("Converter");
		
		// A��o criada ao clicar no Button(btnBotaoVol).
		btnBotaoVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldVol.getText().toString());/* Essa variavel serve para armazenar o valor do
                																		 fieldVol (string) em forma de Double  */
				
				// Aqui � feita a conver��o
				volume.converteVol(valor, comboVol1.getSelectedIndex());
			
				// Exibi��o do resultado
				
				lblTextoVol4.setVisible(true); // Torna o lblTextoVol4 vis�vel para o usu�rio.
				fieldResultadoVol.setVisible(true);// Torna o fieldResultadoVol vis�vel para o usu�rio.
				fieldResultadoVol.setText(volume.getVol(comboVol2.getSelectedIndex()));// Exibi��o do resultado no fieldResultadoVol
				
			}
		});
		
		// Coordenadas do btnBotaoVol.
		btnBotaoVol.setBounds(132, 193, 113, 23);
		getContentPane().add(btnBotaoVol);
		
		
		// Codifica��o do segundo JButton.
		// Este Button serve para voltar para a TelaPrincipal.
		JButton btnBotaoVoltarVol = new JButton("Voltar");
		
		// A��o criada ao clicar no Button(btnBotaoVoltarVol).
		btnBotaoVoltarVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false); // Esse m�todo deixa a TelaVolume invis�vel para o usu�rio.
				new TelaPrincipal().setVisible(true);// Este m�todo deixa a TelaPrincipal vis�vel para o usu�rio.
				
			}
		});
		// Coordenadas do btnBotaoVoltarVol
		btnBotaoVoltarVol.setBounds(10, 279, 70, 23);
		getContentPane().add(btnBotaoVoltarVol);
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
