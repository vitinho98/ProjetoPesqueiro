package Controller;

import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    
    public boolean inserirProduto(Produto produto){
        
        String comando = "INSERT INTO produtos VALUES(?,?,?,?,?,?,?,?)";
        
        try{
            
            Connection conexao = ConnectionFactory.getConnection();
            PreparedStatement ps = conexao.prepareStatement(comando);
            
            ps.setInt(1, produto.getCodigo());
            ps.setString(2, produto.getNome());
            ps.setDouble(3, produto.getPrecoCusto());
            ps.setDouble(4, produto.getPrecoVenda());
            ps.setDouble(5, produto.getPorcentagemLucro());
            ps.setDouble(6, produto.getEstoque());
            ps.setString(7, produto.getUnidadeMedida());
            ps.setBoolean(8, produto.isAtivo());
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            return true;
            
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean alterarProduto(Produto produto){
        
        String comando = "UPDATE produtos SET nome = ?, precoCusto = ?, precoVenda = ?, porcentagemLucro = ?, estoque = ?, tipo = ?, ativo = ? WHERE codigo = ?";
        
        try{
            
            Connection conexao = ConnectionFactory.getConnection();
            PreparedStatement ps = conexao.prepareStatement(comando);
            
            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getPrecoCusto());
            ps.setDouble(3, produto.getPrecoVenda());
            ps.setDouble(4, produto.getPorcentagemLucro());
            ps.setDouble(5, produto.getEstoque());
            ps.setString(6, produto.getUnidadeMedida());
            ps.setBoolean(7, produto.isAtivo());
            ps.setInt(8, produto.getCodigo());
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            return true;
            
        }catch(SQLException e){
            return false;
        }
    }
    
    public boolean excluirProduto(Produto produto){
        
        String comando = "UPDATE produtos SET ativo = ? WHERE codigo = ?";
        
        try{
            
            Connection conexao = ConnectionFactory.getConnection();
            PreparedStatement ps = conexao.prepareStatement(comando);
            
            ps.setBoolean(1, produto.isAtivo());
            ps.setInt(2, produto.getCodigo());
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            return true;
            
        }catch(SQLException e){
            return false;
        }
    }
    
    public List<Produto> listarProdutos(){
        
        String comando = "SELECT * FROM produtos ORDER BY nome WHERE ativo = true";
        Produto produto = new Produto();
        List<Produto> produtos = new ArrayList<Produto>();
        
        try{
            
            Connection conexao = ConnectionFactory.getConnection();
            PreparedStatement ps = conexao.prepareStatement(comando);
            
            ResultSet resultado = ps.executeQuery();
            
            while(resultado.next()){
                
                produto.setCodigo(resultado.getInt("idProduto"));
                produto.setNome(resultado.getString("nome"));
                produto.setPrecoCusto(resultado.getDouble("precoCusto"));
                produto.setPrecoVenda(resultado.getDouble("precoVenda"));
                produto.setPorcentagemLucro(resultado.getDouble("porcentagemLucro"));
                produto.setUnidadeMedida(resultado.getString("tipo"));
                produto.setEstoque(resultado.getDouble("estoque"));
                
                produtos.add(produto);
                
            }
            
            return produtos;
            
        }catch(SQLException e){
            return null;
        }
    }
    
}
