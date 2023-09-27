package br.com.audio.models;

public class FichaTecnica {
    public void fichaTecnicaMusica(Musica musica) {
        System.out.println("*********************\n");
        System.out.println("Artista: " + musica.getArtista());
        System.out.println("Título da música: " + musica.getTitulo());
        System.out.println("Album: " + musica.getAlbum());
        System.out.println("Tempo de duração: " + musica.getTempoDeDuracao() + " minutos");
        System.out.println("Formato: " + musica.getFormato());
        System.out.println("Ano de lançamento: " + musica.getAno());
        System.out.println("Gravadora: " + musica.getGravadora());
        System.out.println("O que dizem os ouvintes: " + musica.classificar());
        System.out.println("\n*********************");
    }

    public void fichaTecnicaPodcast(Podcast podcast) {
        System.out.println("*********************\n");
        System.out.println("Título: " + podcast.getTitulo());
        System.out.println("Descrição: " + podcast.getDescricao());
        System.out.println("Tema: " + podcast.getTema());
        System.out.println("Apresentador: " + podcast.getNomeDoApresentador());
        System.out.println("Temporada: " + podcast.getTemporada());
        System.out.println("Ano: " + podcast.getAno());
        System.out.println("Formato de Áudio: " + podcast.getFormato());
        System.out.println("Tempo de duração: " + podcast.getTempoDeDuracao() + " minuto(s)");
        System.out.println("O que dizem os ouvintes: " + podcast.classificar());
        System.out.println("\n*********************");
    }
}
