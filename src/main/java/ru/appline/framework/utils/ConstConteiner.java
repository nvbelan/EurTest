package ru.appline.framework.utils;

import java.util.HashMap;


public class ConstConteiner {

    private static boolean capitalEveryMonthTick = true;
    private static String menuVklad = "Вклады";
    private static String checkableText = "Рассчитайте доходность по вкладу";
    private static String valuta = "Доллары США";
    private static String vkladSumm = "500000";
    private static String srok = "9 месяцев";
    private static String fillEveryMonth = "70000";
    private static String replenish = "240 000";
    private static String accryedProcent = "690,81";
    private static String result = "740 690,81";
    private static boolean upTick = true;

    public static boolean isUpTick() {
        return upTick;
    }

    public static String getResult() {
        return result;
    }

    public static String getReplenish() {
        return replenish;
    }

    public static String getAccryedProcent() {
        return accryedProcent;
    }

    public static boolean isCapitalEveryMonthTick() {
        return capitalEveryMonthTick;
    }

    public static String getFillEveryMonth() {
        return fillEveryMonth;
    }

    public static String getSrok() {
        return srok;
    }

    public static String getVkladSumm() {
        return vkladSumm;
    }

    public static String getCheckableText() {
        return checkableText;
    }

    public static String getMenuVklad() {
        return menuVklad;
    }

    public static String getValuta() {
        return valuta;
    }


}
