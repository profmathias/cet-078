# Gerenciamento de Frota de Veículos


## Motivação

O empresa "Foguetão Transportes" é uma empresa de extremo sucesso em
logística rodoviária no país. Eles possuem uma vasta frota de VEÍCULOS,
dentre eles Motocicletas, Vans e Caminhões de 4 e 6 eixos. Os veículos
são empregados nas mais diversas atividades dentro do setor de logística
e basicamente seus CLIENTES são empresas que desejam terceirizar o
transporte de bens. A empresa te contratou para desenvolver um sistema
de Informática para melhorar gerenciar a sua frota. A empresa possui um
corpo de MOTORISTAS, atente para o tipo da licença dirigir, A, B, C, etc,
um Motoboy às vezes não pode dirigir um caminhão, por exemplo. Uma das
grandes novidades do sistema é o rastreamento de veículos.

## Das funcionalidades

O sistema deverá:

- Gerenciar Veículos (Adicionar/Remover/Modificar/Listar)
- Gerenciar Motoristas (Adicionar/Remover/Modificar/Listar)
- Gerenciamento de Rotas (Adicionar/Remover/Modificar/Listar)
- Relatório de Veículos em Trânsito e Estacionados
- Relatório de Alocação de Motoristas

O gerenciamento de rotas define para um AUTOMOVEL um motorista, um 
cliente e uma ROTA. Uma ROTA é composta por uma origem, um destino,
e possíveis paradas intermediárias,
bem como as datas de saída e chegada prevista.

## Dos Menus (Sugestão Inicial)

### Menu Principal (Adminsitrativo)

Qual sistema deseja acessar?
1. Administrativo
2. Motorista

#### Menu Administrativo

1. Gerenciar Veículos (Adicionar/Remover/Modificar/Listar)
2. Gerenciar Motoristas (Adicionar/Remover/Modificar/Listar)
3. Gerenciar Rotas (Alocação de Veículo para Cliente) (Adicionar/Remover/Modificar/Listar)
4. Relatório de Veículos
5. Relatório de Alocação de Motoristas
6. Relatório de Viagens Completas

### Menu do Motorista
1. Registrar Início da Viagem
2. Registrar Localização Atual (Parada Intermediária)
3. Registrar Chegada

## Decisões Arquiteturais

Utilize o padrão arquitetural MVC.

Note que Motoristas e Veículos possuem uma espécie de estado,
`Disponível`, `Alocado`, `Em Transito`. Esse estado deve ser
apresentado nos relatórios.