/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Guglielmo H T
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        itmCad = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        itmAlt = new javax.swing.JMenuItem();
        itmCon = new javax.swing.JMenuItem();
        mnuRel = new javax.swing.JMenu();
        itmGer = new javax.swing.JMenuItem();
        itmExc = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmSair = new javax.swing.JMenuItem();
        mnuFunc = new javax.swing.JMenu();
        itmCadFun = new javax.swing.JMenuItem();
        itmAltFun = new javax.swing.JMenuItem();
        itmConFun = new javax.swing.JMenuItem();
        itmRelFun = new javax.swing.JMenuItem();
        itmExcFun = new javax.swing.JMenuItem();
        mnuUsuario = new javax.swing.JMenu();
        itmNome = new javax.swing.JMenuItem();
        itmCargo = new javax.swing.JMenuItem();
        itmSenha = new javax.swing.JMenuItem();
        itmCadastro = new javax.swing.JMenuItem();
        itmExcluir = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        itmManu = new javax.swing.JMenuItem();
        itmSobre = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu do Sistema");
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Funcionario mês");
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 290, 160, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bleachperfil3.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 0, 500, 370);

        itmCad.setText("Depto.");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Cadastar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        itmCad.add(jMenuItem1);

        itmAlt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlt.setText("Alterar");
        itmCad.add(itmAlt);

        itmCon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCon.setText("Consultar");
        itmCad.add(itmCon);

        mnuRel.setText("Relatorios");

        itmGer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmGer.setText("Geral");
        mnuRel.add(itmGer);

        itmCad.add(mnuRel);

        itmExc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExc.setText("Excluir");
        itmCad.add(itmExc);
        itmCad.add(jSeparator1);

        itmSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSair.setText("Sair");
        itmCad.add(itmSair);

        jMenuBar1.add(itmCad);

        mnuFunc.setText("Funcionário.");

        itmCadFun.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadFun.setText("Cadastrar");
        itmCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadFunActionPerformed(evt);
            }
        });
        mnuFunc.add(itmCadFun);

        itmAltFun.setText("Alterar");
        mnuFunc.add(itmAltFun);

        itmConFun.setText("Consultar");
        mnuFunc.add(itmConFun);

        itmRelFun.setText("Relatório");
        mnuFunc.add(itmRelFun);

        itmExcFun.setText("Excluir");
        mnuFunc.add(itmExcFun);

        jMenuBar1.add(mnuFunc);

        mnuUsuario.setText("Usuário");

        itmNome.setText("Nome");
        mnuUsuario.add(itmNome);

        itmCargo.setText("Cargo");
        mnuUsuario.add(itmCargo);

        itmSenha.setText("Senha");
        itmSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSenhaActionPerformed(evt);
            }
        });
        mnuUsuario.add(itmSenha);

        itmCadastro.setText("Cadastrar");
        itmCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastroActionPerformed(evt);
            }
        });
        mnuUsuario.add(itmCadastro);

        itmExcluir.setText("Excluir");
        mnuUsuario.add(itmExcluir);

        jMenuBar1.add(mnuUsuario);

        mnuAjuda.setText("Ajuda");

        itmManu.setText("Manual usuário");
        mnuAjuda.add(itmManu);

        itmSobre.setText("Sobre");
        mnuAjuda.add(itmSobre);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(514, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        new CadastroDepartamento().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itmSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmSenhaActionPerformed

    private void itmCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastroActionPerformed
        // TODO add your handling code here:
        dispose(); // fecha a tela anterior
        
        new CadastroUsuario().setVisible(true);// chama a tela TelaMenu
    }//GEN-LAST:event_itmCadastroActionPerformed

    private void itmCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadFunActionPerformed
        // TODO add your handling code here:
         dispose(); // fecha a tela anterior
        
        new Funcionario().setVisible(true);// chama a tela TelaMenu
    }//GEN-LAST:event_itmCadFunActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAlt;
    private javax.swing.JMenuItem itmAltFun;
    private javax.swing.JMenu itmCad;
    private javax.swing.JMenuItem itmCadFun;
    private javax.swing.JMenuItem itmCadastro;
    private javax.swing.JMenuItem itmCargo;
    private javax.swing.JMenuItem itmCon;
    private javax.swing.JMenuItem itmConFun;
    private javax.swing.JMenuItem itmExc;
    private javax.swing.JMenuItem itmExcFun;
    private javax.swing.JMenuItem itmExcluir;
    private javax.swing.JMenuItem itmGer;
    private javax.swing.JMenuItem itmManu;
    private javax.swing.JMenuItem itmNome;
    private javax.swing.JMenuItem itmRelFun;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JMenuItem itmSenha;
    private javax.swing.JMenuItem itmSobre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuFunc;
    private javax.swing.JMenu mnuRel;
    private javax.swing.JMenu mnuUsuario;
    // End of variables declaration//GEN-END:variables
}
