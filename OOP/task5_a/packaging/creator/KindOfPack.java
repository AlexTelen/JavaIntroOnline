public enum KindOfPack {
    PAPER("бумага"),
    CELLOPHANE("целлофан"),
    BASKET("корзина");

    private String value;

    KindOfPack(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
