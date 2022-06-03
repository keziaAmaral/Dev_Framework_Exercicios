package cadastroaluno;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaCadastro extends javax.swing.JFrame {

    AlunoDAO alunoDAO = new AlunoDAO();
    
    public TelaCadastro() {
        initComponents();
        btnExcluir.setEnabled(false);
    }
    
    public void limparCampos()
    {   
        txtMatricula.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        btnSexo.clearSelection();
        btnExcluir.setEnabled(false);       
    }
    
    public void preencherTabela()
    {
        ArrayList alunos;
        
        DefaultTableModel tabela = (DefaultTableModel)tabelaAlunos.getModel();
        tabela.setRowCount(0);
        alunos = alunoDAO.listarAlunos();
        Iterator it = alunos.iterator();
        
        while(it.hasNext())
        {
            Aluno aluno = (Aluno)it.next();
            tabela.addRow(new Object[]{aluno.getMatricula(), aluno.getNome(), aluno.getSexo(), aluno.getEmail()});
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnMasculino = new javax.swing.JRadioButton();
        btnFeminino = new javax.swing.JRadioButton();
        btnNovo = new javax.swing.JButton();
        btnNovo1 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE ALUNOS");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("NOME:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("MATRÍCULA:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("E-MAIL:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("SEXO:");

        txtMatricula.setEditable(false);
        txtMatricula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSexo.add(btnMasculino);
        btnMasculino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMasculino.setText("MASCULINO");

        btnSexo.add(btnFeminino);
        btnFeminino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFeminino.setText("FEMININO");

        btnNovo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNovo.setText("SALVAR");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnNovo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNovo1.setText("NOVO");
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MATRICULA", "NOME", "SEXO", "EMAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAlunos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAlunos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnMasculino)
                                            .addComponent(btnFeminino))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNovo1)
                            .addComponent(btnNovo)
                            .addComponent(btnExcluir))))
                .addGap(67, 67, 67))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnExcluir, btnNovo, btnNovo1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnMasculino))
                        .addGap(6, 6, 6)
                        .addComponent(btnFeminino)
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );

        setSize(new java.awt.Dimension(679, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_btnNovo1ActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        if(txtNome.getText().trim().isEmpty() || txtEmail.getText().trim().isEmpty() 
                || btnMasculino.isSelected() == false && btnFeminino.isSelected() == false)
        {
            JOptionPane.showMessageDialog(rootPane, "PREENCHA TODOS OS CAMPOS!");
        }
        else
        {
            Aluno aluno = new Aluno();
            
            if(!txtMatricula.getText().isEmpty())
            {
                aluno.setMatricula(Integer.parseInt(txtMatricula.getText()));
            }
            
            aluno.setNome(txtNome.getText().trim());
            aluno.setEmail(txtEmail.getText().trim());
            
            if(btnMasculino.isSelected() == true)
            {
                aluno.setSexo("M");
            }
            else
            {
                aluno.setSexo("F");
            }
            
            String msg;
            
            if(aluno.getMatricula() == 0)
            {
                msg = alunoDAO.cadastrarAluno(aluno);
                
                if(msg.equals("1"))
                {
                    msg = "CADASTRO EFETUADO COM SUCESSO!";
                }
                
                JOptionPane.showMessageDialog(rootPane, msg);
            }
            else
            {
                msg = alunoDAO.atualizarAluno(aluno);
                
                if(msg.equals("1"))
                {
                    msg = "ALTERAÇÃO EFETUADA COM SUCESSO!";
                }
                JOptionPane.showMessageDialog(rootPane, msg);
            }
            
            this.limparCampos();
            this.preencherTabela();
        }    
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tabelaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlunosMouseClicked
        btnExcluir.setEnabled(true);
        txtMatricula.setText(tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 0).toString());
        txtNome.setText(tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 1).toString());
        
        if(tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(), 2).toString().equals("M"))
        {
            btnMasculino.setSelected(true);
        }
        else
        {
            btnFeminino.setSelected(true);
        }
        txtEmail.setText(tabelaAlunos.getValueAt(tabelaAlunos.getSelectedRow(),3).toString());        
    }//GEN-LAST:event_tabelaAlunosMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "DESEJA EXCLUIR O REGISTRO?");
        
        if(resposta == 0)
        {
            String matricula = txtMatricula.getText();
            String msg = alunoDAO.excluirAluno(matricula);
            
            if(msg.equals("1"))
            {
                msg = "EXCLUSÃO EFETUADA COM SUCESSO!";
            }
            JOptionPane.showMessageDialog(rootPane, msg);
            this.limparCampos();
            this.preencherTabela();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JRadioButton btnFeminino;
    private javax.swing.JRadioButton btnMasculino;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnNovo1;
    private javax.swing.ButtonGroup btnSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAlunos;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
