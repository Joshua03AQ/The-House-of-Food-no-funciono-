public abstract class Menu {
public double Hamburg;
public double Papa;
public double Refresc;
public double Pizzas;
public double Nughuets;
public double Enesalada;
public double Yogurth;
public double Agua;

public Menu(double H, double P, double R, double PZ, double N, double ES, double YG, double A){
    this.Hamburg = H;
    this.Papa = P;;
    this.Refresc = R;
    this.Pizzas = PZ;
    this.Nughuets = N;
    this.Enesalada = ES;
    this.Yogurth = YG;
    this.Agua = A;
}

public abstract void mostrarDetalles();
public abstract void ganancia();
public abstract void factura();
public abstract void facturacionHamburguesa(double IVA);
public abstract void facturacionPapas(double IVA);
public abstract void facturacionRefrescos(double IVA);
public abstract void facturacionPizzas(double IVA);
public abstract void facturacionNughuets(double IVA);
public abstract void facturacionEnsaladas(double IVA);
public abstract void facturacionYoghurt(double IVA);
public abstract void facturacionAgua(double IVA);
}
