import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Välkommen! Skriv in notans värde så beräknar jag hur mycket dricks du ska betala.");
        System.out.println("Du kan alltid välja att avsluta programmet genom att skriva siffran '0'. ");
        Scanner myScanner = new Scanner(System.in);
        int bill;

        while (true) {
            try {
                bill = myScanner.nextInt();
                int tot = bill;

                if (bill < 0) {
                    System.out.println("Notan kan inte vara negativ");
                } else if (bill > 0 && bill < 50) {
                    System.out.println("Notans värde är: " + bill);
                    System.out.println("Du skall dricksa: 0kr");
                    System.out.println("Totalt belopp blir: " + bill );
                    System.out.println("Tack så mycket och ha en bra dag!");
                    break;
                } else if (bill > 49 && bill < 301) {
                    System.out.println("Notans värde är: " + bill);
                    int dricks = ((bill * 15) / 100);
                    System.out.println("Du skall dricksa: " + dricks);
                    tot = bill + dricks;
                    System.out.println("Totalt belopp blir: " + tot );
                    System.out.println("Tack så mycket och ha en bra dag!");
                    break;
                } else if (bill > 300 && bill < 1001) {
                    System.out.println("Notans värde är: " + bill);
                    int dricks = ((bill * 20) / 100);
                    System.out.println("Du skall dricksa: " + dricks);
                    tot = bill + dricks;
                    System.out.println("Totalt belopp blir: " + tot );
                    System.out.println("Tack så mycket och ha en bra dag!");
                    break;
                } else if (bill > 1000) {
                    System.out.println("Notans värde är: " + bill);
                    int dricks = ((bill * 25) / 100);
                    System.out.println("Du skall dricksa: " + dricks);
                    tot = bill + dricks;
                    System.out.println("Totalt belopp blir: " + tot );
                    System.out.println("Tack så mycket och ha en bra dag!");
                    break;
                } else if (bill == 0){
                    System.out.println("Programmet avslutas, tack så mycket och ha en bra dag!");
                    break;
                }

            } catch (Exception e) {
                System.out.println("Felaktigt värde, ange ett tal. Du kan inte skriva några bokstäver eller ord!");
                myScanner.next();
            }
        }
    }
}