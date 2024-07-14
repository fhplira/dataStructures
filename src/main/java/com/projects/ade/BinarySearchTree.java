package com.projects.ade;

public class BinarySearchTree<T extends Comparable<T>> implements BinaryTree<T> {

    Node<T> root;
    int size;

    @Override
    public void preOrderTraversal() {
        preOrderTraversal(this.root);
    }

    private void preOrderTraversal(Node<T> node) {
        if(node != null) {
            System.out.println(node.value);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    @Override
    public void inOrderTraversal() {
        inOrderTraversal(this.root);
    }

    private void inOrderTraversal(Node<T> node) {
        if(node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.value);
            inOrderTraversal(node.right);

        }
    }

    @Override
    public void postOrderTraversal() {
        postOrderTraversal(this.root);
    }

    private void postOrderTraversal(Node<T> node) {
        if(node != null) {
            postOrderTraversal(node.right);
            postOrderTraversal(node.left);
            System.out.println(node.value);
        }
    }

    @Override
    public void add(T element) {
        this.root = add(element, this.root);
    }

    private Node<T> add(T element, Node<T> node) {

        if (node == null) {
            this.size++;
            return new Node<>(element);
        } else {
            if (element.compareTo(node.value) < 0) {
                node.left = add(element, node.left);
            } else {
                node.right = add(element, node.right);
            }
            return node;
        }
    }

    @Override
    public boolean contains(T value) {
        return contains(value, this.root);
    }

    private boolean contains(T value, Node<T> node) {
        if(node != null) {
            if(node.getValue() == value) {
                return true;
            } else if(value.compareTo(node.getValue()) < 0) {
                return contains(value, node.left);
            } else {
                return contains(value, node.right);
            }
        } else {
            return false;
        }
    }

    @Override
    public void remove(T value) {
        this.root = remove(value, this.root);
    }

    private Node<T> remove(T value, Node<T> node) {
        if(node != null) {
            if(node.value == value) {
                this.size--;
                if(node.right == null && node.left == null) {
                    return null;
                } else if(node.right != null && node.left != null) {
                    Node<T> inOrderSuccessor = node.right;
                    while(inOrderSuccessor.left != null) {
                        inOrderSuccessor = inOrderSuccessor.left;
                    }
                    node.value = inOrderSuccessor.value;
                    node.right = remove(inOrderSuccessor.value, node.right);
                    return node;
                } else {
                    return node.left == null ? node.right : node.left;
                }
            } else if(value.compareTo(node.value) < 0) {
                node.left = remove(value, node.left);
            } else {
                node.right = remove(value, node.right);
            }
        } else {
            throw new IllegalArgumentException("Cannot remove a value from a null node");
        }
        return node;
    }

    private class Node<T extends Comparable<T>> {
        T value;
        Node<T> left;
        Node<T> right;

        public Node(T value) {
            this.value = value;
        }


        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }
    }

}
