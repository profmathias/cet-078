#import <stdio.h>

typedef struct t_personagem {
    int posicao_em_x;
    int posicao_em_y;
    char nome[50];
    void (*voar)(struct t_personagem*); // o argumento é void pois nesse
                                     // momento não conhecemos o tipo Jogador
} Personagem;

void voar(Personagem *personagem) {
    personagem->posicao_em_y+=10;
}

int main(int argc, char **argv) {

    Personagem p = {0, 0, "Mathias", voar};
    printf("Personagem %s X: %i Y %i\n", p.nome, p.posicao_em_x, p.posicao_em_y);

    p.voar(&p);

    printf("Personagem %s X: %i Y %i\n", p.nome, p.posicao_em_x, p.posicao_em_y);
}