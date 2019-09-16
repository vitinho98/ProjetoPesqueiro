package View;

import Controller.ProdutoController;
import Model.Produto;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadProduto extends javax.swing.JFrame {
    
    private final String caracteres = "0987654321,.";
    private AddEstoque addEstoque;
    private RemEstoque remEstoque;
    
    public CadProduto() {
        initComponents();
        txtNome.requestFocus();
        jtProdutos.getColumnModel().getColumn(1).setPreferredWidth(500);
        btnExcluir.setEnabled(false);
        btnAumentarEstoque.setEnabled(false);
        btnDiminuirEstoque.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblPrecoCusto = new javax.swing.JLabel();
        txtPrecoCusto = new javax.swing.JTextField();
        lblPorcentagemLucro = new javax.swing.JLabel();
        txtPorcentagemLucro = new javax.swing.JTextField();
        lblPrecoVenda = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        lblEstoque = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        lblUnidade = new javax.swing.JLabel();
        cbUnidade = new javax.swing.JComboBox();
        jspPessoas = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAumentarEstoque = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnDiminuirEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCodigo.setText("Código:");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblPrecoCusto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPrecoCusto.setText("Custo:");

        txtPrecoCusto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPrecoCusto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoCustoFocusLost(evt);
            }
        });
        txtPrecoCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecoCustoKeyTyped(evt);
            }
        });

        lblPorcentagemLucro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPorcentagemLucro.setText("% Lucro:");

        txtPorcentagemLucro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPorcentagemLucro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPorcentagemLucroFocusLost(evt);
            }
        });
        txtPorcentagemLucro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentagemLucroKeyTyped(evt);
            }
        });

        lblPrecoVenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPrecoVenda.setText("Preço Venda:");

        txtPrecoVenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPrecoVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoVendaFocusLost(evt);
            }
        });
        txtPrecoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecoVendaKeyTyped(evt);
            }
        });

        lblEstoque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblEstoque.setText("Estoque:");

        txtEstoque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstoqueKeyTyped(evt);
            }
        });

        lblUnidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblUnidade.setText("Unidade Medida:");

        cbUnidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbUnidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UN", "KG", "DZ", "100GR" }));

        jtProdutos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Custo", "% Lucro", "Venda", "Estoque", "Unidade Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtProdutosMousePressed(evt);
            }
        });
        jspPessoas.setViewportView(jtProdutos);

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAumentarEstoque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAumentarEstoque.setText("ADICIONAR ESTOQUE");
        btnAumentarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarEstoqueActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnDiminuirEstoque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDiminuirEstoque.setText("DIMINUIR ESTOQUE");
        btnDiminuirEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiminuirEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspPessoas)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrecoCusto)
                            .addComponent(lblCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPorcentagemLucro)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPorcentagemLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(lblPrecoVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(lblEstoque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(lblUnidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAumentarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDiminuirEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecoCusto)
                    .addComponent(lblPorcentagemLucro)
                    .addComponent(lblPrecoVenda)
                    .addComponent(lblEstoque)
                    .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnidade)
                    .addComponent(cbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcentagemLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAumentarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiminuirEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jspPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        btnAumentarEstoque.getAccessibleContext().setAccessibleParent(btnAumentarEstoque);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        if(conferirCampos()){
            
            ProdutoController pc = new ProdutoController();
            Produto produto = setarProduto();
            
            if(produto != null){
                
                if(produto.getCodigo() == null)
                    if(pc.inserirProduto(produto)){
                        atualizarTabela();
                        JOptionPane.showMessageDialog(null, "Produto cadastrado!");
                        limpar();
                        txtNome.requestFocus();
                    }else
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
                else
                    if(pc.alterarProduto(produto)){
                        atualizarTabela();
                        JOptionPane.showMessageDialog(null, "Produto alterado!");
                        limpar();
                        txtNome.requestFocus();
                    }else
                        JOptionPane.showMessageDialog(null, "Erro ao alterar");
                
            }else
                JOptionPane.showMessageDialog(null, "Não foi possível completar a operação!\nTente novamente!");
            
            
        }else
            JOptionPane.showMessageDialog(null, "Insira todos os campos!");
   
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAumentarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarEstoqueActionPerformed
        
        addEstoque = new AddEstoque(this, rootPaneCheckingEnabled);
        addEstoque.setVisible(true);
        addEstoque.receberNomeProduto(this, txtNome.getText());
        
    }//GEN-LAST:event_btnAumentarEstoqueActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        if(conferirCampos()){
            
            ProdutoController pc = new ProdutoController();
            Produto produto = new Produto();
            
            try{
                
                produto.setCodigo(Integer.parseInt(txtCodigo.getText()));
                produto.setAtivo(false);

                if(pc.excluirProduto(produto)){
                    atualizarTabela();
                    limpar();
                    JOptionPane.showMessageDialog(null, "Produto excluído!");
                }else
                    JOptionPane.showMessageDialog(null, "Erro ao excluir!");
                
            }catch(NumberFormatException | HeadlessException e ){
                
                JOptionPane.showMessageDialog(null, "Não foi possível completar a operação!\nTente novamente!");
                
            }
            
                
        }else
            JOptionPane.showMessageDialog(null, "Selecione um produto!");
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        limpar();
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnDiminuirEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiminuirEstoqueActionPerformed
        
        remEstoque = new RemEstoque(this, rootPaneCheckingEnabled);
        remEstoque.setVisible(true);
        remEstoque.receberNomeProduto(this, txtNome.getText());
        
    }//GEN-LAST:event_btnDiminuirEstoqueActionPerformed

    private void txtEstoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstoqueKeyTyped
        
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            getToolkit().beep();
        }
        
    }//GEN-LAST:event_txtEstoqueKeyTyped

    private void txtPrecoCustoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoCustoKeyTyped
        
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            getToolkit().beep();
        }
        
    }//GEN-LAST:event_txtPrecoCustoKeyTyped

    private void txtPorcentagemLucroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentagemLucroKeyTyped
       
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            getToolkit().beep();
        }
        
    }//GEN-LAST:event_txtPorcentagemLucroKeyTyped

    private void txtPrecoVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoVendaKeyTyped
        
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            getToolkit().beep();
        }
        
    }//GEN-LAST:event_txtPrecoVendaKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        //atualizarTabela();
        
    }//GEN-LAST:event_formWindowActivated

    private void txtPrecoCustoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoCustoFocusLost
        
        if(!txtPrecoVenda.getText().isEmpty()){
            
            try{
                
                double precoCusto = Double.parseDouble(txtPrecoCusto.getText());
                double precoVenda = Double.parseDouble(txtPrecoVenda.getText());
                double porcentagemLucro = Double.parseDouble(txtPorcentagemLucro.getText());
                
                if(precoCusto <= 0) throw new IllegalArgumentException("O custo não pode ser maior ou igual a zero!");
                
                if(precoCusto >= precoVenda)
                    txtPrecoVenda.setText(String.valueOf(precoCusto * (porcentagemLucro / 100) + precoCusto));
                else
                    txtPorcentagemLucro.setText(String.valueOf(((precoVenda - precoCusto) / precoCusto) * 100));
                
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
            
        }
        
    }//GEN-LAST:event_txtPrecoCustoFocusLost

    private void txtPorcentagemLucroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPorcentagemLucroFocusLost
        
        if(!txtPrecoCusto.getText().isEmpty()){
            
            try{
                
                double precoCusto = Double.parseDouble(txtPrecoCusto.getText());
                double porcentagemLucro = Double.parseDouble(txtPorcentagemLucro.getText()) / 100;
                
                if(porcentagemLucro <= 0) throw new IllegalArgumentException("A porcentagem de lucro não pode ser maior ou igual a zero!");
                
                txtPrecoVenda.setText(String.valueOf(precoCusto * porcentagemLucro + precoCusto));
                
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
            
        }
        
    }//GEN-LAST:event_txtPorcentagemLucroFocusLost

    private void txtPrecoVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaFocusLost
        
        if(!txtPrecoCusto.getText().isEmpty()){
            
            try{
                
                double precoCusto = Double.parseDouble(txtPrecoCusto.getText());
                double precoVenda = Double.parseDouble(txtPrecoVenda.getText());
                
                if(precoVenda <= 0) throw new IllegalArgumentException("O preço de venda não pode ser maior ou igual a zero!");
                
                txtPorcentagemLucro.setText(String.valueOf(((precoVenda - precoCusto) / precoCusto) * 100));
                
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
            
        }
        
    }//GEN-LAST:event_txtPrecoVendaFocusLost

    private void jtProdutosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdutosMousePressed
        
        int linha = jtProdutos.getSelectedRow();
        
        String precoCusto = (String) jtProdutos.getValueAt(linha, 2);
        precoCusto = precoCusto.substring(2);
        
        String porcentagem = (String) jtProdutos.getValueAt(linha, 3);
        porcentagem = porcentagem.replaceAll("%", "");
        
        String precoVenda = (String) jtProdutos.getValueAt(linha, 4);
        precoVenda = precoVenda.substring(2);
        
        txtCodigo.setText((String) jtProdutos.getValueAt(linha, 0));
        txtNome.setText((String) jtProdutos.getValueAt(linha, 1));
        txtEstoque.setText((String) jtProdutos.getValueAt(linha, 5));
        
        txtPrecoCusto.setText(precoCusto);
        txtPorcentagemLucro.setText(porcentagem);
        txtPrecoVenda.setText(precoVenda);
        
        cbUnidade.setSelectedItem((String) jtProdutos.getValueAt(linha, 6));
        
        btnExcluir.setEnabled(true);
        btnAumentarEstoque.setEnabled(true);
        btnDiminuirEstoque.setEnabled(true);
        
    }//GEN-LAST:event_jtProdutosMousePressed
    
    private Produto setarProduto(){
        
            Produto produto = new Produto();
            
            try{
                
                produto.setCodigo(Integer.parseInt(txtCodigo.getText()));
                produto.setNome(txtNome.getText());
                produto.setPrecoCusto(Double.parseDouble(txtPrecoVenda.getText()));
                produto.setPrecoVenda(Double.parseDouble(txtPorcentagemLucro.getText()));
                produto.setPorcentagemLucro(Double.parseDouble(txtPrecoCusto.getText()));
                produto.setEstoque(Double.parseDouble(txtEstoque.getText()));
                produto.setUnidadeMedida((String) cbUnidade.getSelectedItem());
                produto.setAtivo(true);

                return produto;
                
            }catch(Exception e){
                return null;
            }
    }
    
    private boolean conferirCampos(){
        
        if(txtNome.getText().isEmpty())
            return false;
        else if(txtPrecoVenda.getText().isEmpty())
            return false;
        else if(txtPrecoCusto.getText().isEmpty())
            return false;
        else if(txtPorcentagemLucro.getText().isEmpty())
            return false;
        else if(txtEstoque.getText().isEmpty())
            return false;
        else
            return true;
        
    }
    
    private void atualizarTabela(){
        
        ProdutoController pc = new ProdutoController();
        List<Produto> produtos = pc.listarProdutos();
        
        DefaultTableModel modelo = (DefaultTableModel)jtProdutos.getModel();
        int totalLinhas = modelo.getRowCount();
        
        for(int i = totalLinhas - 1; i > -1; i--)
            modelo.removeRow(i);
        
        for(Produto produto : produtos){
            Object[] obj = new Object[]{
                produto.getCodigo(),
                produto.getNome(),
                "R$" + produto.getPrecoCusto(),
                produto.getPorcentagemLucro() + "%",
                "R$" + produto.getPrecoVenda(),
                produto.getEstoque(),
                produto.getUnidadeMedida()};  
            
            modelo.addRow(obj);
        }
        
    }
    
    private void limpar(){
        
        txtCodigo.setText(null);
        txtEstoque.setText(null);
        txtNome.setText(null);
        txtPrecoCusto.setText(null);
        txtPrecoVenda.setText(null);
        txtPorcentagemLucro.setText(null);
        cbUnidade.setSelectedIndex(0);
        
        btnExcluir.setEnabled(false);
        btnAumentarEstoque.setEnabled(false);
        btnDiminuirEstoque.setEnabled(false);
        
    }
    
    public void recebeValoresAdd(double quantidade, double custo){
        
        try{
            
            double custoTotalAntigo = Double.parseDouble(txtPrecoVenda.getText()) * Double.parseDouble(txtEstoque.getText());
            double custoTotalAdicionado = quantidade * custo;
            
            double custoTotal = custoTotalAdicionado + custoTotalAntigo;
            double estoqueTotal = Double.parseDouble(txtEstoque.getText()) + quantidade;

            double novoCusto = custoTotal / estoqueTotal;
            double novoEstoque = Double.parseDouble(txtEstoque.getText()) + quantidade;
            
            txtEstoque.setText(String.valueOf(novoEstoque));
            txtPrecoCusto.setText(String.valueOf(novoCusto));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível completar a operação!\nTente novamente!");
            e.printStackTrace();            
        }

    }
    
    public void recebeValoresRem(double quantidade){
        
        try{
            
            double novoEstoque = Double.parseDouble(txtEstoque.getText()) + quantidade;
            txtEstoque.setText(String.valueOf(novoEstoque));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível completar a operação!\nTente novamente!");
            e.printStackTrace();  
        }
        
    }
    
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAumentarEstoque;
    private javax.swing.JButton btnDiminuirEstoque;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbUnidade;
    private javax.swing.JScrollPane jspPessoas;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPorcentagemLucro;
    private javax.swing.JLabel lblPrecoCusto;
    private javax.swing.JLabel lblPrecoVenda;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPorcentagemLucro;
    private javax.swing.JTextField txtPrecoCusto;
    private javax.swing.JTextField txtPrecoVenda;
    // End of variables declaration//GEN-END:variables
}
