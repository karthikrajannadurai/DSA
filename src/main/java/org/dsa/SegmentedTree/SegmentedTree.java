package org.dsa.SegmentedTree;

class SegmentObject {

    private int sum;
    private int L;
    private int R;
    SegmentObject left, right;

    SegmentObject(int sum, int L, int R) {
        this.sum = sum;
        this.L = L;
        this.R = R;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public int getL() {
        return L;
    }

    public void setL(int l) {
        L = l;
    }
}

class SegmentTree {

    public SegmentObject buildTree(int[] nums, int L, int R) {

        if (L == R) {
            return new SegmentObject(nums[L], L, R);
        }
        SegmentObject root = new SegmentObject(0, L, R);
        int mid = (L + R) / 2;
        root.left = buildTree(nums, L, mid);
        root.right = buildTree(nums, mid + 1, R);
        root.setSum(root.left.getSum() + root.right.getSum());
        return root;
    }

    public void update(int index, SegmentObject root, int data) {

        if (root.getL() == root.getR()) {
            root.setSum(data);
            return;
        }
        int mid = (root.getL() + root.getR()) / 2;
        if (index <= mid) {
            update(index, root.left, data);
        } else {
            update(index, root.right, data);
        }
        root.setSum(root.left.getSum() + root.right.getSum());
    }

    public int rangeQuery(int L, int R, SegmentObject root) {

        if (root.getL() == L && root.getR() == R) {
            return root.getSum();
        }

        int mid = (root.getL() + root.getR()) / 2;
        if (L > mid) {
            return rangeQuery(L, R, root.right);
        } else if (R <= mid) {
            return rangeQuery(L, R, root.left);
        } else {
            return (rangeQuery(L, mid, root.left) + rangeQuery(mid + 1, R, root.right));
        }
    }
}

public class SegmentedTree {
    public static void main(String[] args) {
        SegmentTree seg = new SegmentTree();
        System.out.println("Build Segmented Tree");
        SegmentObject root = seg.buildTree(new int[]{1, 2, 3, 4, 5}, 0, 4);
        System.out.println(root.getSum());

        System.out.println("Update the Tree");
        seg.update(4, root, 0);
        seg.update(0, root, 0);
        System.out.println(root.getSum());

        System.out.println("Range Query:");
        System.out.println(seg.rangeQuery(2, 4, root));
    }
}
