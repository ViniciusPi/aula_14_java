package aula_14;

public abstract class Pesssoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    public Pesssoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    protected void ganharXP() {
        this.experiencia = this.experiencia + 100.0f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return " nome='" + nome + '\'' +
                        ", idade=" + idade +
                        ", sexo='" + sexo + '\'' +
                        ", experiencia=" + experiencia +
                        '}';
    }
}
