package eu.oloeriu.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GraphTraversal {
	static class Node {
		private int data;
		private boolean visited;
		private List<Node> neighbours;

		public Node(int data) {
			this.data = data;
			this.visited = false;
			this.neighbours = new ArrayList<Node>();
		}

		public void addNeighbours(Node node) {
			this.neighbours.add(node);
		}

		public List<Node> getNeighbours() {
			return neighbours;
		}
	}

	// recursive
	public void dfs(Node node) {
		node.visited = true;
		System.out.print(node.data + " ");
		for (Node neighbour : node.getNeighbours()) {
			if (!neighbour.visited) {
				dfs(neighbour);
			}
		}
	}

	// iterative dfs
	public void dfsWithStack(Node node) {
		Stack<Node> stack = new Stack<Node>();
		stack.add(node);
		node.visited = true;
		System.out.print(node.data + " ");
		while (!stack.isEmpty()) {
			Node element = stack.pop();
			for (Node neighbour : element.getNeighbours()) {
				if (!neighbour.visited) {
					stack.add(neighbour);
					neighbour.visited = true;
					System.out.print(neighbour.data + " ");
				}
			}
		}
	}

	public static void main(String arg[]) {
		Node node40 = new Node(40);
		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50 = new Node(50);
		Node node70 = new Node(70);

		node40.addNeighbours(node10);
		node40.addNeighbours(node20);
		node10.addNeighbours(node30);
		node20.addNeighbours(node10);
		node20.addNeighbours(node30);
		node20.addNeighbours(node60);
		node20.addNeighbours(node50);
		node30.addNeighbours(node60);
		node60.addNeighbours(node70);
		node50.addNeighbours(node70);

		GraphTraversal dfsExample = new GraphTraversal();

		System.out.println("The DFS traversal of the graph using stack ");
		dfsExample.dfsWithStack(node40);

		System.out.println();

		// Resetting the visited flag for nodes
		node40.visited = false;
		node10.visited = false;
		node20.visited = false;
		node30.visited = false;
		node60.visited = false;
		node50.visited = false;
		node70.visited = false;

		System.out.println("The DFS traversal of the graph using recursion ");
		dfsExample.dfs(node40);

	}
}