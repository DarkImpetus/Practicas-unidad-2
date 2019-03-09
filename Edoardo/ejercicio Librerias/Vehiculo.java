package mx.tecnm.valladolid;
/*MODIFICADORES DE ACCESO
public String Marca; //acceso desde cualquier clase
private String Marca;//acceso unicamente dentro de la clase donde se declara
protected String Marca;//acceso en jerarquia de herencia o paquete
*/

public class Vehiculo 
{	//ATRIBUTOS POR DEFAULT PUBLICOS
	protected   String Marca, Modelo, Anio;
	protected   double Precio;

    public Vehiculo() 
    {	this.Marca="";
    	this.Modelo="";
    	this.Anio="";
    	this.Precio=0.0;
    }
    
    public Vehiculo(String Marca, String Modelo, String anio,double precio)
    {	this.Marca=Marca;
    	this.Modelo=Modelo;
    	this.Anio=anio;
    	this.Precio=precio;
    }
    
    public void setMarca(String valor) {	this.Marca=valor;  }
    public void setModelo(String valor) {	this.Modelo=valor;  }
    public void setAnio(String valor) {	this.Anio=valor;  }
    public void setPrecio(double valor) {	this.Precio=valor;  }
    
    public String getMarca() {	return this.Marca;   }
    public String getModelo() {	return this.Modelo;   }
    public String getAnio() {	return this.Anio;   }
    public double getPrecio() {	return this.Precio;  }

	public String toString()
	{	return "Marca:" + getMarca() + "\nModelo:" + getModelo() +
		"\nAño:" + getAnio() + "\nPrecio:" + getPrecio();
		
	}    
}//FIN DE LA CLASE