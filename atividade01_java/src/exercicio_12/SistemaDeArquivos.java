package exercicio_12;

public class SistemaDeArquivos {

    private Diretorio raiz;

    public SistemaDeArquivos() {
        this.raiz = new Diretorio("raiz");
    }

    public Diretorio getRaiz() {
        return raiz;
    }

    public void adicionarItem(String caminho, Object item) {
        String[] partes = caminho.split("/");
        Diretorio diretorioAtual = raiz;

        for (String parte : partes) {
            boolean encontrado = false;
            for (Object conteudo : diretorioAtual.getConteudo()) {
                if (conteudo instanceof Diretorio && ((Diretorio) conteudo).getNome().equals(parte)) {
                    diretorioAtual = (Diretorio) conteudo;
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                Diretorio novoDiretorio = new Diretorio(parte);
                diretorioAtual.adicionar(novoDiretorio);
                diretorioAtual = novoDiretorio;
            }
        }
        diretorioAtual.adicionar(item);
    }

    public static void main(String[] args) {
        SistemaDeArquivos sistema = new SistemaDeArquivos();
        Arquivo arquivo1 = new Arquivo("arquivo1.txt", 500);
        Arquivo arquivo2 = new Arquivo("arquivo2.txt", 234);

        sistema.adicionarItem("docs", arquivo1);
        sistema.adicionarItem("docs", arquivo2);

        Diretorio docs = (Diretorio) sistema.getRaiz().getConteudo().get(0); 
        System.out.println("Tamanho total do diretório 'docs': " + docs.calcularTamanhoTotal() + " bytes");
    }
}
