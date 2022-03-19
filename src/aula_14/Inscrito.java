package aula_14;

public class Inscrito extends Pesssoa {
    private String login;
    private int videosAssistidos;


    public Inscrito(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
    }

    public void viuMaisUm(Video video) {
        this.videosAssistidos++;
        this.ganharXP();
        video.play();



    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getVideosAssistidos() {
        return videosAssistidos;
    }


    public void setVideosAssistidos(int videosAssistidos) {
        this.videosAssistidos = videosAssistidos;

    }

    @Override
    public String toString() {
        return "Inscrito{" +
                " videosAssistidos=" + videosAssistidos + super.toString();

    }
}
