import java.util.Scanner;

public class App {
   
    public static Scanner sc = new Scanner(System.in);

    public static double SBT, IVA, TAP, p, CB;

    public static double H;
    public static double P;
    public static double R;
    public static double PZ;
    public static double N;
    public static double ES;
    public static double YG;
    public static double A;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SBT = H + P + R + PZ + N + ES + YG + A;

        IVA = SBT * 0.15;

        Menu M = new Menu(H, P, R, PZ, N, ES, YG, A, null);
    }

    public void Precios(){
        H = H * 30;
        P = P * 15;
        R = R * 12;
        PZ = PZ * 70;
        N = N * 25;
        ES = ES * 30;
        YG = YG * 15;
        A = A * 12;
    }
}
