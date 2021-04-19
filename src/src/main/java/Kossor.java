import java.util.Scanner;

public class Kossor{


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        CowSay kossan = new CowSay("kossis", 100);
        CowChild lillaKossan = new CowChild("Lillis", 50, 5);

        System.out.println(kossan.getCowName()+" väger:"+kossan.getCowWeight());
        System.out.println(lillaKossan.getCowName()+ "väger "+ lillaKossan.getCowWeight() +" och är "+lillaKossan.getMonth()+ " månader");

        System.out.println("Vad säger kossan?");
        String kossaSay = scan.next();
        kossan.setWhatDoesTheCowSay(kossaSay);

        System.out.println("Vad säger kalven?");
        String kalvSay = scan.next();
        lillaKossan.setWhatDoesTheCowChildSay(kalvSay);

        System.out.println(kossan.toString());
        System.out.println(lillaKossan.toString());

    }
}
