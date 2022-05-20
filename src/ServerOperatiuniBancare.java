import java.util.ArrayList;
import java.util.List;

public class ServerOperatiuniBancare {

    private static ServerOperatiuniBancare instance = null;
    private List<OperatiuniBancare> op = new ArrayList<>();


    private ServerOperatiuniBancare(){


    }

    public static ServerOperatiuniBancare getInstance(){

        if(instance == null) {

            instance = new ServerOperatiuniBancare();

            return instance;
        }
        else{

            return instance;
        }



    }

    public void inregistreazaOperatiune(OperatiuniBancare op){

        this.op.add(op);

    }

    public void efectueazaOperatiuni(){
           for(OperatiuniBancare o : op){
                o.efectuareOperatiune();
            }
       
    }



}
