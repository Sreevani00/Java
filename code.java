class Geeks{

    static void follPatt(String s)
    {

        //Your code here

       int n = s.length();
       int count1;   //count of x
       int count2;   //count of y
       int i = 0;
       boolean flag = true;
       while(i!=n)
       {
           count1 = 0;  
           count2 = 0;  
           while(i!=n && s.charAt(i)=='x')
           { i++;
               count2++;
           }

           if(count1 != count2)
           {
               flag = false;
               break;
           }
       }

       if(flag)
           System.out.print("1");
       else
           System.out.print("0");
       System.out.println();
   }
}