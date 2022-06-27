package test;

public class COFINS implements Imposto{

    @Override
    public Double calculaImposto(Double valor) {

        if (valor > 17000) {    
            return valor * 0.08;
        }

        return 0.0;
    }
   
   
}
