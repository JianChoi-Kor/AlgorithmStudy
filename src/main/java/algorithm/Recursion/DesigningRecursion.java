package algorithm.Recursion;

public class DesigningRecursion {

    public static void main(String[] args) {

    }

    // 순차탐색
    public static int search(int[] data, int n, int target) {
        for (int i=0; i<n; i++) {
            if (data[i]==target) {
                return i;
            }
        }
        return -1;
    }

    // 순차탐색(매개변수의 명시화)
    // search(data, 0, n-1, target)으로 호출한다면 위 함수와 완전히 동일한 기능을 수행한다.
    public static int search(int[] data, int begin, int end, int target) {
        if (begin>end) {
            return -1;
        } else if (target==data[begin]) {
            return begin;
        } else {
            return search(data, begin+1, end, target);
        }
    }

    // 최대값 찾기(매개변수의 명시화)
    public static int findMax(int[] data, int begin, int end) {
        if (begin==end) {
            return data[begin];
        } else {
            return Math.max(data[begin], findMax(data, begin+1, end));
        }
    }
}
