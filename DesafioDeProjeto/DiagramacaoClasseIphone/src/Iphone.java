public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando Música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da url: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando Aba do link: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número" + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Telefone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

}
