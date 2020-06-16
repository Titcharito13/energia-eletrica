package energia.eletrica;

import javax.swing.JOptionPane;

public class ClasseEnergia {
    
    private double leituraAntiga;
    private double leituraAtual;
    private double gasto;
    private double tusd;
    private double acrescimo;
    private double icms;
    private String bandeira;
    private double te;
    private double total1;
    private double total2;
   
    public double getLeituraAntiga() {
        return leituraAntiga;
    }

    public void setLeituraAntiga(double leituraAntiga) {
        this.leituraAntiga = leituraAntiga;
    }

    public double getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(double leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }

    public double getTusd() {
        return tusd;
    }

    public void setTusd(double tusd) {
        this.tusd = tusd;
    }

    public double getTe() {
        return te;
    }

    public void setTe(double te) {
        this.te = te;
    }

    public double getTotal1() {
        return total1;
    }

    public void setTotal1(double total1) {
        this.total1 = total1;
    }

    public double getTotal2() {
        return total2;
    }

    public void setTotal2(double totalBandeira) {
        this.total2 = totalBandeira;
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }  
    
    
    
    public double gasto(double leituraAntiga, double leituraAtual){    
        this.gasto = this.leituraAtual - this.leituraAntiga;
        return this.gasto;        
    }
    public double taxate(double gasto){
        this.te = this.gasto * 0.29;
        return this.te;
    }    
    public double taxatusd(double gasto){
        this.tusd = this.gasto * 0.30;
        return this.tusd;
    }
    public double somataxas(double tusd, double te){
        this.total1 = this.tusd + this.te;
        return this.total1;
    }
    public String bandeira(double gasto){
        if (this.gasto <100) {
            this.bandeira = "verde";
        }else if (this.gasto >101 && this.gasto <150) {
            this.bandeira = "amarelo";
        }else if (this.gasto>150 && this.gasto<200) {
            this.bandeira = "vermelho patamar 1";
        }else{
            this.bandeira = "vermelho patamar 2";
        }
        return this.bandeira;
    }
    public double icms(double total1){
        this.icms = this.total1 *0.25;
        this.icms = this.icms + this.total1;
        return icms;
    }
    
    public double acrecimo(String bandeira, double icms){
        if ("verde".equals(this.bandeira)) {
            this.acrescimo = 1;
        }
        if ("amarelo".equals(this.bandeira)) {
            this.acrescimo = 0.04169;
        }
        if ("vermelho patamar 1".equals(this.bandeira)) {
            this.acrescimo = 0.04169;
        }
        if ("vermelho patamar 2".equals(this.bandeira)) {
            this.acrescimo = 0.06243;
        }
        return this.acrescimo;
    }
    public double taxaPagar(double icms){
        this.total2 = this.icms * this.acrescimo;
        this.total2 = this.total2+this.icms;
        return this.total2;
    }

    void recibo(double leituraAntiga, double leituraAtual, double gasto, double total1, String bandeira, double totalBandeira) {
        JOptionPane.showMessageDialog(null,"......Recibo......"
                + "\n\nLeitura antiga: "
                + this.leituraAntiga
                + "\nLeitura atual: "
                + this.leituraAtual
                + "\nTotal gasto: "
                + this.gasto
                + "\nTotal sem bandeira: "
                + this.total1
                + "\nBandeira: "
                + this.bandeira
                + "\nTotal com bandeira "
                + this.total2);
    } 
}
