package test.demo12;

public class Test {
    public static void main(String[] args) {
        TennisSport ts = new TennisSport("刘诗雯", 23);
        System.out.println(ts.getName()+ ", " +ts.getAge());
        ts.study();
        ts.speakEnglish();
    }
}
