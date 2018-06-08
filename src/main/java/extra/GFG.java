package extra;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int testCases=in.nextInt();

        int i=0,j=0,arr[]=new int[28];

        for(j=0;j<28;j++)
            arr[j]=0;

        String m=null,n=null;

        char brr[]=null;
        for(i=0;i<testCases;i++)
        {
            m=in.next();
            n=in.next();

            brr=m.toCharArray();
            for(j=0;j<brr.length;j++)
                arr[(int)brr[j]-97]++;

            brr=n.toCharArray();
            for(j=0;j<brr.length;j++)
                arr[(int)brr[j]-97]--;

            for(j=0;j<28;j++)
                if(arr[j]!=0)
                    break;

            if(j==28)
                System.out.println("YES");
            else
            {
                System.out.println("NO");
                for(j=0;j<28;j++)
                    arr[j]=0;
            }


        }
    }
}