import figures.Fourangles.FourAnglik;
import figures.Fourangles.Sqaure;

public class Main {
    public static void main(String[] args) {
        /*FourAnglik fa = new FourAnglik();
        fa.setName("Четырехугольник");
        System.out.println(fa.getName());*/

        Sqaure s = new Sqaure();
        s.setSumCorners(360);
        s.sayAbout();
        System.out.println(s.getAnglesAmount());


    }
}