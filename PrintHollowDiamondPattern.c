#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int main() {
   int k,n, i, j, mid,t;
    scanf("%d",&t);
   for( k=0;k<t;k++)
   {
       printf("Case #%d:\n",(k+1));
   scanf("%d", &n);
   if(n %2 == 1) { 
      n++;
}
mid = (n/2);
for(i = 1; i<= mid; i++) {
    for(j = 1; j<=(mid-i); j++){
      printf(" ");
    }
    if(i == 1) {
      printf("*");
    } else {
      printf("*");
      
      for(j = 1; j<=2*i-3; j++){ 
          printf(" ");
      }
      printf("*");
    }
    printf("\n");
}
for(i = mid+1; i<n; i++) {
   for(j = 1; j<=i-mid; j++) { 
      printf(" ");
   }
   if(i == n-1) {
      printf("*");
   } else {
      printf("*");
     
      for(j = 1; j<=2*(n - i)-3; j++) { 
        
        printf(" ");
      }
      printf("*");
   }
   printf("\n");
}
   }
}
