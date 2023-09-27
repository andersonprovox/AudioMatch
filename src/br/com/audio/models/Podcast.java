package br.com.audio.models;

public class Podcast extends Audio{
    private String nomeDoApresentador;
    private String temporada;
    private String descricao;
    private String tema;

    public String getNomeDoApresentador() {
        return nomeDoApresentador;
    }

    public void setNomeDoApresentador(String nomeDoApresentador) {
        this.nomeDoApresentador = nomeDoApresentador;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
