public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar(); // true (ligada)
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar(); // false (desligada)
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume(); // Volume: 26
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarVolume(); // Volume: 27
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarVolume(); // Volume: 28
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume(); // Volume: 27
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume(); // Volume: 26
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.passarCanal(); // Canal: 2
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.passarCanal(); // Canal: 3
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.voltarCanal(); // Canal: 2
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(12); // Canal: 12
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
