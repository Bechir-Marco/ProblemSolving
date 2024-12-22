from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.res = 0

        def dsf(curr):
            if not curr:
                return 0

            left = dsf(curr.left)
            right = dsf(curr.right)
            self.res = max(self.res, left + right)
            return 1 + max(left, right)

        dsf(root)
        return self.res
