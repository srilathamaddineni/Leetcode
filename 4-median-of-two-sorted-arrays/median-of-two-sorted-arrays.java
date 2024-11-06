class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int mergedArray[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                mergedArray[k++]=nums1[i];
                i++;
            }
            else
            {
                mergedArray[k++]=nums2[j];
                j++;
            }
        }
        while(i<m)
        {
            mergedArray[k++]=nums1[i++];
        }
         while(j<n)
        {
            mergedArray[k++]=nums2[j++];
        }
        if((m+n)%2==0)
        {
            double median=(double)(mergedArray[(m+n-1)/2]+mergedArray[(m+n)/2])/2;
            return median;
        }
        return mergedArray[(m+n)/2];
    }
}