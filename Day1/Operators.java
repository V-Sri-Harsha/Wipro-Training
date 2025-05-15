public class Operators {
    public static void main(String[] args) {
        System.out.println("Hello, Harsha!");
//Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("\nArithmetic Operators:");
        System.out.println("\nAddition: " + (a + b));
        System.out.println("\nSubtraction: " + (a - b));
        System.out.println("\nMultiplication: " + (a * b));
        System.out.println("\nDivision: " + (a / b));
        System.out.println("\nModulus: " + (a % b));
//Increment & Decrement Operators
        System.out.println("\nIncrement & Decrement Operators:");
        int x = 5;
        System.out.println("\nOriginal x: " + x);
        System.out.println("\nPost-increment x++: " + (x++));
        System.out.println("\nAfter post-increment: " + x);
        System.out.println("\nPre-increment ++x: " + (++x));
//Assignment Operators
        System.out.println("\nAssignment Operators:");
        int y = 10;
        y += 5;
        System.out.println("\ny after += 5: " + y);
        y *= 2;
        System.out.println("\ny after *= 2: " + y);
//Relational Operators
        System.out.println("\nRelational Operators:");
        int p = 10, q = 20;
        System.out.println("\np == q: " + (p == q));
        System.out.println("\np != q: " + (p != q));
        System.out.println("\np < q: " + (p < q));
        System.out.println("\np > q: " + (p > q));
//Logical Operators
        System.out.println("\nLogical Operators:");
        boolean cond1 = true;
        boolean cond2 = false;
        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
//Negation Operator
        System.out.println("\nNegation Operator:");
        System.out.println("!cond1: " + (!cond1));
//Concatenation
        System.out.println("\nString Concatenation Operator:");
        String s1 = "Hello", s2 = "World";
        System.out.println("\nConcatenated String: " + s1 + " " + s2);
//Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int bitA = 5, bitB = 3;
        System.out.println("\nbitA & bitB: " + (bitA & bitB));
        System.out.println("\nbitA | bitB: " + (bitA | bitB));
        System.out.println("\nbitA ^ bitB: " + (bitA ^ bitB));
//Shift Operators
        System.out.println("\nShift Operators:");
        int shift = 8;
        System.out.println("\nLeft shift (shift << 1): " + (shift << 1));
        System.out.println("\nRight shift (shift >> 1): " + (shift >> 1));
//Conditional / Ternary Operator
        System.out.println("\nTernary Operator:");
        int num1 = 10, num2 = 20;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Max using ternary: " + max);
//new Operator
        System.out.println("\nnew Operator:");
        String name = new String("Harsha");
        System.out.println("\nCreated using new: " + name);
//instanceof Operator
        System.out.println("\ninstanceof Operator:");
        System.out.println("\nname instanceof String: " + (name instanceof String));
//if Statements
        System.out.println("\nif Statement:");
        int score = 75;
        if (score >= 50) {
            System.out.println("\nPassed!");
        }
//switch Statement
        System.out.println("\nswitch Statement:");
        int day = 3;
        switch (day) {
            case 1: System.out.println("\nMonday"); break;
            case 2: System.out.println("\nTuesday"); break;
            case 3: System.out.println("\nWednesday"); break;
            default: System.out.println("\nInvalid Day");
        }
//while Loop
        System.out.println("\nwhile Loop:");
        int count = 0;
        while (count < 3) {
            System.out.println("\nCount is: " + count);
            count++;
        }
//do...while Loop
        System.out.println("\ndo...while Loop:");
        int z = 0;
        do {
            System.out.println("\nz is: " + z);
            z++;
        } while (z < 3);
//for Loop
        System.out.println("\nfor Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\ni = " + i);
        }
    }
}
