#import <stdio.h>
#import <stdlib.h>
#import <string.h>

typedef struct t_jogador {
    int posicao_em_x;
    int posicao_em_y;
    char *nome;
    void (*voar)(struct t_jogador*);
} Jogador;

void voar(Jogador* j) {
    j->posicao_em_y = 10;
}

Jogador construtor() {
    Jogador j;
    j.posicao_em_x = 0;
    j.posicao_em_y = 0;
    j.nome = malloc(sizeof(char)*50);
    strcpy(j.nome, "Mathias");
    j.voar = voar;
    return j;
}

void destrutor(Jogador *j) {
    free(j->nome);
}

int main(int argc, char **argv) {
    Jogador j1 = construtor();
    printf("Jogador %s X: %i Y %i\n", j1.nome, j1.posicao_em_x, j1.posicao_em_y);

    j1.voar(&j1);
    printf("Jogador %s X: %i Y %i\n", j1.nome, j1.posicao_em_x, j1.posicao_em_y);

    destrutor(&j1);

    return 0;
}