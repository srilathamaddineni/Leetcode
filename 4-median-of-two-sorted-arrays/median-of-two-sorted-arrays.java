class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //Brute Force
        /*int m=nums1.length;
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
        return mergedArray[(m+n)/2];*/
        //Optimized Solution using Binary search
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>n2)
        {
            return findMedianSortedArrays(nums2,nums1);
        }
        int low=0,high=n1;
        int left=(n1+n2+1)/2;
        while(low<=high)
        {
        int l1=Integer.MIN_VALUE, l2=Integer.MIN_VALUE;
        int r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;
        int mid1=(low+high)/2;
        int mid2=left-mid1;
        if(mid1<n1) r1=nums1[mid1];
        if(mid2<n2) r2=nums2[mid2];
        if(mid1-1>=0)l1=nums1[mid1-1];
        if(mid2-1>=0)l2=nums2[mid2-1];
        if(l1<=r2 && l2<=r1)
        {
            if((n1+n2)%2==1)
            {
                return Math.max(l1,l2);
            }
            else
            {
                return (double)((Math.max(l1,l2)+Math.min(r1,r2))/2.0);
            }
        }
        else if(l1>r2)
        {
            high=mid1-1;
        }
        else
        {
            low=mid1+1;
        }

        }
        return 0;
    }
}