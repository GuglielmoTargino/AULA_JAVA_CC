
package telas;

/**
 *
 * @author Guglielmo H T
 */
public class TelaMenu extends javax.swing.JFrame {

   
    public TelaMenu() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        btnFuncionarioMes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnudepto = new javax.swing.JMenu();
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

        btnFuncionarioMes.setBackground(new java.awt.Color(204, 204, 204));
        btnFuncionarioMes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFuncionarioMes.setForeground(new java.awt.Color(102, 102, 0));
        btnFuncionarioMes.setText("Funcionario mês");
        getContentPane().add(btnFuncionarioMes);
        btnFuncionarioMes.setBounds(320, 260, 150, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planta3.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(494, 390));
        jLabel2.setMinimumSize(new java.awt.Dimension(494, 390));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 350);

        mnudepto.setText("Depto.");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Cadastar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnudepto.add(jMenuItem1);

        itmAlt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlt.setText("Alterar");
        itmAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAltActionPerformed(evt);
            }
        });
        mnudepto.add(itmAlt);

        itmCon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCon.setText("Consultar");
        itmCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConActionPerformed(evt);
            }
        });
        mnudepto.add(itmCon);

        mnuRel.setText("Relatorios");

        itmGer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmGer.setText("Geral");
        itmGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmGerActionPerformed(evt);
            }
        });
        mnuRel.add(itmGer);

        mnudepto.add(mnuRel);

        itmExc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExc.setText("Excluir");
        itmExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcActionPerformed(evt);
            }
        });
        mnudepto.add(itmExc);
        mnudepto.add(jSeparator1);

        itmSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSair.setText("Sair");
        mnudepto.add(itmSair);

        jMenuBar1.add(mnudepto);

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

        setSize(new java.awt.Dimension(516, 383));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        new ControleDepartamento("cadastrar").setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itmSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmSenhaActionPerformed

    private void itmCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastroActionPerformed
        // TODO add your handling code here:
        
        //dispose(); // Serve para fecha a tela anterior
        
        new CadastroUsuario().setVisible(true);// chama a tela TelaMenu
    }//GEN-LAST:event_itmCadastroActionPerformed

    private void itmCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadFunActionPerformed
        // TODO add your handling code here:
         dispose(); // fecha a tela anterior
        
        new Funcionario().setVisible(true);// chama a tela TelaMenu
    }//GEN-LAST:event_itmCadFunActionPerformed

    private void itmConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConActionPerformed
        // TODO add your handling code here:
        
        new ControleDepartamento("consultar").setVisible(true);
    }//GEN-LAST:event_itmConActionPerformed

    private void itmExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcActionPerformed
        // TODO add your handling code here:
        new ControleDepartamento("exc").setVisible(true);
    }//GEN-LAST:event_itmExcActionPerformed

    private void itmAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAltActionPerformed
        // TODO add your handling code here:
        new ControleDepartamento("alterar").setVisible(true);
        
    }//GEN-LAST:event_itmAltActionPerformed

    private void itmGerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmGerActionPerformed
        // TODO add your handling code here:
        new RelatorioDepartamento().setVisible(true);
    }//GEN-LAST:event_itmGerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFuncionarioMes;
    private javax.swing.JMenuItem itmAlt;
    private javax.swing.JMenuItem itmAltFun;
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
    private javax.swing.JMenu mnudepto;
    // End of variables declaration//GEN-END:variables
}
