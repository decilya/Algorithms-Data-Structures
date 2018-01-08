package ilya_v.java.algorithms.lesson_5;

class Stack {
    final int LENGTH = 1000;
    int count = -1;

    int[] field;

    Stack() {
        this.field = new int[this.LENGTH - 1];
        for (int i = 0; i <= this.field.length - 1; i++) {
            this.field[i] = 0;
        }
    }

    boolean push(int n) {
        if (count < this.LENGTH) {
            this.count++;
            this.field[this.count] = n;
            return true;
        }

        return false;
    }

    boolean pop() {
        if (this.count != -1) {
            this.field[this.count] = 0;
            this.count--;

            return true;
        }

        return false;
    }
}