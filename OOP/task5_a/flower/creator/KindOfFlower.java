public enum KindOfFlower {
    ROSE("Роза"),
    TULIP("Тюльпан"),
    ORCHID("Орхидея"),
    NARCISSUS("Нарцисс"),
    LILY("Лилия");

    private String value;

    KindOfFlower(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
