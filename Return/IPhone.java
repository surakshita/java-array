public class IPhone
{
public static boolean call()
{
System.out.println("invoking call method:");
boolean connect=true;
return connect;
}
public static String message()
{
System.out.println("invoking message:");
String text="DONE WITH TASK";
return text;
}
public static double charging(double percent)
{
System.out.println("invoking charging:");
System.out.println("charge percentage:"+percent);

if(percent>50)
{
System.out.println("percent is greater than 50%");
return 100;
}
if(percent<50 && percent>0)
{
System.out.println("percent is less than 50%");
return 0;
}


return -1;
}
}