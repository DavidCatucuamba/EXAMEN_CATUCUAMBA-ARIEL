package Clases;

//git pull origin master
// import.package.clase
public class Main {
    public static void main(String[] args) {
        //5 objetos con valores nulls
        //Objeto 1
        System.out.println("************OBJETO 1************");
        Ticket t1=new Ticket();
        t1.setPrecioPasaje(20);
        t1.setNumeroTickets(2);
        t1.setRutaElegida("QUITO-GUAYAQUIL");
        t1.InformacionTickets();
        //Objeto2
        System.out.println("************OBJETO 2************");

        Normal n1=new Normal();
        n1.setRutaElegida("QUITO - PUYO");
        n1.setPrecioPasaje(15);
        n1.setSelccionAsientos("Ventana");
        n1.setNumerodeMaletaspermitido(1);
        n1.setMaletaadicional(0);
        n1.setNumeroTickets(2);
        n1.NoMaletaAdicional();

        //Objeto3
        System.out.println("************OBJETO 3************");
        VIP v1=new VIP();
        v1.setNumeroTickets(1);
        v1.setRutaElegida("QUITO - TULCAN");
        v1.setPrecioPasaje(17.5);
        v1.setServicioAdicional("Internet");
        v1.setNumerodeMaletaspermitido(2);
        v1.setMaletadicional2(0);
        v1.NoMaletaAdicional();
        //Objeto4
        System.out.println("************OBJETO 4************");
        Pasajero p1=new Pasajero();
        p1.setNumeroTickets(2);
        p1.setRutaElegida("QUITO - RIOBAMBA");
        p1.setPrecioPasaje(17.5);
        p1.setNombre("Ariel");
        p1.setApellido("Catucuamba");
        p1.MostrarInfoPasajero();
        //Objeto5
        System.out.println("************OBJETO 4************");
        VIP v2=new VIP();
        v2.setNumeroTickets(2);
        v2.setRutaElegida("QUITO - GUAYAQUIL");
        v2.setPrecioPasaje(20);
        v2.setServicioAdicional("Internet");
        v2.setNumerodeMaletaspermitido(2);
        v2.setMaletadicional2(4);
        v2.NoMaletaAdicional();

        //Instanciar al menos 5 objetos con valores iniciales.
        System.out.println("***************************************************");
        System.out.println("***************************************************");
        System.out.println("                        DATOS                      ");
        System.out.println("                       QUEMADOS                      ");
        System.out.println("***************************************************");
        System.out.println("***************************************************");
        System.out.println("***************************************************");
        //Objeto3
        System.out.println("************OBJETO 1************");
        Ticket t2=new Ticket(2,"Quito-Guayaquil",20);
        t2.InformacionTickets();
        //Objeto2
        System.out.println("************OBJETO 2************");
        Normal n2=new Normal(2,"Quito-Puyo",15,"Pasillo",1,2);
        n2.NoMaletaAdicional();
        //Objeto3
        System.out.println("************OBJETO 3************");
        VIP v3=new VIP(2,"Quito-Tulcán",17.5,"Television",2,3);
        v3.NoMaletaAdicional();
        //Objeto4
        System.out.println("************OBJETO 4************");
        Pasajero p2=new Pasajero(2,"Quito-Riobamba",17.5,"David","Diaz");
        p2.MostrarInfoPasajero();
        //Objeto5
        System.out.println("************OBJETO 5************");
        Pasajero p5=new Pasajero(1,"Quito-Riobamba",17.5,"Jimena","Melba");
        p5.MostrarInfoPasajero();
        p5.InformacionTickets();
        //2do
        //FIN

    }
}