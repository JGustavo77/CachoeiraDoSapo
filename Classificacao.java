public enum Classificacao {
    INOCENTE,
    SUSPEITO,
    CUMPLICE,
    ASSASSINO;

     public static Classificacao Classificar(int respostasPositivas) {
        return switch (respostasPositivas) {
            case 2 -> SUSPEITO;
            case 3, 4 -> CUMPLICE;
            case 5 -> ASSASSINO;
            default -> INOCENTE;
        };
    }
}