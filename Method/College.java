public class College
{
public static void student(String store)
{
System.out.println("arg store:"+store);
}
public static void student(String marks,String usn)
{
System.out.println("invoking student for string marks and usn:");
System.out.println("String and String");
System.out.println("first arg:"+ marks);
System.out.println("second arg:"+ usn);
}
public static void student(String marks,int usn)
{
System.out.println("invoking student string for marks and int for usn:");
System.out.println("String and int");
System.out.println("first arg:"+ marks);
System.out.println("second arg:"+ usn);
}
public static void month(int marks,String usn)
{
System.out.println("invoking student int as marks and String for usn:");
System.out.println("int and String");
System.out.println("first arg:"+ marks);
System.out.println("second arg:"+ usn);
}

}
