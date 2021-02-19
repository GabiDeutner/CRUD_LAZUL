
package Frames;

import BancoDado.BD_Pagamento;
import Objeto.Objeto_Pagamento;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class Fr_Cad_Pagamento extends javax.swing.JFrame {

    private String Operacao;
    private Objeto_Pagamento RegistroPagamento = new Objeto_Pagamento ();
    private BD_Pagamento     bd_pagamento      = new BD_Pagamento ();
    
    public Fr_Cad_Pagamento() {
        initComponents();
        
         try {
            CargaTabela ();
            Desabilita ();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Pagamento\n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        Operacao="";
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lb_tipo = new javax.swing.JLabel();
        lb_abr = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_pagamento = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lb_codigo = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        tf_tipo = new javax.swing.JTextField();
        tf_abr = new javax.swing.JTextField();
        bt_limpar = new javax.swing.JButton();
        bt_incluir = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_tipo.setText("Tipo de Pagamento:");

        lb_abr.setText("Abreviatura:");

        tb_pagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Tipo", "Abreviatura"
            }
        ));
        tb_pagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_pagamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_pagamento);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Pagamento");

        lb_codigo.setText("Código:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt_limpar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bt_incluir)
                                                .addGap(32, 32, 32)
                                                .addComponent(bt_excluir)
                                                .addGap(8, 8, 8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lb_tipo)
                                                    .addComponent(lb_codigo, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lb_abr, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tf_abr)
                                                    .addComponent(tf_tipo)
                                                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(18, 18, 18)
                                .addComponent(bt_alterar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_codigo)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tipo)
                    .addComponent(tf_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_abr)
                    .addComponent(tf_abr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_limpar)
                    .addComponent(bt_incluir)
                    .addComponent(bt_excluir)
                    .addComponent(bt_alterar))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void tb_pagamentoMouseClicked(java.awt.event.MouseEvent evt) {                                          
           CarregaTabela_TextFileld();
           MontaTela();        

    }                                         

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {                                          
        tf_codigo.setText(null);      
        tf_tipo.setText(null);
        tf_abr.setText(null);     
        
// TODO add your handling code here:
    }                                         

    private void bt_incluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(Operacao.equals("Incluir")) {
           
           if(isCamposPreenchidos()) {
                
                carregaRegPagamento_Inclusao ();
                
                if(isCamposValidos()) {
                    
                    try {
                        
                        if (bd_pagamento.busca_abr_pagamento(RegistroPagamento.getAbr_pagamento())==0) {
                    
                            if(bd_pagamento.InserirPagamento(RegistroPagamento)) {
                                JOptionPane.showMessageDialog(null, "Pagamento incluido com sucesso.","Mensagem",JOptionPane.INFORMATION_MESSAGE);                 
                            
                            } else {
                                JOptionPane.showMessageDialog(null, "Erro ao Incluir Pagamento.","ERRO BD",JOptionPane.ERROR_MESSAGE);                 
                            }
                            
                            
                        } else {
                             JOptionPane.showMessageDialog(null, "Abreviatura Pagamento deve ser única.","ERRO",JOptionPane.ERROR_MESSAGE);                 
                        }
                         
                        
                        
                        
                    } catch (Exception ex) {
                      JOptionPane.showMessageDialog(null, "Erro ao Incluir Pagamento\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);           
                    } finally {
                        Limpar();
                        Operacao="";
                        habilitaConsulta();
                         try {
                                CargaTabela ();
                                Desabilita ();
                         } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Pagamento\n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                         }
                        
                        
                    }
                    
                    
                    
                } else {
                  JOptionPane.showMessageDialog(null, "Preencha todos os campos Corretamente!\n Abreviatura com 3 caracteres. \n Tipo com até 30 caracteres","ERRO",JOptionPane.ERROR_MESSAGE);    
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
    int cd_pagamento = 0;
        int resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Excluir", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(resp==0){
            
            try  {
                
                cd_pagamento = Integer.parseInt(tf_codigo.getText().trim());
                
                if (bd_pagamento.ExcluiPagamento(cd_pagamento)) {
                   JOptionPane.showMessageDialog(null, "Pagamento Excluído com Sucesso!","Mensagem",JOptionPane.INFORMATION_MESSAGE);           
                    
                } else {
                   JOptionPane.showMessageDialog(null, "Erro ao Excluir Pagamento \n","ERRO BD",JOptionPane.ERROR_MESSAGE);                
                }
                
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, "Erro ao Excluir Pagamento \n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);           
                        
            } finally {
                Limpar();
                
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

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        if(Operacao.equals("Altera")) {
            if(isCamposPreenchidos()) {
                
                carregaRegPagamento ();
                
                if(isCamposValidos()) {
                    
                    
                     try {
                        
                        if (bd_pagamento.busca_abr_Pagamento_altera(RegistroPagamento)) {
                    
                            if(bd_pagamento.AlterarPagamento(RegistroPagamento)) {
                                JOptionPane.showMessageDialog(null, "Pagamento alterado com sucesso.","Mensagem",JOptionPane.INFORMATION_MESSAGE);                 
                            
                            } else {
                                JOptionPane.showMessageDialog(null, "Erro ao Alterar Pagamento.","ERRO BD",JOptionPane.ERROR_MESSAGE);                 
                            }
                            
                            
                        } else {
                             JOptionPane.showMessageDialog(null, "Abreviatura Pagamento deve ser única.","ERRO",JOptionPane.ERROR_MESSAGE);                 
                        }
                         
                        
                    
                    
                        
                    } catch (Exception ex) {
                      JOptionPane.showMessageDialog(null, "Erro ao Alterar Pagamento Civil\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);           
                    } finally {
                        Limpar();
                        Operacao="";
                        habilitaConsulta();
                         try {
                                CargaTabela ();
                         } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Estado Civil\n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                         }
                        
                        
                    }
                    
                    
                    
                } else {
                  JOptionPane.showMessageDialog(null, "Preencha todos os campos Corretamente!\n Abreviatura com 3 caracteres. \n Nome com até 30 caracteres","ERRO",JOptionPane.ERROR_MESSAGE);    
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
            java.util.logging.Logger.getLogger(Fr_Cad_Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_Cad_Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_Cad_Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_Cad_Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_Cad_Pagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_incluir;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_abr;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_tipo;
    private javax.swing.JTable tb_pagamento;
    private javax.swing.JTextField tf_abr;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_tipo;
    // End of variables declaration                   

    
   private void Desabilita () {
         tf_codigo.setEditable(false);      
         tf_tipo.setEditable(false);
         tf_abr.setEditable(false);
      
  }

    private void Limpar() {
        tf_codigo.setText(null);      
        tf_tipo.setText(null);
        tf_abr.setText(null);       
    }
    
    private  boolean isCamposPreenchidos () {
        boolean saida=false;
       
            if((!tf_tipo.getText().trim().isEmpty())&&
                (!tf_abr.getText().trim().isEmpty())) {
            saida=true;
            }       
       return saida;
    }
    
    private void carregaRegPagamento () {
        
        RegistroPagamento.setTp_pagamento(tf_tipo.getText().trim());
        RegistroPagamento.setAbr_pagamento(tf_abr.getText().trim());
        
    }

    private void carregaRegPagamento_Inclusao () {
        
        
        RegistroPagamento.setTp_pagamento(tf_tipo.getText().trim());
        RegistroPagamento.setAbr_pagamento(tf_abr.getText().trim());
        
    }
    private void habilitaConsulta () {
        Limpar();
        tf_codigo.setEditable(true);
        tf_tipo.setEditable(false);
        tf_abr.setEditable(false);
    }
    
    private void habilitaEdicao () {
        Limpar();
        tf_codigo.setEditable(false);
        tf_tipo.setEditable(true);
        tf_abr.setEditable(true);
    }

    private void MontaTela() {
     
        tf_tipo.setText(RegistroPagamento.getTp_pagamento());        
        tf_abr.setText(RegistroPagamento.getAbr_pagamento());        
        tf_codigo.setText(String.valueOf(RegistroPagamento.getCd_Pagamento()));
        
    }

    
    public void CargaTabela () throws Exception {
        try {
            
        
            DefaultTableModel modelo = (DefaultTableModel) tb_pagamento.getModel();
            modelo.setNumRows(0);  
            modelo.setRowCount(0);
           
            for(Objeto_Pagamento registro: bd_pagamento.CarregarListaPagamento()) {
                modelo.addRow( new Object [] 
                            {
                               registro.getCd_Pagamento(),
                               registro.getTp_pagamento(),
                               registro.getAbr_pagamento()
                            }
                            );
           }
           
        } catch (Exception ex)   {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Pagamento\n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    
     private void CarregaTabela_TextFileld() {
        
         RegistroPagamento.setCd_Pagamento((int) tb_pagamento.getValueAt(tb_pagamento.getSelectedRow(),0));
         RegistroPagamento.setTp_pagamento((String) tb_pagamento.getValueAt(tb_pagamento.getSelectedRow(),1));
         RegistroPagamento.setAbr_pagamento((String) tb_pagamento.getValueAt(tb_pagamento.getSelectedRow(),2));
         
    }   

     public boolean isCamposValidos(){
         boolean saida=false;
         if ((RegistroPagamento.isAbr_Pagamento_Valida())&&(RegistroPagamento.isTp_Pagamento_Valida())) {
             saida=true;
         }
         return saida;
     }




}
