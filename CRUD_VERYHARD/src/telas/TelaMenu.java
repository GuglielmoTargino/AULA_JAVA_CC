
package telas;

/**
 *
 * @author Guglielmo H T
 */
public class TelaMenu extends javax.swing.JFrame {

   //construtor da classe
    public TelaMenu(String usuario, String cargo) {
        initComponents();
        
        lblSaudacao.setText("Bem-vindo " + usuario + " (" + cargo + ")");
        
        //if(!cargo.equalsIgnoreCase("estagiario")){ // A esclamação no começo 
        //inverte o iqualsIgnoreCase.
        if(cargo.equalsIgnoreCase("estagiario")){
            mnuUsuario.setVisible(false);
            jMenuItem1.setEnabled(false);
            itmAlt.setEnabled(false);
            itmExc.setEnabled(false);
            itmCon.setEnabled(false);
            
        } else if (cargo.equalsIgnoreCase("vendedor")){
             mnuUsuario.setVisible(false);
             itmAlt.setEnabled(false);
             itmExc.setEnabled(false);
            
            
        
        }

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lblSaudacao = new javax.swing.JLabel();
        btnFuncionarioMes = new javax.swing.JButton();
        lblIcone = new javax.swing.JLabel();
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
        itmCadastroUsuario = new javax.swing.JMenuItem();
        itmExcluirUsuario = new javax.swing.JMenuItem();
        itmConsultarUsuario = new javax.swing.JMenuItem();
        itmAlterarUsuario = new javax.swing.JMenuItem();
        itmRelatorioUsuario = new javax.swing.JCheckBoxMenuItem();
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

        lblSaudacao.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(340, 150, 150, 50);

        btnFuncionarioMes.setBackground(new java.awt.Color(204, 204, 204));
        btnFuncionarioMes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFuncionarioMes.setForeground(new java.awt.Color(102, 102, 0));
        btnFuncionarioMes.setText("Funcionario mês");
        getContentPane().add(btnFuncionarioMes);
        btnFuncionarioMes.setBounds(330, 260, 150, 40);

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/luaterra.jpg"))); // NOI18N
        lblIcone.setText("icone");
        lblIcone.setMaximumSize(new java.awt.Dimension(494, 390));
        lblIcone.setMinimumSize(new java.awt.Dimension(494, 390));
        getContentPane().add(lblIcone);
        lblIcone.setBounds(0, 0, 500, 350);

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
        itmAltFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAltFunActionPerformed(evt);
            }
        });
        mnuFunc.add(itmAltFun);

        itmConFun.setText("Consultar");
        itmConFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConFunActionPerformed(evt);
            }
        });
        mnuFunc.add(itmConFun);

        itmRelFun.setText("Relatório");
        itmRelFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelFunActionPerformed(evt);
            }
        });
        mnuFunc.add(itmRelFun);

        itmExcFun.setText("Excluir");
        itmExcFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcFunActionPerformed(evt);
            }
        });
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

        itmCadastroUsuario.setText("Cadastrar");
        itmCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastroUsuarioActionPerformed(evt);
            }
        });
        mnuUsuario.add(itmCadastroUsuario);

        itmExcluirUsuario.setText("Excluir");
        itmExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirUsuarioActionPerformed(evt);
            }
        });
        mnuUsuario.add(itmExcluirUsuario);

        itmConsultarUsuario.setText("Consultar");
        itmConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuario.add(itmConsultarUsuario);

        itmAlterarUsuario.setText("Alterar");
        itmAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuario.add(itmAlterarUsuario);

        itmRelatorioUsuario.setSelected(true);
        itmRelatorioUsuario.setText("Relatório");
        itmRelatorioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioUsuarioActionPerformed(evt);
            }
        });
        mnuUsuario.add(itmRelatorioUsuario);

        jMenuBar1.add(mnuUsuario);

        mnuAjuda.setText("Ajuda");

        itmManu.setText("Manual usuário");
        mnuAjuda.add(itmManu);

        itmSobre.setText("Sobre");
        mnuAjuda.add(itmSobre);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(515, 382));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        new ControleDepartamento("cadastrar").setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itmSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmSenhaActionPerformed

    private void itmCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastroUsuarioActionPerformed
        // TODO add your handling code here:
        
        //dispose(); // Serve para fecha a tela anterior       
        
        new CadastroUsuario("cadastrar").setVisible(true);// chama a tela TelaMenu
    }//GEN-LAST:event_itmCadastroUsuarioActionPerformed

    private void itmCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadFunActionPerformed
        // TODO add your handling code here
        
        new Funcionario("cadastrar").setVisible(true);// chama a tela TelaMenu
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

    private void itmConFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConFunActionPerformed
        // TODO add your handling code here:
        
        new Funcionario("consultar").setVisible(true);// chama a tela funcionario
    }//GEN-LAST:event_itmConFunActionPerformed

    private void itmExcFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcFunActionPerformed
        // TODO add your handling code here:
        new Funcionario("excluir").setVisible(true);
    }//GEN-LAST:event_itmExcFunActionPerformed

    private void itmAltFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAltFunActionPerformed
        // TODO add your handling code here:
        new Funcionario("alterar").setVisible(true);
    }//GEN-LAST:event_itmAltFunActionPerformed

    private void itmConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarUsuarioActionPerformed
        // TODO add your handling code here:
        new CadastroUsuario("consultar").setVisible(true);
    }//GEN-LAST:event_itmConsultarUsuarioActionPerformed

    private void itmExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirUsuarioActionPerformed
        // TODO add your handling code here:
        new CadastroUsuario("excluir").setVisible(true);
    }//GEN-LAST:event_itmExcluirUsuarioActionPerformed

    private void itmAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarUsuarioActionPerformed
        // TODO add your handling code here:
        new CadastroUsuario("alterar").setVisible(true);
    }//GEN-LAST:event_itmAlterarUsuarioActionPerformed

    private void itmRelFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelFunActionPerformed
        // TODO add your handling code here:
        new RelatorioFuncionario().setVisible(true);
    }//GEN-LAST:event_itmRelFunActionPerformed

    private void itmRelatorioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioUsuarioActionPerformed
        // TODO add your handling code here:
        new RelatorioUsuario().setVisible(true);
    }//GEN-LAST:event_itmRelatorioUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFuncionarioMes;
    private javax.swing.JMenuItem itmAlt;
    private javax.swing.JMenuItem itmAltFun;
    private javax.swing.JMenuItem itmAlterarUsuario;
    private javax.swing.JMenuItem itmCadFun;
    private javax.swing.JMenuItem itmCadastroUsuario;
    private javax.swing.JMenuItem itmCargo;
    private javax.swing.JMenuItem itmCon;
    private javax.swing.JMenuItem itmConFun;
    private javax.swing.JMenuItem itmConsultarUsuario;
    private javax.swing.JMenuItem itmExc;
    private javax.swing.JMenuItem itmExcFun;
    private javax.swing.JMenuItem itmExcluirUsuario;
    private javax.swing.JMenuItem itmGer;
    private javax.swing.JMenuItem itmManu;
    private javax.swing.JMenuItem itmNome;
    private javax.swing.JMenuItem itmRelFun;
    private javax.swing.JCheckBoxMenuItem itmRelatorioUsuario;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JMenuItem itmSenha;
    private javax.swing.JMenuItem itmSobre;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuFunc;
    private javax.swing.JMenu mnuRel;
    private javax.swing.JMenu mnuUsuario;
    private javax.swing.JMenu mnudepto;
    // End of variables declaration//GEN-END:variables
}
