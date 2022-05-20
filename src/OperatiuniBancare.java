public abstract class OperatiuniBancare {

    protected ContBancar cont;

    public OperatiuniBancare(ContBancar cont) {


        this.cont = cont;


    }

    public abstract void efectuareOperatiune();


}

