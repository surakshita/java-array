public class Report
{
public static void main(String[] args)
{
System.out.println("main:");
String result=marks(72);
System.out.println("result:"+ result);
}
public static String marks(double percentage)
{
System.out.println("invoking marks:");
if(percentage<=35)
{
System.out.println("result:"+ percentage);
return "fail";
}
if(percentage>=35 && percentage<=44)
{
System.out.println("result:"+ percentage);
return "passed";
}
if(percentage>=45 && percentage<=60)
{
System.out.println("result:"+ percentage);
return "second class";
}
if(percentage>=61 && percentage<=84)
{
System.out.println("result:"+ percentage);
return "first class";
}
if(percentage>=86 && percentage<=100)
{
System.out.println("result:"+ percentage);
return "destination";
}
return "percentage";
}
}