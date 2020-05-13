public class main {

    static String tenderNumber = "0320300105420000004";
    static String mailText = "Добрый день, удалось подать заявку на тендер с номером " + tenderNumber + ".";

    public static void main (String [] args) {
        Sender sender = new Sender("dimich14@gmail.com","Ujhbpjynj12afu");
        sender.send("TestSubject",mailText,"dimich14@gmail.com","koks-gops@ya.ru");
    }
}
