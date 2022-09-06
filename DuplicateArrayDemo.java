package com.example.demo;

public class DuplicateArrayDemo {
    
    public static void main(String[] args){
        int [] arr={10,20,30,10,20,30,40,50,10};
        int [] freg = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            int no = arr[i];
            int count = 1;
            for (int j = i +1; j < arr.length; j++)
            {
                if (no == arr[j]);
                count = 1;
                for (j = 1 + 1; j <arr.length; j++)
                {
                    if (no == arr[j])
                    {
                        count++;
                        freg[j] = -1;
                    }
                }
                if (freg[i] != -1)
                {
                    freg[i] = count;
                }
            }
            int countOfDuplicates=0;
            for(i = 0; i<freg.length; i++)
            {
                if(freg[i]<1)
                {
                    countOfDuplicates++;
                }
            }
            System.out.println(" Total no of Duplicates Elements: "+countOfDuplicates);
        }

    }
}
