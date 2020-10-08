#import <stdio.h>

typedef struct t_personagem {
    int posicao_em_x;
    int posicao_em_y;
    char nome[50];
} Personagem;

void voar(Personagem *personagem) {
    personagem->posicao_em_y+=10;
}

int main(int argc, char **argv) {

    Personagem p = {0, 0, "Mathias"};
    printf("Personagem %s X: %i Y %i\n", p.nome, p.posicao_em_x, p.posicao_em_y);

    voar(&p);

    printf("Personagem %s X: %i Y %i\n", p.nome, p.posicao_em_x, p.posicao_em_y);
}