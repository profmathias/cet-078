## Sobrecarga e Sobrescrita de Métodos

Neste exemplos vimos como podemos sobrecarregar métodos, **métodos com o mesmo nome porém com assinaturas diferentes**,
também vimos como sobrescrever métodos herdados de um **superclasse**.

Vimos também, de maneira superficial o conceito de **polimorfismo** e como a sobrescrita de funções está relacionada a ele.
Atente especialmente paraa classe `Cenario`.

### Exercício

- Aperfeiçoe o nosso jogo, procurando identificar métodos que possam oferecer versões distintas, utilizando sobrecarga.
- Identifique métodos que necessitem ser especializados em **subclasses** e sobrescreva-as para obter um comportamento específico para aquela classe.
  * Verifique o exemplo do método `renderizar()`
- Seja criativo, crie novos conceitos para o jogo o que irá requerer novas classes e funcionalidades.
- Escreva sempre os testes para cada classe e dentro da classe de teste um teste para cada método caso ele possua alguma lógica ou cálculo.
  * Não é necessário testar métodos que apenas agregam chamadas a outros métodos sem nenhuma lógica específica.
