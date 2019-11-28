package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import Vista.MenuPrincipal;
import Vista.Ventana_Imagen;
import Vista.Ventana_Imagnes2;
import Vista.Ventana_Instrucciones;
import Vista.Ventana_Juego;
import Vista.Ventana_Jugador;
import Vista.Ventana_Numero_Jugadores;


public class Controlador implements ActionListener  {

	public MenuPrincipal ventanaMenu;
	public Ventana_Instrucciones ventanainstru;


	public Ventana_Imagen ventanaima;
	public Ventana_Imagnes2 ventanaima2;
	public Ventana_Numero_Jugadores ventanaNjugadores;
	public Ventana_Juego ventanajuego;
	ImageIcon imagenfichas, imagencolores, imagenfichas2, imagencolores2, dado;
	ImageIcon iconofichas, iconocolores, iconofichas2, iconocolores2, dadonum;



	public Controlador() {

		ventanaMenu = new MenuPrincipal();	
		ventanaMenu.panel1.boton.addActionListener(this);

	}


	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals("1. Jugar")){

			ventanaMenu.dispose();
			ventanainstru = new Ventana_Instrucciones();
			ventanainstru.toFront();
			ventanainstru.instru.botonsiguiente.addActionListener(this);

		}

		if(e.getActionCommand().equals("SIGUIENTE")) {

			ventanainstru.dispose();
			ventanaNjugadores = new Ventana_Numero_Jugadores();
			ventanaNjugadores.panel1.b2.addActionListener(this);
			


		}
		
		if(e.getActionCommand().equals("SIGUIENTE")) {

			ventanaNjugadores.panel2.b3.addActionListener(this);


		}
		if(e.getActionCommand().equals("SIGUIENTE")) {
			
			ventanaNjugadores.panel1.b3.addActionListener(this);
			ventanaNjugadores.panel1.b4.addActionListener(this);


		}


		//cuando oprime 2
		if(e.getActionCommand().equals("2")) {


			ventanaima = new Ventana_Imagen();
			ventanaima.panel2.etiquetaimagen.setVisible(true);

			imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 1.png"));
			iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
			ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);
			ventanaima.panel1.ver.addActionListener(this);
			ventanaima.panel1.boton.addActionListener(this);
			ventanaima.panel1.add(ventanaima.panel1.boton);
		
		
		}else if(ventanaima.panel1.lista.getSelectedItem().equals("Azul")&&e.getActionCommand().equals("Ver")) {

				 
					imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 1.png"));
					iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);
					
			 }else if(ventanaima.panel1.lista.getSelectedItem().equals("Rojo")&&e.getActionCommand().equals("Ver")) {

					imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 2.png"));
					iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);
					
					
					
			 }else if(ventanaima.panel1.lista.getSelectedItem().equals("Verde")&&e.getActionCommand().equals("Ver")) {

					imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 3.png"));
					iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);
					
			 }else if(ventanaima.panel1.lista.getSelectedItem().equals("Amarillo")&&e.getActionCommand().equals("Ver")) {

					imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 4.png"));
					iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);
			 }
			
	 if(e.getActionCommand().equals("Escoger")) {
					
					ventanaima2 = new Ventana_Imagnes2();
					ventanaima2.setVisible(true);
					imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha - 1.png"));
					iconofichas2 = new ImageIcon(imagenfichas2.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanaima2.panel2.etiquetaimagen2.setIcon(iconofichas2);
					ventanaima2.panel1.ver.addActionListener(this);
					ventanaima2.panel1.boton.addActionListener(this);
					

				}
				 if(ventanaima2.panel1.lista.getSelectedItem().equals("Azul")&&e.getActionCommand().equals("Ver")) {
						 
							imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha - 1.png"));
							iconofichas2 = new ImageIcon(imagenfichas2.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
							ventanaima2.panel2.etiquetaimagen2.setIcon(iconofichas2);
							
					 }else if(ventanaima2.panel1.lista.getSelectedItem().equals("Rojo")&&e.getActionCommand().equals("Ver")) {

							imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha - 2.png"));
							iconofichas2 = new ImageIcon(imagenfichas2.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
							ventanaima2.panel2.etiquetaimagen2.setIcon(iconofichas2);
							
							
							
					 }else if(ventanaima2.panel1.lista.getSelectedItem().equals("Verde")&&e.getActionCommand().equals("Ver")) {

							imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha - 3.png"));
							iconofichas2= new ImageIcon(imagenfichas2.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
							ventanaima2.panel2.etiquetaimagen2.setIcon(iconofichas2);
							
					 }else if(ventanaima2.panel1.lista.getSelectedItem().equals("Amarillo")&&e.getActionCommand().equals("Ver")) {

							imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha - 4.png"));
							iconofichas2 = new ImageIcon(imagenfichas2.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
							ventanaima2.panel2.etiquetaimagen2.setIcon(iconofichas2);
					 }
				 
				 
	
		else if(e.getActionCommand().equals("Guardar")) {

			ventanaima.dispose();
			ventanajuego = new Ventana_Juego();
			ventanajuego.musica.breproducir.addActionListener(this);
			

			imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha - 4.png"));
			iconofichas2 = new ImageIcon(imagenfichas2.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));
			ventanajuego.imagen.etiquetaimagen.setIcon(iconofichas2);
			
			
			dado = new ImageIcon(getClass().getResource("/Modelo/dado1.jpg"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dados.etiquetadado.setIcon(dadonum);	
			ventanajuego.lanzar.addActionListener(this);


		if(e.getActionCommand().equals("2")) {


			ventanaima = new Ventana_Imagen();
			ventanaima.panel2.etiquetaimagen.setVisible(true);

			imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 1.png"));
			iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
			ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);
			ventanaima.panel1.ver.addActionListener(this);
			ventanaima.panel1.boton.addActionListener(this);
			ventanaima.panel1.add(ventanaima.panel1.boton);
			
		
		if(ventanaima.panel1.lista.getSelectedItem().equals("Azul")&&e.getActionCommand().equals("Ver")) {

				 
					imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 1.png"));
					iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);
					
			 }else if(ventanaima.panel1.lista.getSelectedItem().equals("Rojo")&&e.getActionCommand().equals("Ver")) {

					imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 2.png"));
					iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);
					
					
					
			 }else if(ventanaima.panel1.lista.getSelectedItem().equals("Verde")&&e.getActionCommand().equals("Ver")) {

					imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 3.png"));
					iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);
					
			 }else if(ventanaima.panel1.lista.getSelectedItem().equals("Amarillo")&&e.getActionCommand().equals("Ver")) {

					imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 4.png"));
					iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);
			 }
			 if(e.getActionCommand().equals("Escoger")) {
					
					ventanaima2 = new Ventana_Imagnes2();
					ventanaima2.setVisible(true);
					imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha - 1.png"));
					iconofichas2 = new ImageIcon(imagenfichas2.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanaima2.panel2.etiquetaimagen2.setIcon(iconofichas2);
					ventanaima2.panel1.ver.addActionListener(this);
					ventanaima2.panel1.boton.addActionListener(this);

				}
				else if(ventanaima2.panel1.lista.getSelectedItem().equals("Azul")&&e.getActionCommand().equals("Ver")) {
						 
							imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha - 1.png"));
							iconofichas2 = new ImageIcon(imagenfichas2.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
							ventanaima2.panel2.etiquetaimagen2.setIcon(iconofichas2);
							
					 }else if(ventanaima2.panel1.lista.getSelectedItem().equals("Rojo")&&e.getActionCommand().equals("Ver")) {

							imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha - 2.png"));
							iconofichas2 = new ImageIcon(imagenfichas2.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
							ventanaima2.panel2.etiquetaimagen2.setIcon(iconofichas2);
							
							
							
					 }else if(ventanaima2.panel1.lista.getSelectedItem().equals("Verde")&&e.getActionCommand().equals("Ver")) {

							imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha - 3.png"));
							iconofichas2= new ImageIcon(imagenfichas2.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
							ventanaima2.panel2.etiquetaimagen2.setIcon(iconofichas2);
							
					 }else if(ventanaima2.panel1.lista.getSelectedItem().equals("Amarillo")&&e.getActionCommand().equals("Ver")) {

							imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha - 4.png"));
							iconofichas2 = new ImageIcon(imagenfichas2.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
							ventanaima2.panel2.etiquetaimagen2.setIcon(iconofichas2);
					 }
	
		
	
				
		else if(e.getActionCommand().equals("Escoger")) {

			ventanaima.dispose();
			ventanajuego = new Ventana_Juego();
			ventanajuego.musica.breproducir.addActionListener(this);
			
			dado = new ImageIcon(getClass().getResource("/Modelo/dado1.jpg"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dados.etiquetadado.setIcon(dadonum);	
			ventanajuego.lanzar.addActionListener(this);
			
		}
		 	 
		 	int i = (int)(Math.random()*6+1);
		 	
		 	if(e.getActionCommand().equals("Tirar Dado")&& i == 1 ) {

				dado = new ImageIcon(getClass().getResource("/Modelo/dado1.jpg"));
				dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
				ventanajuego.dados.etiquetadado.setIcon(dadonum);	
		 	}else if(i == 2 ) {

				dado = new ImageIcon(getClass().getResource("/Modelo/Dado - 2.jpg"));
				dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
				ventanajuego.dados.etiquetadado.setIcon(dadonum);	
		 	}else if(i == 3 ) {

				dado = new ImageIcon(getClass().getResource("/Modelo/Dado - 3.jpg"));
				dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
				ventanajuego.dados.etiquetadado.setIcon(dadonum);	
		 	}else if(i == 4 ) {

				dado = new ImageIcon(getClass().getResource("/Modelo/Dado - 4.jpg"));
				dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
				ventanajuego.dados.etiquetadado.setIcon(dadonum);	
		 	}else if(i == 5 ) {

				dado = new ImageIcon(getClass().getResource("/Modelo/Dado - 5.jpg"));
				dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
				ventanajuego.dados.etiquetadado.setIcon(dadonum);	
				
		 	}else if(i == 6 ) {

				dado = new ImageIcon(getClass().getResource("/Modelo/Dado - 6.jpg"));
				dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
				ventanajuego.dados.etiquetadado.setIcon(dadonum);	
		 		 	
		 }

	}
		
		
	