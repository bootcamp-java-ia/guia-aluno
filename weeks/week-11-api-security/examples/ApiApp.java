import io.javalin.Javalin;
import java.util.ArrayList;
import java.util.List;

public class ApiApp {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Teclado"));
        produtos.add(new Produto(2, "Mouse"));

        Javalin app = Javalin.create().start(7000);

        // GET
        app.get("/produtos", ctx -> {
            ctx.json(produtos);
        });

        // POST (simples, didático)
        app.post("/produtos", ctx -> {
            Produto novo = ctx.bodyAsClass(Produto.class);
            produtos.add(novo);
            ctx.status(201);
        });
    }
}