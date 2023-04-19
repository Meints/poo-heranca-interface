public class Video implements AcoesVideos{
    //#region variables
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //#region constructor
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }
    
    @Override
    public String toString() {
        return "Video{" + "título: " + titulo + ", avaliação: " + avaliacao + ", views: " + views + ", curtidas: " + curtidas + ", reproduzindo: " + reproduzindo + "}";
    }

    //getters & setters
    public String getTitulo() {
        return titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public int getViews() {
        return views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean isReproduzindo(){
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
