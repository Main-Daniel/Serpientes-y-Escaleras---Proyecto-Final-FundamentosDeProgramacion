package Vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Panelcolor3 extends JPanel {
	public JTextField nombreJugador;
	public JComboBox<Object> lista;
	public String[] Colores = {"Azul", "Rojo", "Verde", "Amarillo"};
	public JLabel etiqueta;
	public JButton boton;
	public JButton aceptar;
	public JButton ver;
	
	public Panelcolor3() {
		
		setLayout(null);
		setVisible(true);

		etiqueta = new JLabel("Color:", SwingConstants.CENTER);
		etiqueta.setForeground(Color.BLACK);
		etiqueta.setBounds(20, 10, 80, 30);
		add(etiqueta);
		
		lista = new JComboBox<Object>(Colores);
		lista.setBounds(80, 10, 80, 30);
		add(lista);
		
		boton = new JButton("Confirmar");
		boton.setBounds(50, 200, 100, 30);
		add(boton);
			
		nombreJugador = new JTextField();
		nombreJugador.setBounds(40,100,130,20);
		add(nombreJugador);
		
		etiqueta = new JLabel("Ingresa tu nombre Jugador 2: "); 
		etiqueta.setBounds(10, 60, 180, 50);
		add(etiqueta);	
		

		ver = new JButton("Ver");
		ver.setBounds(80, 50, 70, 20);
		add(ver);
			
		aceptar = new JButton("JUGAR");
		aceptar.setBounds(50, 200, 100, 30);
		add(aceptar);
	
}
}