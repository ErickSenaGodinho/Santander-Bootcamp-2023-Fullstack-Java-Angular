public class App {
    public static void main(String[] args) throws Exception {
        Iphone myIphone = new Iphone();
        myIphone.selecionarMusica("Let it Happen - Tame Impala");
        myIphone.tocar();
        myIphone.pausar();
        myIphone.selecionarMusica("Lonely - Akon");
        myIphone.tocar();

        myIphone.exibirPagina("www.linkedin.com");
        myIphone.adicionarNovaAba("www.youtube.com");
        myIphone.atualizarPagina();

        myIphone.ligar("(33) 99999-99999");
        myIphone.iniciarCorreioDeVoz();
        myIphone.atender();
    }
}
