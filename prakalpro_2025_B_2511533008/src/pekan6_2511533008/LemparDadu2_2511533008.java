package pekan6_2511533008;
import java.util.Random;
import java.util.Scanner;

public class LemparDadu2_2511533008 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       Random rand = new Random();
       
       int dadu1, dadu2, jumlah;
       int percobaan = 0;
       String jawab;
       
       do {
           dadu1 = rand.nextInt(6) + 1;
           dadu2 = rand.nextInt(6) + 1;
           jumlah = dadu1 + dadu2;
           percobaan++;

           System.out.println(dadu1 + " + " + dadu2 + " = " + jumlah);

           if (jumlah == 7) {
               System.out.println("Tebakan Anda Benar");
               System.out.println("Anda menang setelah " + percobaan + " percobaan!");
               break;
           } else {
               System.out.println("Tebakan Anda Salah");
               System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
               jawab = scan.next();

               if (!jawab.equalsIgnoreCase("ya")) {
                   System.out.println("Permainan selesai.");
                   break;
               }
           }

       } while (true);

       scan.close();
       
    }
      
}
