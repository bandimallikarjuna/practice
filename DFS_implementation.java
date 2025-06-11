package practice;
import java.util.*;
public class DFS_implementation {
static void dfs(int person,List<List<Integer>>graph,boolean[]visited, List<Integer> circle)
{
	visited[person]=true;
	circle.add(person);
	for(int friend:graph.get(person)) {
		if(!visited[friend]) {
			dfs(friend,graph,visited,circle);
		}
	}
}
public static void main(String[]args) {
	int n=6;
	List<List<Integer>> graph=new ArrayList<>();
	for(int i=0;i<n;i++)graph.add(new ArrayList<>());
	graph.get(0).add(1);
	graph.get(1).add(0);
	graph.get(1).add(2);
	graph.get(2).add(1);
	graph.get(3).add(4);
	graph.get(4).add(3);
int startPerson=1;
boolean[] visited=new boolean[n];
List<Integer> circle=new ArrayList<>();
dfs(startPerson,graph,visited,circle);
System.out.println("people in the same social circle as person"+startPerson+":"+circle);
}
}
