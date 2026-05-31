package WEEK 1.day1;
class Solution {
    public static int removeDuplicates(int[] a) {
        int k=0;
        for(int i=1;i<a.length;i++){
            if(a[i]!=a[k]){
                k++;
                a[k]=a[i];
            }
            
         }
         return k+1;
    }  
    
}
    