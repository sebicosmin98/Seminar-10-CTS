public class BlocareCont extends OperatiuniBancare{

    public BlocareCont(ContBancar cont) {

        super(cont);


    }

    @Override
    public void efectuareOperatiune() {

        System.out.println("Cont blocat");

    }




}
