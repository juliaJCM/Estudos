#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int soma(int mtz[5][5]){
    int total = 0;

    for(int i = 0; i <= 5; i++){
        total += mtz[i][i];
    }

    return total;
}

int main(){
    setlocale(LC_ALL,"portuguese");

    int tam = 5;
    int matriz[tam][tam];
    int result;

    for(int i=0; i<= tam; i++){
        for(int j=0; j <= tam; j++){
            printf("matriz[%d][%d] = ", i, j);
            scanf ("%d\n", &matriz[i][j]);
        }
    }
    result = soma(matriz);

    printf("A soma dos elementos da diagonal será: %d", result);

 return 0;
}
