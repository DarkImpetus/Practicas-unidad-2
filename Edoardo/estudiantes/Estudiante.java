package mx.tecnm.valladolid.ricalde.entidades;

public class Estudiante extends Persona
{	//ATRIBUTOS O MIEMBROS DE CLASE
	String matricula, carrera;
	int semestre;
	 
    public Estudiante() 
    {	super();//llamada al constructor heredado de persona
    	matricula="";
    	carrera="";
    	semestre=0;
    }
    
    public Estudiante(String nom, int ed, String ma, String ca, int sem )
    {	super(nom,ed);
    	matricula=ma;
    	carrera=ca;
    	semestre=sem;
    }
    
    //***************METODOS SET
    public void setMatricula(String ma) {	matricula = ma;    }
    public void setCarrera(String ca) {	carrera= ca;    }
    public void setSemestre(int sem) {	semestre=sem;    }
    
    //***************METODOS GET
    public String getMatricula() {	return matricula; }
    public String getCarrera() {	return carrera;    }
    public int getSemestre() {	return semestre;    }
    
    //*************** IMPRIMIR O toString()
    public String imprimir()
    {	return super.imprimir() + "\n" +
    			"MATRICULA: " + getMatricula() + "\n" +
    			"CARRERA: " +	getCarrera() + "\n" +
    			"SEMESTRE: " + getSemestre();
    }
}//FIN DE LA CLASE ESTUDIANTE