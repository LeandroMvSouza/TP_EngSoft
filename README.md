# TP_EngSoft

Tema 8 Gestão de Biblioteca

O sistema deve dar apoio à gestão de uma biblioteca escolar. Os títulos da biblioteca podem ser livros,
periódicos e outros. Cada título tem um número de exemplares, um período máximo de empréstimo e
uma descrição. Um título só pode ser emprestado a leitores cadastrados, que pagarão multas se
ultrapassarem o período de empréstimo. Professores cadastrados podem pedir que determinados
títulos, para que sejam consultados apenas na biblioteca durante a oferta de uma disciplina. O produto
deve permitir o tratamento de perdas e dar apoio ao controle de assinaturas de periódicos.

## Estruturas de dados (esboço)

    // Global_Variables:
    DEPT_MULTIPLIER X // How much dept is accrued per day of delay.
    N // Maximum amount of a given array

    struct user {
      float owned_dept; // a user can only get more books loans if he does not have any pending debts

      array lost_titles[N]; // a user can lose up to N titles.

      array loaned_titles[N] // a user can loan up to N different titles
    }

    struct professor extends user {
      array reserved_titles[N]; // a professor can reserve up to N different titles. These titles will not be available for other users to loan for a set amount of time - 1 semester or 6 months.
    }

    struct title {
      bool is_periodic;

      string description;

      array exemplars[N]; // any given title can have up to N exemplars

      int loan_period; // in days
    }

    struct exemplar {
      bool is_loaned;
      bool is_lost;
      bool is_late; // loan_countdown > title->loan_period ? TRUE : FALSE;
      bool is_reserved; // reserve_countdown > 6 months ? FALSE : TRUE;
      int loan_countdown;
      int reserve_countdown; // incremented at the end of each day
    }

## Requisitos

### Serviços fornecidos (O que o sistema faz)

. (A) Permite cadastro de dois tipos de usuário :
  1. Professor ;
  2. Aluno

Um Aluno é um usuário comum. Ele pode fazer o empréstimo de até N títulos, contanto que não esteja devendo nada ou não tenha perdido um livro.

Um Professor é uma superclasse de usuário. Pode fazer tudo que um aluno faz com o adicional de poder reservar títulos que devem permanecer na biblioteca por 1 semestre.

. (B) Permite apenas que títulos sejam adicionados ao acervo. Títulos perdidos serão, necessariamente, repostos pelo usuário responsável. (Não sei o que vocês acham sobre isso, mas fazer dessa forma evita ter que preocupar com manipulação de array a lá lista encadeada. Talvez java tenha funções que permitam fazer isso facilmente, se for o caso tira esse "apenas").

. (C) Permite a consulta do acervo disponível por qualquer usuário, seja ele cadastrado ou não. O sistema deverá informar a quantidade de exemplares disponíveis, se o título em questão está reservado ou não.

. (D) Permite à usuários cadastrados verificarem o status de seus empréstimos (títulos ; se título X está atrasado; quanto tempo demora até ter que entregar o título X).

. (E) Permite à professores obter uma lista de seus títulos reservados.

. (G) Informa usuários cadastrados sobre a impossibilidade de tomarem novos empréstimos devido à pendências (dívidas ou títulos perdidos).

. (H) Permite o tratamento de perdas ( como ??? )

. (I) Apoiar o controle de assinatura de periódicos ( como ??? )

### Restrições (O que o sistema não faz)

. Assume-se que o superusuário ou administrador do sistema não irá modificar as estruturas de dados estabelecidas no início do projeto. Apenas modificará os dados de objetos pré-registrados ou criará novos objetos.

. O sistema assume que cada usuário; título e exemplar é necessariamente único. Ou seja, não existem pessoas com mais de uma conta; cada título é único (i.e. Quinta Edição do Livro X) e cada exemplar de um título tem identificador único.

. O sistema não permite que um usuário faça empréstimo ou reserve o mesmo título.
