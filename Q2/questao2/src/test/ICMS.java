package test;

public class ICMS implements Imposto{

    @Override
    public Double calculaImposto(Double valor) {
        return valor * 0.30;
    }
    
}
    
