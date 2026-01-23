package AULA5.INTERFACE.PADRAO;

public class Main {
    public static void main(String[] args){

        MusicPlayer musicPlayer = new MusicBox();
        musicPlayer.playMusica();
        musicPlayer.stopMusic();

        SmartTV smartTV = new SmartTV();
        smartTV.playVideo();
        smartTV.pauseVideo();
        smartTV.playMusica();
        smartTV.stopMusic();
    }

    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusica(MusicPlayer musicPlayer){
        musicPlayer.playMusica();
    }

}
