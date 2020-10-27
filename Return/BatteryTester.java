public class BatteryTester
{
public static void main(String[] args)
{
System.out.println("invoking from charging method:");
double percent=IPhone.charging(55);

System.out.println("percent of charging is:"+percent);
}
}