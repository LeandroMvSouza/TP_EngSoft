# TP_EngSoft

Tema 8 - Gestão de Biblioteca

O sistema deve dar apoio à gestão de uma biblioteca escolar. Os títulos da biblioteca podem ser livros, periódicos e outros. Cada título tem um número de exemplares, um período máximo de empréstimo e uma descrição. Um título só pode ser emprestado a leitores cadastrados, que pagarão multas se ultrapassarem o período de empréstimo. Professores cadastrados podem pedir que determinados
títulos, para que sejam consultados apenas na biblioteca durante a oferta de uma disciplina. O produto deve permitir o tratamento de perdas e dar apoio ao controle de assinaturas de periódicos.

## Roadmap

Série de tarefas a serem realizadas, sendo a ordem de implementação de cima pra baixo. O desenvolvimento é incremental, com determinadas tarefas podendo ou não depender de alguma anterior.

| Tarefa                                              | Status       | Cobertura de Testes | Responsáveis | Comentários |
|-----------------------------------------------------|--------------|---------------------|--------------|-------------|
| Criar estruturas de dados iniciais                  | Feito        | N/A                 | Leandro      | Falta criar suporte para requisitos I e H |
| Criar "banco de dados" com títulos e exemplares     |              |                     |              | |
| Implementar método que lista itens do acervo        |              |                     |              | |
| Implementar sistema de cadastro e login de usuários |              |                     |              | |
| Implementar métodos específicos para usuários       |              |                     |              | |
| Implementar métodos específicos para professores    |              |                     |              | |
| Implementar o tratamento de perdas (requisito H)    |              |                     |              | |
| Implementar o controle de assinaturas (requisito I) |              |                     |              | |

## Requisitos

### Serviços fornecidos (O que o sistema faz)

* (A) Permite cadastro de dois tipos de usuário :
  1. Usuário ;
  
          public class User {

            * Um usuário pode pegar emprestado até N exemplares. Além disso,
              um usuário não pode pegar emprestado mais de um exemplar
              do mesmo título (i.e. dois "Harry Potter e a Pedra Filosofal")

            * Um usuário pode perder até N exemplares.

            * Um usuário só pode pegar um título emprestado caso não 
              tenha nenhum título perdido e se sua dívida atual é 0.
          }

  2. Professor

          public class Professor extends User {

            * Um Professor é uma superclasse de usuário. Pode fazer tudo que um
              usuário faz com o adicional de poder reservar títulos. Um título
              reservado deve ter ao menos um de seus exemplares não disponível 
              para empréstimo por um período de 6 meses ou 183 dias.

            * Um professor pode reservar por 6 meses até N títulos. Além disso, 
              um professor não pode reservar um título já reservado.
          }

* (B) Permite apenas que títulos sejam adicionados ao acervo. O número de exemplares para cada título é fixo - sempre que o administrador do sistema adiciona um novo título a biblioteca comprará 2 exemplares.
  
  Exemplares perdidos serão, necessariamente, repostos pelo usuário responsável. (Não sei o que vocês acham sobre isso, mas fazer dessa forma evita ter que preocupar com manipulação de array a lá lista encadeada. Talvez java tenha funções que permitam fazer isso facilmente, se for o caso tira esse "apenas").

      public class Title {

        * Um título é único e representa uma obra literária
          ou periódica, possuindo as informações necessárias
          para identificá-lo. Caso um título tenha mais de
          um volume, essa informação estará presente em
          seu título, separada por um | .
        
          Por exemplo :
          
          - Harry Potter e a Pedra Filosofal
          - Cálculo | Volume 1
          - Cálculo | Volume 2

        * O número padrão de dias para a duração de um empréstimo.
          private int loanPeriod = 14;

        * O número padrão de dias para um título permanecer reservado.
          183 é aproximadamente 6 meses.
          private int reservePeriod = 183;

        * Cada título pode ter até N exemplares distintos
          da mesma obra literária/periódico.
      }

      public class Exemplar {
        * Um exemplar é uma unidade atômica de um título.
        * 
        * Por exemplo:
        *  - Senhor dos Aneis e a Sociedade do Anel é um título X
        *    X->exemplars[0] é o primeiro exemplar
        *    X->exemplars[1] é o segundo exemplar
      }

*  (C) Permite a consulta do acervo disponível por qualquer usuário, seja ele cadastrado ou não. O sistema deverá informar a quantidade de exemplares disponíveis e se o título em questão está reservado ou não.

*  (D) Permite à usuários cadastrados verificarem o status de seus empréstimos (títulos ; se título X está atrasado; quanto tempo demora até ter que entregar o título X).

* (E) Permite à professores obter uma lista de seus títulos reservados.

* (G) Informa usuários cadastrados sobre a impossibilidade de tomarem novos empréstimos devido à pendências (dívidas ou títulos perdidos).

* (H) Permite o tratamento de perdas, fornecendo ao usuário a opção de informar a perda. A partir disso, um formulário de reposição deve ser preenchido e o usuário terá até 30 dias para repor o título. Caso a reposição não ocorra, o usuário terá sua conta bloqueada do sistema.

* (I) Apoiar o controle de assinatura de periódicos, exibindo as assinaturas feitas, o período contratado e o período restante, além do valor a ser pago pelas mesmas.

### Restrições (O que o sistema não faz)

* Assume-se que o superusuário ou administrador do sistema não irá modificar as estruturas de dados estabelecidas no início do projeto. Apenas modificará os dados de objetos pré-registrados ou criará novos objetos.

* O sistema assume que cada usuário; título e exemplar é necessariamente único. Ou seja, não existem pessoas com mais de uma conta; cada título é único (i.e. Quinta Edição do Livro X) e cada exemplar de um título tem identificador único.

* O sistema não permite que um usuário faça empréstimo ou reserve o mesmo título.