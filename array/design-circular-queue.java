class MyCircularQueue {
    int queue[];
    int front,rear,capacity,size;

    public MyCircularQueue(int k) {
        queue = new int[k];
        front = -1;
        rear = -1;
        capacity = k;
        size = 0;

    }
    
    public boolean enQueue(int value) {
        if(size == capacity){
            return false;
        }
        if(front == -1) front = 0;
        rear = (rear+1)%capacity;
        queue[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size == 0){
            return false;
        }
        front = (front+1)%capacity;
        size--;
        if(size == 0) front = rear = -1;
        return true;
    }
    
    public int Front() {
        if(size == 0) return -1;
        return queue[front];
    }
    
    public int Rear() {
        if(size == 0) return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(size == capacity){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */