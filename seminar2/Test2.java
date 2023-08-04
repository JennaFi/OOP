package seminar2;

public class Test2 implements  INumeric {



        int start;
        int val;

        public Test2() {
            start = 0;
            val = 0;
        }

        @Override
        public void reset() {
            val = 0;
            start = 0;
        }

        @Override
        public int getNext() {
            val+=2;
            return val;
        }

        @Override
        public void setStart(int x) {
            start = x;
        }
}
