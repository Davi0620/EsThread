import java.util.Random;

public class Pilota {
    
    String nome;

    int skillRett;
    int skillCurva;

    int tminRett;
    int tmaxRett;



    int tminCurva;
    int tmaxCurva;

    Random rand;


    public Pilota(String nome, int skillRett, int skillCurva) {

        this.nome = nome;
        this.skillRett = skillRett;
        this.skillCurva = skillCurva;
       

    }


    public int getSkillRettRandom() {

        return skillRett;
    }


    public int getSkillCurvaRandom() {
        return skillCurva;
    }


    public int setTempRett(int skillRett) {

        if (skillRett>5) {
            
            tminRett=2000/skillRett-50;
            return tminRett;
            //non ci sarebbe
        }
        else{

            tmaxRett=2000/skillRett+400;
            return tmaxRett;
            //non ci sarebbe
        }

        //return rand.nextInt(tminRett, tmaxRett);
    }


    public int setTempCurva(int skillCurva) {
        
        if (skillCurva>5) {
            
            tminCurva=2000/skillCurva-50;
            return tminCurva;
            //non ci sarebbe
        }
        else{

            tmaxCurva=2000/skillCurva+400;
            return tmaxCurva;
            //non ci sarebbe
            
        }

        //return rand.nextInt(tminCurva, tmaxCurva);
        //se faccio questa riga di codice mi da eccezione
        
    }
    
    
}
