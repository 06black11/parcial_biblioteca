package biblioteca;


import java.time.LocalDateTime;

public abstract class Recurso {
    private Integer id;
    private String nombre;
    private LocalDateTime fechaRegistro;

    public Recurso(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.fechaRegistro = LocalDateTime.now();
    }

    public Integer getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public LocalDateTime getFechaRegistro() { return fechaRegistro; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [id=" + id +
                ", nombre=" + nombre +
                ", fechaRegistro=" + fechaRegistro + "]";
    }
}
