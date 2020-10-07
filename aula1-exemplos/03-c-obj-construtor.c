#import <stdio.h>
#import <stdlib.h>
#import <string.h>

typedef struct t_jogador {
    int posicao_em_x;
    int posicao_em_y;
    char nome[50];
    void (*voar)(struct t_jogador*);
} Jogador;

void voar(Jogador* j) {
    j->posicao_em_y = 10;
}

Jogador new_jogador() {
    Jogador j;
    j.posicao_em_x = 0;
    j.posicao_em_y = 0;
    strcpy(j.nome, "Mathias");
    j.voar = voar;
    return j;
};

int main(int argc, char **argv) {
    Jogador j1 = new_jogador();
    printf("Jogador %s X: %i Y %i\n", j1.nome, j1.posicao_em_x, j1.posicao_em_y);

    j1.voar(&j1);
    printf("Jogador %s X: %i Y %i\n", j1.nome, j1.posicao_em_x, j1.posicao_em_y);

    return 0;
}