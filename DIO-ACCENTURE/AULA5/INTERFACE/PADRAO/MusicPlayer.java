package AULA5.INTERFACE.PADRAO;

public interface MusicPlayer  {

    // Interface não permite implementações de métodos como:

    /*
    *  void playMusica(){
    *
    *   System.out.printl("soltando a música");
    *
    *   }
    * */

//    String music = "O tempo dele não havia paredão";

    // Apenas permite métodos abstratos

    void playMusica();

    void pauseMusica();

    void stopMusic();

    void pularMusica();

    void voltarMusica();

}
