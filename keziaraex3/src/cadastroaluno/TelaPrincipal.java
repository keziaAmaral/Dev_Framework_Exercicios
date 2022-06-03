package cadastroaluno;

import javax.swing.JOptionPane;


public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuCadasto = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CADASTRO DE ALUNOS");

        menuArquivo.setText("ARQUIVO");

        menuCadasto.setText("CADASTRO");
        menuCadasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastoActionPerformed(evt);
            }
        });
        menuArquivo.add(menuCadasto);

        menuSair.setText("SAIR");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSair);

        jMenuBar1.add(menuArquivo);

        menuSobre.setText("SOBRE");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuSobre);

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

    private void menuCadastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastoActionPerformed
        TelaCadastro tela = new TelaCadastro();
        tela.show();
    }//GEN-LAST:event_menuCadastoActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        JOptionPane.showMessageDialog(rootPane, "SISTEMA DE CADASTRO DE ALUNOS\nDESENVOLVIDO POR KEZIA AMARAL");
    }//GEN-LAST:event_menuSobreActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuCadasto;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuSobre;
    // End of variables declaration//GEN-END:variables
}
