package com.twu.exercises;

public class AsteriskPattern {

    public String genHorizontalPattern(int amount) {
        return genHorizontalPattern(amount, '*');
    }

    public String genVerticalPattern(int amount) {
        StringBuilder sb = new StringBuilder();
        while (amount > 0) {
            sb.append("*").append(System.lineSeparator());
            amount--;
        }
        return sb.toString();
    }

    public String genRightTrianglePattern(int lineAmount) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= lineAmount; i++) {
            sb.append(genHorizontalPattern(i))
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }

    public String genIsoscelesTrianglePattern(int lineAmount) {
        StringBuilder sb = new StringBuilder();
        for (int lineNo = 1; lineNo <= lineAmount; lineNo++) {
            sb.append(genPlaceHolder(lineAmount, lineNo))
                    .append(genHorizontalPattern(2 * lineNo - 1, '*'))
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }

    public String genDiamondPattern(int n) {
        StringBuilder sb = new StringBuilder();
        int linesCount = 2 * n -1;
        for (int lineNo = 1; lineNo <= linesCount; lineNo++) {
            sb.append(genPlaceHolder(n, lineNo))
                    .append(genHorizontalPattern(Math.abs(linesCount - 2*Math.abs(n - lineNo)), '*'))
            .append(System.lineSeparator());
        }
        return sb.toString();
    }

    private String genPlaceHolder(int lineAmount, int lineNo) {
        return genHorizontalPattern(Math.abs(lineAmount - lineNo), ' ');
    }

    private static String genHorizontalPattern(int amount, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= amount; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AsteriskPattern asteriskPattern = new AsteriskPattern();
        System.out.println(asteriskPattern.genHorizontalPattern(1));
        System.out.println(asteriskPattern.genHorizontalPattern(5));
        System.out.println(asteriskPattern.genVerticalPattern(1));
        System.out.println(asteriskPattern.genVerticalPattern(5));
        System.out.println(asteriskPattern.genRightTrianglePattern(1));
        System.out.println(asteriskPattern.genRightTrianglePattern(5));
        System.out.println(asteriskPattern.genIsoscelesTrianglePattern(3));
        System.out.println(asteriskPattern.genIsoscelesTrianglePattern(5));
        System.out.println(asteriskPattern.genIsoscelesTrianglePattern(10));
        System.out.println(asteriskPattern.genDiamondPattern(3));
        System.out.println(asteriskPattern.genDiamondPattern(5));
        System.out.println(asteriskPattern.genDiamondPattern(10));
    }
}
