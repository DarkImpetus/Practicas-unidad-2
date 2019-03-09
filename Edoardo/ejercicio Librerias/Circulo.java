package mx.tecnm.valladolid.ricalde;
public class Circulo extends Punto
{	//ATRIBUTOS FALTANTES
	double radio;

    public Circulo() 
    {	super();
    	radio=0.0;
    }
    
    public Circulo(int x, int y, double radio)
    {	this.x=x;
    	this.y=y;
    	this.radio=radio;
    }
    
    public void setRadio(double valor) { this.radio=valor; }
    public double getRadio() {	return this.radio; }
  	
	public String toString()
	{	return super.toString() + "\nRadio=" + getRadio();
	}
	//METODOS FUNCIONALES PROPIOS 
	public double area()
	{	return Math.PI*Math.pow(getRadio(),2);
	}
	public double diametro() {	return getRadio()*2; }
}//fin de la clase