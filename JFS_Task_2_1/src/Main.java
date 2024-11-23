//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Person person1 = new Person("Alex");
        Person person2 = new Person("Alex Xavier Rajan", 31);
        System.out.print("Person name with default age:" + person1);
        System.out.print("Person name with age:" + person2);
    }
}