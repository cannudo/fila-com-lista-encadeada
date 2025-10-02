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
}