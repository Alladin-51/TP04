package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	public TelaPrincipal() {
		
		
		// Codifica��o e coordenadas do Jframe.
		setTitle("Conversor de medidas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Codifica��o do JLabel da tela principal com suas coordenadas e seu texto.
		JLabel lblTextoPrincipal = new JLabel("Escolha qual campo de medida deseja converter");
		lblTextoPrincipal.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTextoPrincipal.setBounds(10, 11, 284, 28);
		contentPane.add(lblTextoPrincipal);
		
		// Codifica��o da JComboBox da tela principal com suas coordenadas e seus componentes.
		JComboBox comboPrincipal = new JComboBox();
		comboPrincipal.setModel(new DefaultComboBoxModel(new String[] {"Comprimento", "Area", "Peso", "Volume", "Temperatura","Tempo", "Velocidade", "Dados"}));
		comboPrincipal.setBounds(62, 78, 157, 22);
		contentPane.add(comboPrincipal);
		
		
		// Codifica��o do JButton da tela principal
		// Este Butto serve para chamar o pr�ximo frame.
		JButton btnBotaoPrincipal = new JButton("OK");
		
		// Coordenadas do btnBotaoPrincipal.
		btnBotaoPrincipal.setBounds(99, 127, 89, 23);
			
		// A��o criada ao clicar no btnBotaoPrincipal.
		btnBotaoPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false); // Este m�todo deixa a TelaPrincipal invis�vel para o usu�rio.
			
				switch(comboPrincipal.getSelectedIndex())   /* Este switch serve para determinar qual frame vai abrir de acordo com a 
				                                                          op��o escolhida na JComboBox (comboPrincipal)  */
				{
				case 0: 
					new TelaComprimento();  // Abre o frame TelaComprimento.
					break;
				case 1:
					new TelaArea();         // Abre o frame TelaArea.
					break; 
				case 2:
					new TelaPeso();         // Abre o frame TelaPeso.
					break;
				case 3:
					new TelaVolume();       // Abre o frame TelaVolume.
					break;
				case 4:
					new TelaTemperatura();  // Abre o frame TelaTemperatura.
					break;
				case 5:
					new TelaTempo();        // Abre o frame TelaTempo.
					break;
				case 6:
				new TelaVelocidade();       // Abre o frame TelaVelocidade.
					break;
				case 7:
					new TelaDados();        // Abre o frame TelaDados.
					break;
				}	
			}
		});
		
		contentPane.add(btnBotaoPrincipal);
	}
}

