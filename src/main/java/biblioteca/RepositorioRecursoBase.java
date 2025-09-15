package biblioteca;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioRecursoBase<T extends Recurso> implements RepositorioRecurso<T> {
    protected List<T> listaRecurso = new ArrayList<>();

    @Override
    public T guardar(T recurso) {
        listaRecurso.add(recurso);
        return recurso;
    }

    @Override
    public T actualizar(Integer id, T recurso) {
        for (int i = 0; i < listaRecurso.size(); i++) {
            if (listaRecurso.get(i).getId().equals(id)) {
                listaRecurso.set(i, recurso);
                return recurso;
            }
        }
        return null;
    }

    @Override
    public boolean eliminar(Integer id) {
        for (int i = 0; i < listaRecurso.size(); i++) {
            if (listaRecurso.get(i).getId().equals(id)) {
                listaRecurso.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public T obtener(Integer id) {
        for (T r : listaRecurso) {
            if (r.getId().equals(id)) {
                return r;
            }
        }
        return null;
    }

    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(listaRecurso);
    }

    @Override
    public abstract List<T> buscarPorCriterio(String criterio);
}
