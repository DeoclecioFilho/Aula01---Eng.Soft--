import java.util.List;

public class Produto {


    private String conteudo;
    private ListarDados listarDados;

    public Produto(String nomeDaLista) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Ocp.refatorado." + nomeDaLista);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            this.listarDados = null;
        }
        if (!(objeto instanceof ListarDados)) {
            this.listarDados = null;
        }
        this.listarDados = (ListarDados) objeto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void imprimir() {
        this.listarDados.imprimir(conteudo);
    }
}
