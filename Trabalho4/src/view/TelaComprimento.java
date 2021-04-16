package view;
import converter.Comprimento;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaComprimento extends JFrame {

	private JPanel contentPane;
	private JTextField fieldComp;
	private JTextField fieldResultadoComp;

	
	public TelaComprimento() {
		setTitle("Comprimento");
		
		// Aqui � feito a instancia��o da classe comprimento 
		Comprimento comprimento = new Comprimento();
		
		
		// Coordenadas do frame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 400, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// Codifica��o do primeiro JLabel, suas coordenadas e seu texto.
		JLabel lblTextoComp1 = new JLabel("Digite o n\u00FAmero a ser convertido");
		lblTextoComp1.setBounds(108, 11, 220, 14);
		contentPane.add(lblTextoComp1);
		
		
		// Codifica��o do primeiro JTextField com suas coordenadas.
		// Este � o textField que recebe o n�mero digitado pelo usu�rio.
		fieldComp = new JTextField();
		fieldComp.setBounds(142, 36, 86, 20);
		contentPane.add(fieldComp);
		fieldComp.setColumns(10);
		
		
		// Codifica��o do segundo JLabel, suas coordenadas e seu texto.
		JLabel lblTextoComp2 = new JLabel("Selecione a unidade de medida do n\u00FAmero digitado acima");
		lblTextoComp2.setBounds(29, 67, 331, 14);
		contentPane.add(lblTextoComp2);
		
		
		// Codifica��o da primeira JComboBox com suas coordenadas e seus componentes.
		// Nessa ComboBox o usu�rio escolhe a unidade de medida do n�mero que ele digitou no Jtextfield acima.
		JComboBox comboComp1 = new JComboBox();
		comboComp1.setModel(new DefaultComboBoxModel(new String[] {"Milimetro", "Centimetro", "Decimetro", "Metro", "Quilometro", "Milha", "Pes"}));
		comboComp1.setBounds(118, 90, 134, 22);
		contentPane.add(comboComp1);
		
		
		// Codifica��o do terceiro JLabel, suas coordenadas e seu texto.
		JLabel lblTextoComp3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoComp3.setBounds(51, 123, 295, 14);
		contentPane.add(lblTextoComp3);
		
		
		// Codifica��o da segunda JComboBox com suas coordenadas e seus componentes.
		// Nesta ComboBox o usu�rio escolhe a unidade para qual ele deseja converter o n�mero por ele digitado.
		JComboBox comboComp2 = new JComboBox();
		comboComp2.setModel(new DefaultComboBoxModel(new String[] {"Milimetro", "Centimetro", "Decimetro", "Metro", "Quilometro", "Milha", "Pes"}));
		comboComp2.setBounds(122, 150, 130, 22);
		contentPane.add(comboComp2);
		
		
		
		// Codifica��o do segundo JTextField com suas coordenadas.
		// Este � o TextField que printa o resultado para o usu�rio
		fieldResultadoComp = new JTextField();
		fieldResultadoComp.setBounds(117, 280, 146, 20);
		contentPane.add(fieldResultadoComp);
		fieldResultadoComp.setColumns(10);
		fieldResultadoComp.setVisible(false); // Esse m�todo faz com que o TextField n�o fique vis�vel para o usu�rio.
		
		
		// Codifica��o do quarto JLabel, suas coordenadas e seu texto.
		JLabel lblTextoComp4 = new JLabel("Resultado");
		lblTextoComp4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoComp4.setBounds(151, 255, 79, 14);
		contentPane.add(lblTextoComp4);
		lblTextoComp4.setVisible(false); // Esse m�todo faz com que o Label n�o fique vis�vel para o usu�rio.
		
		
		// Codifica��o do primeiro JButton.
		// Este Button serve para converter a unidade de medida.
		JButton btnBotaoComp = new JButton("Converter");
		
		// A��o criada ao clicar no Button(btnBotaoComp).
		btnBotaoComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				double valor = Double.parseDouble(fieldComp.getText().toString()); /* Essa variavel serve para armazenar o valor do
                																		fieldArea (string) em forma de Double  */
				
				// Aqui � feita a conver��o
				comprimento.converteComp(valor, comboComp1.getSelectedIndex());
			
				// Exibi��o do resultado
				
				 lblTextoComp4.setVisible(true); // Torna o lblTextoArea4 vis�vel para o usu�rio.
				 fieldResultadoComp.setVisible(true); // Torna o fieldResultadoArea vis�vel para o usu�rio.
			     fieldResultadoComp.setText(comprimento.getComp(comboComp2.getSelectedIndex()));/* Exibi��o do resultado no 
			     																					  fieldResultadoArea */
			}
		});
		// Coordenadas do btnBotaoComp.
		btnBotaoComp.setBounds(132, 193, 113, 23);
		contentPane.add(btnBotaoComp);
		
		
		// Codifica��o do segundo JButton.
		// Este Button serve para voltar para a TelaPrincipal.
		JButton btnBotaoVoltarComp = new JButton("Voltar");
		
		// A��o criada ao clicar no Button(btnBotaoVoltarComp).
		btnBotaoVoltarComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new	TelaPrincipal().setVisible(true); // Este m�todo deixa a TelaPrincipal vis�vel para o usu�rio.
				setVisible(false);  // Esse m�todo deixa a TelaArea invis�vel para o usu�rio.
				
			}
		});
		
		// Coordenadas do btnBotaoVoltarComp.
		btnBotaoVoltarComp.setBounds(10, 279, 70, 23);
		contentPane.add(btnBotaoVoltarComp);
		
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
}
