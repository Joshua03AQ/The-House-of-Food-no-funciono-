// Clase Funcionalidades, hereda todo de la clase abstracta Menu
public class Funcionalidades extends Menu{
// Creacion de atriubutos nuevos para la calse Funcionalidades
private double SubTotal;
private double IVA;
private double Total;
// Constructor para la clase Funcionalidades, con los atriubutos heredados de la clase abstracta Menu
public Funcionalidades(double H, double P, double R, double PZ, double N, double ES, double YG, double A){
    super(H, P, R, PZ, N, ES, YG, A); // super
}
// Sobreescritura del metodo fanancia() de la clase Menu
@Override
public void ganancia() {
    double h = this.Hamburg * 30;
    double p = this.Papa * 15;
    double r = this.Refresc * 12;
    double pz = this.Pizzas * 70;
    double n = this.Nughuets * 25;
    double es = this.Enesalada * 30;
    double yg = this.Yogurth * 15;
    double a = this.Agua * 12;
    this.SubTotal = h + p + r + pz + n + es + yg + a;
    this. IVA = SubTotal * 0.15;
    this. Total = SubTotal + IVA;
    System.out.println("Ganancias totales: "+"C$"+Total);
}
// Sobreescritura del metodo mostrarDetalles() de la clase Menu
@Override
public void mostrarDetalles() {
 System.out.println("Hamburguesa: "+this.Hamburg);
 System.out.println("Papas: "+this.Papa);
 System.out.println("Refrescos: "+this.Refresc);
 System.out.println("Pizza: "+this.Pizzas);
 System.out.println("Nughets: "+this.Nughuets);
 System.out.println("Ensaladas: "+this.Enesalada);
 System.out.println("Yoguths: "+this.Yogurth);
 System.out.println("Agua: "+this.Agua);
}
// Sobreescritura del metodo factura() de la clase Menu
@Override
public void factura() {
    double h = this.Hamburg * 30;
    double p = this.Papa * 15;
    double r = this.Refresc * 12;
    double pz = this.Pizzas * 70;
    double n = this.Nughuets * 25;
    double es = this.Enesalada * 30;
    double yg = this.Yogurth * 15;
    double a = this.Agua * 12;
this. SubTotal = h + p + r + pz + n + es + yg + a;
this. IVA = SubTotal * 0.15;
this. Total = SubTotal + IVA;
System.out.println("========================================");
System.out.println("SubTotal: "+"C$"+SubTotal);
System.out.println("Monto total a cobrar: "+"C$"+Total);
System.out.println("========================================");
}
// Sobreescritura de los metodo de facturacion de los productos de la clase Menu
@Override
public void facturacionHamburguesa(double IVA) {
    double h = this.Hamburg * 30;
    this. SubTotal = h * IVA;
    this. Total = h + SubTotal;
 System.out.println("Monto: "+"C$"+Total);
}
@Override
public void facturacionPapas(double IVA) {
    double p = this.Papa * 15;
    this. SubTotal = p * IVA;
    this. Total = p + SubTotal;
    System.out.println("Monto: "+"C$"+Total);
}
@Override
public void facturacionRefrescos(double IVA) {
    double r = this.Refresc * 12;
    this. SubTotal = r * IVA;
    this. Total = r + SubTotal;
    System.out.println("Monto: "+"C$"+Total);
}
@Override
public void facturacionPizzas(double IVA) {
    double pz = this.Pizzas * 70;
    this. SubTotal = pz * IVA;
    this. Total = pz + SubTotal;
    System.out.println("Monto: "+"C$"+Total);
}
@Override
public void facturacionNughuets(double IVA) {
    double n = this.Nughuets * 25;
    this. SubTotal = n * IVA;
    this. Total = n + SubTotal;
    System.out.println("Monto: "+"C$"+Total);
}
@Override
public void facturacionEnsaladas(double IVA) {
    double es = this.Enesalada * 30;
    this. SubTotal = es * IVA;
    this. Total = es + SubTotal;
    System.out.println("Monto: "+"C$"+Total);
}
@Override
public void facturacionYoghurt(double IVA) {
    double yg = this.Yogurth * 30;
    this. SubTotal = yg * IVA;
    this. Total = yg + SubTotal;
    System.out.println("Monto: "+"C$"+Total);
}
@Override
public void facturacionAgua(double IVA) {
    double a = this.Agua * 12;
    this. SubTotal = a * IVA;
    this. Total = a + SubTotal;
    System.out.println("Monto: "+"C$"+Total);
}
}
