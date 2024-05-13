package com.projects.ade;

public class BinarySearchTree implements BinaryTree {

    Node root;
    int size;

    @Override
    public void preOrderTraversal() {
        preOrderTraversal(this.root);
    }

    private void preOrderTraversal(Node node) {
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

    private void inOrderTraversal(Node node) {
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

    private void postOrderTraversal(Node node) {
        if(node != null) {
            postOrderTraversal(node.right);
            postOrderTraversal(node.left);
            System.out.println(node.value);
        }
    }

    @Override
    public void add(int element) {
        this.root = add(element, this.root);
    }

    private Node add(int element, Node node) {

        if (node == null) {
            this.size++;
            return new Node(element);
        } else {
            if (element < this.root.value) {
                node.left = add(element, node.left);
            } else {
                node.right = add(element, node.right);
            }

        }
        return node;
    }

    @Override
    public boolean contains(int value) {
        return contains(value, this.root);
    }

    private boolean contains(int value, Node node) {
        if(node != null) {
            if(node.getValue() == value) {
                return true;
            } else if(value < node.getValue()) {
                return contains(value, node.left);
            } else {
                return contains(value, node.right);
            }
        } else {
            return false;
        }
    }

    @Override
    public void remove(int value) {
        this.root = remove(value, this.root);
    }

    private Node remove(int value, Node node) {
        if(node != null) {
            if(node.value == value) {
                this.size--;
                if(node.right == null && node.left == null) {
                    return null;
                } else if(node.right != null && node.left != null) {
                    Node inOrderSuccessor = node.right;
                    while(inOrderSuccessor.left != null) {
                        inOrderSuccessor = inOrderSuccessor.left;
                    }
                    node.value = inOrderSuccessor.value;
                    node.right = remove(inOrderSuccessor.value, node.right);
                    return node;
                } else {
                    return node.left == null ? node.right : node.left;
                }
            } else if(value < node.value) {
                node.left = remove(value, node.left);
            } else {
                node.right = remove(value, node.right);
            }
        } else {

        }
        return node;
    }

    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }


        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

}
