from typing import List, Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
    

        result = []

        def traverse(node):
            if node:
                traverse(node.left)  
                traverse(node.right) 
                result.append(node.val)  


        traverse(root)
        return result


if __name__ == "__main__":
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)
    root.left.right.left = TreeNode(6)
    root.left.right.right = TreeNode(7)
    root.right.right = TreeNode(8)

    sol = Solution()
    print(sol.preorderTraversal(root))  # Attendu : [1, 2, 4, 5, 6, 7, 3, 8]
