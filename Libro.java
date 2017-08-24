public class Libro
{
    private String aut;
    private String tit;
    
    Libro(String autor, String titulo)
    {
        aut = autor;
        tit = titulo;
    }
    
    public String dimeAutor()
    {
        return(aut);
    }
    
    public String dimeTitulo()
    {return(tit);
    }
}
