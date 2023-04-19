public abstract class Pessoa {
    protected String nome; 
    protected int idade;
    protected String sexo;
    protected float experiencia;

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome: " + nome + ", idade: " + idade + ", sexo: " + sexo + ", experiência: " + experiencia + "}";
    }
}

