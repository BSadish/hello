Class ImplicitTypeConversion
{
public static void main(String[] args)
{
long l=254;
int i= (int)l;
short s= (short)i;
byte b= (byte)s;
System.out.println("long value ="+l);
System.out.println("int value ="+i);
System.out.println("short value ="+s);
}
}