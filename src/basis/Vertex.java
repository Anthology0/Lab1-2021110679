package basis;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 有向图结点类
 */
public class Vertex {
	public String name;						//节点保存的单词
	public HashSet<Vertex> predecessors;	//前驱节点
	public HashSet<Vertex> successors;		//后继节点
	public HashMap<Vertex, Integer> weights;//出边的权重
	
	public Vertex() {
		this.name = null;
		this.predecessors = new HashSet<>();
		this.successors = new HashSet<>();
		this.weights = new HashMap<>();
	}
	
	public Vertex(String name) {
		this.name = name;
		this.predecessors = new HashSet<>();
		this.successors = new HashSet<>();
		this.weights = new HashMap<>();
	}
	
	public boolean equals(Vertex v) {
		return this.name.equals(v.name);
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
}
