# Bem-vindo ao Repositório da Disciplinas LPIII

Navegue através da árvore de diretórios acima para encontrar códigos e arquivos da disciplina.
Caso tenha interesse em usar o `git`, instale a ferramenta no seu computador e utilizando um
gerenciador faça o `clone` do repositório na sua máquina. Caso use o terminal, para clonar o
repositório basta digitar:

```
$ git clone https://github.com/profmathias/cet-078.git
```

Se você clonou na sua máquina, para obter as atualizações sempre execute o comando abaido dentro do diretório contendo
os arquivos do diretório:

```
$ git pull
```

## Slides
- **Java Básico**  
    - [Variáveis, Estruturas de Controle, Vetores e Matrizes](https://www.icloud.com/iclouddrive/0W8dZtn9bJ7BRe5HBw0G92hNA#Interfaces_e_Classes_Abstratas)

- **Aula 9:**
    - [Classes Abstratas e Interfaces](https://www.icloud.com/iclouddrive/0_X3PB-3zCoTArSbEFWR7aCGQ)
    - [Gravação da Aula](https://drive.google.com/file/d/1ek5rX-JM77A1cyCfca_wLyRFapfZ3ocY/view?usp=sharing)
        - **Exercício:** Identifique nos exercícios anteriores possíveis classes abstratas e interfaces.
        Implemente-as e crie classes derivadas (herança) que façam uso das Classes Abstratas ou implementem
        as interfaces.

- **Aula 8:**
    - Na aula oito discutimos soluções possíveis para o exercício do Jogo. Vimos com tratar as associações entre classes, identificamos
    as Composições, Agregações e Generalizações (Herança). A partir de um código de um dos alunos, fomos discutindo soluções e
    refatorando o código. Não houve aula teórica. Esclarecimento de dúvidas e explicações de tópicos relevantes.
    - **OBS:** Aulas práticas com exercícios não são gravadas. 

- **Aula 7:**
    - [Sobrecarga e Sobrescrita de Código](https://www.icloud.com/iclouddrive/0e9Hln2ZeRZPLx72zi0b9arqg#Sobrecarga_e_Sobrescrita)
    - [Gravação da Aula](https://drive.google.com/file/d/1pj31CpbzxqMblBio3vvL69hk9S-aV4rE/view?usp=sharing)
    - **Exercício:** Um jogo é composto por vários elementos, muitos deles renderizáveis, isso significa que o
    o objeto é desenhado na tela, por exemplo, heróis, monstros, obstáculos, objetos decorativos, etc. Pensando
    em um jogo, elenque as Classes que compoem um cenário. Crie uma classe base chamada Renderizavel que possui 
    um método renderizar e imprime na tela os dados do objeto. A partir daí crie uma hierarquia de classes 
    renderizavéis. Pense em múltiplos níveis de hierarquia, por exemplo, Renderizavel -> Personagem -> Heroi.
    Crie no mínimo 8 classes referentes ao jogo e elementos renderizáveis, implemente-as. Pense nas ações
    "métodos" que cada uma dessas classes terão e implemente-as também. Qualquer dúvida entrar em contato 
    ou traga na próxima aula.
- **Aula 6:**
    - [Relacionamento entre Classes e Herença](https://www.icloud.com/iclouddrive/0FyyHvu30defaPxrZUwfQlS9w)
    - [Gravação da Aula](https://drive.google.com/file/d/1RixLU1g7k2vkiZG_D31lH03-OI377h8e/view)
        - Por alguma razão os slides não sairam na gravação, nesta gravação temos somente o áudio.
    - Exercício: Em um jogo os personagens podem ser mosntros e heróis. Todos os personagens são 
    "Objetos rederizáveis." ou seja podem acionar um método para que seja impresso na tela. Quantas classes
    podemos identificar na descrição acima? Quais são os membros de classe (atributos e métodos) que podem
    ser compartilhados entre as classes? Criar uma hierarquia de classes utilizando herança para implementar as classes identificadas.
- **Aula 5:**
    - [Regras de Escopo e Construtores](https://www.icloud.com/iclouddrive/0S2BD03noem5UjGYomw2xkiYA#Escopo_e_Construtores)
    - [Gravação da Aula](https://drive.google.com/file/d/1czTqfBuvlyE9guRfw7BZhdih1uLhNzjx/view?usp=sharing)
    - **Exercício:** Crie os construtores das classes de Formas do exercício anterior para que eles possam
    ser criados já com valores especificados na criação do objeto.
- **Aula 4:**
    - [Introdução à TDD com Java](https://www.icloud.com/iclouddrive/0d3R6GZ3dHp1QwYOKversybcw)
    - [Gravação da Aula](https://drive.google.com/file/d/1MQaZDS5inDKCAt_sw5uoqfDHkgTMYC7T/view?usp=sharing)
    - **Exercício:** Crie classes de testes para todas as classes representando formas do exercício do
    Gerenciador de formas.
- **Aula 3:**
    - [Classes em Java -Parte 3 - Implementando e Testando uma Classe](https://www.icloud.com/iclouddrive/0AEI5bZKNqpFkp3dMEutl7UPg#Parte_3_-_Implementando_e_Testando_uma_Classe)
    - [Gravação da Aula](https://drive.google.com/file/d/1CUF4G-7zp5wypG4l9SIzepeJLrXFnuWy/view?usp=sharing)
    - **Exercício:** Implementação no BlueJ de um Gerenciador de Formas. 
        - [Enunciado aqui.](https://www.icloud.com/iclouddrive/02xsMw4RTE9seyeOvYIIYglfw#exercicio-aula-3)
        - [Código Base aqui](https://github.com/profmathias/cet-078/tree/master/Aula3-Gerenciador-de-Formas)
- **Aula 2:**
    - [Revisão de LPII com códigos](https://github.com/profmathias/cet-078/tree/master/Aula1-Revisao-Rapida-De-LPII-C-Com-OO)
    - [Classes em Java - Implementando utilizando BlueJ](https://www.icloud.com/iclouddrive/0AEI5bZKNqpFkp3dMEutl7UPg#Parte_3_-_Implementando_e_Testando_uma_Classe)
    - [Gravação da Aula](https://drive.google.com/file/d/1QhoO1tSDdbUqE9miZpvrVSw_JesMx-xz/view?usp=sharing) 
    - **Exercício:** Implementação no BlueJ de Classes representando formas geométricas. [Código base e enunciado aqui.](https://github.com/profmathias/cet-078/tree/master/Aula3-Primeira-Classe-OO)
- **Aula 1:**
    - [Introdução à Programação e Análise Orientada a Objetos](https://www.icloud.com/iclouddrive/0XOC0zx153RF7Tj9tN5dPQKDg)
    - [Classes, Atributos e Métodos](https://www.icloud.com/iclouddrive/0MPZU1w60AGnxzn6zcQIsDd1A)
    - [Gravação da Aula](https://drive.google.com/file/d/1wRV0nXduQaTVRAZ77oQu86VeH46Jh65z/view?usp=sharing)

## IDEs, Ferramentas e Softwares

### Java
- [BlueJ (Simples e Prático para Fazer Exercícios)](https://www.bluej.org)
- [IntelliJ (Mais Profissional - Super recomendo)](https://www.jetbrains.com/products.html#type=ide)

### Python

- [JetBrains PyCharm (Super recomendo)](https://www.jetbrains.com/products.html#type=ide)
