#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
int main(){
    setlocale(LC_ALL,"portuguese");

    int n,i;

    printf("Digite o tamanho do vetor: ");
    scanf("%i", &n);

    int vetor[n];

    for(i = 0; i < n; i++){
    printf("Digite o valor da posição %i: ", i);
    scanf("%i", &vetor[i]);
    }

    int var=rand()%i;
    int soma = 0;

    for(var; (2*var+1) < n; var++){
        soma = soma+vetor[var]+(2*var+1);
    }
    printf("A soma será: %i", soma);


    return 0;
}
