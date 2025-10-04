public class Main {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();
        fila.enfileirar("Primeiro");
        fila.enfileirar("Segundo");
        System.out.println(fila.lista.toString());
        No<String> fifo = fila.primeiroDadoDaFila();
        No<String> provaDeConceito = fila.desenfileirarEPegarODadoRemovido();
        System.out.println(fifo);
        System.out.println(provaDeConceito);
        System.out.println("O esquema FIFO foi seguido? " + (fifo == provaDeConceito ? "Sim, o esquema foi seguido." : "Não, o esquema não foi seguido."));
        try {
            fila.desenfileirar();
        } catch (FilaVaziaException e) {
            System.err.println("Método desenfileirar() não foi executado: a lista está vazia.");
        }
        System.out.println(fila.lista.toString());
    }
}

class Fila<TipoGenerico> {
    ListaEncadeada<TipoGenerico> lista;
    int quantidade;
    
    public Fila() {
        System.out.println("Classe Fila diz: \"Olá, mundo!\"");            
        this.lista = new ListaEncadeada<>();
        this.quantidade = 0;
        /*
         * ----------------------
         * INSERÇÕES E REMOÇÕES
         * SEGUEM O ESQUEMA FIFO
         * (FIRST IN, FIRST OUT)
         * ----------------------
         * O primeiro dado a entrar 
         * também será o primeiro dado a sair
         * da fila.
         * ----------------------
        */
    }

    public void enfileirar(TipoGenerico dado) {
        // Como será que a gente descobre
        // se o dado será o primeiro a entrar na lista?

        // Mulé, tú tá falando consigo mesmo? Lembre que a implementação
        // o gerenciamento da lista é de responsabilidade dela mesma.
        // Verifique se você pode pedir que ela informe sobre a ordem dos nós.
        No<TipoGenerico> novoDado = new No<>(dado);
        this.lista.adicionarNoAoFimDaLista(novoDado);
        this.incrementarQuantidade();
        System.out.println("Quantidade de dados na fila: " + this.getQuantidade());
    }

    public void desenfileirar() {
        // Disse isso porque
        // ele deve ser também o primeiro dado
        // a ser removido da fila.
        if(this.estaVazia()) {
            throw new FilaVaziaException("desenfileirar(): a fila está vazia.");
        }
        this.lista.removerNoDoInicio();
        this.decrementrarQuantidade();
        System.out.println("Quantidade de dados na fila: " + this.getQuantidade());
    }

    public No<TipoGenerico> desenfileirarEPegarODadoRemovido() {
        // Disse isso porque
        // ele deve ser também o primeiro dado
        // a ser removido da fila.
        if(this.estaVazia()) {
            throw new FilaVaziaException("desenfileirar(): a fila está vazia.");
        }
        No<TipoGenerico> noRemovido = this.lista.removerNoDoInicio();
        this.decrementrarQuantidade();
        System.out.println("Quantidade de dados na fila: " + this.getQuantidade());
        return noRemovido;
    }

    public void incrementarQuantidade() {
        this.quantidade++;
    }

    public void decrementrarQuantidade() {
        this.quantidade--;
    }

    public boolean estaVazia() {
        return this.quantidade < 1;
    }

    public No<TipoGenerico> primeiroDadoDaFila() {
        if(this.estaVazia()) {
            throw new FilaVaziaException("Fila vazia");
        }

        No<TipoGenerico> retorno = this.lista.getCabeca();

        return retorno;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String PalestinaLivre() {
        String extensaoDaLiberdade = ":palestinian_territories: Do Rio Jordão ao Mar Mediterrâneo";
        return extensaoDaLiberdade;
    }
}