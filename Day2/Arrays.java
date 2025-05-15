public class Array {
public static void main(String[] args) {
int[] marks=new int[10];

marks[0]=78;
marks[1]=90;
system.out.println("no of subjects ="+marks.length);
for(int mark : marks) {
system.out.println(mark +"	");
}
system.out.println();
float[] salaries =new float[9];


int[][] n=new int[5][4];
system.out.println("array size ="+n.length);
for(int i=0;i<n.length;i++){
//system.out.println(size of n[" +i+"]="+
//system.out.println("size of n[%d]=%d\n",i,n[i].length);
}
}
}


String[] names={"ajay","praveen","suraj"};
int[] ages={22,23,20};
for(int i=0;i<names.length;i++) {
system.out.println((i+1)+"."+names[i]+ " "+ ages[i]);
system.out.printf("%d. %-20s, %d \n",(i+1),names[i],ages[i]);
system.out.println(String.format("%d. %-20s, %d \n",(i+1),names[i],ages[i]));
float sal=4567.78945f;
system.out.println(sal);
system.out.println("%f \n", sal);
system.out.println("%.0f \n", sal);
system.out.println("%.1f \n", sal);
system.out.println("%.3f \n", sal);
system.out.println("%.7f \n", sal);

displayNaturals(10);
displayNaturals(5);
displayNaturals(20);

system.out.println("First 10 natural numbers are:");
for(int i=1;i<=10;i++);{
system.out.print(i+",");
if(i==10) {
system.out.println(i);
}
else{
system.out.println(i+",");
}
system.out.println();

method defintion to display first 10 natural numbers
for

string Handling
1.java.lang.String -immutable
2.java.lang.StringBuffer-mutable
3.java.lang.StringBuilder-mutable

String object can be created 
1.as a literal
 String name="Sanjay";
creates at string constant pool
2.using new operator
String name=new String("sanjay");
creates in heap memory
String s1="wipro";
String s2="Wipro";
