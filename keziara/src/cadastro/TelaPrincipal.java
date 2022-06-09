package cadastro;
import javax.swing.JOptionPane;


public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastroConsulta = new javax.swing.JMenu();
        menuCadastoPaciente = new javax.swing.JMenuItem();
        menuCadastoMedico = new javax.swing.JMenuItem();
        menuCadastoConsulta = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CADASTRO DE CONSULTAS");

        menuCadastroConsulta.setText("ARQUIVO");

        menuCadastoPaciente.setText("CADASTRO PACIENTE");
        menuCadastoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastoPacienteActionPerformed(evt);
            }
        });
        menuCadastroConsulta.add(menuCadastoPaciente);

        menuCadastoMedico.setText("CADASTRO MÉDICO");
        menuCadastoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastoMedicoActionPerformed(evt);
            }
        });
        menuCadastroConsulta.add(menuCadastoMedico);

        menuCadastoConsulta.setText("CADASTRO CONSULTA");
        menuCadastoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastoConsultaActionPerformed(evt);
            }
        });
        menuCadastroConsulta.add(menuCadastoConsulta);

        menuSair.setText("SAIR");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuCadastroConsulta.add(menuSair);

        jMenuBar1.add(menuCadastroConsulta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastoPacienteActionPerformed
        TelaCadastroPaciente tela = new TelaCadastroPaciente();
        tela.show();
    }//GEN-LAST:event_menuCadastoPacienteActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuCadastoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastoMedicoActionPerformed
        TelaCadastroMedico tela = new TelaCadastroMedico();
        tela.show();
    }//GEN-LAST:event_menuCadastoMedicoActionPerformed

    private void menuCadastoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastoConsultaActionPerformed
        TelaCadastroConsulta tela = new TelaCadastroConsulta();
        tela.show();
    }//GEN-LAST:event_menuCadastoConsultaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCadastoConsulta;
    private javax.swing.JMenuItem menuCadastoMedico;
    private javax.swing.JMenuItem menuCadastoPaciente;
    private javax.swing.JMenu menuCadastroConsulta;
    private javax.swing.JMenuItem menuSair;
    // End of variables declaration//GEN-END:variables

 /**
 *
 * @author Kezia
 */ 
}
