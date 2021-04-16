package view;
import converter.Peso;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;

public class TelaPeso extends JFrame {

	private JPanel contentPane;
	private JTextField fieldPeso;
	private JTextField fieldResultadoPeso;

	public TelaPeso() {
		
		
		// Instancia��o da classe Peso do pacote converter.
		Peso peso = new Peso();
		
		// Coordenadas do frame.
		setBounds(200, 100, 400, 350);
		getContentPane().setLayout(null);
		setTitle("Peso");
		
		// Codifica��o do primeiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoPeso1 = new JLabel("Digite o valor a ser convertido");
		lblTextoPeso1.setBounds(108, 11, 220, 14);
		getContentPane().add(lblTextoPeso1);
		
		
		// Codifica��o do primeiro JTextField com suas coordenadas.
		// Este � o textField que recebe o n�mero digitado pelo usu�rio.
		fieldPeso = new JTextField();
		fieldPeso.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldPeso);
		fieldPeso.setColumns(10);
		
		
		// Codifica��o do segundo JLabel , suas coordenadas e seu texto.
		JLabel lblTextoPeso2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoPeso2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoPeso2);
		
		
		// Codifica��o da primeira JComboBox com suas coordenadas e seus componentes.
		// Nessa ComboBox o usu�rio escolhe a unidade de medida do n�mero que ele digitou no Jtextfield acima.
		JComboBox comboPeso1 = new JComboBox();
		comboPeso1.setModel(new DefaultComboBoxModel(new String[] {"Miligrama", "Grama", "Quilograma", "Libras", "Toneladas"}));
		comboPeso1.setBounds(122, 92, 130, 22);
		getContentPane().add(comboPeso1);
		
		
		// Codifica��o do terceiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoPeso3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoPeso3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoPeso3);
		
		
		// Codifica��o da segunda JComboBox com suas coordenadas e seus componentes.
		// Nesta ComboBox o usu�rio escolhe a unidade para qual ele deseja converter o n�mero por ele digitado.
		JComboBox comboPeso2 = new JComboBox();
		comboPeso2.setModel(new DefaultComboBoxModel(new String[] {"Miligrama", "Grama", "Quilograma", "Libras", "Toneladas"}));
		comboPeso2.setBounds(122, 150, 130, 22);
		getContentPane().add(comboPeso2);
		
		
		
		// Codifica��o do segundo JTextField com suas coordenadas.
		// Este � o TextField que printa o resultado para o usu�rio
		fieldResultadoPeso = new JTextField();
		fieldResultadoPeso.setBounds(117, 280, 146, 20);
		getContentPane().add(fieldResultadoPeso);
		fieldResultadoPeso.setColumns(10);
		fieldResultadoPeso.setVisible(false); // Esse m�todo faz com que o TextField n�o fique vis�vel para o usu�rio.
		
		
		// Codifica��o do quarto JLabel , suas coordenadas e seu texto.
		JLabel lblTextoPeso4 = new JLabel("Resultado");
		lblTextoPeso4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoPeso4.setBounds(151, 255, 79, 14);
		getContentPane().add(lblTextoPeso4);
		lblTextoPeso4.setVisible(false); // Esse m�todo faz com que o Label n�o fique vis�vel para o usu�rio.
		
		
		
		// Codifica��o do primeiro JButton.
		// Este Button serve para converter a unidade de medida.
		JButton btnBotaoPeso = new JButton("Converter");
		
		// A��o criada ao clicar no Button(btnBotaoPeso).
		btnBotaoPeso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldPeso.getText().toString()); /* Essa variavel serve para armazenar o valor do
                																		 fieldArea (string) em forma de Double  */
				
				// Aqui � feita a conver��o
				peso.convertePeso(valor, comboPeso1.getSelectedIndex());
			
				// Exibi��o do resultado
				
				lblTextoPeso4.setVisible(true); // Torna o lblTextoPeso4 vis�vel para o usu�rio.
				fieldResultadoPeso.setVisible(true); // Torna o fieldResultadoPeso vis�vel para o usu�rio.
				fieldResultadoPeso.setText(peso.getPeso(comboPeso2.getSelectedIndex()));// Exibi��o do resultado no fieldResultadoPeso
				
				
				
			}
		});
		
		// Coordenadas do btnBotaoPeso.
		btnBotaoPeso.setBounds(132, 193, 113, 23);
		getContentPane().add(btnBotaoPeso);
		
		
		// Codifica��o do segundo JButton.
		// Este Button serve para voltar para a TelaPrincipal.
		JButton btnBotaoVoltarPeso = new JButton("Voltar");
		
		// A��o criada ao clicar no Button(btnBotaoVoltarPeso).
		btnBotaoVoltarPeso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false); // Esse m�todo deixa a TelaPeso invis�vel para o usu�rio.
				new TelaPrincipal().setVisible(true); // Este m�todo deixa a TelaPrincipal vis�vel para o usu�rio.
			}
		});
		
		// Coordenadas do btnBotaoVoltarPeso.
		btnBotaoVoltarPeso.setBounds(10, 279, 70, 23);
		getContentPane().add(btnBotaoVoltarPeso);
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		
		
	}
}