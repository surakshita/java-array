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
if(dis>=100 && dis<=110)
{
System.out.println("place:");
return "Hubli";
}
if(dis>=110 && dis<=120)
{
System.out.println("place:");
return "Bengaluru";
}
if(dis>120 && dis<=130)
{
  System.out.println("place:");
return "Belgaum";
}
if(dis>130 && dis<=140)
{
  System.out.println("place:");
return "Davanagere";
}
if(dis>140 && dis<=150)
{
  System.out.println("place:");
return "Vijaypura";
}
if(dis>150 && dis<=160)
{
  System.out.println("place:");
return "Udupi";
}
if(dis>=170 && dis<=180)
{
  System.out.println("place:");
return "Chikmagalur";
}
  if(dis>100000)
  {
    System.out.println("place:");
    return "not on earth";
  }
return "dis";
}
}
