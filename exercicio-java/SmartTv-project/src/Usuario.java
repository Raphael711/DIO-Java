import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTv = new SmartTV();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Statuts -> Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Statuts -> Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Novo Statuts -> Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo Statuts -> Canal atual: " + smartTv.canal);

        Scanner novoCanal = new Scanner (System.in);
        System.out.println("Digite o canal desejado: ");
        int canal = novoCanal.nextInt();
        System.out.println("Novo Statuts -> Canal atual: " + canal);
        novoCanal.close();
    }
    
    
}
