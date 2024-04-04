package org.design.pattern.strategy;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void filter() {
        System.out.println("BlackAndWhiteFilter");
    }
}
