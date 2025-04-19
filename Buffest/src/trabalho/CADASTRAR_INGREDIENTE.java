package trabalho;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class CADASTRAR_INGREDIENTE extends JPanel {
    private CUSTOS custos;
    private JTextField nomeTextField;
    private JTextField valorTextField;
    private JTextField quantidadeTextField;
    private JButton confirmarButton;
    private JButton cancelarButton;
    private String nomeOriginal;

    public CADASTRAR_INGREDIENTE(CUSTOS custos) {
        this.custos = custos;
        this.setMinimumSize(new Dimension(400, 300));
        initComponents();
    }

    public CADASTRAR_INGREDIENTE(CUSTOS custos, String nome, double valor, double quantidade) {
        this.custos = custos;
        this.nomeOriginal = nome;
        this.setMinimumSize(new Dimension(400, 300));
        initComponents();
        
        nomeTextField.setText(nome);
        valorTextField.setText(Double.toString(valor));
        quantidadeTextField.setText(Double.toString(quantidade));
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        JPanel tituloPanel = new JPanel();
        JLabel tituloLabel = new JLabel("Cadastrar Ingrediente");

        JLabel nomeLabel = new JLabel("Nome");
        JLabel valorLabel = new JLabel("Valor");
        JLabel quantidadeLabel = new JLabel("Quantidade");

        nomeTextField = new JTextField(20);
        valorTextField = new JTextField(20);
        quantidadeTextField = new JTextField(20);

        confirmarButton = new JButton("Confirmar");
        cancelarButton = new JButton("Cancelar");

        tituloPanel.setBorder(BorderFactory.createEtchedBorder());
        tituloPanel.add(tituloLabel);

        confirmarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(tituloPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quantidadeLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantidadeTextField, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabel)
                            .addComponent(valorLabel))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeTextField)
                            .addComponent(valorTextField, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(confirmarButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelarButton)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tituloPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(valorLabel)
                    .addComponent(valorTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidadeLabel)
                    .addComponent(quantidadeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarButton)
                    .addComponent(cancelarButton))
                .addContainerGap())
        );
    }

    private void confirmarButtonActionPerformed(ActionEvent evt) {
String nome = nomeTextField.getText();
    double valor;
    double quantidade;

    try {
        valor = Double.parseDouble(valorTextField.getText());
        quantidade = Double.parseDouble(quantidadeTextField.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Connection conn = null;
    PreparedStatement pstmt = null;
    PreparedStatement pstmtUni = null; 

    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabalhopi", "root", "5563");
        
        if (nomeOriginal == null) { // Se nomeOriginal é nulo, é uma inserção
            conn.setAutoCommit(false);

            String sql = "INSERT INTO custo_variavel (Icredientes, Valor, Quantidade) VALUES (?,?,?)";
            pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, nome);
            pstmt.setDouble(2, valor);
            pstmt.setDouble(3, quantidade);
            pstmt.executeUpdate();

            ResultSet rs = pstmt.getGeneratedKeys();
            int fk_id_Variavel = 0;
            if (rs.next()) {
                fk_id_Variavel = rs.getInt(1);
            }

            String sqlUni = "INSERT INTO unidade_custo_variavel (fk_id_Variavel, total) VALUES (?,?)";
            pstmtUni = conn.prepareStatement(sqlUni);
            pstmtUni.setInt(1, fk_id_Variavel);
            pstmtUni.setDouble(2, valor / quantidade); 
            pstmtUni.executeUpdate();

            conn.commit();
            JOptionPane.showMessageDialog(this, "Ingrediente cadastrado com sucesso.");
        } else { // Caso contrário, é uma atualização
            conn.setAutoCommit(false);

            String sql = "UPDATE custo_variavel SET Icredientes = ?, Valor = ?, Quantidade = ? WHERE Icredientes = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nome);
            pstmt.setDouble(2, valor);
            pstmt.setDouble(3, quantidade);
            pstmt.setString(4, nomeOriginal);
            pstmt.executeUpdate();

            String sqlUni = "UPDATE unidade_custo_variavel SET total = ? WHERE fk_id_Variavel = (SELECT id_Variavel FROM custo_variavel WHERE Icredientes = ?)";
            pstmtUni = conn.prepareStatement(sqlUni);
            pstmtUni.setDouble(1, valor / quantidade);
            pstmtUni.setString(2, nome);
            pstmtUni.executeUpdate();

            conn.commit();
            JOptionPane.showMessageDialog(this, "Ingrediente atualizado com sucesso.");
        }

        custos.extrairdados();
        custos.fecharCadastroIngredientes();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao inserir no banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        try {
            if (conn != null) conn.rollback();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } finally {
        try {
            if (pstmtUni != null) pstmtUni.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    private void cancelarButtonActionPerformed(ActionEvent evt) {
        custos.fecharCadastroIngredientes();
    }
}
