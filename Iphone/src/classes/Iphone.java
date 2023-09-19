package Iphone.src.classes;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public void tocarMusica() {
        System.out.println("O aparelho está tocando musica");
    }

    public void pausarMusica() {
        System.out.println("A música foi pausada");
    }

    public void selecionarMusica() {
        System.out.println("Uma música foi selecionada");
    }

    public void exibirPagina() {
        System.out.println("Uma página está sendo exibida");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    
    public void atualizarPagina() {
        System.out.println("A página foi atualizada");
    }

    public void ligar() {
        System.out.println("O aparelho está realizando uma ligação");
    }

    public void atender() {
        System.out.println("Uma ligação foi atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Um correio de voz foi iniciado");
    }

}
