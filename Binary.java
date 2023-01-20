public class Binary {
    public static void main(String[] args) {
        int ar[] ={0,1,2,5,6,7,1,5};
        int peak = peakIndex(ar);
        System.out.println("index "+peak);

        if(peak==-1)
        {
            System.out.println(false);
            return;
        }
        else {
            for (int i = 1; i < peak; i++) {
                if(ar[i]<ar[i-1])      
                {
                        System.out.println(false);
                        return;}
                }
                
            }
            
            for (int i = peak + 1; i < ar.length; i++) {
                if (ar[i] > ar[i - 1]) {
                    System.out.println(false);
                    return;
                }
            }

            System.out.println(true);
            }
      

   static int peakIndex(int[] a){
        int low = 0, high = a.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if ((mid - 1) >= 0 && (mid + 1) < a.length) {
                System.out.println("mid is "+mid);
                 if(a[mid-1] < a[mid] && a[mid] >a[mid+1])
                     return mid;
                else if(a[mid-1]>a[mid])
                    high= mid - 1;
                
                else 
                    low = mid + 1;

            }
            else
            return -1;

        }

        return low;
    }
}
