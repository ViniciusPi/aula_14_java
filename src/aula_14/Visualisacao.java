package aula_14;

public class Visualisacao {
    private Video video;
    private Inscrito espectador;

    public Visualisacao(Video video, Inscrito espectador) {
        this.video = video;
        this.espectador = espectador;
        this.espectador.viuMaisUm(this.video);
    }

    public void avaliar() {
        video.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        video.setAvaliacao(nota);
    }

    public void avaliar(float porcentagem) {
        int tot = 0;

        if (porcentagem <= 20f) {
            tot = 2;
        } else if (porcentagem <= 50f) {
            tot = 5;
        } else if (porcentagem <= 90f) {
            tot = 8;
        } else {
            tot = 10;
        }

        video.setAvaliacao(tot);

    }

    @Override
    public String toString() {
        return "Visualisacao{" +
                "video=" + video.getTitulo() +
                ", espectador=" + espectador.getNome() +
                '}';
    }
}
