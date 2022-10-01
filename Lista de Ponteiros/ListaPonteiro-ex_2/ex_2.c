#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n, n2;

    int *it=NULL;
    int *it2=NULL;

    printf("Digite um numero inteiro: ");
    scanf("%i", &n);

    printf("Digite outro numero inteiro: ");
    scanf("%i", &n2);

    it=&n;
    it2=&n2;

    if(*it > *it2){
        printf("O numero 1 sera maior que o numero 2: %i > %i", *it, *it2);
    }
    else {
        printf("O numero 2 sera maior que o numero 1: %i > %i", *it2, *it);
    }

    return 0;
}
