public class Visualizacao {
    //#region variables
    private Gafanhoto espectador;
    private Video filme;

    //#region constructor
    public Visualizacao(Gafanhoto espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    //getters & setters
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Espectador: " + espectador + "\nFilme: " + filme;
    }
}
