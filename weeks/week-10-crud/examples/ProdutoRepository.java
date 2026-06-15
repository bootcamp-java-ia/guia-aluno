import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private List<Produto> produtos = new ArrayList<>();

    // CREATE
    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    // READ
    public void listar() {
        for (Produto p : produtos) {
            System.out.println(p.getId() + " - " + p.getNome());
        }
    }

    // UPDATE
    public void atualizarNome(int id, String novoNome) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                System.out.println("Atualizando produto " + id);
                // cria novo objeto para simplicidade didática
                produtos.remove(p);
                produtos.add(new Produto(id, novoNome));
                return;
            }
        }
    }

    // DELETE
    public void remover(int id) {
        produtos.removeIf(p -> p.getId() == id);
    }
}
