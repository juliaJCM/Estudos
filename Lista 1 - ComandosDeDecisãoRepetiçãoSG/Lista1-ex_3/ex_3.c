#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){

    setlocale(LC_ALL,"portuguese");

    int sal, prest;

    printf("Digite o sal�rio bruto: ");
    scanf("%d", &sal);
    printf("Digite o valor da presta��o: ");
    scanf("%d", &prest);

    if(prest > 40*sal/100){
        printf("O empr�stimo N�O ser� concedido!");
    }
    else{
        printf("O empr�stimo ser� concedido!");
    }

    return 0;
}
