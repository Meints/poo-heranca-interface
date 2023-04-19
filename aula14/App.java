public class App {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("COMO É A VIDA DE UM JOGADOR DE SÉRIE A?");
        v[1] = new Video("NARUTO vs PAIN「AMV」- Impossible");
        v[2] = new Video("Rock lee vs Gaara - Linkin park");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Fred", 19, "M", "fredin");
        g[1] = new Gafanhoto("Raissa", 19, "f", "ray");

        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0], v[2]);
        vis[1].avaliar(87.0f);

        System.out.println("Vídeo 1");
        System.out.println(vis[0].toString());
        System.out.println("=======================================================");
        System.out.println("Vídeo 2");
        System.out.println(vis[1].toString());
    }
}