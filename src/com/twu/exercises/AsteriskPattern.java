package com.twu.exercises;

public class AsteriskPattern {

    public String genOnePattern(char ch) {
        return "" + ch;
    }

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

    public String genDiamondPatternWithName(int n, String name) {
        return genDiamondPattern(n).replace(genHorizontalPattern(2 * n -1),name);
    }

    private String genPlaceHolder(int lineAmount, int lineNo) {
        return genHorizontalPattern(Math.abs(lineAmount - lineNo), ' ');
    }

    private String genHorizontalPattern(int amount, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= amount; i++) {
            sb.append(genOnePattern(ch));
        }
        return sb.toString();
    }
}
