class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isBalanced(self, root):
        def height(node):
            if not node:
                return 0, True
            left_height, left_balanced = height(node.left)
            right_height, right_balanced = height(node.right)
            if not left_balanced or not right_balanced:
                return 0, False
            if abs(left_height - right_height) > 1:
                return 0, False

            return 1 + max(left_height, right_height), True

        _, balanced = height(root)
        return balanced


# Exemple d'utilisation
root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
root.left.left = TreeNode(4)
root.left.right = TreeNode(5)

# Créer une instance de Solution et vérifier si l'arbre est équilibré
sol = Solution()
print(sol.isBalanced(root))  # Affiche True si l'arbre est équilibré, False sinon
