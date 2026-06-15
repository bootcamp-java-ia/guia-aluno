import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> tarefas = new ArrayList<>();

        tarefas.add("Estudar Java");
        tarefas.add("Fazer commit");

        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }
}