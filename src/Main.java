public class Main {
    public static void main(String[] args) {

        ServerOperatiuniBancare server = ServerOperatiuniBancare.getInstance();

        ContBancar c1 = new ContBancar("Sebastian", "1");
        ContBancar c2 = new ContBancar("Bogdan", "2");

        OperatiuniBancare o1= new AlimentareCont(c1,600);
        OperatiuniBancare o2= new TransferBancar(c2,200,c1);

        server.inregistreazaOperatiune(o1);
        server.inregistreazaOperatiune(o2);
        server.efectueazaOperatiuni();
        server.efectueazaOperatiuni();



    }











}
