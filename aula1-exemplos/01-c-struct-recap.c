#import <stdio.h>

typedef struct t_jogador {
    int posicao_em_x;
    int posicao_em_y;
    char nome[50];
} Jogador;

void voar(Jogador *jogador) {
    jogador->posicao_em_y+=10;
}

int main(int argc, char **argv) {

    Jogador j = {0, 0, "Mathias"};
    printf("Jogador %s X: %i Y %i\n", j.nome, j.posicao_em_x, j.posicao_em_y);

    voar(&j);

    printf("Jogador %s X: %i Y %i\n", j.nome, j.posicao_em_x, j.posicao_em_y);
}