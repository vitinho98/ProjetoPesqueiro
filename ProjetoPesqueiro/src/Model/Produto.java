package Model;

public class Produto {
    
    private Integer idProduto;
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double porcentagemLucro;
    private double estoque;
    private String unidadeMedida;
    private boolean ativo;

    public Produto() {
        
    }

    public Integer getCodigo() {
        return idProduto;
    }

    public void setCodigo(Integer codigo) {
        this.idProduto = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPorcentagemLucro() {
        return porcentagemLucro;
    }

    public void setPorcentagemLucro(double porcentagemLucro) {
        this.porcentagemLucro = porcentagemLucro;
    }

    public double getEstoque() {
        return estoque;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String tipo) {
        this.unidadeMedida = tipo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    
}
