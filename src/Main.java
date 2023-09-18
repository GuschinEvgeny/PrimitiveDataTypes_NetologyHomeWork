// import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Введите стоимость авиабилета: ");
        //Scanner price = new Scanner(System.in);
        //System.out.println("В этой строке: ");
        //int ticket_price = price.nextInt();
        int ticketPrice = 13676 ;
        byte bonusMile = 20;
        System.out.println("Стоимость вашего перелета " + ticketPrice);
        System.out.println("Количество ваших бонусных миль за текущий перелет");
        System.out.println( "составляет " + ticketPrice /  bonusMile );
    }
}