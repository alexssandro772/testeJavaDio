package exercicio1;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    void ligar() {
        ligada = true;
        System.out.println("Status da TV: " + "Ligada");
    }
    // ligar, desligar, aumentar volume e mudade de canal de 1 em 1 e no canal específico
    public static void main(String[] args) {
        System.out.println("Bem-vindo a SmatTVs");
        SmartTv tv = new SmartTv();
        tv.ligar();
    }
    
}
