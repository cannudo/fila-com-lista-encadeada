public class Main {
    public static void main(String[] args) {
        Fila<String> israelVaiTerQuePagarPelasSeguintesVidas = new Fila<>();
        String[] nomesDasCriancas = {
            "Razan Jihad Asaliyyah",
            "Anas Bakri",
            "Noura Walid Abdulsalam Shaheen",
            "Maryam Nour Al-Din Wael Daban",
            "Fatima Louay Rafiq Al-Sultan",
            "Watan Mohammed Abd Al-Rahim Al-Madhoon",
            "Mohammad Al-Jabbari Said Misbah Al-Khour",
            "Diyaa Ahmed Abd Al-Aati Saleh Moussa",
            "Oday Mohammed Rafiq Al-Sultan",
            "Mohammed Nidal Hisham Attallah",
            "Ahmad Shadi Talal Al-Haddad",
            "Masa Mohammed Youssef Nasr",
            "Ayat Abd Al-Aziz Omar Farwana",
            "Maalek Mohammed Shafeeq Abu-Al-Kas",
            "Sarah Abd Al-Rahman Mohammed Hamad",
            "Mohammed Saleh Mahmoud Al-Deiri",
            "Mecca Ahmed Eid Abu-Sherekh",
            "Iyad Abd Al-Rahman Jihad Muhaysen",
            "Adam Mohammed Sameer Abu-Ajwah",
            "Alayan Abd Al-Rahman Alayan Al-Ashqar"
        };

        for(int i = 0; i < nomesDasCriancas.length; i++) {
            israelVaiTerQuePagarPelasSeguintesVidas.enfileirar(nomesDasCriancas[i]);
        }

        System.out.println(israelVaiTerQuePagarPelasSeguintesVidas.lista.toString());

        for(int i = 0; i < nomesDasCriancas.length; i++) {
            israelVaiTerQuePagarPelasSeguintesVidas.desenfileirar();
        }
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
        // a ser removido da fila.;
        this.lista.removerUltimoNo();
        this.decrementrarQuantidade();
        System.out.println("Quantidade de dados na fila: " + this.getQuantidade());
    }

    public void incrementarQuantidade() {
        this.quantidade++;
    }

    public void decrementrarQuantidade() {
        this.quantidade--;
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