public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTv smartTV = new SmartTv();

        smartTV.diminuirVoluma();
        smartTV.diminuirVoluma();
        smartTV.diminuirVoluma();
        smartTV.aumentaVoluma();
        System.out.println("Volume Atual : " + smartTV.volume);


        System.out.println("Canal Atual : " + smartTV.canal);
        smartTV.mudarCanal(13);


        System.out.println("Tv Ligada ? " +smartTV.ligado);
        System.out.println("Canal Atual : " + smartTV.canal);
        System.out.println("Volume Atual : " + smartTV.volume);

        smartTV.ligar();

        System.out.println("Tv Ligada ? " +smartTV.ligado);

        smartTV.deligar();

        System.out.println("Tv desligada ? " +smartTV.ligado);

    }
    
}
