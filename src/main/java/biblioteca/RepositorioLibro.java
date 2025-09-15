package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class RepositorioLibro extends RepositorioRecursoBase<Libro> {

    public RepositorioLibro() {
        super();
    }

    @Override
    public List<Libro> buscarPorCriterio(String criterio) {
        List<Libro> resultados = new ArrayList<>();
        String lower = criterio.toLowerCase();

        for (Libro l : listaRecurso) {
            if ((l.getAutor() != null && l.getAutor().toLowerCase().contains(lower)) ||
                (l.getNombre() != null && l.getNombre().toLowerCase().contains(lower))) {
                resultados.add(l);
            }
        }
        return resultados;
    }
}
