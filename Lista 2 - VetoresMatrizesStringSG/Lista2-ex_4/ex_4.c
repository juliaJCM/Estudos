#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
int main(){
    setlocale(LC_ALL,"portuguese");

    int l, c;

    printf("Digite o tamanho igual entre linhas e colunas de uma matriz: ");
    scanf("%i %i", &l, &c);

    int matriz[l][c];

    for(int i = 0; i < l; i++){
       for(int k = 0; k < c; k++){
        printf("Digite o valor de cada posição: ");
        scanf("%d", &matriz[i][k]);
       }
    }

    int soma = 0;

    for(int j = 0; j < c; j++){
        soma += matriz[j][j];
    }

    printf("A soma da diagonal será: %i", soma);

    return 0;
}
