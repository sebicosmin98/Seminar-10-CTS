public class TransferBancar extends OperatiuniBancare {

    private double suma;
    private ContBancar contDestinatie;

    public TransferBancar(ContBancar cont, double suma, ContBancar contDestinatie) {

        super(cont);
        this.suma = suma;
        this.contDestinatie = contDestinatie;
    }

    @Override
    public void efectuareOperatiune() {

        System.out.println(cont + "suma" + suma + contDestinatie);


    }
}
