package test;

public class Principal {
    
    public static void main(String[] args) {
        
        Produto produto = new Produto("Energético",5.49,3);
        Produto produto2 = new Produto("Banana",0.99,2);
        Produto produto3 = new Produto("Arroz",20.00,1);
        Produto produto4 = new Produto("Chocolate",4.50,1);
        Produto produto5 = new Produto("Leite",3.73,3);

        Caixa caixa = new Caixa();

        System.out.printf("%.2f\n",caixa.calculaValorFinal(produto, 3));
        System.out.printf("%.2f\n",caixa.calculaValorFinal(produto2, 7));
        System.out.printf("%.2f\n",caixa.calculaValorFinal(produto3, 1));
        System.out.printf("%.2f\n",caixa.calculaValorFinal(produto4, 12));
        System.out.printf("%.2f\n",caixa.calculaValorFinal(produto5, 5));
    }
}
