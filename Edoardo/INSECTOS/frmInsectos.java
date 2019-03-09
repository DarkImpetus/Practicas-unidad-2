package mx.tecnm.valladolid.ricalde;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class frmInsectos extends JFrame implements ActionListener
{	//declaración de atributos o miembros de clase o variables globales de clase
	int n, buscar=0, Pos;
	Clase_insectos Lista[];
	boolean encontrado=false;
	
	JPanel pnlUno, pnlDos, pnlTres, pnlTres2;
	JLabel lblNombre, lblClase, lblHabitat, lblColor, lblTip_alimentacion, lblSexo, lblEdad, lblPeso, lbl_anio, lbl_gr, lblImagen, lblEsp1, lblEsp2, lblEsp3, lblEsp4, lblEsp5;
	JTextField txtNombre, txtClase, txtColor, txtPeso;
	JRadioButton rdcmdMacho, rdcmdHembra;
	JComboBox lstEdad, lstHabitat, lstTip_alimentacion;
	ButtonGroup cmdgrSexo;
	JButton cmdEditar, cmdGuardar, cmdComer, cmdDormir, cmdDesplazar, cmdReproducir, cmdLimpiar, cmdEliminar, cmdImprimir, cmdSalir;
	
	String ArrayEdad[] = {"Menos de 1", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "Más de 25"};
	String ArrayHabitat[] = {"Terrestre", "Acuático",  "Acuático-terrestre", "Aéreo-terrestre"};
	String ArrayAlimentacion[] = {"Hervíboro", "Carnívoro", "Omnivoro", "Saprófago", "Hematófago"};
		
    public frmInsectos() 
    {
    	super("I N S E C T O S");
    	
    	Container Contenedor = getContentPane();
    	Contenedor.setLayout(new BorderLayout(5, 5));
    	
    	Icon Insectos = new ImageIcon("Insectos.png");
    	lblImagen = new JLabel(Insectos);

    	pnlUno    = new JPanel();
   		pnlDos    = new JPanel();
   		pnlDos.setLayout(new GridLayout(8, 3, 9, 9));
   		pnlTres   = new JPanel();
   		pnlTres.setLayout(new GridLayout(6, 1, 15, 15));
   		pnlTres2  = new JPanel();
   		pnlTres2.setLayout(new GridLayout(1, 4, 10, 10));
    	
    	lblNombre 			= new JLabel("Nombre: ");
    	lblClase 			= new JLabel("Clase: ");
    	lblHabitat 			= new JLabel("Hábitat: ");
    	lblColor 			= new JLabel("Color: ");
    	lblTip_alimentacion = new JLabel("Tipo de alimentación: ");
    	lblSexo				= new JLabel("Sexo: ");
    	lblEdad 			= new JLabel("Edad: ");
    	lblPeso 			= new JLabel("Peso");
    	lbl_anio 			= new JLabel("   Año(s)");
    	lbl_gr				= new JLabel("   gr.");
    	
    	lblEsp1 = new JLabel();
    	lblEsp2 = new JLabel();
    	lblEsp3 = new JLabel();
    	lblEsp4 = new JLabel();
    	lblEsp5 = new JLabel();
    	
    	txtNombre	= new JTextField(5);
    	txtClase    = new JTextField(5);
    	txtColor    = new JTextField(5);
    	txtPeso     = new JTextField(5);
    	
    	
    	rdcmdMacho 	= new JRadioButton("Macho");
    	rdcmdHembra = new JRadioButton("Hembra");
    	
    	lstEdad 			= new JComboBox(ArrayEdad);
    	lstHabitat 			= new JComboBox(ArrayHabitat);
    	lstTip_alimentacion = new JComboBox(ArrayAlimentacion);
    	
    	cmdComer      = new JButton("COMER");
    	cmdDesplazar  = new JButton("DESPLAZAR");
    	cmdDormir     = new JButton("DORMIR");
    	cmdEliminar   = new JButton("ELIMINAR");
    	cmdGuardar    = new JButton("GUARDAR");
    	cmdImprimir   = new JButton("IMPRIMIR");
    	cmdLimpiar    = new JButton("LIMPIAR");
    	cmdEditar	  = new JButton("EDITAR");
    	cmdReproducir = new JButton("REPRODUCIR");
    	cmdSalir      = new JButton("SALIR");
    	
    	cmdComer.addActionListener(this);
    	cmdDesplazar.addActionListener(this);
    	cmdDormir.addActionListener(this);
    	cmdEliminar.addActionListener(this);
    	cmdGuardar.addActionListener(this);
    	cmdImprimir.addActionListener(this);
    	cmdLimpiar.addActionListener(this);
    	cmdEditar.addActionListener(this);
    	cmdReproducir.addActionListener(this);
    	cmdSalir.addActionListener(this);
    	
    	cmdgrSexo = new ButtonGroup();
    	cmdgrSexo.add(rdcmdMacho);
    	cmdgrSexo.add(rdcmdHembra);
    	
    	
    	
    	pnlDos.add(lblNombre); 			 pnlDos.add(txtNombre);			     pnlDos.add(lblEsp1);                     
   		pnlDos.add(lblSexo);			 pnlDos.add(rdcmdMacho);		   	 pnlDos.add(rdcmdHembra);
    	pnlDos.add(lblClase); 			 pnlDos.add(txtClase);               pnlDos.add(lblEsp2);
    	pnlDos.add(lblHabitat); 		 pnlDos.add(lstHabitat);             pnlDos.add(lblEsp3);  
    	pnlDos.add(lblEdad); 			 pnlDos.add(lstEdad);				 pnlDos.add(lbl_anio);
    	pnlDos.add(lblTip_alimentacion); pnlDos.add(lstTip_alimentacion);    pnlDos.add(lblEsp4);
    	pnlDos.add(lblColor); 			 pnlDos.add(txtColor);               pnlDos.add(lblEsp5);
    	pnlDos.add(lblPeso); 			 pnlDos.add(txtPeso);                pnlDos.add(lbl_gr);
    	
    	pnlUno.add(lblImagen);
    	
    	pnlTres.add(cmdEditar);   pnlTres.add(cmdGuardar);    pnlTres.add(cmdImprimir); 
    	pnlTres.add(cmdLimpiar);  pnlTres.add(cmdEliminar);   pnlTres.add(cmdSalir);
    	
    	pnlTres2.add(cmdComer); pnlTres2.add(cmdDesplazar); pnlTres2.add(cmdReproducir); pnlTres2.add(cmdDormir);
    	
    	Contenedor.add(pnlUno, BorderLayout.CENTER);
    	Contenedor.add(pnlDos, BorderLayout.EAST);
    	Contenedor.add(pnlTres, BorderLayout.WEST);
    	Contenedor.add(pnlTres2, BorderLayout.SOUTH);
    		
    		
    	lstEdad.setSelectedIndex(-1);
    	lstHabitat.setSelectedIndex(-1);
    	lstTip_alimentacion.setSelectedIndex(-1);
    
    	cmdEditar.setEnabled(false);
    	//cmdGuardar.setEnabled(false);	
    	cmdEliminar.setEnabled(false);
    	cmdComer.setEnabled(false);
    	cmdDesplazar.setEnabled(false);
    	cmdReproducir.setEnabled(false);
    	cmdDormir.setEnabled(false);
    	
    	this.setLocation(300, 200);
    	
    	Pos   = 0;	
    	try
    	{
    		n     = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos arreglos desea crear?"));
    		Lista = new Clase_insectos[n];
    		
    		for( int Contador=0; Contador<Lista.length; Contador++)
    		{
    			Lista[Contador] = new Clase_insectos();
    		}
    	}
    	catch(NumberFormatException Excepcion)
    	{
    		JOptionPane.showMessageDialog(null, "Se esperaba un valor numérico");
    		System.exit(0);	
    	}
    	
    	setSize(750, 340);
    	setVisible(true);
    	setResizable(false);
    	
    } //FIN DEL CONSTRUCTOR
    
    
    
    public void actionPerformed(ActionEvent Evento)
    {
    	if(Evento.getSource() == cmdEditar)
    	{	Clase_insectos insec= new Clase_insectos();
    		String nombre=JOptionPane.showInputDialog("Escriba el nombre del insecto a buscar:");
    		for (int i = 0; i<Lista.length; i++)
    		{	if(Lista[i].getNombre().equalsIgnoreCase(nombre))
    			{	JOptionPane.showMessageDialog(null,"Encontrado en pos: "+ i);
    				buscar=i;
    				insec = Lista[buscar];
    				txtNombre.setText(insec.getNombre());
    				if( insec.getSexo().equalsIgnoreCase("Hembra")) rdcmdHembra.setSelected(true);
    				if( insec.getSexo().equalsIgnoreCase("Macho")) rdcmdMacho.setSelected(true);
    				
    				encontrado=true;
    			}
    		}
    		
    	}
    	
    	if(Evento.getSource() == cmdGuardar)
    	{	Clase_insectos insec = new Clase_insectos();
    		
    		insec.setNombre(txtNombre.getText());
    		if(rdcmdHembra.isSelected()) insec.setSexo("Hembra");
    		if(rdcmdMacho.isSelected()) insec.setSexo("Macho");
    		insec.setClase(txtClase.getText());
    		insec.setHabitat(String.valueOf(lstHabitat.getSelectedItem()));
    		insec.setEdad(Integer.parseInt(String.valueOf(lstEdad.getSelectedIndex())));
    		insec.setTip_alimentacion(String.valueOf(lstTip_alimentacion.getSelectedItem()));
    		insec.setTip_color(txtColor.getText());
    		insec.setPeso(Double.parseDouble(txtPeso.getText()));
  
  			if(encontrado==true) 
  			{	Lista[buscar]= insec;
  				encontrado=false;
  			}
  			else Lista[Pos]= insec;
  		
    			JOptionPane.showMessageDialog(null, "DATOS GUARDADOS: " + (Pos+1) + " \n\n" + Lista[Pos].toString());
   				Evento.setSource(cmdLimpiar);
   				cmdEditar.setEnabled(true);
   				cmdEliminar.setEnabled(true);
    			Pos++;
    	
    	
    	
    	
    	
    	
    		/*
    		try
    		{
    			Lista[Pos].setNombre(txtNombre.getText());
    			if(rdcmdHembra.isSelected()) Lista[Pos].setSexo("Hembra");
    			if(rdcmdMacho.isSelected()) Lista[Pos].setSexo("Macho");
    			Lista[Pos].setClase(txtClase.getText());
    			Lista[Pos].setHabitat(String.valueOf(lstHabitat.getSelectedItem()));
    			Lista[Pos].setEdad(Integer.parseInt(String.valueOf(lstEdad.getSelectedIndex())));
    			Lista[Pos].setTip_alimentacion(String.valueOf(lstTip_alimentacion.getSelectedItem()));
    			Lista[Pos].setTip_color(txtColor.getText());
    			Lista[Pos].setPeso(Double.parseDouble(txtPeso.getText()));
  
    			JOptionPane.showMessageDialog(null, "DATOS GUARDADOS: " + (Pos+1) + " \n\n" + Lista[Pos].toString());
   				Evento.setSource(cmdLimpiar);
   				cmdEditar.setEnabled(true);
   				cmdEliminar.setEnabled(true);
    			Pos++;	
    		}		
    		catch(IndexOutOfBoundsException Excepcion)
    		{
    			JOptionPane.showMessageDialog(null, "ESPACIO DE ALMACENAMIENTO LLENO");
    			Evento.setSource(cmdLimpiar);
    			cmdGuardar.setEnabled(false);
    			cmdImprimir.setEnabled(false);
    		}
    		catch(Exception Excepcion)
    		{
    			JOptionPane.showMessageDialog(null, Excepcion);	
    		} 
    		*/			
   		}	
    	
    	if(Evento.getSource() == cmdComer)
    	{
    		JOptionPane.showMessageDialog(null, "El(la) " + txtNombre.getText() + " está comiendo");	
    	}
    	
    	if(Evento.getSource() == cmdDormir)
    	{
    		JOptionPane.showMessageDialog(null, "El(la) " + txtNombre.getText() + " está durmiendo");
    	}
    	
    	if(Evento.getSource() == cmdDesplazar)
    	{
    		JOptionPane.showMessageDialog(null, "El(la) " + txtNombre.getText() + " está desplazándose");
    	}
    	
    		if(Evento.getSource() == cmdReproducir)
    	{
    		JOptionPane.showMessageDialog(null, "El(la) " + txtNombre.getText() + " está en proceso de reproducción");
    	}
    	
    	if(Evento.getSource() == cmdLimpiar)
    	{
    		txtNombre.setText("");
    		txtClase.setText("");
    		txtColor.setText("");
    		txtPeso.setText("");
    		cmdgrSexo.clearSelection();
    		lstEdad.setSelectedIndex(-1);
    		lstHabitat.setSelectedIndex(-1);
    		lstTip_alimentacion.setSelectedIndex(-1);
    		
    		//cmdGuardar.setEnabled(false);	
    		cmdComer.setEnabled(false);
    		cmdDesplazar.setEnabled(false);
    		cmdReproducir.setEnabled(false);
    		cmdDormir.setEnabled(false);	
    	}
    	
    	if(Evento.getSource() == cmdEliminar)
    	{
    		int Buscar;
    		boolean BAND;
    		
    		Buscar = -1;
    		BAND   = false;
    		
    		try
    		{
    			Buscar = Integer.parseInt(JOptionPane.showInputDialog("¿Qué arreglo desea eliminar?"));
    		}
    		catch(NumberFormatException Excepcion)
    		{
    			JOptionPane.showMessageDialog(null, "Se esperaba un valor numérico");
    			BAND = true;
    		}
    		
    		for(int Contador=0; Contador<Lista.length; Contador++)
    		{	
    			if(Contador == (Buscar-1))
    			{
    				if(Lista[Contador].getNombre() == "" && Lista[Contador].getSexo() == "" && Lista[Contador].getClase() == "" && Lista[Contador].getHabitat() == "" && Lista[Contador].getTip_alimentacion() == "" && Lista[Contador].getTip_color() == "" && Lista[Contador].getEdad() == 0 && Lista[Contador].getPeso() == 0.0)
    				{
    					JOptionPane.showMessageDialog(null, "ESTE ARREGLO YA FUE ELIMINADO");
    					BAND = true;
    					break;
    				}
    				else
    				{
    					JOptionPane.showMessageDialog(null, "El arreglo:\n\n " + Lista[Contador].toString() + "\n\nSE HA ELIMINADO");
    					Lista[Contador].setNombre("");
    					Lista[Contador].setSexo("");
    					Lista[Contador].setClase("");
    					Lista[Contador].setHabitat("");
    					Lista[Contador].setEdad(0);
    					Lista[Contador].setTip_alimentacion("");
    					Lista[Contador].setTip_color("");
    					Lista[Contador].setPeso(0.0);
    				
    					BAND  = true;
    					break;	
    				}	
    			}
    		}
    		
    		if(BAND == false)
    		{
    			JOptionPane.showMessageDialog(null, "NO EXISTE UN ARREGLO CON ESE NOMBRE");
    		}
    	}
    	
    	if(Evento.getSource() == cmdImprimir)
    	{
    		for (int i = 0; i<Lista.length; i++)
    		{	
    			if(Lista[i].getNombre().equalsIgnoreCase(""))
    			{
    			}else JOptionPane.showMessageDialog(null,Lista[i].toString());
    		}
    	}
    	
    	if(Evento.getSource() == cmdSalir)
    	{
    		JOptionPane.showMessageDialog(null, "Gracias por utilizar este software.\n\nElaborado por:\n> Mario A. Ramirez A.\n> Martín E. Herrera Z.");
    		System.exit(0);
    	}
    	
    }
    
    public static void main (String[] args) 
    {
    	frmInsectos Aplic_1 = new frmInsectos();
    	Aplic_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
  
} //FIN DE LA CLASE