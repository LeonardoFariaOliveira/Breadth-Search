# Breadth-Search
Algoritmo de busca por extensão utilizado para resolver o problema das cidades feito em Java
<img src='https://github.com/LeonardoFariaOliveira/Breadth-Search/assets/66142358/e4f1aed1-1857-45f5-840a-cf4ba27374d0'/>


# Problema
O problema consistia em encontrar o menor caminho possível para a cidade indicada, recebendo a cidade de início(s) e fim(e) no parametro na hora de executar
conforme as cidades do mapa

# Solução
Primeiro mapeei o mapa em grafos, onde cada cidade é um nó e possui nó vizinhos(adjacentes). Sendo assim criei uma classe Nó que possui:
* nomeName(nome do nó atual)
* cityName(o nome do vizinho)
* pos(posição do vizinho)
  
Sendo assim se um nó possui 4 vizinhos, eu crio 4 objetos nó com o mesmo nodeName porém com cityName e pos diferentes. Exemplo:
Arad possui 3 vizinhos então crio 3 objetos passando o mesmo nome e a mesma posição no array de nós
<img src='https://github.com/LeonardoFariaOliveira/Breadth-Search/assets/66142358/27040571-c476-4500-a48d-28fe717a67a1'/>

Depois de criar o grafo, apliquei o algoritmo de busca em largura usando as classes: ListIterator, LinkedList e Queue do Java

## Instalação

```bash
$ git clone https://github.com/LeonardoFariaOliveira/Breadth-Search
$ cd Breadth-Search
```

## Running the app

```bash
$ javac Main.java
# java Main <cidade-de-partida> <cidade-de-destino>
$ java Main Arad Bucharest
```
