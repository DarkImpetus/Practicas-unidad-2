package mx.tecnm.valladolid.ricalde.entidades;

public class BecadoExtranjero extends Estudiante
{	//ATRIBUTOS O MIEMBROS DE CLASE privados por que ya no hay mas subclases en la jerarquia
	private String pais, documentacion;

    public BecadoExtranjero() 
    {	super();
    	pais="";
    	documentacion="";
    }
    
    public BecadoExtranjero(String no, int ed,String ma, String ca, int se, String pa, String doc)
    {	nombre = no;
    	edad = ed;
    	matricula= ma;
    	carrera = ca;
    	semestre = se;
    	pais = pa;
    	documentacion = doc;
    	//OTRA OPCION
    	//super(no,ed,ma,ca,se);
    }
    
    //*************** SET
    public void setPais(String pa){	pais=pa;    }
    public void setDocumentacion(String doc) {	documentacion=doc;    }
    //*************** GET
    public String getPais() {	return pais;    }
    public String getDocumentacion() {	return documentacion;    }
    
    //*************** IMPRIMIR O TOSTRING
    public String imprimir()
    {	return super.imprimir() + "\n" +
    			"PAIS: " + getPais()  + "\n" +
    			"DOCUMENTACION: " + getDocumentacion();
    }
    
}