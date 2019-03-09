package edu.itsva.programacion.paquetes.ejemplos;

public class Cliente extends Persona
{	//ATRIBUTOS O MIEMBROS DE CLASE
	String rfc, direccion;

    public Cliente() 
    {	super();
    	rfc="";
    	direccion="";
    }
    
    public Cliente(String n, int e, String r, String d)
    {	super(n,e);
    	//nombre = n; edad = e;
    	//OTRA OPCION: setNombre(n); setEdad(e);
    	rfc= r;
    	direccion = d;
    }
    //**************************************************************************+
    public void setRFC(String r)    {	rfc= r;    }
    public void setDireccion(String d)  {	direccion = d;    }
    //**************************************************************************+
    public String getRFC() {	return rfc;    }
    public String getDireccion() {	return direccion;    }
    //**************************************************************************+
    public String imprimir()
    {	return super.imprimir() + "\n" + "RFC: " + rfc + "\n" + "DIRECCION: " + direccion;
    }
    
    /*
    public String imprimir()
    {	return "NOMBRE: " + getNombre() + "\n" + "RFC: " + rfc + "\n" + "DIRECCION: " + direccion;
    }
     */
}