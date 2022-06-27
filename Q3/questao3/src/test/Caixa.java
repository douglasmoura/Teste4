package test;

public class Caixa {
    
    public Double calculaValorFinal(Produto produto, Integer quantidade){

        if (produto.getType() == 1) {

            return (produto.getValue() * quantidade) * 0.90;

        }else if (produto.getType() == 2) {

            return (produto.getValue() * quantidade) * 0.80;

        }else if (produto.getType() == 3 && quantidade > 5){

            return (produto.getValue() * quantidade) * 0.90;

        }

        return produto.getValue() * quantidade;
    }
}
