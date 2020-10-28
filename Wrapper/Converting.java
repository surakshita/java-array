public class Converting
{
public static void main(String[] args)
{
System.out.println("invoking main:");

String numbers="2";
byte convertedNumber=Byte.parseByte(numbers);
System.out.println("converted number:"+ convertedNumber);

String room="504";
short convertedRoom=Short.parseShort(room);
System.out.println("converted number:"+ convertedRoom);

String num="23500";
int convertNum=Integer.parseInt(num);
System.out.println("converted num:"+ convertNum);

String anotherNum="944994949";
long convertedAnotherNum=Long.parseLong(anotherNum);
System.out.println("converted longNum:"+ convertedAnotherNum);

String temp="36.4f";
float convertedTemp=Float.parseFloat(temp);
System.out.println("converted temp:"+ convertedTemp);

String marks="60.34d";
double convertedMarks=Double.parseDouble(marks);
System.out.println("converted marks:"+ convertedMarks);


String earthIsFlat="false";
boolean converted=Boolean.parseBoolean(earthIsFlat);
System.out.println("converted :"+ converted);

System.out.println("exit:");

}
}