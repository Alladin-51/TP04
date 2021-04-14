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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboPrincipal = new JComboBox();
		comboPrincipal.setModel(new DefaultComboBoxModel(new String[] {"Comprimento", "Area", "Peso", "Volume", "Temperatura","Tempo", "Velocidade", "Dados"}));
		comboPrincipal.setBounds(62, 78, 157, 22);
		contentPane.add(comboPrincipal);
		
		JLabel lblMsgInicio = new JLabel("Escolha qual campo de medida deseja converter");
		lblMsgInicio.setFont(new Font("Arial", Font.PLAIN, 11));
		lblMsgInicio.setBounds(24, 11, 238, 28);
		contentPane.add(lblMsgInicio);
		
		JButton btnBotaoPrincipal = new JButton("OK");
		btnBotaoPrincipal.setBounds(99, 127, 89, 23);
			
		btnBotaoPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				switch(comboPrincipal.getSelectedIndex())
				{
				case 0: 
					new TelaComprimento();
					break;
				case 1:
					new TelaArea();
				
					break;
				case 2:
					new TelaPeso();
					break;
				case 3:
			//		new telaVolume();
					break;
				case 4:
			//		new TelaTemperatura();
					break;
				case 5:
			//		new TelaTempo();
					break;
				case 6:
		//			new TelaVelocidade();
					break;
				case 7:
			//		new TelaDados();
					break;
				}	
			}
		});
		
		contentPane.add(btnBotaoPrincipal);
	}
}

