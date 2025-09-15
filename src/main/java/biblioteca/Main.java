package biblioteca;

public class Main {
    public static void main(String[] args) {
        ServicioBiblioteca servicio = new ServicioBiblioteca();

        // agregamos los libros
        servicio.agregarLibro(new Libro(1,  "Satanás", "Mario Mendoza", 2002, "ISBN-001"));
        servicio.agregarLibro(new Libro(2,  "En las montañas de la locura", "H.P. Lovecraft", 1936, "ISBN-002"));
        servicio.agregarLibro(new Libro(3,  "It", "Stephen King", 1986, "ISBN-003"));

        servicio.agregarPeriodico(new Periodico(4, "El Tiempo", "El Tiempo Editorial", 2024));
        servicio.agregarPeriodico(new Periodico(5, "El Espectador", "El Espectador Editorial", 2023));
        servicio.agregarPeriodico(new Periodico(6, "Semana", "Semana Editorial", 2022));

        servicio.agregarComputador(new Computador(7, "PC Biblioteca 1", "Dell", "Optiplex", TipoComputador.ESCRITORIO));
        servicio.agregarComputador(new Computador(8, "Laptop Biblioteca 2", "HP", "Pavilion", TipoComputador.PORTATIL));
        servicio.agregarComputador(new Computador(9, "Servidor Principal", "IBM", "x3550", TipoComputador.SERVIDOR));

        // alistar todos los libros
        System.out.println("=== LIBROS ===");
        for (Libro l : servicio.listarLibros()) {
            System.out.println(l);
        }

        System.out.println("\n=== PERIODICOS ===");
        for (Periodico p : servicio.listarPeriodicos()) {
            System.out.println(p);
        }

        System.out.println("\n=== COMPUTADORES ===");
        for (Computador c : servicio.listarComputadores()) {
            System.out.println(c);
        }

        // aqui buscamos el libro sea por nombre o id
        // 
        System.out.println("\n=== OBTENER LIBRO CON ID 3 ===");
        Libro libro = servicio.obtenerLibro(3);
        if (libro != null) {
            System.out.println("Encontrado: " + libro);
        }

       // se elimina el id 6 
        System.out.println("\n=== ELIMINAR PERIODICO CON ID 6 ===");
        boolean eliminado = servicio.eliminarPeriodico(6);
        System.out.println("¿Eliminado? " + eliminado);

      // profesorn se imprime el listado final
        System.out.println("\n=== LISTADO FINAL ===");
        for (Libro l : servicio.listarLibros()) {
            System.out.println(l);
        }
        for (Periodico p : servicio.listarPeriodicos()) {
            System.out.println(p);
        }
        for (Computador c : servicio.listarComputadores()) {
            System.out.println(c);
        }
    }
}
