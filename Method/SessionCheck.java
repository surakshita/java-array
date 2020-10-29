public class SessionCheck
{
public static void main(String[] args)
{
System.out.println("invoking main");
System.out.println("main method:"+args.length);

String days="nov";
Session.month(days);
Session.month(days,9);
Session.month(9,days);
Session.month(days,days);



System.out.println("exit:");
}
}