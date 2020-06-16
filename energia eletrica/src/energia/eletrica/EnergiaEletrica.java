package energia.eletrica;

import javax.swing.JOptionPane;

public class EnergiaEletrica {

    public static void main(String[] args) {
        
        ClasseEnergia dados = new ClasseEnergia();
        
        dados.setLeituraAntiga(Double.parseDouble(JOptionPane.showInputDialog("Leitura anterior:")));
        dados.setLeituraAtual(Double.parseDouble(JOptionPane.showInputDialog("Leitura atual:"))); 
        
        dados.gasto(dados.getLeituraAntiga(),dados.getLeituraAtual());
        dados.taxate(dados.getGasto());
        dados.taxatusd(dados.getGasto());
        dados.somataxas(dados.getTe(),dados.getTusd());
        dados.icms(dados.getTotal1());
        dados.bandeira(dados.getGasto());
        dados.acrecimo(dados.getBandeira(),dados.getIcms());
        dados.taxaPagar(dados.getIcms());
        
        dados.recibo(dados.getLeituraAntiga(),dados.getLeituraAtual(),dados.getGasto(),dados.getTotal1(),dados.getBandeira(),dados.getTotal2());
        
    }
    
}
