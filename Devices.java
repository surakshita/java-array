public class Devices
{
public static void main(String[] args)
{
System.out.println("Types of devices");
String[] typesArray={"input type","output type","storage type","input/output type"};

typesOfDevices(typesArray);

//typesOfDevices(null);

}

public static void typesOfDevices(String[] type)
{

System.out.println("Types of Devices :"+ type);
System.out.println("To check the size of argument in second method ");

int size =type.length;
System.out.println("The length is :"+ size);

System.out.println("To find the index value we use :");
System.out.println("typesOfDevice index 0 value is :"+ type[0]);
}
}