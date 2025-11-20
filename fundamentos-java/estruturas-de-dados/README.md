# Estrutura de Dados em Java

## Diferentes Estruturas de Dados

### List
	
Permite elementos duplicados
Ordem dos elementos é a ordem de inserção

Vector, ArrayList, LinkedList

#### Como gerenciar inserção e remoção simultaneas?

- ArrayList nao tem nenhum tratamento para isso
- Vector tem
- Logo aplicações multithread vector > arraylist

### Set

Não permite duplicatas de objetos
Portanto o objeto a ser inserido precisa ter o **equals** e (desejável) o **hashCode** implementados

### Map

"Dicionário" de elementos que são identificados por chave/valor

Poder haver duplicados? Desde que as chaves sejão distintas


