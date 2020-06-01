/*
Merge Sort - Problem Statement
Send Feedback
Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5 
*/

// import java.util.Arrays;
public class solution {

    public static void mergeSort(int[] a){
        if(a.length<=1){
            return ;
        }
        int b[] =new int[a.length/2];
        int c[] =new int[a.length-b.length];
        for(int i=0;i<a.length/2;i++){
            b[i]=a[i];
        }
        for(int i=a.length/2;i<a.length;i++){
            c[i-a.length/2]=a[i];
        }
        mergeSort(b);
        mergeSort(c);
        merge(b,c,a);

    }
    public static void merge(int s1[],int s2[] ,int d[]){
        int i=0,j=0,k=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<=s2[j]){
                d[k]= s1[i];
                i++;
                k++;
            }else{
                d[k]=s2[j];
                j++;
                k++;
            }
        }
        if(i<s1.length){
            while(i<s1.length){
                d[k] =s1[i];
                i++;
                k++;
            }
        }
        if(j<s2.length){
            while(j<s2.length){
                d[k]=s2[j];
                j++;
                k++;
            }

        }
    }
}
