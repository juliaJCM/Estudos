#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main(){
    setlocale(LC_ALL,"portuguese");

    int totalVet;
    printf("Digite tamanho do vetor: ");
    scanf("%i", &totalVet);

    int Vetor[totalVet];

    for(int i = 0; i <= totalVet; i++ ){

        printf("Digite os valores correspondentes: ");
        scanf("%i", &Vetor[i]);
    }

    imprimir(Vetor);

return 0;
}
    int n = 10;

    int imprimir (int vet[n]){

    for(int i = 0 ;i <= n; i++){
        printf("%i,", vet[i]);
    }
}
