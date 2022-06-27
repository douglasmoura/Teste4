public class App {
    public static void main(String[] args) throws Exception {
       String frase = "Na minha máquina funciona";

       String[] split = frase.split(" ");

       System.out.println(split[split.length-1]);

       System.out.println(split[split.length-1].length());
       
    }
}
