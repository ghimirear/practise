class Practice
{
public static void main(String args[])
{
   String s = "bcfaed";
   String t = "cbdaef";
   char a[]=s.toCharArray();
   char b[] = t.toCharArray();
   char charA[]=new char[a.length];
   char charB[] = new char[b.length];
   int count=0;
   int nextCount =0;
   for(int i=0;i<a.length;i++){
       count=0;
       for(int j=0;j<a.length;j++)
       {
       if(a[i]>a[j])
       {
       count++;
       }
       }
       charA[count]=a[i];
   }
   
      // System.out.println(b);
      for(int k=0;k<b.length;k++)
      {
          nextCount=0;
          for(int l=0;l<a.length;l++)
          {
          if(a[k]>a[l])
          {
          nextCount++;
          }
          }
          charB[nextCount]=a[k];
      }
//       System.out.println(charB);
//    System.out.println(charA);
    String stringA = new String(charA);
   String stringB = new String(charB);
   System.out.println(stringA +" " +stringB);
   if (stringA.compareTo(stringB)==0) {
     System.out.println("ananograms");
   }
  
}
}
