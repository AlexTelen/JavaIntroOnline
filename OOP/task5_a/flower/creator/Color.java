public enum Color {
    RED("красный"),
    WHITE("белый"),
    YELLOW("желтый"),
    PINK("розовый"),
    PURPLE("фиолетовый");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
