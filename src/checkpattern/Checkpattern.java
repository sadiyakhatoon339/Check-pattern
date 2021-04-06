/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.exit;

/**
 *
 * @author DELL
 */
public class Checkpattern {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[100];
        int j,d,d1=0;
      
        for(int i=0;i<10;i++ )
        {
            a[i]=Integer.parseInt(br.readLine());
            
        }
        
        for(int i=0;i<10;i++ )
        {
        if(a[i]<10)
            System.out.println(a[i]);
        else if(a[i]%10==0)
        {
           
            j=a[i];
            while(j>0)
            {
           d=j%10;
            if(d==0)
               d1++;
            j=j/10;
            }
            double s=Math.pow(11,d1);
            int s1=(int)s;
                   System.out.println(s1);
                   d1=0;
                  
        }
        else 
                System.out.println(i);
        }
        // TODO code application logic here
    }
    
}
