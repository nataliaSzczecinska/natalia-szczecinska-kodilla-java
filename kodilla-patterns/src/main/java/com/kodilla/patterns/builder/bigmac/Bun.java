package com.kodilla.patterns.builder.bigmac;

public enum Bun {
    BUN_WITH_SESAME_SEEDS("with sesame"),
    BUN_WITHOUT_SESAME_SEEDS("without sesame");

    private String bun;

    Bun(String bun) {
        this.bun = bun;
    }

    public String getBun() {
        return bun;
    }
}
