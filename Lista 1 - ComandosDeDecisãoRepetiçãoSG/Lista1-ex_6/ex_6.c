#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main(){
      setlocale(LC_ALL,"portuguese");

    int x=12,y=5,z=1;
    int n=0;
    int num;

    printf("Digite um número inteiro:");
    scanf("%i",&num);

    printf("\n%i", z);

    if(num > y){
        printf("\n%i", y);
    }

    if (num > x){
        printf("\n%i\n", x);
        while(n<num){
            n=(x+y)-z;
            z=y;
            y=x;
            x=n;
            printf("%i \n",n);
        }
    }

    return 0;
}
