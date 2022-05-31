package numberthree;

import java.util.Scanner;

public class Main {
    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int edge1;
        int edge2;
        boolean condition = true;
        int stops = 1;
        int counter = 0;

        Graph map = new Graph(N, M);
   
        while (counter < N) {
            try {
                edge1 = (sc.nextInt()-1);                    
                edge2 = (sc.nextInt()-1);
                int distance = sc.nextInt();
                
                map.addEdge(edge1, edge2, distance);
                stops++;
                    
            } catch (Exception e) {
                condition = false;
            }
            counter++;
        }
        map.displayGraph();

        map.dijkstra(0, M);
    }
}
