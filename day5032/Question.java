package pangu.com.day5032;

public class Question {
    private int num;
    private String title;
    private String answer;

    public Question(int num, String title) {
        this.num = num;
        this.title = title;
//        this.answer = answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public String getTitle() {
        return title;
    }
}
