# Sistema de Gerenciamento de Dietas

## Motivação

A clínica de dietas *Comer com Qualidade* e seus nutricionistas tem uma
vasta experiência em nutrição no mercado, porém todos os processos são
ainda manuais. Receitas de Dietas são prescritas a mão baseadas em um
conjunto de Dietas catalogadas. Os registros de pacientes também é em 
papel, bem como os dados de funcionários e nutricionistas. Os donos da
clínica querem automatizar, inicialmente, o processo de gerenciamento da
geração, manutenção e prescrição das dietas, dos seus nutricionistas e
pacientes. A clínica também deseja oferecer uma interface para que o 
cliente registre as suas refeições e ao final do dia o sistema irá informar
se ele cumpriu com a dieta.

## Das funcionalidades

O sistema deverá:

- Gerenciar o cadastramento de ALIMENTOs e suas propriedades
nutricionais.
- A montagem de uma REFEICAO, que é compostas por vários alimentos.
- A montagem de uma DIETA que é uma combinação de refeições ao longo
da semana.
- Uma DIETA está sempre associada a um clinete e ao Nutricionista 
que a prescreveu.
- Deve ser possível adicionar CLIENTES e NUTRICIONISTAS no sistema.
- Oferecer uma Interface para o usuário registrar suas refeições, essas
refeições serão comparadas com as refeições da dieta.

## Dos Menus (Sugestão Inicial)

### Menu Principal
```
Entrar como...
1. Nutricionista
2. Paciente
```

### Menu Principal do Nutricionista
```
Digite a sua Matrícula: 1234
Bem-vindo Sr. Fulano de Tal (Matrícula 1234)

Escolha uma opção:
1. Gerenciamento de Alimentos (Adicionar/Remover/Modificar/Listar)
2. Gerenciamento de Refeição (Adicionar/Remover/Modificar/Listar)
3. Gerenciamento de Dieta (Adicionar/Remover/Modificar/Listar)
4. Gerenciamento de Pacientes (Adicionar/Remover/Modificar/Listar)
5. Receitar Dieta
6. Gerenciamento de Nutricionistas (Adicionar/Remover/Modificar/Listar)
```

Cada seção de gerenciamento permite inserir/remover/atualizar/listar 
entidades (ex. RECEITA, PACIENTE, NUTRICIONISTA, etc.).

### Menu Principal do Paciente
```
Digite o seu número de paciente: 12345
Bem-vindo Sr. Sicrano (Paciente: 12345)

Escolha uma opção:
1. Registrar Refeição Feita
2. Relatório Diário
```

Note que o paciente só registra as Refeições Feitas. Uma refeição feita
é uma especialização de uma REFEICAO que tem associada a ela a data e hora
que foi feita bem como o paciente que a fez.

O relatório diário fara uma comparação das refeições feitas com as recomendadas
e indicar se o paciente está em dias com a dieta.

## Decisões Arquiteturais

Utilize o padrão arquitetural MVC como visto em sala de aula.

