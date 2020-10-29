public class Session
{
public static void month(String store)
{
System.out.println("arg store:"+store);
}
public static void month(String value,String period)
{
System.out.println("invoking month for string and period:");
System.out.println("String and String");
System.out.println("first arg:"+value);
System.out.println("second arg:"+period);
}
public static void month(String value,int period)
{
System.out.println("invoking month string for value and int for period:");
System.out.println("String and int");
System.out.println("first arg:"+value);
System.out.println("second arg:"+period);
}
public static void month(int value,String period)
{
System.out.println("invoking month int as string and String for period:");
System.out.println("int and String");
System.out.println("first arg:"+value);
System.out.println("second arg:"+period);
}

}