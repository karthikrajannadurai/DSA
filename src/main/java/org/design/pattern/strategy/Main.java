package org.design.pattern.strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage(new JpegCompress(), new BlackAndWhiteFilter());
        imageStorage.store();
    }
}
