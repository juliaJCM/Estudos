#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int produto(int num1, int num2){
    int total = 0;

    if(num1 > 0){
        num1--;
        total = num2;
    }
    else if( num1 < 0){
        num1++;
        total = -num2;
    }
    if(num1==0){
        return total;
    }

    else{
        return total + produto (num1, num2);
    }
}

int main(){
    setlocale(LC_ALL,"portuguese");

    int num1 = 0, num2=0, res=0;

    printf("Digite dois números: ");

    scanf("%d%d",&num1,&num2);

    res = produto(num1, num2);

    printf("O produto dos dois números será:%d\n ", res);

return 0;
}
