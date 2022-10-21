#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
int main(){
    setlocale(LC_ALL,"portuguese");

    int n;

    printf("Digite o valor do vetor: ");
    scanf("%i", &n);

    int vetor[n];

    for(int i = 0; i < n; i++){
        vetor[i] = rand()%100;
    }

    int menor = vetor[0];

    for(int j = 1; j < n; j++){
        if(vetor[j] < menor){
            menor = vetor[j];
        }
    }

     for(int k = 0; k < n; k++){
        if(vetor[k] == menor){
           printf("%i", k);
        }
    }

    return 0;
}
