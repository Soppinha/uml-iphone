public class Musica {
    private final String nomeMusica;
    private final String artista;
    private final Integer anoLancamento;
    private Boolean isFavorito;

    public Musica(String nomeMusica, String artista, Integer anoLancamento, Boolean isFavorito) {
        this.nomeMusica = nomeMusica;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.isFavorito = isFavorito;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public String getArtista() {
        return artista;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public Boolean getFavorito() {
        return isFavorito;
    }

    public void favoritar() {
        isFavorito = !this.isFavorito;
    }
}
