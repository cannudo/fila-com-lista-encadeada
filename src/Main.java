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
    }
}