class Solution {
    public void setZeroes(int[][] matrix) {
          int n=matrix.length;
          int m=matrix[0].length;
        /*int col[]=new int[m];
          int row[]=new int[n];
          for(int i=0;i<n;i++)
          {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    col[j]=1;
                    row[i]=1;
                }
            }
          }
          for(int i=0;i<n;i++)
          {
            for(int j=0;j<m;j++)
            {
                if(col[j]==1 || row[i]==1)
                {
                    matrix[i][j]=0;
                }
            }
          }*/
          boolean first_row_has_zero=false;
          boolean first_column_has_zero=false;
          for(int i=0;i<n;i++)
          {
            if(matrix[i][0]==0)
            {
                first_column_has_zero=true;
            }
          }
          for(int j=0;j<m;j++)
          {
            if(matrix[0][j]==0)
            {
                first_row_has_zero=true;
            }
          }
          for(int i=1;i<n;i++)
          {
            for(int j=1;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            } 
          }
          for(int i=1;i<n;i++)
          {
            for(int j=1;j<m;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            } 
          }
          if(first_row_has_zero)
          {
            for(int j=0;j<m;j++)
            {
                matrix[0][j]=0;
            }
          }
          if(first_column_has_zero)
          {
            for(int i=0;i<n;i++)
            {
                matrix[i][0]=0;
            }
          }
          


    }
}