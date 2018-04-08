import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int lastanswer = 0;
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int q = scan.nextInt();
        int qtype ;
        int x ;
        int y ;
        
        scan.close();
        
        List<List<Integer>> seqList = new ArrayList<List<Integer>>(n);
            
        for(int i = 0 ; i < n ; i++)
        {
            seqList.add(new ArrayList<Integer>());
        }
        
        for(int j = 1 ; j <= q ; j++)
        {
            qtype = scan.nextInt();
            x = scan.nextInt();
            y = scan.nextInt();
            
            int seqindex = (x^lastanswer)%n;
            List<Integer> currSeq = seqList.get(seqindex);
            
            if(qtype == 1)
            {
              currSeq.add(y);
            }
            
            if(qtype == 2)
            {
             lastanswer = (y%currSeq.size());
            }
            
            System.out.println(lastanswer);
        }
        
        
    }
}