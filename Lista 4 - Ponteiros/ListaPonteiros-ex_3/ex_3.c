#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    printf("Digite o tamanho do vetor: ");
    scanf("%i", &n);

    int *vet;
    vet = malloc(n*sizeof(int));

    preen(n, vet);

    for(int i=0; i < n; i++){
        printf("%i ", vet[i]);
    }

    return 0;
}
int preen(int n, int v[n]);

int preen(int n, int v[n]){
    for(int i=0; i<n; i++){
        printf("Digite um numero: ");
        scanf("%i", &v[i]);
    }
}
