#import <stdio.h>

typedef struct t_jogador {
    int posicao_em_x;
    int posicao_em_y;
    char nome[50];
    void (*voar)(struct t_jogador*); // o argumento é void pois nesse
                                     // momento não conhecemos o tipo Jogador
} Jogador;

void voar(void *jogador) {
    Jogador *j = (Jogador*) jogador;
    j->posicao_em_y+=10;
}

int main(int argc, char **argv) {

    Jogador j = {0, 0, "Mathias", voar};
    printf("Jogador %s X: %i Y %i\n", j.nome, j.posicao_em_x, j.posicao_em_y);

    j.voar(&j);

    printf("Jogador %s X: %i Y %i\n", j.nome, j.posicao_em_x, j.posicao_em_y);
}