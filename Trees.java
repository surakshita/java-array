public class Trees
{
public static void main(String[] args)
{
System.out.println("Starting entry point for my program");
plants("aloe vera");
plants(null);
String plantType="cactus";
plants(plantType);
}

public static void plants(String names)
{
System.out.println("Name of the plant :"+names);
}
}
