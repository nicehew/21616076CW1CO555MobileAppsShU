package e.hew.a21616076cw1co555mobileappssh_u;

public class QuestionLibrary {

    private String mQuestions [] = {
            "Thick or thin soles",
            "High or low tops",
            "Simple or intricate design",
            "Flat or with heel",
            "Sport or casual",
            "Wide or slim"
    };

    private String mChoices [] [] = {
            {"Thick","Thin"},
            {"High","Low"},
            {"Simple","Intricate"},
            {"Flat","Heel"},
            {"Sport","Casual"},
            {"Wide","Slim"}

    };

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }
}
