package AULA5.INTERFACE.PADRAO;

public class SmartTV implements VideoPlayer, MusicPlayer {
    @Override
    public void playMusica() {
        System.out.println("Tocar som");
    }

    @Override
    public void pauseMusica() {
        System.out.println("Pausa a musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("Parando a musica");
    }

    @Override
    public void pularMusica() {
        System.out.println("Pula  musica");

    }

    @Override
    public void voltarMusica() {
        System.out.println("Voltando música");
    }

    @Override
    public void playVideo() {
        System.out.println("Play no vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pause no vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("Parando vídeo");
    }

    @Override
    public void pularVideo() {
        System.out.println("pulando o vídeo");
    }

    @Override
    public void voltarVideo() {
        System.out.println("Voltando o vídeo");
    }
}
