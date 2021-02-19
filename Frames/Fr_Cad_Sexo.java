
package Frames;
import BancoDado.BD_Sexo;
import Objeto.Objeto_Sexo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class Fr_Cad_Sexo extends javax.swing.JFrame {


    private String Operacao;
    private Objeto_Sexo RegistroSexo = new Objeto_Sexo ();
    private BD_Sexo     bd_sexo      = new BD_Sexo ();
    
    
    
    
    public Fr_Cad_Sexo() {
        initComponents();
                try {
        CargaTabela ();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Sexo\n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        Operacao="";
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lb_cd_sexo = new javax.swing.JLabel();
        lb_nm_sexo = new javax.swing.JLabel();
        lb_abrev_sexo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt_limpar = new javax.swing.JButton();
        bt_incluir = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();
        tf_cd_sexo = new javax.swing.JTextField();
        tf_nm_sexo = new javax.swing.JTextField();
        tf_abrev_sexo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_sexo = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_cd_sexo.setText("Código:");

        lb_nm_sexo.setText("Nome:");

        lb_abrev_sexo.setText("Abreviatura:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Sexo");

        bt_limpar.setText("Limpar");
        bt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparActionPerformed(evt);
            }
        });

        bt_incluir.setText("Incluir");
        bt_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_incluirActionPerformed(evt);
            }
        });

        bt_excluir.setText("Excluir");
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        bt_alterar.setText("Alterar");
        bt_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarActionPerformed(evt);
            }
        });

        tf_cd_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cd_sexoActionPerformed(evt);
            }
        });

        tb_sexo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Abreviatura"
            }
        ));
        tb_sexo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_sexoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_sexo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(bt_limpar)
                        .addGap(29, 29, 29)
                        .addComponent(bt_incluir)
                        .addGap(31, 31, 31)
                        .addComponent(bt_excluir)
                        .addGap(29, 29, 29)
                        .addComponent(bt_alterar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_abrev_sexo)
                                .addGap(33, 33, 33)
                                .addComponent(tf_abrev_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_cd_sexo)
                                    .addComponent(lb_nm_sexo))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nm_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_cd_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cd_sexo)
                    .addComponent(tf_cd_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nm_sexo)
                    .addComponent(tf_nm_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_abrev_sexo)
                    .addComponent(tf_abrev_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_limpar)
                    .addComponent(bt_incluir)
                    .addComponent(bt_alterar)
                    .addComponent(bt_excluir))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>                        

    private void tb_sexoMouseClicked(java.awt.event.MouseEvent evt) {                                     
        CarregaTabela_TextFileld();
        MontaTela();
        
    }                                    

    private void bt_incluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
               if(Operacao.equals("Incluir")) {
            if(isCamposPreenchidos()) {
                
                carregaRegSexo_Inclusao ();
                
                if(isCamposValidos()) {
                    
                    try {
                        
                        if (bd_sexo.busca_abr_Sexo(RegistroSexo.getAbr_Sexo())==0) {
                    
                            if(bd_sexo.InserirSexo(RegistroSexo)) {
                                JOptionPane.showMessageDialog(null, "Sexo incluido com sucesso.","Mensagem",JOptionPane.INFORMATION_MESSAGE);                 
                            
                            } else {
                                JOptionPane.showMessageDialog(null, "Erro ao Incluir Sexo.","ERRO BD",JOptionPane.ERROR_MESSAGE);                 
                            }
                            
                            
                        } else {
                             JOptionPane.showMessageDialog(null, "Abreviatura Sexo deve ser única.","ERRO",JOptionPane.ERROR_MESSAGE);                 
                        }
                    } catch (Exception ex) {
                      JOptionPane.showMessageDialog(null, "Erro ao Incluir Sexo\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);           
                    } finally {
                        Limpar();
                        Operacao="";
                        habilitaConsulta();
                         try {
                                CargaTabela ();
                         } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Sexo\n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                         }
                        
                        
                    }
                    
                    
                    
                } else {
                  JOptionPane.showMessageDialog(null, "Preencha todos os campos Corretamente!\n Abreviatura com 3 caracteres. \n Nome com até 10 caracteres","ERRO",JOptionPane.ERROR_MESSAGE);    
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos","ERRO",JOptionPane.ERROR_MESSAGE);
                
            }    
            
        } else {
            Operacao="Incluir";
            habilitaEdicao();
        }
        
    }                                          

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
int resp = JOptionPane.showConfirmDialog(null,"Confirma Exclusão?","Mensagem Exclusão",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(resp==0) {
            
            try {
               RegistroSexo.setCd_Sexo(Integer.parseInt(tf_cd_sexo.getText().trim()));
               
               if(bd_sexo.ExcluirSexo(RegistroSexo) ) {
                  JOptionPane.showMessageDialog(null, "Sexo excluído com Sucesso","Mensagem",JOptionPane.INFORMATION_MESSAGE);            
               } else {
                  JOptionPane.showMessageDialog(null, "Erro ao Excluir Sexo","ERRO BD",JOptionPane.ERROR_MESSAGE);               
               }
               
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, "Erro ao Excluir Sexo"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);           
                        
           } finally  {
                Limpar();
                       
                habilitaConsulta();
                try {
                    CargaTabela ();
                } catch (Exception ex) {
                       JOptionPane.showMessageDialog(null, "Erro ao carregar GRID \n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            Desabilita ();
        }
        
       
        
// TODO add your handling code here:
    }                                          

    private void tf_cd_sexoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {                                           
if(Operacao.equals("Altera")) {
            if(isCamposPreenchidos()) {
                
                carregaRegSexo ();
                
                if(isCamposValidos()) {
                    
                    
                     try {
                        
                        if (bd_sexo.busca_abr_Sexo_altera(RegistroSexo)) {
                    
                            if(bd_sexo.AlterarSexo(RegistroSexo)) {
                                JOptionPane.showMessageDialog(null, "Sexo alterado com sucesso.","Mensagem",JOptionPane.INFORMATION_MESSAGE);                 
                            
                            } else {
                                JOptionPane.showMessageDialog(null, "Erro ao Alterar Sexo.","ERRO BD",JOptionPane.ERROR_MESSAGE);                 
                            }
                            
                            
                        } else {
                             JOptionPane.showMessageDialog(null, "Abreviatura Sexo deve ser única.","ERRO",JOptionPane.ERROR_MESSAGE);                 
                        }
                         
                        
                    
                    
                        
                    } catch (Exception ex) {
                      JOptionPane.showMessageDialog(null, "Erro ao Alterar Sexo\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);           
                    } finally {
                        Limpar();
                        Operacao="";
                        habilitaConsulta();
                         try {
                                CargaTabela ();
                         } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Sexo\n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                         }
                        
                        
                    }
                    
                    
                    
                } else {
                  JOptionPane.showMessageDialog(null, "Preencha todos os campos Corretamente!\n Abreviatura com 3 caracteres. \n Nome com até 10 caracteres","ERRO",JOptionPane.ERROR_MESSAGE);    
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos","ERRO",JOptionPane.ERROR_MESSAGE);
                
            }    
            
        } else {
            Operacao="Altera";

            habilitaEdicao();
        }
                
        

// TODO add your handling code here:
    }                                          

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {                                          
         tf_cd_sexo.setText(null);      
         tf_nm_sexo.setText(null);
         tf_abrev_sexo.setText(null);        

// TODO add your handling code here:
    }                                         

    
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
            java.util.logging.Logger.getLogger(Fr_Cad_Sexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_Cad_Sexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_Cad_Sexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_Cad_Sexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_Cad_Sexo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_incluir;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_abrev_sexo;
    private javax.swing.JLabel lb_cd_sexo;
    private javax.swing.JLabel lb_nm_sexo;
    private javax.swing.JTable tb_sexo;
    private javax.swing.JTextField tf_abrev_sexo;
    private javax.swing.JTextField tf_cd_sexo;
    private javax.swing.JTextField tf_nm_sexo;
    // End of variables declaration                   

private void Limpar() {
         tf_cd_sexo.setText(null);      
         tf_nm_sexo.setText(null);
         tf_abrev_sexo.setText(null);
        
    }

private void Desabilita () {  
        Limpar();
        tf_cd_sexo.setEditable(false);
        tf_nm_sexo.setEditable(false);
        tf_abrev_sexo.setEditable(false);
        
  }
    
    private  boolean isCamposPreenchidos () {
       boolean saida=false;
       
       if((!tf_nm_sexo.getText().trim().isEmpty())&&
          (!tf_abrev_sexo.getText().trim().isEmpty())) {
           saida=true;
       }

       
       return saida;
    }

    private void carregaRegSexo () {
        
        RegistroSexo.setNm_Sexo(tf_nm_sexo.getText().trim());
        RegistroSexo.setAbr_Sexo(tf_abrev_sexo.getText().trim());
        
    }

    private void carregaRegSexo_Inclusao () {
        
        
        RegistroSexo.setNm_Sexo(tf_nm_sexo.getText().trim());
        RegistroSexo.setAbr_Sexo(tf_abrev_sexo.getText().trim());
        
    }
    private void habilitaConsulta () {
        Limpar();
        tf_cd_sexo.setEditable(true);
        tf_nm_sexo.setEditable(false);
        tf_abrev_sexo.setEditable(false);
    }
    
    private void habilitaEdicao () {
        Limpar();
        tf_cd_sexo.setEditable(false);
        tf_nm_sexo.setEditable(true);
        tf_abrev_sexo.setEditable(true);
    }

    private void MontaTela() {
     
        tf_nm_sexo.setText(RegistroSexo.getNm_Sexo());        
        tf_abrev_sexo.setText(RegistroSexo.getAbr_Sexo());        
        tf_cd_sexo.setText(String.valueOf(RegistroSexo.getCd_Sexo()));
        
    }

    
    public void CargaTabela () throws Exception {
        try {
            
        
           DefaultTableModel modelo = (DefaultTableModel) tb_sexo.getModel();
           modelo.setNumRows(0);  // zera qtde de linhas tabela 
           modelo.setRowCount(0);
           
           for(Objeto_Sexo registro: bd_sexo.CarregarListaSexo()) {
               modelo.addRow( new Object [] 
                            {
                               registro.getCd_Sexo(),
                               registro.getNm_Sexo(),
                               registro.getAbr_Sexo()
                            }
                            );
           }
           
        } catch (Exception ex)   {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID sexo\n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    
     private void CarregaTabela_TextFileld() {
        
         RegistroSexo.setCd_Sexo((int) tb_sexo.getValueAt(tb_sexo.getSelectedRow(),0));
         RegistroSexo.setNm_Sexo((String) tb_sexo.getValueAt(tb_sexo.getSelectedRow(),1));
         RegistroSexo.setAbr_Sexo((String) tb_sexo.getValueAt(tb_sexo.getSelectedRow(),2));
         
    }   

     public boolean isCamposValidos(){
         boolean saida=false;
         if ((RegistroSexo.isAbr_Sexo_Valida())&&(RegistroSexo.isNm_Sexo_Valida())) {
             saida=true;
         }
         return saida;
     }


} // fim 
