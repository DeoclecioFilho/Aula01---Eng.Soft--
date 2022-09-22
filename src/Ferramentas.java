import java.util.List;

public class Ferramentas implements ListarDados{

    @Override
    public void imprimir(String conteudo) {
        System.out.println("Ferramenta: " + conteudo);
    }
}
