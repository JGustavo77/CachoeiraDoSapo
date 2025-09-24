public enum Classificacao {
    INOCENTE,
    SUSPEITO,
    CUMPLICE,
    ASSASSINO;
    
    public static Classificacao Classificar(int respostasPositivas) {
        if (respostasPositivas == 2) {
            return Classificacao.SUSPEITO;
        } else if (respostasPositivas == 3 || respostasPositivas == 4) {
            return Classificacao.CUMPLICE;
    }
    if (respostasPositivas == 5) {
        return Classificacao.ASSASSINO;
    } else {
        return Classificacao.INOCENTE;
    }
}
}