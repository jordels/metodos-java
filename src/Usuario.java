public class Usuario {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
 SmartTv smartTv = new SmartTv();

 System.out.println("TV ligada?" + smartTv.ligada());
 System.out.println("Canal Atual ?" + smartTv.canal);
 System.out.println("Volume Atual ?" + smartTv.volume);

 SmartTv.desligar();

 System.out.println("Novo Status TV ligada ?" + smartTv.ligada());
 
 

    }
}
