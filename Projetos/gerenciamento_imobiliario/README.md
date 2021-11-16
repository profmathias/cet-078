# Gerenciamento de Imobiliária

A imobiliária "Sua casa, meu lucro!" está tendo dificuldades para gerenciar
os seus corretores, imóveis e clinetes e tem passado por uma situação difícil.
Com vistas para a melhoria da situação financeira da empresa o seu presidente
resolveu informatizar todo o sistema. O principal objetivo é ter um registro
central de seus CORRETORES, CLIENTES e IMOVEIS e NOGICIAÇÕES. Dessa forma a
imobiliária pretende otimizar os processos e reduzir a perda de receita nas
suas transações, bem como melhor entender os custos com Corretores. A empresa
possui corretores associados, que são designados durante a criação de uma 
negociação, ao final do processo uma valor é pago para o corretor com base
em uma porcentagem da comissão estipulada na Negociação. Imóveis podem ser 
de diferentes tipos, por exemplo Apartamentos, Casas, Terrenos, 
Fazendas/Sítios.

## Das funcionalidades

O sistema deverá:

- Gerenciar Clientes 
- Gerenciar Imóveis
- Gerenciar Corretores
- Gerenciar Negociações de Compra/Venda
- Relatório de Comissões Pagas
- Relatório de Comissões a Pagar

## Dos Menus (Sugestão Inicial)

Qual sistema deseja acessar?

1. Administrativo
2. Corretor

## Menu Administrativo

1. Gerenciar Imóveis (Adicionar/Remover/Modificar/Listar)
2. Gerenciar Corretores (Adicionar/Remover/Modificar/Listar)
3. Gerenciar Negociações (Adicionar/Remover/Modificar/Listar)
4. Gerenciar Clientes (Adicionar/Remover/Modificar/Listar)
5. Relatório de Comissões Pagas
6. Relatório de Comissões a Pagar

## Menu do Corretor

1. Minhas Negociações
2. Relatório de Comissões Recebidas e a Receber

## Decisões Arquiteturais

Utilize o padrão arquitetural MVC.

Note que as Negociações possuem um estado, elas podem estar nas situações
`Pronta para Negociação`, `Em Negociação`, `Finalizada`. Utilize um
atributo em negociação para representar o estado dela. 

