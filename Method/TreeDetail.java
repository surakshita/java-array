public class TreeDetail
{
public static void main(String[] args)
{
System.out.println("invoking main");
System.out.println("main method:"+args.length);

String grown="jan";
Session.month(grown);
Session.month(grown,9);
Session.month(9, grown);
Session.month(grown, grown);



System.out.println("exit:");
}
}
