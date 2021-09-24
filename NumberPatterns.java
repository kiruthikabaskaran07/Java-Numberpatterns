public class NumberPatterns
{


public static void Pattern1()
{
int rows = 5;
for (int i = 1; i <= rows; i++)
{
int num = i;
for (int j = 1; j <= i; j++)
{
System.out.print(num +" ");
num = num+rows-j;
}
System.out.println( );
}
System.out.println("---------------------" );
}


public static void Pattern2()
{
int rows = 5;
for (int i = rows; i >= 1; --i) {
for (int j = 1; j <= i; ++j) {
System.out.print(j + " ");
}
System.out.println( );
}
System.out.println("---------------------" );

}


public static void Pattern3()
{
for (int i = 1; i <= 5; i++) {
for (int j = i; j <= 5; j++) {
System.out.print(j + " ");
}
System.out.println();
}
System.out.println("---------------------" );
}


public void Pattern4() {
for (int i = 1; i <= 5; i++) {
for (int j = 5; j >= i; j--) {
System.out.print(j + " ");
}
System.out.println();
}
System.out.println("---------------------" );
}


public static void Pattern5()  {
for (int i = 0; i<= 4; i++) {
for (int j = 5 - i; j <= 5; j++) {
System.out.print(j + " ");
}
System.out.println();
}
System.out.println("---------------------" );
}


public static void Pattern6(){
int rows = 5;
for (int i = 1; i <= rows; i++) { 
for (int j = i; j >= 1; j--)
{
System.out.print(j+" ");
}
System.out.println();
}
System.out.println("---------------------" );
}


public static void Pattern7(){
int rows = 5;
for (int i = rows; i >= 1; i--)
{
for (int j = rows; j >= i; j--)
{
System.out.print(j+" ");
}
System.out.println();
}
System.out.println("---------------------" );
}


public static void Pattern8(){
for (int i = 1; i <= 5; i++) {
for (int j = i; j <= 5; j++) {
System.out.print(i+" ");
}
System.out.println();
}
System.out.println("---------------------" );
}


public static void Pattern9()  {
for (int i = 1; i <= 4; i++) {
int t;
if (i % 2 == 0)
t = 0;
else
t = 1;
for (int j = 1; j <= i; j++) {
System.out.print(t + " ");
if (t == 1)
t = 0;
else
t = 1;
}
System.out.println();
}
System.out.println("---------------------" );
}


public static void Pattern10()  {
for (int i = 1; i <= 9; i += 2) {
for (int j = i; j <= 9; j += 2)
System.out.print(j + " ");
System.out.println();
}
System.out.println("---------------------" );
}
public static void main(String args[])
{


Sample s=new Sample();
s.Pattern1();
s.Pattern2();
s.Pattern3();
s.Pattern4();
s.Pattern5();
s.Pattern6();
s.Pattern7();
s.Pattern8();
s.Pattern9();
s.Pattern10();
}
}