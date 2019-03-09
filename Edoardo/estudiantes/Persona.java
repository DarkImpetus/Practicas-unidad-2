package mx.tecnm.valladolid.ricalde.entidades;
public class Persona 
{	//ATRIBUTOS O MIEMBROS DE CLASE
	protected  String nombre;
	protected  int edad;

    public Persona() 
    {	nombre="";
    	edad=0;
    }
    
    public Persona(String n, int e)
    {	nombre = n;
    	edad=e;
    }
    
    public void setNombre(String n)    {	nombre = n;    }
    
    public void setEdad(int e)    {	edad = e;    }
    
    public String getNombre()    {	return nombre;    }
    
    public int getEdad()    {	return edad;    }
    
    
    public String imprimir()
    {	return "NOMBRE: " + getNombre() + "\n" + 
    			"EDAD: " + getEdad();
    }
}//fin de la clase persona


