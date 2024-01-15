package test.demo12;

public class TennisSport extends Sportsman implements SpeakEnglish{
    public TennisSport() {
    }

    public TennisSport(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }
}
