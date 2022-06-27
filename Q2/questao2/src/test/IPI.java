package test;

public class IPI implements Imposto{


    @Override
    public Double calculaImposto(Double valor) {

        if (valor < 25000) {    
            return valor * 0.05;
        }

        return valor * 0.10;

    }
   
}
