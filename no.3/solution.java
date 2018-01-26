import java.lang.Math;
import java.util.*;

public class solution {
    public static void main(String[] args) {
        int n = 4;
        nQueen(5);
    }


    public static int nQueen(int n) {
        if (n == 1) {
            System.out.println("1");
            System.out.println("[0]");
            return 1;
        }

        int result = 0;
        int value = 0;
        stack st = new stack(n); // 지정한 칸들을 저장하는 stack
        st.push(0); //초기화
        boolean removing = false; // stack 에서 pop된 상황. stack안의 상태에서 확인할 수 있는 경우를 모두 확인한 상태.
        while (!st.empty()) {
            value = 0;
            if (removing) {
                value = st.pop() + 1;
                removing = false;
            }

            //row에서 칸을 오른쪽으로 이동.
            while (!isPossible(st, value) && value <= n - 1) {
                value++;
            }

            //이 row에 만족하는 칸이 존재한다면...
            if (value <= n - 1) {
                st.push(value);
                if (st.full()) // stack이 다 찬 상황. nqueen 조건을 만족하는 경우.
                {
                    result++;
                    System.out.println(String.valueOf(result));
                    st.print();
                    st.pop();
                    removing = true;
                }
            }
            //만족하는 칸이 존재하지 않는다면, stack에서 뺀다.
            else {
                removing = true;
            }
        }
        return result;
    }


    //stack에 존재하는 숫자들과 value가 nqueen문제에 만족하는지 확인.
    public static boolean isPossible(stack st, int value) {
        int top = st.top;
        int[] arr = st.arr;
        if (st.empty()) {
            return true;
        }
        if (st.full()) {
            return false;
        }
        for (int i = 0; i < top; i++) {
            if (arr[i] == value || Math.abs(value - arr[i]) == (top - i)) {
                return false;
            }
        }
        return true;
    }

}

public class stack {
    int top;
    int[] arr;
    int size;

    public stack(int size) {
        this.top = 0;
        this.arr = new int[size];
        this.size = size;
    }

    public boolean push(int element) {
        if (top == size) {
            return false;
        } else {
            arr[top] = element;
            top++;
            return true;
        }
    }

    public int pop() {
        if (top >= 0) {
            top--;
            int tmp = arr[top];
            return tmp;
        } else {
            return -1;
        }

    }

    public boolean add() {
        if (top == 0) {
            return false;
        }
        arr[top - 1] = arr[top - 1] + 1;
        return true;
    }

    public boolean empty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean full() {
        if (size == top) {
            return true;
        } else {
            return false;
        }
    }

    public int sum(int[] args) {
        int sum = 0;
        for (int i = 0; i < top; i++) {
            sum += args[i] * arr[i];
        }
        return sum;
    }

    //stringbuilder를 쓰면 좋지만, 시간관계상 생략합니다.
    public void print() {
        String result = "[";
        for (int i = 0; i < this.size - 1; i++) {
            result += String.valueOf(this.arr[i]);
            result += ",";
        }
        result += String.valueOf(this.arr[this.size - 1]);
        result += "]";
        System.out.println(result);
    }
}
