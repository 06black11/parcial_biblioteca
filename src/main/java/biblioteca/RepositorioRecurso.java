package biblioteca;

import java.util.List;

public interface RepositorioRecurso<T extends Recurso> {
    T guardar(T recurso);
    T actualizar(Integer id, T recurso);
    boolean eliminar(Integer id);
    T obtener(Integer id);
    List<T> listarTodos();
    List<T> buscarPorCriterio(String criterio);
}
