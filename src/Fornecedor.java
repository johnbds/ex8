
public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;
    
    
    public Fornecedor(String n,String e,int t, double c, double d){
        super(n,e,t);
        setValorCredito(c);
        setValorDivida(d);
        
    }
    public double getValorCredito(){
        return this.valorCredito;
    }
    public void setValorCredito(double c){
        this.valorCredito = c;
    }
    public double getValorDivida(){
        return this.valorDivida;
    }
    public void setValorDivida(double d){
        this.valorDivida = d;
    }
    
    public double obterSaldo(){
        double saldo;
        saldo = getValorCredito()- getValorDivida();
        return saldo;
    }
    
}
