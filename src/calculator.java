import java.util.Scanner;
public class calculator {
    Scanner sc = new Scanner(System.in);
    double a,b;
    int pilih;
    void callcalc(){
        System.out.println("input a:");
        a = sc.nextDouble();
        System.out.println();
        b = sc.nextDouble();

        System.out.println("1.tambah\n2.kurang");
        pilih = sc.nextInt();
        switch (pilih){
            case 1 :
                double plus = a+b;
                System.out.println(plus);
                break;
            double min = a-b;
            case  2 :
                System.out.println(min);
                break;
        }


    }

    public static void main(String[] args) {
        calculator C = new calculator();

    }
}