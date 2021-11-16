# Gerenciamento de Entrega de Pacotes e Correspondências

## Motivação
A empresa de Correios e Telegrafos Vai Chegar (CTVC) quer otimizar o processo
de entrega e resolveu informatizar o seu processo de gerenciamento
de entregas. Eles trabalham com Pacotes e Correspondências e entregam
para todo o País. O CEO da CTVC quer ter o controle do movimento dos pacotes
desde a hora da postagem em uma filial até a entrega e para isso ele contratou a sua empresa
para liderar o processo. Os pacotes tem em sua essência uma origem, uma rota
e um destino, além dos veículos e entregadores envolvidos. Ao receber
um pacote na agência ele será registrado. Baseado no destino o sistema encontrará
a próxima rota disponível que atende àquele pacote e associa o pacote a rota.
Ao chegar na cidade de destino ele é associado a um entregador que por fim
entrega o pacote.

## Das Funcionalidades

O sistema deverá:

- Registrar, em uma filial, novos pacotes no sistema.
- Gerenciar o cadastramento e manutenção das rotas diárias periódicas.
  - Um rota é uma lista de cidades e veículos associados. Por exemplo
  uma rota de Ilhéus para Salvador pode ser feita por um caminhão e passar
  por várias cidades. Um pacote com destino a uma dessas cidades pode ir
  neste caminhão.
- Gerenciar os Veículos
- Gerenciar os Entregadores
- Gerar Relatório de Entregas

## Dos Menus (Sugestão Inicial)

### Menu Principal (Adminsitrativo)

O que vc deseja fazer?
1. Gerenciamento de Funcionários (Adicionar/Remover/Modificar/Listar)
2. Regsitro de Pacote/Cartas
3. Registro de Veículos e Rotas
4. Despacho de Pacote
5. Recebimento de Pacote desta Filial
6. Entrega de Pacote para outro Filial
7. Relatório diário de entregas

### Menu Carteiro (6. Entrega de Pacote)

1. Coletar Pacote/Carta em Filial
2. Registrar como Entregue
3. Não entregue, devolução à filial


## Decisões Arquiteturais

Utilize o padrão arquitetural MVC.

Neste sistema muitos objetos possuem um estado. Por exemplo, um pacote
pode ter sido recebido, entregue ou estar em trânsito. É importante
identificar quais são os estados, veículos também tem estados, por exemplo,
No Depósito, Em Trânsito, No Destino, bem como carteiros. Gerencie estes
estados, dessa forma poderiamos depois implementar uma funcionalidade
para saber o estado de cada veículo/carteiro/etc. Note que esses estados
são implementados como atributos do objeto.