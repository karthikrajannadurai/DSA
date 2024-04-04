package org.design.pattern.Observer;

public class Main {
    public static void main(String[] args) {

// There are two types of sending updated data to observer.
        // push style -- video
        // pull style -- implemented
        DataSource dataSource = new DataSource();
        Observer spreadSheet = new SpreadSheet(dataSource);
        Observer pieChart = new PieChart(dataSource);
        dataSource.addObserver(spreadSheet);
        dataSource.addObserver(pieChart);
        dataSource.setValue(1);
    }
}
