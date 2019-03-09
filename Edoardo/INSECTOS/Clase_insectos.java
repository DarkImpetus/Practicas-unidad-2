package mx.tecnm.valladolid.ricalde;
import javax.swing.*;

public class Clase_insectos
{
	private String Nombre, Clase, Tip_alimentacion, Tip_color, Habitat, Sexo;
	private int Edad;
	private double Peso;
	
	public Clase_insectos()
	{
		this.Nombre = "";
		this.Clase = "";
		this.Tip_alimentacion = "";
		this.Tip_color = "";
		this.Habitat = "";
		this.Sexo = "";
		this.Edad = 0;
		this.Peso = 0.0;
	}
	
    public Clase_insectos(String nombre, String clase, String tip_alimentacion, String tip_color, String habitat, String sexo, int edad, int peso) 
    {
    	this.Nombre = nombre;
    	this.Clase = clase;
    	this.Tip_alimentacion = tip_alimentacion;
    	this.Tip_color = tip_color;
    	this.Habitat = habitat;
    	this.Sexo = sexo;
    	this.Edad = edad;
    	this.Peso = peso;
    }
    
     public Clase_insectos(String nombre, String clase, String tip_color, String habitat, String sexo) 
    {
    	this.Nombre = nombre;
    	this.Clase = clase;
    	this.Tip_color = tip_color;
    	this.Habitat = habitat;
    	this.Sexo = sexo;
    }
    
    public void setNombre(String Valor){ Nombre = Valor;}
    public void setClase(String Valor){ Clase = Valor;}
    public void setTip_alimentacion(String Valor){ Tip_alimentacion = Valor;}
    public void setTip_color(String Valor){ Tip_color = Valor;}
    public void setHabitat(String Valor){ Habitat = Valor;}
    public void setSexo(String Valor){ Sexo = Valor;}
    public void setEdad(int Valor){ Edad = Valor;}
    public void setPeso(double Valor){Peso = Valor;}
    
    
    public String getNombre() {return this.Nombre;}
    public String getClase() {return this.Clase;}
    public String getTip_alimentacion() {return this.Tip_alimentacion;}
    public String getTip_color() {return this.Tip_color;}
    public String getHabitat() {return this.Habitat;}
    public 	String getSexo() {return this.Sexo;}
    public int getEdad() {return this.Edad;}
    public double getPeso() {return this.Peso;}
    
    public void Comer(String dato)
    {
    	if( dato.equalsIgnoreCase("Si") )
    	{
    		JOptionPane.showMessageDialog(null, "Est� comiendo");
    	}
    	else if (dato.equalsIgnoreCase("No"))
    	{
    		JOptionPane.showMessageDialog(null, "No est� comiendo");
    	}		
    }
    
    public void Desplazar(String dato)
    {
    	if(dato.equalsIgnoreCase("Si"))
    	{
    		JOptionPane.showMessageDialog(null, "Est� movi�ndose");
    	}
    	else if(dato.equalsIgnoreCase("No"))
    	{
    		JOptionPane.showMessageDialog(null, "No est� movi�ndose");
    	}	
    }
    
    public void Reproducir(String dato)
    {
    	if(dato.equalsIgnoreCase("Si"))
    	{
    		JOptionPane.showMessageDialog(null, "En proceso de reproducci�n");
    	}
    	else if( dato.equalsIgnoreCase("No"))
    	{
    		JOptionPane.showMessageDialog(null, "No hay reproducci�n");
    	}
    }
    
    public void Dormir(String dato)
    {
    	if(dato.equalsIgnoreCase("Si"))
    	{
    		JOptionPane.showMessageDialog(null, "Est� dormiendo");
    	}
    	else if(dato.equalsIgnoreCase("No"))
    	{
    		JOptionPane.showMessageDialog(null, "No est� durmiendo");
    	}
    }
    
    public String toString()
    {
    	String Datos;
    	
    	Datos = "Nombre: " + getNombre() + 
    			"\nClase: " + getClase() +
    			"\nH�bitat: " + getHabitat() +
    			"\nColor : " + getTip_color() +
    			"\nTipo de alimentaci�n: " + getTip_alimentacion() +
    			"\nEdad: " + getEdad() + " a�os" +
    			"\nPeso: " + getPeso() + " gr." +
    			"\nSexo: " + getSexo();
    			
    	return Datos;
    }
    
    /*
    public static void main (String[] args) 
    {
    	String Dato1, Dato2, Dato3, Dato4;
    	
    	Clase_insectos Aplicacion = new Clase_insectos();
    		 
    	Aplicacion.setNombre(JOptionPane.showInputDialog("Nombre: "));
    	Aplicacion.setClase(JOptionPane.showInputDialog("Clase: "));
    	Aplicacion.setHabitat(JOptionPane.showInputDialog("Habitat: "));
    	Aplicacion.setTip_color(JOptionPane.showInputDialog("Color: "));
    	Aplicacion.setTip_alimentacion(JOptionPane.showInputDialog("Tipo de alimentaci�n: "));
    	Aplicacion.setSexo(JOptionPane.showInputDialog("Sexo: "));
    	Aplicacion.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad: ")));
    	Aplicacion.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso: ")));
    		
    	
    	JOptionPane.showMessageDialog(null, Aplicacion.toString());
    	
    	Dato1 = JOptionPane.showInputDialog("�Est� Comiendo el(la) " + Aplicacion.getNombre() + "?");
    	Dato2 = JOptionPane.showInputDialog("�Est� desplaz�ndose el(la) " + Aplicacion.getNombre() + "?");
    	Dato3 = JOptionPane.showInputDialog("�Est� en proceso de reproducci�n el(la) " + Aplicacion.getNombre() + "?");
    	Dato4 = JOptionPane.showInputDialog("�Est� durmiendo el(la) " + Aplicacion.getNombre() + "?");
    	
    	Aplicacion.Comer(Dato1);
    	Aplicacion.Desplazar(Dato2);
    	Aplicacion.Reproducir(Dato3);
    	Aplicacion.Dormir(Dato4);
	}
    */
} //FIN DE LA CLASE