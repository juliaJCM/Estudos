#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL,"portuguese");

    int vetor[10];
    int maior = 0;

    for(int i = 0; cont < 10; cont++){
    printf("Digite 10 números inteiros: ");
    scanf("%i", &vetor[cont]);
    }

    for(int i = 0; i < 10; i++) {
        if(vetor[i] > maior){
            maior = vetor[i];
        }
    }

    printf("%i", &maior);
    return 0;
}
