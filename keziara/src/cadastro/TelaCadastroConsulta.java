package cadastro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaCadastroConsulta extends javax.swing.JFrame {

    ConsultaDAO consultaDAO = new ConsultaDAO();
    
    PacienteDAO pacienteDAO = new PacienteDAO();
    MedicoDAO medicoDAO = new MedicoDAO();
    
    ArrayList<Medico> medicoList = medicoDAO.listarMedico();
    ArrayList<Paciente> pacienteList = pacienteDAO.listarPacientes();

    
    public TelaCadastroConsulta() 
    {                
        initComponents();
        
        jComboBoxPaciente.removeAllItems();
        jComboBoxMedico.removeAllItems();
        
        for (Paciente p : pacienteList)
            jComboBoxPaciente.addItem(p.toString());
        
        for (Medico m : medicoList)
            jComboBoxMedico.addItem(m.toString());        
    }
    
    public void limparCampos()
    {   
        txtConvenio.setText("");
        jComboBoxPaciente.setSelectedItem(null);
        jComboBoxMedico.setSelectedItem(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtConvenio = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxMedico = new javax.swing.JComboBox<>();
        jComboBoxPaciente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE ALUNOS");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CONVÊNIO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cadastro de Consulta:");

        txtConvenio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("MÉDICO:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("PACIENTE:");

        jComboBoxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxPacienteMouseClicked(evt);
            }
        });
        jComboBoxPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(290, 290, 290))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnSair)
                        .addGap(111, 111, 111))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSair, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnSair)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(btnSalvar)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(679, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtConvenio.getText().trim().isEmpty() || jComboBoxPaciente.getSelectedItem() == null || jComboBoxMedico.getSelectedItem() == null)
        {
            JOptionPane.showMessageDialog(rootPane, "PREENCHA TODOS OS CAMPOS!");
        }
        else
        {
            Consulta consulta = new Consulta();
            
            consulta.setConvenio(txtConvenio.getText().trim());
            
            for (Paciente p : pacienteList)
            {    
                if(p.getNome() == jComboBoxPaciente.getSelectedItem().toString()){
                    consulta.setId_paciente(p.getIdpaciente());                    
                }
            }     
            
            for (Medico m : medicoList)
            {    
                if(m.getNome() == jComboBoxMedico.getSelectedItem().toString()){
                    consulta.setId_medico(m.getIdmedico());                    
                }
            }
                       
            String msg = consultaDAO.cadastrarConsulta(consulta);

            if(msg.equals("1"))
            {
                msg = "CADASTRO EFETUADO COM SUCESSO!";
            }

            JOptionPane.showMessageDialog(rootPane, msg);
                
            this.limparCampos();
        }    
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        setVisible(false); 
        dispose(); 
    }//GEN-LAST:event_btnSairActionPerformed

    private void jComboBoxPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPacienteActionPerformed

    private void jComboBoxPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxPacienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPacienteMouseClicked
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup btnSexo;
    private javax.swing.JComboBox<String> jComboBoxMedico;
    private javax.swing.JComboBox<String> jComboBoxPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtConvenio;
    // End of variables declaration//GEN-END:variables
}
