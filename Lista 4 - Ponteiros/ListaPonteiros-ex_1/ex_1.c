#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, r;
    char c;

    int *it=NULL;
    int *rl=NULL;
    char *ch=NULL;

    printf("Digite um numero inteiro: ");
    scanf("%i", &i);

    printf("Digite um numero real: ");
    scanf("%i", &r);

    setbuf(stdin, NULL);

    printf("Digite um caracter: ");
    scanf("%c", &c);

    it=&i;
    rl=&r;
    ch=&c;

    *it=*it + 1;
    *rl=*rl + 2;
    *ch=*ch + 12;

    printf("\nNovo valor do inteiro: %i", *it);
    printf("\nNovo valor do real: %i", *rl);
    printf("\nNovo valor do caracter: %c", *ch);

    return 0;
}
