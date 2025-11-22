class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {
            boolean alive = true;

            // collision happens only if stack top > 0 and current < 0
            while (alive && a < 0 && !st.isEmpty() && st.peek() > 0) {
                if (st.peek() < -a) {
                    st.pop();  // top asteroid explodes
                } else if (st.peek() == -a) {
                    st.pop();  // both explode
                    alive = false;
                } else {
                    // top asteroid is bigger -> current one dies
                    alive = false;
                }
            }

            if (alive) st.push(a);
        }

        // build result
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }
}
