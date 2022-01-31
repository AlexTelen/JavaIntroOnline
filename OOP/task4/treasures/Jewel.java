enum Jewel {
    DIAMOND("diamond"),
    EMERALD("emerald"),
    GOLD_COIN("gold coin"),
    PEARL("pearl"),
    RUBY("ruby");

    private String type;

    Jewel(String type) {
        this.type = type;
    }

    String getType() {
        return type;
    }

    @Override
    public String toString() {
        return getType();
    }
}
