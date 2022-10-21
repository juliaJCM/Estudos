#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL,"portuguese");

    int sal, prest;

    printf("Digite o salário bruto: ");
    scanf("%d", &sal);
    printf("Digite o valor da prestação: ");
    scanf("%d", &prest);

    if(prest > 40*sal/100){
        printf("O empréstimo NÃO será concedido!");
    }
    else{
        printf("O empréstimo será concedido!");
    }

    return 0;
}
