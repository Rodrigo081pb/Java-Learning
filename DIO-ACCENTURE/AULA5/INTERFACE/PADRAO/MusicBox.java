package AULA5.INTERFACE.PADRAO;

public class MusicBox implements MusicPlayer {

    // Classes Anônimas
    @Override
    public void playMusica() {
        System.out.println("Solta o som desse professor filho da puta");
    }

    @Override
    public void pauseMusica() {
        System.out.println("Pausa a musica desse professor filho da puta");
    }

    @Override
    public void stopMusic() {
        System.out.println("Para remix som");
    }

    @Override
    public void pularMusica() {
        System.out.println("Pula o som dj xereca");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Volta o som DJ");
    }


}
