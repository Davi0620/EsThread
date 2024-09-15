import java.util.Random;

public class App {

    public static void main(String[] args) {
        
        Pilota vettPilota[]=new Pilota[15];
        Macchina vetMacchina[]=new Macchina[5];//dichiaro
        Semaforo sem1=new Semaforo(5);
        Random rand=new Random();



        for (int i = 0; i < vettPilota.length; i++) {
            
            vettPilota[i]=new Pilota(""+i,rand.nextInt(1, 10),rand.nextInt(1, 10));
        }

        //inizializzo

        for (int i = 0; i < vetMacchina.length; i++) {
            
            vetMacchina[i]=new Macchina(i, vettPilota[i], sem1);
            //la macchina non deve avere un pilota
        }



        for (int i = 0; i < vetMacchina.length; i++) {
            
            vetMacchina[i].start();
        }


        for (int i = 0; i < vetMacchina.length; i++) {
            
            try {
                vetMacchina[i].join();
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }








    }
}