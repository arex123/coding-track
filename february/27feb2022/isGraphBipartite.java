//pepcoding is Graph bipartite problem
import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   
   public static class Pair{
       
       int v; //vertices
       String psf;//path so far
       int level; //level of node
       
       Pair(int v,String psf,int level){
           this.v=v;
           this.psf=psf;
           this.level=level;
       }
       
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      // write your code here
      int[] vis = new int[vtces];
      Arrays.fill(vis,-1);
      
      for(int v=0;v<vtces;v++){
          if(vis[v]==-1){
              boolean isCompBipart = checkBipartite(graph,v,vis);
              if(!isCompBipart){
                  System.out.println("false");
                  return;
              }
          }
      }
      System.out.println("true");
   }
   public static Boolean checkBipartite(ArrayList<Edge>[] graph,int src,int[] vis){
       ArrayDeque<Pair> q = new ArrayDeque<>();
       q.add(new Pair(src,src+"",0));
       while(q.size()>0){
           Pair rem = q.removeFirst();
           
           if(vis[rem.v]!=-1){
               //if vertice is visited then we need to check if 
               //it is being visited at same level or at diff
               //if different then return false, means odd cycle
               
               if(rem.level!=vis[rem.v]){
                   return false;
               }
               
           }else{
               
               vis[rem.v]=rem.level;
               
           }
           
           for(Edge e:graph[rem.v]){
               if(vis[e.nbr]==-1){
                   q.add(new Pair(e.nbr,rem.psf+e.nbr,rem.level+1));
               }
           }
           
       }
       
       return true;
       
   }
   
}





















