#import <stdio.h>
#import <stdlib.h>
#import <string.h>

typedef struct t_personagem {
    int posicao_em_x;
    int posicao_em_y;
    char *nome;
    void (*voar)(struct t_personagem*);
} Personagem;

void voar(Personagem* p) {
    p->posicao_em_y = 10;
}

Personagem construtor() {
    Personagem p;
    p.posicao_em_x = 0;
    p.posicao_em_y = 0;
    p.nome = malloc(sizeof(char)*50);
    strcpy(p.nome, "Mathias");
    p.voar = voar;
    return p;
}

void destrutor(Personagem *p) {
    free(p->nome);
}

int main(int argc, char **argv) {
    Personagem p1 = construtor();
    printf("Personagem %s X: %i Y %i\n", p1.nome, p1.posicao_em_x, p1.posicao_em_y);

    p1.voar(&p1);
    printf("Personagem %s X: %i Y %i\n", p1.nome, p1.posicao_em_x, p1.posicao_em_y);

    destrutor(&p1);

    return 0;
}