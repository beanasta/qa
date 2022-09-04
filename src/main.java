public class main {
    public static void main(String[] args) {
        int eaters = 2; // сколько людей будут есть

        int water = 500; // миллилитров воды
        int potatoes =2; // картофелин
        int chicken = 2; // куриных бёдер
        int spices = 2; // ложек специй

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println((water / eaters) + " миллилитров воды");
        System.out.println((potatoes / eaters) + " картофелин(а)");
        System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
        System.out.println((spices / eaters) + " ложек(ка) специй");
    }
}
