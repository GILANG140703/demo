import java.util.Scanner;
class Calculator{
    Scanner sc = new Scanner(System.in);
    double a,b;
    int pilih;
    void callCalc(){
        System.out.print("Input a: ");
        a = sc.nextDouble();
        System.out.print("Input b: ");
        b = sc.nextDouble();
        System.out.println("1.Tambah\n2.Kurang");
        pilih = sc.nextInt();
        switch (pilih){
            case 1:
                double plus = a+b;
                System.out.println(plus);
                break;
            case 2:

                double min = a-b;
                System.out.println(min);
                break;
            default:
                System.out.println("salah");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.callCalc();
    }
}