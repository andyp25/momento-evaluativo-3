import java.util.Scanner;

public class EDADES {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int edades = 0;

        for (int i = 0; i<20; i++) {
            System.out.println("Ingrese las edades: ");
            edades = sc.nextInt();

            if (edades <= 60) {
                System.out.println("No esta en riesgo");
            }else{
                System.out.println("Esta en riesgo de hipertensión");
            }
        }

        }
    }

