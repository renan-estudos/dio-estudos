package edu.renan.iphone;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public void ligar() {
        System.out.println("Ligar");
    }
    public void atender() {
        System.out.println("Atender");
    }
    public void iniciarCorrerioVoz() {
        System.out.println("iniciarCorrerioVoz");
    }

    public void exibirPagina() {
        System.out.println("exibirPagina");
    }

   public void adicionarNovaAba() {
       System.out.println("adicionarNovaAba");
   }

    public void atualizarPagina() {
        System.out.println("atualizarPagina");
    }

    public void tocar() {
        System.out.println("tocar");
    }
    public void pausar() {
        System.out.println("pausar");
    }

    public void selecionarMusica() {
        System.out.println("selecionarMusica");
    }

}
