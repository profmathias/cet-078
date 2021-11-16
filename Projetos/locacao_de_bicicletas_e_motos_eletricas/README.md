# Locação de Bicicletas e Motos Elétricas

## Motivação

A empresa "Go Green de Bike" quer revolucionar os transporte de pessoas
nas cidades e deseja implementar um método inovador de uso compartilhado
de bicicletas e motos elétricas. A empresa comprou uma frota desses
veículos e distribuirá em pontos estratégicos da cidade. Os clientes poderão
de posse de um código pessoal desbloquear a moto/bicicleta e utilizá-la
para ir onde quiser. Ao término, basta que o cliente estacione a bicicleta/moto
na rua sem a necessidade de levá-la de volta a um dos pontos de apoio.
Todo veículo tem um nível de bateria, que deve ser ajustado ao final do
uso com base na quilometragem, um veículo gasta em média 10% da bateria
para cada 30Km rodados. Quando a bateria do veículo atinge nível crítico
de 15% o veículo deverá ir para a manutenção.
O preço final ao cliente é a quantidade em quilômetros que ele rodou.
A empresa desse modo pretende dar aos seus usuários a comodidade da locomoção
em veículo próprio sem a necessidade de aquisição do veículo. Para isso
eles precisam de um sistema para gerenciar os clientes e veículos, bem
como gerar relatórios de gerência para dar suporte à equipe de manutenção.

## Funcionalidades

- Gerenciamento de Veículos 
- Gerenciamento de Clientes (Adicionar/Remover/Modificar/Listar)
- Gerenciamento de Funcionários (Adicionar/Remover/Modificar/Listar)
- Rastreamento e contabilidade do uso de veículo por usuário.

## Dos Menus (Sugestão Inicial)

Qual módulo do sistema você vai utilizar?

1. Módulo de Administração
2. Módulo do Cliente

### Módulo do Administrador

1. Gerenciar Veículos (Adicionar/Remover/Modificar/Listar)
2. Gerenciar Funcionários (Adicionar/Remover/Modificar/Listar)
3. Gerenciar Clientes (Adicionar/Remover/Modificar/Listar)
4. Relatórios de Veículos estacionados em Ponto de Apoio vs. na Rua
5. Relatórios de veículos disponíveis/ocupados/Necessitando Manutenção. 
6. Relatório Financeiro (Total Pago por Clientes)

### Módulo do Cliente

1. Alugar Veículo
2. Encerrar Aluguel (deve informar se deixou em um ponto de 
   apoio ou na rua e quantos KM rodou e mostrar o valor cobrado no 
   cartão de crédito, note que você precisa atualizar o nível de
   bateria do veículo).

## Decisões Arquiteturais

Utilize o padrão arquitetural MVC. Note que veículos estão em estados diferentes
'Disponível', 'Em Uso', 'Necessita Manutenção'. Esse estado deve ser representado
em um atributo na classe responsável pelo veículo.

