# Sistema de Controle de Vazão em Barragens

A empresa "Barragens Segura Água" administra uma série de barragens ao longo
de diversos rios. Essa água é utilizada tanto para geração de energia como
para abastecimento de cidades. A empresa está tendo problemas em controlar o
uso da água e necessita automatizar o processo. Ela deseja ter um cadastro
dos rios nas quais gerenciam as barragens, bem como as barragens em si. A
empresa quer ter controle fino da vazão das barragens e automatizar o processo.
A lógica é que nos lagos onde a água é utilizada para abastecer cidades o
volume de água deve estar sempre em 15% maior do que as barrages só de geração
de energia. O volume de água nas barrages é medida em metros cúbicos de água.
A vazão mínima de uma barragem é 0 e a máxima é de 2 metros cúbico por minuto 
por comporta aberta. O número de comportas em cada barragem pode variar entre 3 e 10.
Além disso um lago estará em nível crítico se o seu volume atingir 15% da sua capacidade
total. 

## Funcionalidades do Sistema

- Gerenciar Rios
- Gerenciar Barragens e Usos
- Gerenciar Abertura/Fechamento de Comportas
- Relatório Atual de Vazão/Barragem
- Relatório de Nível dos Lagos
- Registrar Água de Chuvas
- Quantidade de Água utilizada para geração de Energia/Consumo de Cidade

## Dos Menus (Sugestão Inicial)

1. Gerenciar Rios (Adicionar/Remover/Modificar/Listar)
2. Gerenciar Vazão (Aumentar/Diminuir Vazão)
3. Registrar Água de Chuva em Barragem específica
4. Relatório Atual de Vazão/Barragem
5. Relatório de Nível dos Lagos
6. Relatório de Consumo
7. Abrir/Fechar Comporta (Aumentar vazão da barragem)

## Decisões Arquiteturais

O sistema irá funcionar como um simulador logo ele terá que ter um
registro de tempo e em cada iteração de tempo uma cadeia de cálculos deve
ser realizada. Este relógio pode ser implementado como uma Thread.
Nesta parte vocês deverão procurar o Prof. para guiar vocês na implementação
do elementos necessários para a simulação.