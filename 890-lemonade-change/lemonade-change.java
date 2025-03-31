class Solution {
    public boolean lemonadeChange(int[] bills) {
        int num_of_fives=0,num_of_tens=0,num_of_twentys=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                num_of_fives++;
            }
            else if(bills[i]==10)
            {
                num_of_tens++;
                num_of_fives--;
            }
            else
            {
                num_of_twentys++;
                if(num_of_tens>0)
                {
                    num_of_tens--;
                    num_of_fives--;
                }
                else
                {
                   num_of_fives= num_of_fives-3;
                }
            }
            if(num_of_fives<0 || num_of_tens<0 || num_of_twentys<0)
            {
                return false;
            }

        } 
        return true;
    }
}