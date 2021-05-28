import java.io.*;
import java.util.*;

public class No1260_DFS와BFS {
    static ArrayList<Integer> list[];
    static boolean isVisited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp[] = br.readLine().split(" ");
        int vertex = Integer.parseInt(temp[0]); //정점의 개수
        int edge = Integer.parseInt(temp[1]); //간선의 개수
        int start = Integer.parseInt(temp[2]); //탐색을 시작할 정점의 번호

        list = new ArrayList[vertex+1];
        isVisited = new boolean[vertex+1];

        for (int i = 0; i < vertex+1; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < edge; i++) {
            temp = br.readLine().split(" ");
            int u = Integer.parseInt(temp[0]);
            int v = Integer.parseInt(temp[1]);

            list[u].add(v);
            list[v].add(u);
        }
        for (int i=0;i<list.length;i++) {
            Collections.sort(list[i]);
        }

        dfs(start);
        System.out.println();

        isVisited=new boolean[vertex+1]; //초기화
        bfs(start);
        System.out.println();
    }

    static private void bfs(int start) {
        Queue bfsQueue = new LinkedList();
        bfsQueue.add(start);
        isVisited[start]=true;

        while (!bfsQueue.isEmpty() ) {
            int x=(Integer)bfsQueue.poll();
            System.out.print(x+" ");
            for (int y : list[x]) {

                if (!isVisited[y]) {
                    isVisited[y]=true;

                    bfsQueue.add(y);
                }
            }

        }
    }

    static private void dfs(int x) { //재귀
        if (isVisited[x]) {
            return;
        }
        isVisited[x] = true;
        System.out.print(x + " ");
        for (int y : list[x]) {
            if (!isVisited[y]) {
                dfs(y);
            }
        }
    }
}
