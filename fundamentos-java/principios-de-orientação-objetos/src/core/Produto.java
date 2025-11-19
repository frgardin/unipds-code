package core;

public class Produto {
    private int codigo;
    private String descricao;
    private float preco;
    private int estoque;

    public Produto(int codigo, String desc, float preco, int estoque) {
        this.codigo = validaCodigo(codigo);
        this.descricao = validaDescricao(desc);
        this.preco = validaPreco(preco);
        this.estoque = validaEstoque(estoque);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setCodigo(int codigo) {
        this.codigo = validaCodigo(codigo);
    }

    private int validaCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("código deve ser maior que zero");
        }
        return codigo;
    }

    public void setDescricao(String desc) {
        this.descricao = validaDescricao(desc);
    }

    private String validaDescricao(String desc) {
        if (desc == null) {
            throw new IllegalArgumentException("descrição deve ser preechida");
        }
        return desc;
    }

    public void setPreco(float preco) {
        this.preco = validaPreco(preco);
    }

    private float validaPreco(float preco) {
        if (preco <= 0.0f) {
            throw new IllegalArgumentException("preco deve ser maior que zero");
        }
        return preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = validaEstoque(estoque);
    }

    private int validaEstoque(int estoque) {
        if (estoque < 0) {
            throw new IllegalArgumentException("estoque nao pode ser negativo");
        }
        return estoque;
    }
}
