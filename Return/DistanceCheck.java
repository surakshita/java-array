public class DistanceCheck
{
public static void main(String[] args)
{
System.out.println("I invoking my main:");
String indexAt0=args[0];
String indexAt1=args[1];
int startDistance=Integer.parseInt(indexAt0);
int endDistance=Integer.parseInt(indexAt1);
String dis1=Distance.finder(startDistance, endDistance);
System.out.println("dis1:"+dis1);



int distance=Integer.parseInt(indexAt0);
String dis=Distance.finder(distance);

System.out.println("dis:"+dis);

}
}