package day13;

class ProducerConsumer{

    int item;
    boolean flag = false;
    synchronized public void producer(int item) throws Exception{
        if(flag){
            wait();
        }
        this.item = item;
        System.out.println("Produced : "+ this.item);
        flag = true;
        notify();
    }

    synchronized public int consumer() throws Exception{
        if(!flag){
            wait();
        }
        System.out.println("Consumed : "+ item);
        flag = false;
        notify();
        return this.item;
    }

}

class Producer extends Thread{
    ProducerConsumer comp;

    Producer(ProducerConsumer c){
        this.comp = c;
    }

    public void run(){
        int i=1;
        while (true){

            try{
                this.comp.producer(i);
                Thread.sleep(2000);
                i++;
            }catch (Exception e){

            }
        }
    }
}

class Consumer extends Thread{
	ProducerConsumer comp;

    Consumer(ProducerConsumer c){
        this.comp = c;
    }

    public void run(){
        int i = 1;
        while (true){


            try{
                this.comp.consumer();
               Thread.sleep(4000);
            }catch (Exception e){

            }
        }
    }
}
public class Q3_Thread_ProducerConsumer {
    public static void main(String[] args) {
    	ProducerConsumer comp = new ProducerConsumer();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);

        p.start();
        c.start();
    }
}
