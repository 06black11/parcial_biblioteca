package biblioteca;

public class Libro extends Recurso {
    private String autor;
    private int ano;
    private String isbn;

    public Libro(Integer id, String nombre,  String autor, int ano, String isbn) {
        super(id, nombre);
     
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
    }

    
    public String getAutor() { return autor; }
    public int getAno() { return ano; }
    public String getIsbn() { return isbn; }

    @Override
    public String toString() {
        return "Libro [id=" + getId() +
                ", nombre=" + getNombre() +
                ", autor=" + autor +
                ", año=" + ano +
                ", isbn=" + isbn +
                ", fechaRegistro=" + getFechaRegistro() + "]";
    }
}
