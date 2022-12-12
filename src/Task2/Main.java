package Task2;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director();
        Worker worker1 = new Worker();
        Accountant accountant1 = new Accountant();

        Profession[] professions = new Profession[]{director1,worker1,accountant1};

        for(Profession prof: professions){
            prof.printProfession();
        }
    }


}
