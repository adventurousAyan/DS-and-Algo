package com.company;

public class Queue {
    int capacity;
    int arr[] = new int[5];
    int front = this.arr.length-1;
    int val;
    int rear = this.arr.length-1;

    public boolean isFull(){
        return this.front == -1 && this.rear == this.arr.length - 1;
    }

    public boolean isEmpty(){
        return this.front == this.rear && !isFull();
    }
    public void enqueue(int val){
        if(!isFull()) {
            this.arr[this.front] = val;
            this.front = this.front - 1;
        } else
        {
            System.out.println("Queue is full. Cannot insert " + val);
        }
    }

    public void dequeue() {
        if(!isEmpty()) {
            int val = this.arr[this.rear];
            this.rear = this.rear - 1;
            System.out.println(val);
        }
        else {
            System.out.println("Queue is empty. No more items to dequeue");
        }

    }


}
