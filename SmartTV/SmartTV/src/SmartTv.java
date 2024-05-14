public class SmartTv {
   boolean ligado = false;
   int canal = 1;
   int volume = 30;


   
   public void mudarCanal (int novoCanal) {
    canal = novoCanal;
    System.out.println("Canal Atual : " + canal);
       
   }
   public void aumentaCanal () {
    canal ++;
    System.out.println("Canal Atual : " + canal);
       
   }

   public void diminuirCanal () {
    canal --;
    System.out.println("Canal Atual : " + canal);
       
   }


   public void aumentaVoluma () {
    volume ++;
    System.out.println("Aumento o volume para : " + volume);
       
   }

   public void diminuirVoluma () {
    volume --;
    System.out.println("Diminuindo o volume para : " + volume);
       
   }

   public void ligar () {
    ligado = true;
       
   }

   public void deligar(){
    ligado = false;
   }


}
