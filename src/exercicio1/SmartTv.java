package exercicio1;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar() {
        ligada = true;
        // System.out.println("Status da TV: " + "Ligada");
    }

    public void desligar() {
        ligada = false;
    }
    // ligar, desligar, aumentar volume e mudade de canal de 1 em 1 e no canal específico

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);        
    }

    public void aumentarCanal() {
        canal++;     
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarCanal(int canalDesejado) {
        canal = canalDesejado;
    }



}
