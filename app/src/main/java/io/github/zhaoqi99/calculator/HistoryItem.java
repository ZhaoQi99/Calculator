package io.github.zhaoqi99.calculator;

public class HistoryItem {
    private  int index;
    private String formula;
    private String result;

    public HistoryItem(String formula, String result) {
        this.formula = formula;
        this.result = result;
    }

    public HistoryItem() {
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFormula() {
        return formula;
    }

    public String getResult() {
        return result;
    }
}
