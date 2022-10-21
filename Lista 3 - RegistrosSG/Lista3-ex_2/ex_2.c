#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
  typedef struct {
    char nome[50];
    int idade;
    double renda;
}Pessoa;

int main()
{
    setlocale(LC_ALL,"portuguese");

    Pessoa p[5];
    for(int cont = 0; cont < 5; cont++){
    printf("Digite seu nome:");
    scanf("%s", p[cont].nome);
    printf("Digite sua idade:");
    scanf("%i", &p[cont].idade);
    printf("Digite sua renda:");
    scanf("%lf", &p[cont].renda);
    }

    for(int i = 0; i < 5; i++){
    printf("\n%s \n%d \n%.2lf", p[i].nome, p[i].idade, p[i].renda);
    }
    return 0;
}
