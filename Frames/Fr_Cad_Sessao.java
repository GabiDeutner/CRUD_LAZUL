package Frames;

import Objeto.Objeto_Paciente;
import Objeto.Objeto_Psicologo;
import Objeto.Objeto_Pagamento;
import Objeto.Objeto_Sessao;

import BancoDado.BD_Paciente;
import BancoDado.BD_Psicologo;
import BancoDado.BD_Pagamento;
import BancoDado.BD_Sessao;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fr_Cad_Sessao extends javax.swing.JFrame {

    private BD_Sessao bd_sessao     = new BD_Sessao ();
    private ArrayList<Objeto_Sessao> ListaSessao = new ArrayList();
    private Objeto_Sessao RegistroSessao   = new Objeto_Sessao ();
    
    private BD_Psicologo        bd_psicologo            = new BD_Psicologo();
    private ArrayList<Objeto_Psicologo> ListaPsicologo = new ArrayList();
    
    private BD_Paciente  bd_paciente     = new BD_Paciente ();
    private ArrayList<Objeto_Paciente> ListaPaciente = new ArrayList();
    
    private BD_Pagamento  bd_pagamento     = new BD_Pagamento ();
    private ArrayList<Objeto_Pagamento> ListaPagamento = new ArrayList();
    
    private String Operacao;
    
    public Fr_Cad_Sessao() {
        initComponents();
        
        try {
            CargaTabela ();
            CargaListaPsicologo();
            CargaListaPaciente();
            CargaListaPagamento();
            CargaComboBoxPsicologo();
            CargaComboBoxPaciente ();
            CargaComboBoxPagamento();
            Desabilita ();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        Operacao="";
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lb_codigo = new javax.swing.JLabel();
        lb_dtsessao = new javax.swing.JLabel();
        lb_inicio = new javax.swing.JLabel();
        lb_termino = new javax.swing.JLabel();
        lb_nm_psicologo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_sessao = new javax.swing.JTable();
        lb_nm_paciente = new javax.swing.JLabel();
        bt_limpar = new javax.swing.JButton();
        bt_incluir = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();
        tf_codigo = new javax.swing.JTextField();
        tf_data = new javax.swing.JTextField();
        tf_inicio = new javax.swing.JTextField();
        tf_termino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_vlr_sessao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cb_tp_pagamento = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cb_nm_psicologo = new javax.swing.JComboBox();
        cb_nm_paciente = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Sessão");

        lb_codigo.setText("Código:");

        lb_dtsessao.setText("Data:");

        lb_inicio.setText("Início:");

        lb_termino.setText("Término:");

        lb_nm_psicologo.setText("Nome Psicólogo:");

        tb_sessao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Data", "Início", "Término", "Nome Psicólogo", "Nome Paciente", "Valor Sessão", "Tipo Pagamento"
            }
        ));
        tb_sessao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_sessaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_sessao);

        lb_nm_paciente.setText("Nome Paciente:");

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

        jLabel2.setText("Valor Sessão:");

        jLabel3.setText("Tipo Pagamento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(bt_limpar)
                                .addGap(65, 65, 65)
                                .addComponent(bt_incluir)
                                .addGap(57, 57, 57)
                                .addComponent(bt_excluir)
                                .addGap(61, 61, 61)
                                .addComponent(bt_alterar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lb_codigo)
                                        .addComponent(lb_dtsessao, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lb_inicio, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lb_termino))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_termino, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_inicio)
                                        .addComponent(tf_data)
                                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(cb_tp_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(31, 31, 31)
                                                .addComponent(tf_vlr_sessao))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lb_nm_psicologo)
                                                    .addComponent(lb_nm_paciente))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cb_nm_paciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cb_nm_psicologo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nm_paciente)
                            .addComponent(cb_nm_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nm_psicologo)
                            .addComponent(cb_nm_psicologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_vlr_sessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_tp_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_codigo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_dtsessao))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_inicio))))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_termino)
                            .addComponent(tf_termino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_limpar)
                    .addComponent(bt_incluir)
                    .addComponent(bt_excluir)
                    .addComponent(bt_alterar))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {                                          
        tf_codigo.setText(null);      
        tf_data.setText(null);
        tf_inicio.setText(null);
        tf_termino.setText(null);
        cb_nm_psicologo.setSelectedIndex(-1);
        cb_nm_paciente.setSelectedIndex(-1);
        tf_vlr_sessao.setText(null);
        cb_tp_pagamento.setSelectedIndex(-1); 
// TODO add your handling code here:
    }                                         

    private void bt_incluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
     
        int cd_paciente=0;
        int cd_Psicologo=0;
        int cd_pagamento = 0;
        
        if(Operacao.equals("Incluir")) 
        {
        
            if(isCamposPreenchidos ()) 
            {

                carregaRegSessao_Inclusao ();
                
                if(isCamposValidos()) {
                
                    try {
                        cd_Psicologo=bd_psicologo.busca_nm_Psicologo(cb_nm_psicologo.getSelectedItem().toString());
                        RegistroSessao.setCd_SessaoPsicologo(cd_Psicologo);
                        cd_paciente = bd_paciente.busca_nm_paciente(cb_nm_paciente.getSelectedItem().toString());
                        RegistroSessao.setCd_SessaoPaciente(cd_paciente);
                        cd_pagamento = bd_pagamento.busca_abr_pagamento(cb_tp_pagamento.getSelectedItem().toString());
                        RegistroSessao.setCd_SessaoPagamento(cd_pagamento);
                        
                    } catch (Exception ex) {
                       JOptionPane.showMessageDialog(null,"Erro ao buscar Psicologo e Paciente\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
                    }
                    
                    try {
                    
                        if(bd_sessao.InserirSessao(RegistroSessao)) {
                            JOptionPane.showMessageDialog(null,"Sessão Incluído com Sucesso","MENSAGEM",JOptionPane.INFORMATION_MESSAGE);     
                        } else {
                            JOptionPane.showMessageDialog(null,"Erro ao incluir Sessão. Erro de Dados","ERRO BD",JOptionPane.ERROR_MESSAGE);     
                        }
                        
                    }  catch (Exception ex) {
                       JOptionPane.showMessageDialog(null,"Erro ao incluir Sessão\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
                    } finally {
                        try {
                            CargaTabela ();
                            CargaListaPaciente();
                            CargaListaPsicologo();
                            CargaListaPagamento();
                            CargaComboBoxPsicologo();
                            CargaComboBoxPaciente ();
                            CargaComboBoxPagamento();
                            Desabilita ();
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                        Operacao="";
                        
                    } // finally 
                    
                    
                } else { //  if(isCamposValidos()) {
                   JOptionPane.showMessageDialog(null, "Preencha Corretamente","ERRO",JOptionPane.ERROR_MESSAGE);
                }
                
                
            } else { // if(isCamposPreenchidos ()) {
           
               JOptionPane.showMessageDialog(null, "Preencha todos os campo!","ERRO",JOptionPane.ERROR_MESSAGE);
            }


            
        }else { // if(Operacao.equals("Incluir")) {
            Operacao="Incluir"; 
            Limpar();
            habilitaEdicao ();
        }

// TODO add your handling code here:
    }                                          

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {                                           

        int resp = JOptionPane.showConfirmDialog(null,"Confirma Exclusão?","Mensagem Exclusão",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(resp==0) {
            
            try {
               RegistroSessao.setCd_Sessao(Integer.parseInt(tf_codigo.getText().trim()));
               
               if(bd_sessao.ExcluirSessao(RegistroSessao) ) {
                  JOptionPane.showMessageDialog(null, "Sessão excluída com Sucesso","Mensagem",JOptionPane.INFORMATION_MESSAGE);            
               } else {
                  JOptionPane.showMessageDialog(null, "Erro ao Excluir Sessão","ERRO BD",JOptionPane.ERROR_MESSAGE);               
               }
               
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, "Erro ao Excluir Sessão"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);           
                        
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

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {                                           
    
           
        int cd_Psicologo=0;
        int cd_paciente=0;
        int cd_pagamento = 0;
        
        if(Operacao.equals("A")) 
        {
        
            if(isCamposPreenchidos ()) 
            {

                carregaRegSessao();
                
                if(isCamposValidos()) {
                
                    try {
                        cd_Psicologo=bd_psicologo.busca_nm_Psicologo(cb_nm_psicologo.getSelectedItem().toString());
                        RegistroSessao.setCd_SessaoPsicologo(cd_Psicologo);
                        cd_paciente = bd_paciente.busca_nm_paciente(cb_nm_paciente.getSelectedItem().toString());
                        RegistroSessao.setCd_SessaoPaciente(cd_paciente);
                        cd_pagamento = bd_pagamento.busca_abr_pagamento(cb_tp_pagamento.getSelectedItem().toString());
                        RegistroSessao.setCd_SessaoPagamento(cd_pagamento);
                        
                    } catch (Exception ex) {
                       JOptionPane.showMessageDialog(null,"Erro ao buscar Psicologo e Paciente\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
                    }
                    
                    try {
                    
                        if(bd_sessao.AlteraSessao(RegistroSessao)) {
                            JOptionPane.showMessageDialog(null,"Sessão Alterado com Sucesso","MENSAGEM",JOptionPane.INFORMATION_MESSAGE);     
                        } else {
                            JOptionPane.showMessageDialog(null,"Erro ao Alterar Sessão. Erro de Dados","ERRO BD",JOptionPane.ERROR_MESSAGE);     
                        }
                        
                    }  catch (Exception ex) {
                       JOptionPane.showMessageDialog(null,"Erro ao Alterar Sessão\n"+ex.getMessage(),"ERRO BD",JOptionPane.ERROR_MESSAGE);
                    } finally {
                        try {
                            CargaTabela ();
                            CargaListaPsicologo();
                            CargaListaPaciente();
                            CargaComboBoxPsicologo();
                            CargaComboBoxPaciente ();
                            CargaComboBoxPagamento();
                            Desabilita ();
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Erro Carga Grid\n"+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                        Operacao="";
                        
                    } // finally 
                    
                    
                } else { //  if(isCamposValidos()) {
                   JOptionPane.showMessageDialog(null, "Preencha Corretamente","ERRO",JOptionPane.ERROR_MESSAGE);
                }
                
                
            } else { // if(isCamposPreenchidos ()) {
           
               JOptionPane.showMessageDialog(null, "Preencha todos os campos!","ERRO",JOptionPane.ERROR_MESSAGE);
            }


            
        }else { // if(Operacao.equals("Incluir")) {
            Operacao="A"; 
            Limpar();
            habilitaEdicao ();
        }
// TODO add your handling code here:
    }                                          

    private void tb_sessaoMouseClicked(java.awt.event.MouseEvent evt) {                                       
       CarregaTabela_TextFileld();
        MontaTela(); 
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
            java.util.logging.Logger.getLogger(Fr_Cad_Sessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_Cad_Sessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_Cad_Sessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_Cad_Sessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_Cad_Sessao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_incluir;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JComboBox cb_nm_paciente;
    private javax.swing.JComboBox cb_nm_psicologo;
    private javax.swing.JComboBox cb_tp_pagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_dtsessao;
    private javax.swing.JLabel lb_inicio;
    private javax.swing.JLabel lb_nm_paciente;
    private javax.swing.JLabel lb_nm_psicologo;
    private javax.swing.JLabel lb_termino;
    private javax.swing.JTable tb_sessao;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_data;
    private javax.swing.JTextField tf_inicio;
    private javax.swing.JTextField tf_termino;
    private javax.swing.JTextField tf_vlr_sessao;
    // End of variables declaration                   

    private void Desabilita () {  
        Limpar();
        tf_codigo.setEditable(false);
        tf_data.setEditable(false);
        tf_inicio.setEditable(false);
        tf_termino.setEditable(false);
        cb_nm_psicologo.setEditable(false);
        cb_nm_paciente.setEditable(false); 
        tf_vlr_sessao.setEditable(false);
        cb_tp_pagamento.setEditable(false); 
  }
    
  private void habilitaConsulta () {
        Limpar();
        tf_codigo.setEditable(true);
        tf_data.setEditable(false);
        tf_inicio.setEditable(false);
        tf_termino.setEditable(false); 
        cb_nm_psicologo.setEditable(false);
        cb_nm_paciente.setEditable(false);
        tf_vlr_sessao.setEditable(false);
        cb_tp_pagamento.setEditable(false); 
    }
    
    private void habilitaEdicao () {
        Limpar();
        tf_codigo.setEditable(false);
        tf_data.setEditable(true);
        tf_inicio.setEditable(true);
        tf_termino.setEditable(true);
        cb_nm_psicologo.setEditable(true);
        cb_nm_paciente.setEditable(true);
        tf_vlr_sessao.setEditable(true);
        cb_tp_pagamento.setEditable(true); 
    }

    private void MontaTela() {
     
        tf_codigo.setText(String.valueOf(RegistroSessao.getCd_Sessao()));
        tf_data.setText(RegistroSessao.getNm_paciente());        
        tf_inicio.setText(String.valueOf(RegistroSessao.getHr_InicioSessao()));
        tf_termino.setText(String.valueOf(RegistroSessao.getHr_TerminoSessao()));
        cb_nm_psicologo.setSelectedItem(RegistroSessao.getNm_Psicologo());
        cb_nm_paciente.setSelectedItem(RegistroSessao.getNm_paciente());
        tf_vlr_sessao.setText(String.valueOf(RegistroSessao.getVlr_Sessao()));
        cb_tp_pagamento.setSelectedItem(RegistroSessao.getAbr_pagamento());
        
    }
    
    
    private void Limpar() {
        tf_codigo.setText(null);      
        tf_data.setText(null);
        tf_inicio.setText(null);
        tf_termino.setText(null);
        cb_nm_psicologo.setSelectedIndex(-1);
        cb_nm_paciente.setSelectedIndex(-1);
        tf_vlr_sessao.setText(null);
        cb_tp_pagamento.setSelectedIndex(-1); 
    }
    
    
     private void carregaRegSessao_Inclusao () {
          
        RegistroSessao.setDt_sessao(Integer.parseInt(tf_data.getText().trim()));    
        RegistroSessao.setHr_InicioSessao(Integer.parseInt(tf_inicio.getText().trim()));
        RegistroSessao.setHr_TerminoSessao(Integer.parseInt(tf_termino.getText().trim()));
        RegistroSessao.setNm_Psicologo(cb_nm_psicologo.getSelectedItem().toString());
        RegistroSessao.setNm_paciente(cb_nm_paciente.getSelectedItem().toString());
        RegistroSessao.setVlr_Sessao(tf_vlr_sessao.getText().trim());
        RegistroSessao.setAbr_pagamento(cb_tp_pagamento.getSelectedItem().toString());
        
        System.out.println(cb_nm_psicologo.getSelectedItem().toString());
        System.out.println(cb_nm_paciente.getSelectedItem().toString());
        System.out.println(cb_tp_pagamento.getSelectedItem().toString());
    } 
     
     
    private void carregaRegSessao () {
        
        RegistroSessao.setDt_sessao(Integer.parseInt(tf_data.getText().trim()));    
        RegistroSessao.setHr_InicioSessao(Integer.parseInt(tf_inicio.getText().trim()));
        RegistroSessao.setHr_TerminoSessao(Integer.parseInt(tf_termino.getText().trim()));
        RegistroSessao.setNm_Psicologo(cb_nm_psicologo.getSelectedItem().toString());
        RegistroSessao.setNm_paciente(cb_nm_paciente.getSelectedItem().toString());
        RegistroSessao.setVlr_Sessao(tf_vlr_sessao.getText().trim());
        RegistroSessao.setAbr_pagamento(cb_tp_pagamento.getSelectedItem().toString());
    }
    
   
    
    private  boolean isCamposPreenchidos () {
       boolean saida=false;
       
       if((!tf_data.getText().trim().isEmpty())&&
          (!tf_inicio.getText().trim().isEmpty())&&
          (!tf_termino.getText().trim().isEmpty())&&
          (cb_nm_psicologo.getSelectedIndex()!=-1)&&
          (cb_nm_paciente.getSelectedIndex()!=-1)&&
          (!tf_vlr_sessao.getText().trim().isEmpty())&&
          (cb_tp_pagamento.getSelectedIndex()!=-1))
       {  
           saida=true;
       }

       
       return saida;
    }
    
    public void CargaTabela () throws Exception {
        try {
            
        
           DefaultTableModel modelo = (DefaultTableModel) tb_sessao.getModel();
           modelo.setNumRows(0);  
           modelo.setRowCount(0);
           
           for(Objeto_Sessao registro: bd_sessao.CarregarListaSessao()) {
               modelo.addRow( new Object [] 
                            {
                               registro.getCd_Sessao(),
                               registro.getDt_sessao(),
                               registro.getHr_InicioSessao(),
                               registro.getHr_TerminoSessao(),
                               registro.getNm_Psicologo(),
                               registro.getNm_paciente(),
                               registro.getVlr_Sessao(),
                               registro.getAbr_pagamento(),
                            }
                            );
           }
           
        } catch (Exception ex)   {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Sessão\n"+ex.getMessage(), "ERRO GRID", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    

    

    private void CarregaTabela_TextFileld() {
        
        
        RegistroSessao.setCd_Sessao((int) tb_sessao.getValueAt(tb_sessao.getSelectedRow(),0));                 
        RegistroSessao.setDt_sessao((int) tb_sessao.getValueAt(tb_sessao.getSelectedRow(),1));  
        RegistroSessao.setHr_InicioSessao((int) tb_sessao.getValueAt(tb_sessao.getSelectedRow(),2));
        RegistroSessao.setHr_TerminoSessao((int) tb_sessao.getValueAt(tb_sessao.getSelectedRow(),3));
        RegistroSessao.setNm_Psicologo(((String) tb_sessao.getValueAt(tb_sessao.getSelectedRow(),4)));
        RegistroSessao.setNm_paciente(((String) tb_sessao.getValueAt(tb_sessao.getSelectedRow(),5))); 
        RegistroSessao.setVlr_Sessao(((String) tb_sessao.getValueAt(tb_sessao.getSelectedRow(),6)));
        RegistroSessao.setAbr_pagamento(((String) tb_sessao.getValueAt(tb_sessao.getSelectedRow(),7)));; 
    } 

   
    public boolean isCamposValidos(){
        boolean saida=false;
        
        if ((RegistroSessao.isVlr_Sessao_Valida())) {
            saida=true;
        }
        return saida;
    }
   
     
    private void CargaListaPsicologo() throws Exception {
 
      
        ListaPsicologo  = bd_psicologo.CarregarListaPsicologo ();
     
     
    }
    
    private void CargaListaPaciente() throws Exception {
 
      
        ListaPaciente  = bd_paciente.CarregarListaPaciente();
     
     
    }
    
    private void CargaListaPagamento() throws Exception {
 
      
        ListaPagamento  = bd_pagamento.CarregarListaPagamento();
     
     
    }
    
    private void CargaComboBoxPsicologo () {
 
        Iterator<Objeto_Psicologo> it = ListaPsicologo.iterator();
       
        while(it.hasNext()) {
           Objeto_Psicologo  reg = it.next();
           String nm = reg.getNm_Psicologo();
           
           cb_nm_psicologo.addItem(nm);
        }
           
        cb_nm_psicologo.setSelectedIndex(-1); 
     
    }
    
    private void CargaComboBoxPaciente () {
 
        Iterator<Objeto_Paciente> it = ListaPaciente.iterator();
       
        while(it.hasNext()) {
           Objeto_Paciente  reg = it.next();
           String nm_paciente = reg.getNm_paciente();
           
           cb_nm_paciente.addItem(nm_paciente);
        }
           
        cb_nm_paciente.setSelectedIndex(-1); 
     
    }
    
    private void CargaComboBoxPagamento () {
 
        Iterator<Objeto_Pagamento> it = ListaPagamento.iterator();
       
        while(it.hasNext()) {
           Objeto_Pagamento  reg = it.next();
           String abr_pagamento = reg.getAbr_pagamento();
           
           cb_tp_pagamento.addItem(abr_pagamento);
        }
           
        cb_tp_pagamento.setSelectedIndex(-1); 
     
    }
    
}// fim da vida, o universo e tudo mais (42)
