public class Libro
{
    private String aut;
    private String tit;
    private int pag;
    private String nRef;
    private int prestamos;
    
    Libro(String autor, String titulo, int pagina)
    {
        aut = autor;
        tit = titulo;
        pag = pagina;
        nRef = "";
        prestamos = 0;
    }
    
    public String dimeAutor()
    {
        return(aut);
    }
    
    public String dimeTitulo()
    {
        return(tit);
    }
    
    public int dimePaginas()
    {
        return(pag);
    }
    
    public String dimeDetalles()
    {
        String cadRes = "";
        
        cadRes += "Titulo: ";
        cadRes += tit;
        cadRes += ", ";
        cadRes += "Autor: ";
        cadRes += aut;
        cadRes += ", ";
        cadRes += "Paginas: ";
        cadRes += pag;
        
        if(nRef.length() != 0)
        {
            cadRes += ", ";
            cadRes += "Numero de Referencia: ";
            cadRes += nRef;
        }
        else
        {
            cadRes += ", ";
            cadRes += "Numero De Referencia: ";
            cadRes += "ZZZ";
        }
        
        cadRes += ", ";
        cadRes += "Prestamos: ";
        cadRes += prestamos; 
        
        return cadRes;
    }
    
    public void cambiaNumRef(String numeroReferencia)
    {
        if(numeroReferencia.length() <= 3)
        {
            nRef = numeroReferencia;
        }
        else
        {
            nRef = nRef;
        }
    }
    
    public String dimeNumRef()
    {
        if(nRef.length() != 0)
        {
            return (nRef);
        }
        else
        {
            return ("ZZZ");
        }
    }
    
    public void prestar()
    {
        prestamos ++;
    }
    
    public int dimePrestamos()
    {
        return prestamos;
    }
}
