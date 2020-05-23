package e.hew.a21616076cw1co555mobileappssh_u;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class shoeYou extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private TextView shoe;

    private int mQuestionNumber = 0;

    private int af1 = 0;
    private int stans = 0;
    private int allStars = 0;
    private int vans = 0;
    private int reebok = 0;
    private int nb = 0;

    private int win;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoe_you);

        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        shoe = (TextView)findViewById(R.id.shoe);

        updateQuestion();
        shoe.setVisibility(View.GONE);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (mQuestionNumber == 0){
                    af1 = af1 + 3;
                    nb = nb + 3;
                    updateQuestion();
                } else if (mQuestionNumber == 1){
                    allStars = allStars + 3;
                    updateQuestion();
                } else if (mQuestionNumber == 2){
                    af1 = af1 + 3;
                    stans = stans + 3;
                    allStars = allStars + 3;
                    updateQuestion();
                } else if (mQuestionNumber == 3){
                    af1 = af1 + 3;
                    stans = stans + 3;
                    vans = vans + 3;
                    allStars = allStars + 3;
                    updateQuestion();
                } else if (mQuestionNumber == 4){
                    af1 = af1 + 3;
                    stans = stans + 3;
                    allStars = allStars + 3;
                    updateQuestion();
                } else if (mQuestionNumber == 5){
                    af1 = af1 + 3;
                    reebok = reebok + 3;
                    vans = vans + 3;
                    updateQuestion();
                } else {
                    mQuestionView.setVisibility(View.GONE);
                    mButtonChoice1.setVisibility(View.GONE);
                    mButtonChoice2.setVisibility(View.GONE);
                    shoe.setVisibility(View.VISIBLE);
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (mQuestionNumber == 0){
                    stans = stans + 3;
                    allStars = allStars + 3;
                    updateQuestion();
                } else if (mQuestionNumber == 1){
                    af1 = af1 + 3;
                    stans = stans + 3;
                    reebok = reebok + 3;
                    nb = nb + 3;
                    updateQuestion();
                } else if (mQuestionNumber == 2){
                    vans = vans + 3;
                    reebok = reebok + 3;
                    nb = nb + 3;
                    updateQuestion();
                } else if (mQuestionNumber == 3){
                    nb = nb + 3;
                    reebok = reebok + 3;
                    updateQuestion();
                } else if (mQuestionNumber == 4){
                    vans = vans + 3;
                    reebok = reebok + 3;
                    nb = nb + 3;
                    updateQuestion();
                } else if (mQuestionNumber == 5){
                    stans = stans + 3;
                    allStars = allStars + 3;
                    nb = nb + 3;
                    updateQuestion();
                } else {
                    mQuestionView.setVisibility(View.GONE);
                    mButtonChoice1.setVisibility(View.GONE);
                    mButtonChoice2.setVisibility(View.GONE);

                    if (af1 > stans && af1 > allStars && af1 > vans && af1 > reebok && af1 > nb) {
                        shoe.setText("Your shoe is: Nike Air Force 1s");
                    } else if (stans > af1 && stans > allStars && stans > vans && stans > reebok && stans > nb) {
                        shoe.setText("Your shoe is: Adidas Stans Smiths");
                    } else if (allStars > af1 && allStars > stans && allStars > vans && allStars > reebok && allStars > nb) {
                        shoe.setText("Your shoe is: Converse All Stars");
                    } else if (vans > af1 && vans > allStars && vans > stans && vans > reebok && vans > nb) {
                        shoe.setText("Your shoe is: Vans Old Skools");
                    } else if (reebok > af1 && reebok > allStars && reebok > vans && reebok > stans && reebok > nb) {
                        shoe.setText("Your shoe is: Reebok Classic");
                    } else if (nb > af1 && nb > allStars && nb > vans && nb > reebok && nb > stans) {
                        shoe.setText("Your shoe is: New Balance 770s");
                    }

                    shoe.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));

        mQuestionNumber++;
    }

}
