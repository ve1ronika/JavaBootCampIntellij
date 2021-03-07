package activity;

public class Calculator {
    private int a;
    private int b;


        public Calculator () {
            this.a = 0;
            this.b = 0;
        }
        public Calculator (int a, int b) {
            this.a = a;
            this.b = b;
        }
        public int getA() {
            return a;
        }
        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }
        public void setB(int b) {
            this.b = b;
        }

        public int addition() {
            return a + b;
        }

        public int substraction() {
            if (a > b) {
                return a - b;
            } else {
                return b - a;
            }
        }
        public double devision() {
                if (a > b) {
                    return (double) a / (double) b;
                } else {
                    return (double)b / a;
                }
            }
        public int multiplication(){
                return a*b;
                }
    }


