public class AlimentareCont extends OperatiuniBancare{

    private double suma;

    public AlimentareCont(ContBancar cont,double suma) {
        super(cont);
        this.suma += suma;
    }

    @Override
    public void efectuareOperatiune() {
        System.out.println("Contul " + cont + " a fost alimentat cu " + suma);
    }
}
