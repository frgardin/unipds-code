package core;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public ContaEspecial(int numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    @Override
    public boolean debitar(double valor) {
        if (super.saldo + this.limite >= valor) {
            super.saldo-=valor;
            return true;
        }
        return false;
    }

}