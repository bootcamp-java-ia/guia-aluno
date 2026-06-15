public class Main {

    public static void main(String[] args) {

        ProdutoRepository repo = new ProdutoRepository();

        // CREATE
        repo.adicionar(new Produto(1, "Teclado"));
        repo.adicionar(new Produto(2, "Mouse"));

        // READ
        repo.listar();

        // UPDATE
        repo.atualizarNome(2, "Mouse Gamer");

        // READ novamente
        repo.listar();

        // DELETE
        repo.remover(1);

        // READ final
        repo.listar();
    }
}
