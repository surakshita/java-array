public class Distance
{
public static void main(String[] args)
{
System.out.println("main:");
String group=finder(156);
System.out.println("group"+group);
}
public static String finder(int dis)

{
System.out.println("dis:"+ dis);
if(dis>=100)
{
System.out.println("place:");
return "Hubli";
}
if(dis>=120)
{
System.out.println("place:");
return "Bengaluru";
}
if(dis>=130)
{
return "Belgaum";
}
if(dis>=140)
{
return "Davanagere";
}
if(dis>=150)
{
return "Vijaypura";
}
if(dis>=160)
{
return "Udupi";
}
if(dis>=170)
{
return "Chikmagalur";
}
return "dis";
}
}