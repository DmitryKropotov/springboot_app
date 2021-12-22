package ru.project.training.interview;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public void addValue(int value) {
        if (value == this.value) {
            return;
        }
        if(value < this.value) {
            if (this.leftChild == null) {
                this.leftChild = new Node(value);
                return;
            }
            this.leftChild.addValue(value);
        }
        if(value > this.value) {
            if (this.rightChild == null) {
                this.rightChild = new Node(value);
                return;
            }
            this.rightChild.addValue(value);
        }
    }

    public boolean checkIfValueExists(int value) {
        if (this.value == value) {
            return true;
        }
        if (value<this.value) {
            if (this.leftChild == null) {
                return false;
            }
            return this.leftChild.checkIfValueExists(value);
        }
        if (this.rightChild == null) {
            return false;
        }
        return this.rightChild.checkIfValueExists(value);

    }
}
