
package Objeto;


public class Objeto_Pagamento {
   
    private int cd_Pagamento;
    private String abr_pagamento;

    public void setCd_Pagamento(int cd_Pagamento) {
        this.cd_Pagamento = cd_Pagamento;
    }

    public void setAbr_pagamento(String abr_pagamento) {
        this.abr_pagamento = abr_pagamento;
    }

    public void setTp_pagamento(String tp_pagamento) {
        this.tp_pagamento = tp_pagamento;
    }

    public int getCd_Pagamento() {
        return cd_Pagamento;
    }

    public String getAbr_pagamento() {
        return abr_pagamento;
    }

    public String getTp_pagamento() {
        return tp_pagamento;
    }
    private String tp_pagamento;


    public boolean isAbr_Pagamento_Valida() {
        boolean saida=false;
        if(this.abr_pagamento.length()==3) {
            saida=true;
        }
        return saida;
    }
    
    
   public boolean isTp_Pagamento_Valida() {
        boolean saida=false;
        if(this.tp_pagamento.length()<=30) {
            saida=true;
        }
        return saida;
    }
    
    
}
