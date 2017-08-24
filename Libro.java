public class Libro
{
    private String aut;
    private String tit;
    private int pag;
    
    Libro(String autor, String titulo, int pagina)
    {
        aut = autor;
        tit = titulo;
        pag = pagina;
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
        cadRes += ",";
        cadRes += "Autor: ";
        cadRes += aut;
        cadRes += ",";
        cadRes += "Paginas: ";
        cadRes += pag;
        
        return cadRes;
    }
}
