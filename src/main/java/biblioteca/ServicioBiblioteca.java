package biblioteca;

import java.util.List;

public class ServicioBiblioteca {
    private RepositorioLibro repositorioLibro = new RepositorioLibro();
    private RepositorioPeriodico repositorioPeriodico = new RepositorioPeriodico();
    private RepositorioComputador repositorioComputador = new RepositorioComputador();

    public ServicioBiblioteca() {}

    public Libro agregarLibro(Libro libro) { return repositorioLibro.guardar(libro); }
    public Periodico agregarPeriodico(Periodico periodico) { return repositorioPeriodico.guardar(periodico); }
    public Computador agregarComputador(Computador computador) { return repositorioComputador.guardar(computador); }

    public boolean eliminarLibro(Integer id) { return repositorioLibro.eliminar(id); }
    public boolean eliminarPeriodico(Integer id) { return repositorioPeriodico.eliminar(id); }
    public boolean eliminarComputador(Integer id) { return repositorioComputador.eliminar(id); }

    public Libro obtenerLibro(Integer id) { return repositorioLibro.obtener(id); }
    public Periodico obtenerPeriodico(Integer id) { return repositorioPeriodico.obtener(id); }
    public Computador obtenerComputador(Integer id) { return repositorioComputador.obtener(id); }

    public List<Libro> listarLibros() { return repositorioLibro.listarTodos(); }
    public List<Periodico> listarPeriodicos() { return repositorioPeriodico.listarTodos(); }
    public List<Computador> listarComputadores() { return repositorioComputador.listarTodos(); }
}
