import br.com.audio.models.Musica;
import br.com.audio.models.FichaTecnica;
import br.com.audio.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica newMusic = new Musica();
        newMusic.setArtista("Deep Purple");
        newMusic.setAlbum("Machine Head");
        newMusic.setAno(1972);
        newMusic.setGravadora("Deep Purple Overseas");
        newMusic.setTitulo("Highway Star");
        newMusic.setTempoDeDuracao(7);
        newMusic.setFormato("MP3");
        newMusic.setGenero("Hard Rock");

        for (int i = 0; i < 1000; i++) {
            newMusic.reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            newMusic.curtir();
        }

        FichaTecnica ficha = new FichaTecnica();
        ficha.fichaTecnicaMusica(newMusic);

        Podcast newpod = new Podcast();
        newpod.setTitulo("por que estudar é bom?");
        newpod.setNomeDoApresentador("Hugo de São Vitor");
        newpod.setTema("educação");
        newpod.setDescricao("Podecast falando dos benefícios ao cérebro para aqueles que estudam");
        newpod.setFormato("OGG");
        newpod.setAno(2023);
        newpod.setTempoDeDuracao(50);

        for (int i = 0; i < 1000; i++) {
            newpod.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            newpod.curtir();
        }

        ficha.fichaTecnicaPodcast(newpod);
    }
}
