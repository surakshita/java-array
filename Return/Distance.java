public class Distance
{
public static String finder(int disInKms)
{
System.out.println("invoked main:");
int place= disInKms;
int rangeValue=40;
if(place<rangeValue)
{
System.out.println("rangeValue:"+ rangeValue);
return "out of range";
}
if(place>50 && place<80)
{
System.out.println("place between range 50 to 80:");
return "Hubli";
}
if(place>80 && place<120)
{
System.out.println("place between range 80 to 120:");
return "Dharwad";
}
return "not found"; 
}
public static String finder(int startDistance,int endDistance)
{
System.out.println("invoking int and int");
System.out.println("startDistance"+ startDistance);
System.out.println("endDistance"+ endDistance);

int start= startDistance;
int end= endDistance;
int minimum=40;
if(start<=minimum && end<=minimum)
{
System.out.println("if statement:"+minimum);
return "not in range";
}
if(start<=minimum || end<=minimum)
{
System.out.println("if statement:"+minimum);
return "Gulbarga";
}

return "place not found";
}
}
