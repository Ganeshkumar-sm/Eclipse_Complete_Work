package graphs;

import java.util.ArrayList;
import java.util.Iterator;

// Notes
// BreathFirstSearch in graph Datastructure need Queue Datastructure to
// implement it. like FIFO-(First In First Out) principle.

public class BreathFirstSearch {
	int V;
	ArrayList<Integer> adj[];
	@SuppressWarnings("unchecked")
	BreathFirstSearch(int noOfVertex) {
		V = noOfVertex;
		adj = new ArrayList[noOfVertex];
		for (int i = 0; i < noOfVertex; i++) {
			adj[i] = new ArrayList<>();
		}
	}
	
	void edge(int x, int y) {
		adj[x].add(y);
	}

	void breathFirstSearch(int sourcevertex) {
		boolean[] visited = new boolean[V];

		ArrayList<Integer> al = new ArrayList<Integer>();

		visited[sourcevertex] = true;

		al.add(sourcevertex);

		while (!al.isEmpty()) {

			sourcevertex = al.remove(0);

			System.out.print(sourcevertex + " ");

			Iterator<Integer> i = adj[sourcevertex].iterator();

			while (i.hasNext()) {
				int n = (int) i.next();

				if (!visited[n]) {
					visited[n] = true;
					al.add(n);
				}
			}

		}

	}

	public static void main(String[] args) {

		BreathFirstSearch g1 = new BreathFirstSearch(6);
		g1.edge(0, 1);
		g1.edge(0, 2);
		g1.edge(0, 5);
		g1.edge(1, 0);
		g1.edge(1, 2);
		g1.edge(2, 0);
		g1.edge(2, 1);
		g1.edge(2, 3);
		g1.edge(2, 4);
		g1.edge(3, 2);
		g1.edge(4, 2);
		g1.edge(4, 5);
		g1.edge(5, 0);
		g1.edge(5, 4);

		g1.breathFirstSearch(0);

	}

}
