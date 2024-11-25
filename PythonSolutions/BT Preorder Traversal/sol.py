from typing import List, Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        #  Iterative Way

        # if not root:
        #     return  []
        # stack = [root]
        # result = []
        # while stack:
        #     top = stack.pop()
        #     result.append(top.val)
        #     if top.right:
        #         stack.append(top.right)
        #     if top.left:
        #         stack.append(top.left)
        # return result

        #    Recursion Way
        

        def traverse(node):
            if node:
                result.append(node.val)  # Visite du nœud
                traverse(node.left)  # Parcours du sous-arbre gauche
                traverse(node.right)  # Parcours du sous-arbre droit

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

