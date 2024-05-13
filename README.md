# Estruturas de Dados | Data Structures 🌳🎲

Este repositório contém minhas implementações de algumas estruturas de dados em Java. Além das encontradas aqui estou trabalhando na adição de Árvores AVL, Grafos e Tabela Hash. Atualmente todas elas estão utilizando o tipo de dado ``int``.

This repository contains my implementations of some data structures in Java. In addition to those found here, I am working on adding AVL Trees, Graphs, and Hash Tables. Currently, all of them use the `int` data type.

## Motivação do Repositório | Why This Project? 🤔

* **Aprendendo com a Prática:** A intenção deste projeto é solidificar meu entendimento em algoritmos e estruturas de dados fundamentais. 
* **A Prática Leva à Perfeição:** Implementar esses conceitos do zero me ajuda a entender como funcionam e a melhorar minhas habilidades de codificação.

* **Learning by Doing:**  I built this project to solidify my understanding of fundamental data structures and algorithms.
* **Practice Makes Perfect:** Implementing these concepts from scratch helps me get how they work and improve my coding skills. 

## Estruturas de Dados Implementadas | Data Structures Implemented 📑

Eis aqui uma lista de estruturas de dados que você encontrará neste repositório:

* **Listas:** (Lista de Arrays, Lista Encadeada)
* **Pilha:** (Pilha utilizando Lista Encadeada)
* **Fila:** (Fila utilizando Lista Encadeada)
* **Árvore:** (Árvore Binária de Busca)
* **[Em Progresso]:** Árvores AVL, Grafos, Tabela Hash

Here's a list of the data structures you'll find in this repository:

* **Lists:** (Array List, Singly Linked List)
* **Stack:** (Linked List-based Stack)
* **Queue:** (Linked List-based Queue)
* **Tree:** (Binary Search Tree)
* **[In Progress]:** AVL Trees, Graphs, Hash Table

## How to Use 🧐

1. **Clone o repositório:** `git clone https://github.com/fhplira/dataStructures.git`
2. **Navegue até o diretório do projeto:** `cd dataStructures`
3. **Explore o código:** Cada estrutura de dado está implementada em seu próprio arquivo (ex: `MyLinkedList.java`, `BinarySearchTree.java`)
---
1. **Clone the repository:** `git clone https://github.com/fhplira/dataStructures.git`
2. **Navigate to the project directory:** `cd dataStructures`
3. **Explore the code!** Each data structure is implemented in its own file (e.g., `MyLinkedList.java`, `BinarySearchTree.java`).

##  Exemplo de Uso | Example Usage 💡

*Observação: Todas as implementações de estrutura de dados atualmente usam o tipo de dado `int`.*
*Note: All data structure implementations currently use the `int` data type.*

```java
// Exemplo de uso da implementação da Árvore Binária de Busca
// Example of using the Binary Search Tree implementation

package com.projects;

import com.projects.ade.*;

public class Main {
    public static void main(String[] args) {

        Tree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(8);
        bst.add(6);
        bst.add(15);
        bst.add(17);
        bst.remove(15);
        System.out.println(bst.contains(15)); // Output: false
        System.out.println(bst.contains(8)); // Output: true

    }
}
