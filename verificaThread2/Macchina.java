public class Macchina extends Thread{
    

    //si può fare con un semaforo da 5

    Pilota p;
    Semaforo s;
    int num;
    int TtotalePilota;
    int TempoTotaleRett;
    int TempoTotaleCurve;

    public Macchina(int num,Pilota p, Semaforo s) {

        this.num=num;
        this.p = p;
        this.s = s;
    }



    @Override
    public void run() {
        
        while (true) {
            
        int randCurva=p.getSkillCurvaRandom();
        int randRett=p.getSkillRettRandom();

        
        int rett1=p.setTempRett(randRett);
        int curva1=p.setTempCurva(randCurva);
        
        int rett2=p.setTempRett(randRett);
        int curva2=p.setTempCurva(randCurva);

        
        int rett3=p.setTempRett(randRett);
        int curva3=p.setTempCurva(randCurva);

        
        
        int rett4=p.setTempRett(randRett);
        int curva4=p.setTempCurva(randCurva);

            //pilota salito in auto 

            System.out.println("pilota "+p.nome+" salito in auto numero "+num);

            try {
                sleep(rett1);

                System.out.println("pilota "+p.nome+" sta facendo il primo rettilineo");
                
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }


            try {
                sleep(curva1);
                
                System.out.println("pilota "+p.nome+" sta facendo la prima curva");
                
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }





            try {
                sleep(rett2);

                System.out.println("pilota "+p.nome+" sta facendo il secondo rettilineo");
                
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }


            try {
                sleep(curva2);
                
                System.out.println("pilota "+p.nome+" sta facendo la seconda curva");
                
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }




            try {
                sleep(rett3);

                System.out.println("pilota "+p.nome+" sta facendo il terzo rettilineo");
                
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }


            try {
                sleep(curva3);
                
                System.out.println("pilota "+p.nome+" sta facendo la terza curva");
                
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
                





            try {
                sleep(rett4);

                System.out.println("pilota "+p.nome+" sta facendo il quarto rettilineo");
                
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }


            try {
                sleep(curva4);
                
                System.out.println("pilota "+p.nome+" sta facendo la quarta curva");
                
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }

            System.out.println("il pilota "+p.nome+" ha finito il circuito!!");

            TempoTotaleRett=rett1+rett2+rett3+rett4;
            TempoTotaleCurve=curva1+curva2+curva3+curva4;
            TtotalePilota=TempoTotaleCurve+TempoTotaleRett;

            System.out.println("auto "+num+" liberata");
            System.out.println("il pilota "+p.nome+" ha impiegato "+TtotalePilota);

            s.V();
            }

            
        }
}
