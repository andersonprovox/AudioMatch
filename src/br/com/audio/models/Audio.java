package br.com.audio.models;

public class Audio {
    private int tempoDeDuracao;
    private String formato;
    private String titulo;
    private int ano;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public void reproduzir() {
        totalDeReproducoes += 1;
    }


    public void curtir() {
        curtidas += 1;
    }

    public void classificar() {
        if (totalDeReproducoes == curtidas) {
            System.out.println("Sensação do momento!");
        } else if (totalDeReproducoes > curtidas) {
            System.out.println("Um dos mais ouvidos");
        } else {
            System.out.println("Confira quando quiser...");
        }
    }

}
