#include <stdio.h>
#include <stdlib.h>
typedef struct {
    char nome[50];
    int idade;
    double renda;
}Pessoa;

int main()
{
    Pessoa p;
    printf("Digite seu nome:");
    scanf("%s", p.nome);
    printf("Digite sua idade:");
    scanf("%i", &p.idade);
    printf("Digite sua renda:");
    scanf("%lf", &p.renda);

    printf("\n%s \n%d \n%.2lf", p.nome, p.idade, p.renda);
    return 0;
}
