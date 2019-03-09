package mx.tecnm.valladolid.ricalde;
public class Punto 
{	//ATRIBUTOS O MIEMBROS DE CLASE
	protected int x,y;

    public Punto() 
    {	x=0;
    	y=0;
    }
    
    public Punto(int x, int y)
    {	this.x=x;
    	this.y=y;
    }
    
    //METODOS SET PARA ESTABLECER VALORES A LOS ATRIBUTOS
    public void setX(int valor){	x=valor;    }
    public void setY(int valor){	y=valor;    }
    //METODOS GET PARA OBTENER VALORES DE LOS ATRIBUTOS
    public int getX() {	return x;    }
    public int getY() {	return y;    }
    
    public String toString()
    {	return "["+getX()+","+getY()+"]";
    }
    
    //METODOS FUNCIONALES
    public double distanciaPunto(Punto p2)
    {	double distancia;
    	distancia= Math.sqrt(Math.pow(x-p2.getX(),2) +Math.pow(y-p2.getY(),2));
    	return distancia;
    }
}