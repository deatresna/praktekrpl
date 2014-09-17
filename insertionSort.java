void insertionsort(int arr[]) 
{ int i,j;
for (i = 1; 
i < N; i++) { int temp = arr[i];
int pos = i; 
for (j = i; j > 0; j--) 
{ if (temp < arr[j-1]) 
{ arr[j] = arr[j-1];
 pos--; } 
 } 
 arr[pos]=temp; 
 } 
 }
