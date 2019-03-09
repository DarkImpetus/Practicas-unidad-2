package	mx.tecnm.valladolid;

public class VTerrestre extends Vehiculo
{	//ATRIBUTOS ESPECIFICOS DE VEHICULO TERRESTRES
	String cilindros;
	int ejes;

    public VTerrestre() 
    {	//INICIALIZAMOS
    	super();//LLAMAMOS AL CONSTRUCTOR DE LA SUPERCLASE
    	//PARA INICIALIZAR LOS ELEMENTOS HEREDADOS
    	
    	this.ejes=4;
    	this.cilindros="1.6 cil";
    }
    
    public void setEjes(int valor) {	this.ejes=valor;   }
    public void setCilindros(String valor) {	this.cilindros=valor;   }
    public int getEjes() {	return this.ejes;  }
    public String getCilindros() {	return this.cilindros;   }
    
    public String toString()
    { return super.toString() + "\nEjes:" + getEjes() +
    	 	"\nCilindros" + getCilindros();
    }
}//fin de lla clase