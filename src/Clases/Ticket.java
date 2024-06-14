package Clases;

public class Ticket {
    int numeroTickets=1;
    String RutaElegida;
    double precioPasaje;

    public String getRutaElegida() {
        return RutaElegida;
    }

    public void setRutaElegida(String rutaElegida) {
        RutaElegida = rutaElegida;
    }

    public int getNumeroTickets() {
        return numeroTickets;
    }

    public void setNumeroTickets(int numeroTickets) {
        this.numeroTickets = numeroTickets;
    }

    public double getPrecioPasaje() {
        return precioPasaje;
    }

    public void setPrecioPasaje(double precioPasaje) {
        this.precioPasaje = precioPasaje;
    }
    public Ticket(){

    }

    public Ticket(int numeroTickets, String RutaElegida, double precioPasaje){
        this.numeroTickets=numeroTickets;
        this.RutaElegida=RutaElegida;
        this.precioPasaje=precioPasaje;
    }
    public void InformacionTickets(){
        System.out.println("***************************************");
        System.out.println("Informacion tickets");
        System.out.println("***************************************");
        System.out.println("Numero de Tickets: "+numeroTickets);
        System.out.println("Ruta elegida: "+RutaElegida);
        System.out.println("precio Pasaje: "+precioPasaje);

    }

}



class Normal extends Ticket{
    String SelccionAsientos;
    int numerodeMaletaspermitido;
    double maletaadicional;
    double total;

    public int getNumerodeMaletaspermitido() {
        return numerodeMaletaspermitido;
    }

    public void setNumerodeMaletaspermitido(int numerodeMaletaspermitido) {
        this.numerodeMaletaspermitido = numerodeMaletaspermitido;
    }

    public String getSelccionAsientos() {
        return SelccionAsientos;
    }

    public void setSelccionAsientos(String selccionAsientos) {
        SelccionAsientos = selccionAsientos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getMaletaadicional() {
        return maletaadicional;
    }

    public void setMaletaadicional(double maletaadicional) {
        this.maletaadicional = maletaadicional;
    }
    public Normal(){

    }

    public Normal(int numeroTickets, String RutaElegida, double precioPasaje,
                  String SelccionAsientos, int numerodeMaletaspermitido,
                  double maletaadicional){
        super(numeroTickets,RutaElegida,precioPasaje);
        this.SelccionAsientos=SelccionAsientos;
        this.numerodeMaletaspermitido=numerodeMaletaspermitido;
        this.maletaadicional=maletaadicional;
    }
    public void NoMaletaAdicional(){
        System.out.println("Asiento: "+SelccionAsientos);
        System.out.println("Numero de maletas totales (solo puede tener 1): "+numerodeMaletaspermitido);
        System.out.println("Maletas adicionales: "+maletaadicional);
        if (maletaadicional>1){
            System.out.println("Tiene un costo adicional por maleta");
            System.out.println("El costo es de 1 dolar mas por maleta");
            setTotal(getMaletaadicional()*1);
            System.out.println("El precio adicional a sido de : "+getTotal());
            double precioF=(getTotal()+getPrecioPasaje()*(getNumeroTickets()));
            System.out.println("Precio total: "+precioF);
        }
        else{
            System.out.println("Sin costo adicional");
            double precioF=(getTotal()+getPrecioPasaje()*(getNumeroTickets()));
            System.out.println("Precio total: "+precioF);
        }
    }

}



class VIP extends Ticket{
    String ServicioAdicional;
    int numerodeMaletaspermitido;
    double maletadicional2;
    double total2;

    public int getNumerodeMaletaspermitido() {
        return numerodeMaletaspermitido;
    }

    public void setNumerodeMaletaspermitido(int numerodeMaletaspermitido) {
        this.numerodeMaletaspermitido = numerodeMaletaspermitido;
    }

    public String getServicioAdicional() {
        return ServicioAdicional;
    }

    public void setServicioAdicional(String servicioAdicional) {
        ServicioAdicional = servicioAdicional;
    }

    public double getTotal2() {
        return total2;
    }

    public void setTotal2(double total2) {
        this.total2 = total2;
    }

    public double getMaletadicional2() {
        return maletadicional2;
    }

    public void setMaletadicional2(double maletadicional2) {
        this.maletadicional2 = maletadicional2;
    }
    public VIP(){

    }

    public VIP(int numeroTickets, String RutaElegida, double precioPasaje,
               String ServicioAdiciona, int numerodeMaletaspermitido, double maletadicional2){
        super(numeroTickets,RutaElegida,precioPasaje);
        this.ServicioAdicional=ServicioAdiciona;
        this.numerodeMaletaspermitido=numerodeMaletaspermitido;
        this.maletadicional2=maletadicional2;
    }

    public void NoMaletaAdicional(){
        System.out.println("Servicio adicional: "+ServicioAdicional);
        System.out.println("Numero de maletas totales (solo puede tener 1): "+numerodeMaletaspermitido);
        System.out.println("Maletas adicionales: "+maletadicional2);
        if (maletadicional2>=1){
            System.out.println("Tiene un costo adicional por maleta");
            System.out.println("El costo es de 1 dolar mas por maleta");
            setTotal2(getMaletadicional2()*1);
            double precioF=(getTotal2()+getPrecioPasaje()*(getNumeroTickets()));
            System.out.println("Precio total: "+precioF);
            System.out.println("El precio adicional a sido de : "+getTotal2());
        }
        else{
            System.out.println("Sin costo adicional");
            double precioF=(getTotal2()+getPrecioPasaje()*(getNumeroTickets()));
            System.out.println("Precio total: "+precioF);
        }
    }

}



class Pasajero extends Ticket{
    String Nombre;
    String Apellido;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Pasajero(){

    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Pasajero(int numeroTickets, String RutaElegida, double precioPasaje, String Nombre,
                    String Apellido){
        super(numeroTickets, RutaElegida, precioPasaje);
        this.Nombre=Nombre;
        this.Apellido=Apellido;
    }
    public void MostrarInfoPasajero(){
        System.out.println("***************************************");
        System.out.println("Informacion pasajero ");
        System.out.println("***************************************");
        System.out.println("Nombre: "+Nombre);
        System.out.println("Apellido: "+Apellido);



    }
}



