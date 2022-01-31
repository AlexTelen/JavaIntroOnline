public class PackCreator {

    public static Pack getPack(KindOfPack kind) {
        switch (kind) {
            case PAPER:
                return new Paper(kind.getValue());
            case CELLOPHANE:
                return new Cellophane(kind.getValue());
            case BASKET:
                return new Basket(kind.getValue());
            default:
                return null;
        }
    }
}
