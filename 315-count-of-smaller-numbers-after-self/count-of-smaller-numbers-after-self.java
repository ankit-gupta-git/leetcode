class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        int[] index = new int[n];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i< n; i++) {
            index[i] = i;
            list.add(0);
        }

        update(index, 0, n - 1, list, nums);

        return list;
    }

    private void update(int[] index, int l, int r, List<Integer> list, int[] nums) {
        if(l >= r) return;

        int mid = l + (r - l) / 2;

        update(index, l, mid, list, nums);
        update(index, mid + 1, r, list, nums);


        merge(index, l, mid, r, list, nums);
    }

    private void merge(int[] index, int l, int mid, int r, List<Integer> list, int[] nums) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        System.arraycopy(index, l ,left, 0, n1);
        System.arraycopy(index, mid+1, right, 0, n2);


        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2) {
            if(nums[left[i]] <= nums[right[j]]) {
                index[k++] = left[i];
                list.set(left[i], list.get(left[i]) + j);
                i++;
            } else index[k++] = right[j++];
        }

        while (i < n1) {
            index[k++] = left[i];
            list.set(left[i], list.get(left[i])+ j);
            i++;
        }
        while(j < n2) {
            index[k++] = right[j++];
        }
    }
}