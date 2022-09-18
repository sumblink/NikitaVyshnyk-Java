import java.io.IOException;
import java.util.Scanner; // подключаем сканер
class Test  {
    public static void main (String [] args) {

        System.out.print ("Угадай число: ");
        Scanner inputFigure = new Scanner (System.in);
        int i = inputFigure.nextInt ();
        if ( i>7) {
            System.out.println ("Привет");
        }
        else if (i<7) {
            System.out.println ("Пока");
        }
        else if (i==7) {
            System.out.println ("Почти");
        }
    }
}