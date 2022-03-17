package aula_14;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int numeroDeLikes;
    private boolean reproduzindo;


    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.numeroDeLikes = 0;
        this.reproduzindo = false;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getNumeroDeLikes() {
        return numeroDeLikes;
    }

    public void setNumeroDeLikes(int numeroDeLikes) {
        this.numeroDeLikes = numeroDeLikes;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        setReproduzindo(true);
        this.views++;
    }

    @Override
    public void pause() {
        setReproduzindo(false);
        this.avaliacao--;
    }

    @Override
    public void like() {
        this.numeroDeLikes++;
        if (this.avaliacao<5){
            this.avaliacao++;
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", numeroDeLikes=" + numeroDeLikes +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
