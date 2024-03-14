package exercicios.exercicio_06;

public class livro {
    private int totalPaginas;

    public livro(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public void lerPagina(int pagina) throws PaginaInvalidaException {
        if (pagina < 1 || pagina > totalPaginas) {
            throw new PaginaInvalidaException("Página inválida");
        } else {
            System.out.println("Lendo página " + pagina);
            
        }
    }
}