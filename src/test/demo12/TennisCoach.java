package test.demo12;

public class TennisCoach extends Coach implements SpeakEnglish{
    public TennisCoach() {
    }

    public TennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void tech() {
        System.out.println("乒乓球教练在教打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教在说英语");
    }
}
