import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("dados.txt");
        writer.write("Produto: Mouse");
        writer.close();
    }
}