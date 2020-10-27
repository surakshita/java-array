public class Age
{
public static String ageDefinition(int age)
{
System.out.println("invoking age:");

if(age>=0 && age<=4)

{
System.out.println("return value:"+age);
return "kid";
}
if(age>=5 && age<=12)
{
System.out.println("return value:"+age);
return "child";
}
if(age>=13 && age<=19)
{
System.out.println("return value:"+age);
return "teen";
}
if(age>=20 && age<=59)
{
System.out.println("return value:"+age);
return "adult";
}
if(age>=60)
{
System.out.println("return value:"+age);
return "old";
}
return "age";
}
}