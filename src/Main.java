public class Main {
    public static void main(String[] args) {
        System.out.println("O \"Olá, mundo!\" da gata.");
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        System.out.println(lista.toString());
        
        Fila foo = new Fila();
    }
}

class Fila {
    public Fila() {
        System.out.println("Classe Fila diz: \"Olá, mundo!\"");            
        
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

    public void inserir() {
        // Como será que a gente descobre
        // se o dado será o primeiro a entrar na lista?

        // Mulé, tú tá falando consigo mesmo? Lembre que a implementação
        // o gerenciamento da lista é de responsabilidade dela mesma.
        // Verifique se você pode pedir que ela informe sobre a ordem dos nós.
    }

    public void remover() {
        // Disse isso porque
        // ele deve ser também o primeiro dado
        // a ser removido da fila.
    }

    public String PalestinaLivre() {
        String extensaoDaLiberdade = ":palestinian_territories: Do Rio Jordão ao Mar Mediterrâneo";
        return extensaoDaLiberdade;
    }
}