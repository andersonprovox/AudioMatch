package br.com.audio.models;

public class Audio {
    private int tempoDeDuracao;
    private String formato;
    private String titulo;
    private int ano;
    private int totalDeReproducoes;
    private int curtidas;
    private String classificacao;

    public void reproduzir() {
        totalDeReproducoes += 1;
    }


    public void curtir() {
        curtidas += 1;
    }

    public String classificar() {
        if (totalDeReproducoes == curtidas) {
            return classificacao = "Sensação do momento!";
        } else if (totalDeReproducoes > curtidas) {
            return classificacao = "Um dos mais ouvidos";
        } else {
            return classificacao = "Confira quando quiser...";
        }
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    public void setTempoDeDuracao(int tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }
}
