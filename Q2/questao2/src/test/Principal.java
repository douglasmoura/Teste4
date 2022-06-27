package test;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        ICMS icms = new ICMS();
        IPI ipi = new IPI();
        COFINS cofins = new COFINS();

        System.out.print("Informe o valor: ");
        Scanner scanner = new Scanner(System.in);
        Double valor = scanner.nextDouble();
        Double valorFinal = 0.0;

        valorFinal = valor + icms.calculaImposto(valor) + ipi.calculaImposto(valor) + cofins.calculaImposto(valor);

        System.out.printf("ICMS: %.2f.\n",icms.calculaImposto(valor));
        System.out.printf("IPI: %.2f.\n",ipi.calculaImposto(valor));
        System.out.printf("COFINS: %.2f.\n",cofins.calculaImposto(valor));
        System.out.printf("Valor final: %.2f.\n",valorFinal);
        scanner.close();

    }
}
