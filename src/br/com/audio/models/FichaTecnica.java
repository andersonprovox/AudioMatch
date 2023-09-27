package br.com.audio.models;

public class FichaTecnica {
    public void fichaTecnicaMusica(Musica musica) {
        System.out.println(musica.getArtista());
        System.out.println(musica.getTitulo());
        System.out.println(musica.getAlbum());
        System.out.println(musica.getTempoDeDuracao());
        System.out.println(musica.getFormato());
        System.out.println(musica.getAno());
        System.out.println(musica.getGravadora());
        System.out.println(musica.classificar());
    }

    public void fichaTecnicaPodcast(Podcast podcast) {
        System.out.println(podcast.getTitulo());
        System.out.println(podcast.getDescricao());
        System.out.println(podcast.getTema());
        System.out.println(podcast.getNomeDoApresentador());
        System.out.println(podcast.getTemporada());
        System.out.println(podcast.getAno());
        System.out.println(podcast.getFormato());
        System.out.println(podcast.getTempoDeDuracao());
        System.out.println(podcast.classificar());
    }
}
