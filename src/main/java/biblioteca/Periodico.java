package biblioteca;

public class Periodico extends Recurso {
    private String editorial;
    private int ano;

    public Periodico(Integer id, String nombre, String editorial, int ano) {
        super(id, nombre);
        this.editorial = editorial;
        this.ano = ano;
    }

    public String getEditorial() { return editorial; }
    public int getAno() { return ano; }

    @Override
    public String toString() {
        return "Periodico [id=" + getId() +
                ", nombre=" + getNombre() +
                ", editorial=" + editorial +
                ", año=" + ano +
                ", fechaRegistro=" + getFechaRegistro() + "]";
    }
}
