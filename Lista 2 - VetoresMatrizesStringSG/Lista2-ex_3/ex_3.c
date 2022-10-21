#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
int main(){
    setlocale(LC_ALL,"portuguese");

    double matriz[5][3];

    for(int l = 0; l < 5; l++){
       for(int c = 0; c < 3; c++){
        printf("Digite a nota referente ao aluno %i: ", l+1);
        scanf("%lf", &matriz[l][c]);
       }
    }

    double soma;

    for(int i = 0; i < 5; i++){
            soma = 0;
        for(int j = 0; j < 3; j++){
            soma += matriz[i][j];
            printf("%i", soma);
        }
        printf("\nA soma das notas referenete ao aluno %i: %lf", i+1, soma);
    }

    return 0;
}
