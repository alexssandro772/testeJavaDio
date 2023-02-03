class TiposVariaveis {
    
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Java com Github!");
        System.out.println("Tipos de variáveis: ");
        System.out.println("Tipos primitivos: Int, float, double, long, boolean, char.");

        System.out.println("FIM");
    
    /*Conhecendo os tipos primitivos: BYTE, int, short, long, double, float, char, boolean.
    São representados na pilha de MEMÓRIA (RAM)
    
    */

    int numero = 10;

    System.out.println(numero);

    //Trabalhando com constantes FINAL
    final double VALOR_DE_PI = 3.14;
//    VALOR_DE_PI = 3.22;
    System.out.println(VALOR_DE_PI);

    byte idade = 123;
    short ano = 2021;
    int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
    long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
    float pi = 3.14F;
    double salario = 1275.33;

}
    
}