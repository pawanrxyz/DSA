// public class Trees {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public class BinaryTree1 {
//         static int idx = -1;
//         public static Node buildTree(int nodes[]) {
//             idx++;
//             if(nodes[idx] == -1) {
//                 return null;
//             }               
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);
//             return newNode;        
//         }
//     }
//     public static void Inorder(Node node){
//         if(node==null) return;
//         Inorder(node.left);
//         System.out.println(node.data);
//         Inorder(node.right);
//     }
// Trees.Inorder(root);
    
//     public static void main(String args[]) {
//         int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 
//         Node root = BinaryTree1.buildTree(nodes);      
//         // Node root = tree.buildTree(nodes)
        
//     }
    
// }