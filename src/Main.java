// import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Введите стоимость авиабилета: ");
        //Scanner price = new Scanner(System.in);
        //System.out.println("В этой строке: ");
        //int ticket_price = price.nextInt();
        int ticket_price = 17958;
        byte bonus_mile = 20;
        System.out.println("Стоимость вашего перелета " + ticket_price);
        System.out.println("Количество ваших бонусных миль за текущий перелет");
        System.out.println( "составляет " + ticket_price /  bonus_mile );
    }
}