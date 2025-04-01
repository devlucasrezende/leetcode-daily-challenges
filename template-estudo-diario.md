
## Template de Estudo Diário

### Problema do Dia 31/03/2025
**Fonte:**  LeetCode  
🔗 **Link:**  https://leetcode.com/problems/two-sum/  
**Nível:** Fácil  

### Reescrevendo o enunciado com minhas palavras:

Tenho um array dde números inteiros e um numero inteiro target, preciso percorrer esse array e verificar em quais posições do array há uma soma para o target.
Exemplo, se tiver um array [1, 2, 4, 5] e o target for 9, preciso
retornar [2, 3]. É suposto haver sempre uma resposta válida

### Ideias iniciais / Estratégia:
-  Percorrer o array duas vezes e fazer um if para ver se a soma do elemento no indice i + j dá o valor do target
-  Criar valor que seja target - nums[i] e criar um mapa para adicionar os valores e indices, se o mapa contiver o valor complement retornar ele e o indice do loop atual
-

### Pseudocódigo (opcional):
...

### Funcionou? O que aprendi?

Sim, a primeira abordagem funcionou, quero ver como fazer com uma complexidade temporal menor

### O que faria diferente se tentasse de novo amanhã?
...

### Avaliação (de 1 a 5):
- Esforço: 2
- Clareza do problema: 5
- Nível de satisfação:  4

---

### Problema do Dia 01/04/2025
**Fonte:**  LeetCode  
🔗 **Link:**  https://leetcode.com/problems/valid-parentheses
**Nível:** Fácil

### Reescrevendo o enunciado com minhas palavras:

Tenho uma String composta somente por caracteres '(', ')', '{', '}', '[' e ']' preciso
verificar se se é uma String válida se todas as aberturas tiverem o fechamento

### Ideias iniciais / Estratégia:
- Criar uma Stack se for abertura, faz push e dps verifica com o stack pop se o caracter que fecha é diferente da correspondente abertura


### Pseudocódigo (opcional):
...

### Funcionou? O que aprendi?

Sim funcionou, depois fiz com Array (getLast e removeLast) para ver se tambem dava


### O que faria diferente se tentasse de novo amanhã?
...

### Avaliação (de 1 a 5):
- Esforço: 3
- Clareza do problema: 5
- Nível de satisfação:  3
