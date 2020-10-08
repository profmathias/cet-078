#import <stdio.h>
#import <stdlib.h>
#import <string.h>

typedef struct t_personagem {
    int posicao_em_x;
    int posicao_em_y;
    char nome[50];
    void (*voar)(struct t_personagem*);
} Personagem;

void voar(Personagem* p) {
    p->posicao_em_y = 10;
}

Personagem new_personagem() {
    Personagem p;
    p.posicao_em_x = 0;
    p.posicao_em_y = 0;
    strcpy(p.nome, "Mathias");
    p.voar = voar;
    return p;
};

int main(int argc, char **argv) {
    Personagem p1 = new_personagem();
    printf("Personagem %s X: %i Y %i\n", p1.nome, p1.posicao_em_x, p1.posicao_em_y);

    p1.voar(&p1);
    printf("Personagem %s X: %i Y %i\n", p1.nome, p1.posicao_em_x, p1.posicao_em_y);

    return 0;
}