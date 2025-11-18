public class Produto {
    private int codigo;
    private String descricao;
    private float preco;
    private int estoque;
    
    public Produto(int codigo, String desc, float preco, int estoque) {
        this.codigo=codigo;
        this.descricao=desc;
        this.preco=preco;
        this.estoque=estoque;
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
        if (codigo <= 0) {
            throw new IllegalArgumentException("código deve ser maior que zero");
        }
        this.codigo=codigo;
    }

    public void setDescricao(String desc) {
        if (desc == null) {
            throw new IllegalArgumentException("descrição deve ser preechida");
        }
        this.descricao=desc;
    }

    public void setPreco(float preco) {
        if (preco <= 0.0f) {
            throw new IllegalArgumentException("preco deve ser maior que zero");
        }
        this.preco=preco;
    }

    public void setEstoque(int estoque) {
        if (estoque < 0) {
            throw new IllegalArgumentException("estoque nao pode ser negativo");
        }
        this.estoque=estoque;
    }
}
