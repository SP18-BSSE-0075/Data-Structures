
import umi.nonlinear.*;

public class Tester 
{

	public static void main(String[] args) 
	{
//        BinaryTree binTree = new BinaryTree();
//		
//		binTree.grow(12);
//		binTree.grow(19);
//		binTree.grow(13);
//		binTree.grow(17);
//		binTree.grow(11);
//		
//		System.out.println("\t  I N  O R D E R ");
//		binTree.inOrder();
//		System.out.println();
//		System.out.println("\t P O S T  O R D E R ");
//		System.out.println();
//		binTree.postOrder();
//		System.out.println();
//		System.out.println("\t  P R E  O R D E R ");
//		System.out.println();
//		binTree.preOrder();
//		System.out.println();
//		
//		System.out.println(" H E I G H T  : " + binTree.height());
//		System.out.println(" D E P T H  : " + binTree.depth(17));
//		
//        BinarySearchTree bst = new BinarySearchTree();
//		
//		bst.grow(5);
//		bst.grow(9);
//		bst.grow(6);
//		bst.grow(10);
//		bst.grow(2);
//		bst.grow(1);
//		bst.grow(4);
//		bst.grow(3);
//		
//		System.out.println();
//		
//		System.out.println("\t  I N  O R D E R ");
//		bst.inOrderTraverse();
//		System.out.println();
//		System.out.println(" H E I G H T  : " + bst.height());
//		System.out.println(" D E P T H  : " + bst.depth(10));
		
		WeightedGraph graph = new WeightedGraph(6);
		
		graph.addEdge(0, 2, 20);
		graph.addEdge(2, 4, 24);
		graph.addEdge(0, 4, 40);
		graph.addEdge(1, 3, 31);
		graph.addEdge(3, 5, 53);
		
		graph.revealGraph();
		
		
		graph.revealGraph();
		

	}

}
