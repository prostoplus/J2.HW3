import java.util.*;

class PhoneBook {
    private HashMap<String, String> phoneRecord = new HashMap<>();

    PhoneBook(){
        this.phoneRecord.put("Пупкин Иван", "8(999)123-32-12");
        this.phoneRecord.put("Аристарх Арсенович Шмык", "8(926)783-49-27");
    }

    void add(String userName, String phoneNumber){
        this.phoneRecord.put(userName, phoneNumber);
    }

    String get(String userName){
        return this.phoneRecord.get(userName);
    }

    void printAllBook(){
        Iterator<Map.Entry<String, String>> iter = this.phoneRecord.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, String> e = iter.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}