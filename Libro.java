/**
 * @author Arturo De La Torre Lara
 * @version 30 de Agosto del 2017
 */
public class Libro
{
    private String aut;
    private String tit;
    private int pag;
    private String nRef;
    private int prestamos;
    
    public Libro(String autor, String titulo, int pagina)
    {
        aut = autor;
        tit = titulo;
        pag = pagina;
        nRef = "";
        prestamos = 0;
    }
    /**
     * @return Retorna el nombre del autor
     */
    public String dimeAutor()
    {
        return(aut);
    }
    /**
     * @return Retorna el nombre del libro
     */
    public String dimeTitulo()
    {
        return(tit);
    }
    /**
     * @return Retorna el numero de paginas que tiene el libro
     */
    public int dimePaginas()
    {
        return(pag);
    }
    /**
     * Concatena el autor, titulo, numero de paginas numero de referencia, numero de prestamos y los regresa en una sola cadena
     * @return Regresa una cadena con los datos del libro
     */
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
    /**
     * Cambia el numero de referencia que esta por default ("ZZZ") siempre y cuando sea menor de 3 letras
     * @param numeroReferencia la cadena numeor de referencia cambia la cadena que estaba "ZZZ"
     */
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
    /**
     * @return Regresa solo el numero de referencia
     */
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
    /**
     * Si se hace un prestamo de el libro aumenta el contador de prestamo
     */
    public void prestar()
    {
        prestamos ++;
    }
    /**
     * @return Regresa el numero de prestamos realizados del libro
     */
    public int dimePrestamos()
    {
        return prestamos;
    }
}
