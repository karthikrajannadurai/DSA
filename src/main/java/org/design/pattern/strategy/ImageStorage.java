package org.design.pattern.strategy;


public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store() {
        compressor.compress();
        filter.filter();
    }
}
