package org.design.pattern.Observer;

public class PieChart implements Observer {
    private DataSource dataSource;

    public PieChart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("PieChart updated "+dataSource.getValue());
    }
}
