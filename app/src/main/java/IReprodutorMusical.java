import java.util.ArrayList;
import java.util.List;

public interface IReprodutorMusical {
    List<Musica> m = new ArrayList<>();

    void tocar();
    void pausar();
    void selecionarMusica(List<Musica> m);
}
