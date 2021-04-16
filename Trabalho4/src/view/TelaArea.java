package view;
import converter.Area;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaArea extends JFrame {
	private JTextField fieldArea;

	private JPanel contentPane;
	private JTextField fieldResultadoArea;

	public TelaArea() {
		
		
		// Instanciação da classe Area do pacote converter
		Area area = new Area();
		
		
		// Coordenadas do frame
		setBounds(200, 100, 400, 350);
		getContentPane().setLayout(null);
		setTitle("Area");
		
		
		// Codificação do primeiro JLabel , suas coordenadas e seu texto.
		JLabel lblTextoArea1 = new JLabel("Digite o valor a ser convertido");
		lblTextoArea1.setBounds(108, 11, 220, 14);
		getContentPane().add(lblTextoArea1);
		
		
		// Codificação do primeiro JTextField com suas coordenadas.
		// Este é o textField que recebe o número digitado pelo usuário.
		fieldArea = new JTextField();
		fieldArea.setBounds(138, 36, 86, 20);
		getContentPane().add(fieldArea);
		fieldArea.setColumns(10);
		
		
		// Codificação do segundo Jlabel com  suas coordenadas e seu texto.
		JLabel lblTextoArea2 = new JLabel("Selecione a unidade de medida do numero digitado acima");
		lblTextoArea2.setBounds(29, 67, 331, 14);
		getContentPane().add(lblTextoArea2);
		
		
		// Codificação da primeira JComboBox com suas coordenadas e seus componentes.
		// Nessa ComboBox o usuário escolhe a unidade de medida do número que ele digitou no Jtextfield acima.
		JComboBox comboArea1 = new JComboBox();
		comboArea1.setModel(new DefaultComboBoxModel(new String[] {"Milimetro quadrado", "Centimetro quadrado", "Decimetro quadrado", "Metro quadrado", "Quilometro quadrado", "Milha quadrada", "Pes quadrados"}));
		comboArea1.setBounds(122, 92, 130, 22);
		getContentPane().add(comboArea1);
		
		
		// Codificação do terceiro JLabel com suas coordenadas e seu texto.
		JLabel lblTextoArea3 = new JLabel("Selecione a unidade para qual deseja converter");
		lblTextoArea3.setBounds(51, 123, 295, 14);
		getContentPane().add(lblTextoArea3);
		
		
		// Codificação da segunda JComboBox com suas coordenadas e seus componentes.
		// Nesta ComboBox o usuário escolhe a unidade para qual ele deseja converter o número por ele digitado.
		JComboBox comboArea2 = new JComboBox();
		comboArea2.setModel(new DefaultComboBoxModel(new String[] {"Milimetro quadrado", "Centimetro quadrado", "Decimetro quadrado", "Metro quadrado", "Quilometro quadrado", "Milha quadrada", "Pes quadrados"}));
		comboArea2.setBounds(122, 150, 130, 22);
		getContentPane().add(comboArea2);
		
		
		
		// Codificação do segundo JTextField com suas coordenadas.
		// Este é o TextField que printa o resultado para o usuário
		fieldResultadoArea = new JTextField();
		fieldResultadoArea.setBounds(116, 280, 146, 20);
		getContentPane().add(fieldResultadoArea);
		fieldResultadoArea.setColumns(10);
		fieldResultadoArea.setVisible(false);      // Esse método faz com que o TextField não fique visível para o usuário.
		
		
		
		// Codificação do quarto JLabel com suas coordenadas e seu texto.
		JLabel lblTextoArea4 = new JLabel("Resultado");
		lblTextoArea4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTextoArea4.setBounds(151, 255, 79, 14);
		getContentPane().add(lblTextoArea4);
		lblTextoArea4.setVisible(false);         // Esse método faz com que o Label não fique visível para o usuário.
		
		
		
		// Codificação do primeiro JButton.
		// Este Button serve para converter a unidade de medida.
		JButton btnBotaoArea = new JButton("Converter");
		
		// Ação criada ao clicar no Button(btnBotaoArea).
		btnBotaoArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(fieldArea.getText().toString()); /* Essa variavel serve para armazenar o valor do
				                                                                         fieldArea (string) em forma de Double  */
				
				// Aqui é feita a converção de unidade de medida
				area.converteArea(valor, comboArea1.getSelectedIndex());
			
				// Exibição do resultado
				
				lblTextoArea4.setVisible(true); // Torna o lblTextoArea4 visível para o usuário.
				fieldResultadoArea.setVisible(true); // Torna o fieldResultadoArea visível para o usuário.
				fieldResultadoArea.setText(area.getArea(comboArea2.getSelectedIndex()));// Exibição do resultado no fieldResultadoArea
				
			}
		});
		
		// Coordenadas do btnBotaoArea
		btnBotaoArea.setBounds(132, 193, 113, 23);
		getContentPane().add(btnBotaoArea);
		
		
		// Codificação do segundo JButton.
		// Este Button serve para voltar para a TelaPrincipal.
		JButton btnBotaoVoltarArea = new JButton("Voltar");
		
		// Ação criada ao clicar no Button(btnBotaoVoltarArea).
		btnBotaoVoltarArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false); // Esse método deixa a TelaArea invisível para o usuário.
				new TelaPrincipal().setVisible(true); // Este método deixa a TelaPrincipal visível para o usuário.
			}
		});
		
		// Coordenadas do btnBotaoVoltarArea.
		btnBotaoVoltarArea.setBounds(10, 279, 70, 23);
		getContentPane().add(btnBotaoVoltarArea);
		
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		

	}
	}


