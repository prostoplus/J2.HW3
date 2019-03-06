public class Main {

    public static int calcWord(ArrayList<String> arrList, String word) {
        return Collections.frequency(arrList, word);
    }

    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("умаять");
        wordList.add("подвздошный");
        wordList.add("разъясняться");
        wordList.add("лечить");
        wordList.add("лечить");
        wordList.add("фарцовщица");
        wordList.add("гудронный");
        wordList.add("петербуржец");
        wordList.add("безалкогольный");
        wordList.add("фарцовщица");
        wordList.add("прилипало");
        wordList.add("притворство");
        wordList.add("умаять");
        wordList.add("гудронный");
        wordList.add("раскислый");
        wordList.add("танцор");
        wordList.add("окказионалист");
        wordList.add("притворство");
        wordList.add("умелица");
        wordList.add("гудронный");

        for (int i = 0; i < wordList.size(); i++) {
            if (calcWord(wordList, wordList.get(i)) == 1) {
                System.out.println(wordList.get(i));
            }
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Арсен Ярополкович Творожок", "8(960)274-44-10");
        System.out.println("Номер Арсена Ярополковича Творожока: " +
                myPhoneBook.get("Арсен Ярополкович Творожок"));

        myPhoneBook.add("Напримеров", "314-6-824");
        System.out.println("Номер Напримерова: " +myPhoneBook.get("Напримеров"));

        System.out.println();
        System.out.println("------------");
        System.out.println();

        myPhoneBook.printAllBook();

    }
}