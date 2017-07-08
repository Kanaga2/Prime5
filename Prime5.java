# Prime5
 import java.io.*;
import java.util.*;
public class Prime65
{
  public static void main(String args[])
  {
    int n1,n2,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    System.out.println("Enter the starting limit");
    n1=sc.nextInt();
    System.out.println("Enter the ending limit");
    n2=sc.nextInt();
    int a[]=new int[n];
    int i=0,j=0,c=0;
    for(i=n1;i<=n2;i++)
    {
      for(j=n1;j<i;j++)
      {
        if(i%j==0)
        {
          
          break;
        }
        }
        if(i==j)
        {
          a[c]=i;
          c++;
        }
        }
          for(i=0;i<a.length;i++){
            int c1=0;
            for(j=i;j<a.length;j++){
              c1++;
              sum=sum+a[j];
              if(sum==n){
                System.out.println(""+c1);
                break;
              }
              
            }
          }
        }
        }
      
