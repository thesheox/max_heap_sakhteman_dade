import java.util.Random;

public class main_heap {
    public static void main(String[] args) {

        HeapPriorityQueue<Integer,Integer> p =new HeapPriorityQueue<Integer,Integer>();
        Random r =new Random();
        for(int i=0;i<100;i++){
            p.insert(r.nextInt(100), r.nextInt(100));
        }
        
          while(p.isEmpty()!=true){
            System.out.print(p.removeMin().getKey());
            System.out.print(",");
          }
        
    }
}