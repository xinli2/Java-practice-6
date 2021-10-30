public class Drill06 {

    // Given a generic HashNode<K,V> as a parameter 
    // return the value in the HashNode.
    public static <K, V> V returnValue(HashNode<K, V> node) {
        return node.getValue();
    }

    // Given a generic HashNode<K,V> as a parameter
    // return the key in the HashNode.
    public static <K, V> K returnKey(HashNode<K, V> node) {
        return node.getKey();
    }

    // In the singly-linked list of generic HashNode<K,V>s 
    // that starts with the given node, return the value 
    // in the last node.
    public static <K, V> V findLastVal(HashNode<K, V> first) {
        while (first.getNext() != null) {
        	first = first.getNext();
        }
        return first.getValue();
    }

    // In the singly-linked list of generic HashNode<K,V>s that starts 
    // with the given node, return the indexed node. The first node is
    // index 0, then next index 1, etc.
    public static <K, V> HashNode<K, V> findNodeByIndex(HashNode<K, V> first,
            int index) {
    	for (int i = 0; i < index; i++) {
    		first = first.getNext();
    	}
        return first;
    }

    // Count all of the nodes in the given singly-linked list of
    // generic HashNode<K,V>s that starts with the given node.
    public static <K, V> int countNodes(HashNode<K, V> first) {
        int count = 1;
        if (first == null) {
        	return 0;
        }
        while (first.getNext() != null) {
        	count++;
        	first = first.getNext();
        }
        return count;
    }

}
