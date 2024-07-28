package Projeto;

public class Main {

    public static void main(String[] args) {
        IPhone meuIphone = new IPhone();
        
        // Testando as funcionalidades
        meuIphone.tocar();
        meuIphone.selecionarMusica("Música Exemplo");
        meuIphone.ligar("123456789");
        meuIphone.exibirPagina("https://exemplo.com");
    }
    
}
