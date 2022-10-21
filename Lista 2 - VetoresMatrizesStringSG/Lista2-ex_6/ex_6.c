#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main(){
      setlocale(LC_ALL,"portuguese");

    int valor = 0;

    printf("Digite um número: ");
    scanf("%d", &valor);

    int result = fatorial(valor);

    printf("O fatorial do número digitado será: %d \n ",result);
    return 0;
}
//Recursividade
int fatorial(int val){
    int fat = 0;

    if(val == 0){
    return 1;
}
    else{
    fat = val * fatorial (val-1);
    return fat;

    return 0;
}
}
