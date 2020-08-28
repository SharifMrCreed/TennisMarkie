package com.alle.san.tennismarchy;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.alle.san.tennismarchy.models.SetModel;

import java.util.ArrayList;

import static com.alle.san.tennismarchy.utils.Globals.FIFTEEN;
import static com.alle.san.tennismarchy.utils.Globals.FORTY;
import static com.alle.san.tennismarchy.utils.Globals.THIRTY;
import static com.alle.san.tennismarchy.utils.Globals.ZERO;


public class NewMatchFragment extends Fragment {
    private static final String TAG = "NewMatchFragment";

    TextView pOneName, pOneSet, pOneGame, pOneScore,
             pTwoName, pTwoSet, pTwoGame, pTwoScore;
    Button  pOnePoint,
            pTwoPoint;

    int  aSet = 0, aGame = 0, aScore = 0,
         bSet = 0, bGame = 0, bScore = 0;

    ArrayList<SetModel> setsPlayed = new ArrayList<>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
           }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_new_match, container, false);
        pOneName = view.findViewById(R.id.player_one_name);
        pTwoName = view.findViewById(R.id.player_two_name);
        pOneScore = view.findViewById(R.id.tvP1scores);
        pTwoScore = view.findViewById(R.id.tvP2scores);
        pOneGame = view.findViewById(R.id.tvP1games);
        pTwoGame = view.findViewById(R.id.tvP2games);
        pOneSet = view.findViewById(R.id.tvP1Sets);
        pTwoSet = view.findViewById(R.id.tvP2Sets);
        pOnePoint = view.findViewById(R.id.btnPOnePoint);
        pTwoPoint = view.findViewById(R.id.btnPTwoPoint);

        playerOnePoints();
        playerTwoPoints();

        return view;
    }

    private void playerOnePoints() {
        pOnePoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aScore++;
                switch(aScore){
                    case 1:
                        pOneScore.setText(FIFTEEN);
                        break;

                    case 2:
                        pOneScore.setText(THIRTY);
                        break;
                    case 3:
                        pOneScore.setText(FORTY);
                        break;
                    case 4:
                        aScore = 0;
                        bScore = 0;
                        aGame++;
                        pTwoScore.setText(ZERO);
                        pOneScore.setText(ZERO);
                        if (aGame == 6){
                            SetModel newSet = new SetModel(aGame, bGame);
                            setsPlayed.add(newSet);
                            aSet++;
                            aGame = 0;
                            bGame = 0;
                            pTwoGame.setText(String.valueOf(bGame));
                            pOneGame.setText(String.valueOf(aGame));
                            pOneSet.setText(String.valueOf(aSet));

                            Log.d(TAG, "onCreateView: sets played so far =>"+ setsPlayed.toString());
                        }
                        pOneGame.setText(String.valueOf(aGame));
                        break;
                    default:
                        break;
                }

            }
        });
    }

    private void playerTwoPoints() {
        pTwoPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bScore++;
                switch(bScore){
                    case 1:
                        pTwoScore.setText(FIFTEEN);
                        break;
                    case 2:
                        pTwoScore.setText(THIRTY);
                        break;
                    case 3:
                        pTwoScore.setText(FORTY);
                        break;
                    case 4:
                        aScore = 0;
                        bScore = 0;
                        bGame++;
                        pOneScore.setText(ZERO);
                        pTwoScore.setText(ZERO);
                        if (bGame == 6){
                            SetModel newSet = new SetModel(aGame, bGame);
                            setsPlayed.add(newSet);
                            bSet++;
                            aGame = 0;
                            bGame = 0;
                            pTwoGame.setText(String.valueOf(bGame));
                            pOneGame.setText(String.valueOf(aGame));
                            pTwoSet.setText(String.valueOf(bSet));
                            Log.d(TAG, "onCreateView: sets played so far =>"+ setsPlayed.toString());
                        }
                        pTwoGame.setText(String.valueOf(bGame));
                        break;
                    default:
                        break;
                }

            }
        });
    }
}