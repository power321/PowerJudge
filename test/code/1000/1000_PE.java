import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner cin = new Scanner(new BufferedInputStream(System.in));
    int a,b;
    while(cin.hasNext())
    {
      a = cin.nextInt();
      b = cin.nextInt();
      System.out.print(a+b);
    }
  }
}