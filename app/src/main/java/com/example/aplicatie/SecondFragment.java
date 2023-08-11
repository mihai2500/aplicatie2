package com.example.aplicatie;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.aplicatie.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment implements View.OnClickListener{

    private FragmentSecondBinding binding;

    private TextView totalPoints;
    private TextView autonomousPoints; private TextView teleopPoints; private TextView endgamePoints; private TextView pointsPenalties;

    private TextView cones_terminal_auto; private Button terminal_plus_auto; private Button terminal_minus_auto;
    private TextView cones_ground_auto; private Button ground_plus_auto; private Button ground_minus_auto;
    private TextView cones_low_auto; private Button low_plus_auto; private Button low_minus_auto;
    private TextView cones_mid_auto; private Button mid_plus_auto; private Button mid_minus_auto;
    private TextView cones_high_auto; private Button high_plus_auto; private Button high_minus_auto;

    private TextView cones_terminal_teleop; private Button terminal_plus_teleop; private Button terrminal_minus_teleop;
    private TextView cones_ground_teleop; private Button ground_plus_teleop; private Button ground_minus_teleop;
    private TextView cones_low_teleop; private Button low_plus_teleop; private Button low_minus_teleop;
    private TextView cones_mid_teleop; private Button mid_plus_teleop; private Button mid_minus_teleop;
    private TextView cones_high_teleop; private Button high_plus_teleop; private Button high_minus_teleop;

//    private CheckBox checkCircuit; private CheckBox checkTerminal1; private CheckBox checkTerminal2;

//    private RadioGroup radioGroup1; private RadioButton radioButton,radioButton2,radioButton3,radioButton4,radioButton5;
//
//    private RadioGroup radioGroup2; private RadioButton radioButton6,radioButton7,radioButton8,radioButton9,radioButton10;

    private TextView topConeNumber; private Button topConePlus; private Button topConeMinus;
    private TextView beaconNumber; private Button beaconPlus; private Button beaconMinus;

    private TextView minorPenalties; private Button minorPlus; private Button minorMinus;
    private TextView majorPenalties; private Button majorPlus; private Button majorMinus;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }



    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        radioGroup1 = (RadioGroup)getView().findViewById(R.id.radioGroup1);
//        radioButton = (RadioButton)getView().findViewById(R.id.radioButton);
//        radioButton2 = (RadioButton)getView().findViewById(R.id.radioButton2);
//        radioButton3 = (RadioButton)getView().findViewById(R.id.radioButton3);
//        radioButton4 = (RadioButton)getView().findViewById(R.id.radioButton4);
//        radioButton5 = (RadioButton)getView().findViewById(R.id.radioButton5);

//        checkCircuit = getView().findViewById(R.id.checkCircuit);
//        checkTerminal1 = getView().findViewById(R.id.checkTerminal1);
//        checkTerminal2 = getView().findViewById(R.id.checkTerminal2);

        setUi();

        terminal_plus_auto.setOnClickListener(this);
        ground_plus_auto.setOnClickListener(this);
        low_plus_auto.setOnClickListener(this);
        mid_plus_auto.setOnClickListener(this);
        high_plus_auto.setOnClickListener(this);
        terminal_minus_auto.setOnClickListener(this);
        ground_minus_auto.setOnClickListener(this);
        low_minus_auto.setOnClickListener(this);
        mid_minus_auto.setOnClickListener(this);
        high_minus_auto.setOnClickListener(this);

        terminal_plus_teleop.setOnClickListener(this);
        ground_plus_teleop.setOnClickListener(this);
        low_plus_teleop.setOnClickListener(this);
        mid_plus_teleop.setOnClickListener(this);
        high_plus_teleop.setOnClickListener(this);
        terrminal_minus_teleop.setOnClickListener(this);
        ground_minus_teleop.setOnClickListener(this);
        low_minus_teleop.setOnClickListener(this);
        mid_minus_teleop.setOnClickListener(this);
        high_minus_teleop.setOnClickListener(this);

        topConeMinus.setOnClickListener(this);
        topConePlus.setOnClickListener(this);
        topConeNumber.setOnClickListener(this);
        beaconMinus.setOnClickListener(this);
        beaconPlus.setOnClickListener(this);

        minorPlus.setOnClickListener(this);
        minorMinus.setOnClickListener(this);
        majorMinus.setOnClickListener(this);
        majorPlus.setOnClickListener(this);

    }
//        private RadioGroup.OnCheckedChangeListener onCheckedChangeListener = new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup1, int checkedId) {
//                switch (checkedId) {
//                    case R.id.radioButton:
//                        if (radioButton.isChecked()) {
//                            String newText = Integer.toString(Integer.parseInt(totalPoints.getText().toString()));
//                            totalPoints.setText(newText);
//                            String newText2 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()));
//                            autonomousPoints.setText(newText2);
//                        }
//                        break;
//                    case R.id.radioButton2:
//                        if(radioButton2.isChecked()) {
//                            String newText = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 2);
//                            totalPoints.setText(newText);
//                            String newText2 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) + 2);
//                            autonomousPoints.setText(newText2);
//                        }
//                        break;
//                    case R.id.radioButton3:
//                        if(radioButton3.isChecked()) {
//                            String newText = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 2);
//                            totalPoints.setText(newText);
//                            String newText2 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) + 2);
//                            autonomousPoints.setText(newText2);
//                        }
//                        break;
//                    case R.id.radioButton4:
//                        if(radioButton4.isChecked()) {
//                            String newText = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 10);
//                            totalPoints.setText(newText);
//                            String newText2 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) + 10);
//                            autonomousPoints.setText(newText2);
//                        }
//                        break;
//                    case R.id.radioButton5:
//                        if(radioButton5.isChecked()) {
//                            String newText = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 20);
//                            totalPoints.setText(newText);
//                            String newText2 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) + 20);
//                            autonomousPoints.setText(newText2);
//                        }
//                        break;
//                }
//            }
//        };


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.terminal_plus_auto:
                String newText = Integer.toString(Integer.parseInt(cones_terminal_auto.getText().toString()) + 1);
                cones_terminal_auto.setText(newText);
                String newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 2);
                totalPoints.setText(newText2);
                String newText3 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) + 1);
                autonomousPoints.setText(newText3);
                String newText4 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) + 1);
                teleopPoints.setText(newText4);
                String newText5 = Integer.toString(Integer.parseInt(cones_terminal_teleop.getText().toString()) + 1);
                cones_terminal_teleop.setText(newText5);
                break;
            case R.id.terminal_minus_auto:
                if (Integer.parseInt(cones_terminal_auto.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_terminal_auto.getText().toString()) - 1);
                    cones_terminal_auto.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 2);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) - 1);
                    autonomousPoints.setText(newText3);
                    newText4 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) - 1);
                    teleopPoints.setText(newText4);
                    newText5 = Integer.toString(Integer.parseInt(cones_terminal_teleop.getText().toString()) - 1);
                    cones_terminal_teleop.setText(newText5);
                }
                break;
            case R.id.ground_plus_auto:
                newText = Integer.toString(Integer.parseInt(cones_ground_auto.getText().toString()) + 1);
                cones_ground_auto.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 4);
                totalPoints.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) + 2);
                autonomousPoints.setText(newText3);
                newText4 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) + 2);
                teleopPoints.setText(newText4);
                newText5 = Integer.toString(Integer.parseInt(cones_ground_teleop.getText().toString()) + 1);
                cones_ground_teleop.setText(newText5);
                break;
            case R.id.ground_minus_auto:
                if (Integer.parseInt(cones_ground_auto.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_ground_auto.getText().toString()) - 1);
                    cones_ground_auto.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 4);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) - 2);
                    autonomousPoints.setText(newText3);
                    newText4 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) - 2);
                    teleopPoints.setText(newText4);
                    newText5 = Integer.toString(Integer.parseInt(cones_ground_teleop.getText().toString()) - 1);
                    cones_ground_teleop.setText(newText5);
                }
                break;
            case R.id.low_plus_auto:
                newText = Integer.toString(Integer.parseInt(cones_low_auto.getText().toString()) + 1);
                cones_low_auto.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 6);
                totalPoints.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) + 3);
                autonomousPoints.setText(newText3);
                newText4 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) + 3);
                teleopPoints.setText(newText4);
                newText5 = Integer.toString(Integer.parseInt(cones_low_teleop.getText().toString()) + 1);
                cones_low_teleop.setText(newText5);
                break;
            case R.id.low_minus_auto:
                if (Integer.parseInt(cones_low_auto.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_low_auto.getText().toString()) - 1);
                    cones_low_auto.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 6);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) - 3);
                    autonomousPoints.setText(newText3);
                    newText4 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) - 3);
                    teleopPoints.setText(newText4);
                    newText5 = Integer.toString(Integer.parseInt(cones_low_teleop.getText().toString()) - 1);
                    cones_low_teleop.setText(newText5);
                }
                break;
            case R.id.mid_plus_auto:
                newText = Integer.toString(Integer.parseInt(cones_mid_auto.getText().toString()) + 1);
                cones_mid_auto.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 8);
                totalPoints.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) + 4);
                autonomousPoints.setText(newText3);
                newText4 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) + 4);
                teleopPoints.setText(newText4);
                newText5 = Integer.toString(Integer.parseInt(cones_mid_teleop.getText().toString()) + 1);
                cones_mid_teleop.setText(newText5);
                break;
            case R.id.mid_minus_auto:
                if (Integer.parseInt(cones_mid_auto.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_mid_auto.getText().toString()) - 1);
                    cones_mid_auto.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 8);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) - 4);
                    autonomousPoints.setText(newText3);
                    newText4 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) - 4);
                    teleopPoints.setText(newText4);
                    newText5 = Integer.toString(Integer.parseInt(cones_mid_teleop.getText().toString()) - 1);
                    cones_mid_teleop.setText(newText5);
                }
                break;
            case R.id.high_plus_auto:
                newText = Integer.toString(Integer.parseInt(cones_high_auto.getText().toString()) + 1);
                cones_high_auto.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 10);
                totalPoints.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) + 5);
                autonomousPoints.setText(newText3);
                newText4 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) + 5);
                teleopPoints.setText(newText4);
                newText5 = Integer.toString(Integer.parseInt(cones_high_teleop.getText().toString()) + 1);
                cones_high_teleop.setText(newText5);
                break;
            case R.id.high_minus_auto:
                if (Integer.parseInt(cones_high_auto.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_high_auto.getText().toString()) - 1);
                    cones_high_auto.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 10);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(autonomousPoints.getText().toString()) - 5);
                    autonomousPoints.setText(newText3);
                    newText4 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) - 5);
                    teleopPoints.setText(newText4);
                    newText5 = Integer.toString(Integer.parseInt(cones_high_teleop.getText().toString()) - 1);
                    cones_high_teleop.setText(newText5);
                }
                break;
            case R.id.terminal_plus_teleop:
                newText = Integer.toString(Integer.parseInt(cones_terminal_teleop.getText().toString()) + 1);
                cones_terminal_teleop.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 1);
                totalPoints.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) + 1);
                teleopPoints.setText(newText3);
                break;
            case R.id.terminal_minus_teleop:
                if (Integer.parseInt(cones_terminal_teleop.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_terminal_teleop.getText().toString()) - 1);
                    cones_terminal_teleop.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 1);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) - 1);
                    teleopPoints.setText(newText3);
                }
                break;
            case R.id.ground_plus_teleop:
                newText = Integer.toString(Integer.parseInt(cones_ground_teleop.getText().toString()) + 1);
                cones_ground_teleop.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 2);
                totalPoints.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) + 2);
                teleopPoints.setText(newText3);
                break;
            case R.id.ground_minus_teleop:
                if (Integer.parseInt(cones_ground_teleop.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_ground_teleop.getText().toString()) - 1);
                    cones_ground_teleop.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 2);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) - 2);
                    teleopPoints.setText(newText3);
                }
                break;
            case R.id.low_plus_teleop:
                newText = Integer.toString(Integer.parseInt(cones_low_teleop.getText().toString()) + 1);
                cones_low_teleop.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 3);
                totalPoints.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) + 3);
                teleopPoints.setText(newText3);
                break;
            case R.id.low_minus_teleop:
                if (Integer.parseInt(cones_low_teleop.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_low_teleop.getText().toString()) - 1);
                    cones_low_teleop.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 3);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) - 3);
                    teleopPoints.setText(newText3);
                }
                break;
            case R.id.mid_plus_teleop:
                newText = Integer.toString(Integer.parseInt(cones_mid_teleop.getText().toString()) + 1);
                cones_mid_teleop.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 4);
                totalPoints.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) + 4);
                teleopPoints.setText(newText3);
                break;
            case R.id.mid_minus_teleop:
                if (Integer.parseInt(cones_mid_teleop.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_mid_teleop.getText().toString()) - 1);
                    cones_mid_teleop.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 4);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) - 4);
                    teleopPoints.setText(newText3);
                }
                break;
            case R.id.high_plus_teleop:
                newText = Integer.toString(Integer.parseInt(cones_high_teleop.getText().toString()) + 1);
                cones_high_teleop.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 5);
                totalPoints.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) + 5);
                teleopPoints.setText(newText3);
                break;
            case R.id.high_minus_teleop:
                if (Integer.parseInt(cones_high_teleop.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_high_teleop.getText().toString()) - 1);
                    cones_high_teleop.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 5);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(teleopPoints.getText().toString()) - 5);
                    teleopPoints.setText(newText3);
                }
                break;
            case R.id.topConePlus:
                newText = Integer.toString(Integer.parseInt(topConeNumber.getText().toString()) + 1);
                topConeNumber.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 3);
                totalPoints.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(endgamePoints.getText().toString()) + 3);
                endgamePoints.setText(newText3);
                break;
            case R.id.topConeMinus:
                if (Integer.parseInt(topConeNumber.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(topConeNumber.getText().toString()) - 1);
                    topConeNumber.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 3);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(endgamePoints.getText().toString()) - 3);
                    endgamePoints.setText(newText3);
                }
                break;
            case R.id.beaconPlus:
                if (Integer.parseInt(beaconNumber.getText().toString()) <2){
                    newText = Integer.toString(Integer.parseInt(beaconNumber.getText().toString()) + 1);
                    beaconNumber.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 10);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(endgamePoints.getText().toString()) + 10);
                    endgamePoints.setText(newText3);
                }
                break;
            case R.id.beaconMinus:
                if (Integer.parseInt(beaconNumber.getText().toString()) !=0 ){
                    newText = Integer.toString(Integer.parseInt(beaconNumber.getText().toString()) - 1);
                    beaconNumber.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 10);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(endgamePoints.getText().toString()) - 10);
                    endgamePoints.setText(newText3);
                }
                break;
            case R.id.minorPlus:
                newText = Integer.toString(Integer.parseInt(minorPenalties.getText().toString()) + 1);
                minorPenalties.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 10);
                totalPoints.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(pointsPenalties.getText().toString()) - 10);
                pointsPenalties.setText(newText3);
                break;
            case R.id.minorMinus:
                if (Integer.parseInt(minorPenalties.getText().toString()) !=0 ){
                    newText = Integer.toString(Integer.parseInt(minorPenalties.getText().toString()) - 1);
                    minorPenalties.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 10);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(pointsPenalties.getText().toString()) + 10);
                    pointsPenalties.setText(newText3);
                }
                break;
            case R.id.majorPlus:
                newText = Integer.toString(Integer.parseInt(majorPenalties.getText().toString()) + 1);
                majorPenalties.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) - 30);
                totalPoints.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(pointsPenalties.getText().toString()) - 30);
                pointsPenalties.setText(newText3);
                break;
            case R.id.majorMinus:
                if (Integer.parseInt(majorPenalties.getText().toString()) !=0 ){
                    newText = Integer.toString(Integer.parseInt(majorPenalties.getText().toString()) - 1);
                    majorPenalties.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 30);
                    totalPoints.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(pointsPenalties.getText().toString()) + 30);
                    pointsPenalties.setText(newText3);
                }
                break;

//            case R.id.checkCircuit:
//                if(checkCircuit.isChecked()){
//                    newText = Integer.toString(Integer.parseInt(endgamePoints.getText().toString()) + 20);
//                    endgamePoints.setText(newText);
//                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 20);
//                    totalPoints.setText(newText2);
//                }
//                break;
//            case R.id.checkTerminal1:
//                if(checkTerminal1.isChecked()){
//                    newText = Integer.toString(Integer.parseInt(endgamePoints.getText().toString()) + 2);
//                    endgamePoints.setText(newText);
//                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 2);
//                    totalPoints.setText(newText2);
//                }
//                break;
//            case R.id.checkTerminal2:
//                if(checkTerminal2.isChecked()){
//                    newText = Integer.toString(Integer.parseInt(endgamePoints.getText().toString()) + 2);
//                    endgamePoints.setText(newText);
//                    newText2 = Integer.toString(Integer.parseInt(totalPoints.getText().toString()) + 2);
//                    totalPoints.setText(newText2);
//                }
//                break;
        }
    }
    private void setUi() {
        totalPoints = getView().findViewById(R.id.totalPoints);
        autonomousPoints = getView().findViewById(R.id.autonomousPoints);
        teleopPoints = getView().findViewById(R.id.teleopPoints);
        endgamePoints = getView().findViewById(R.id.endgamePoints);
        pointsPenalties = getView().findViewById(R.id.pointsPenalties);

        cones_terminal_auto = getView().findViewById(R.id.cones_terminal_auto);
        terminal_plus_auto = getView().findViewById(R.id.terminal_plus_auto);
        terminal_minus_auto = getView().findViewById(R.id.terminal_minus_auto);

        cones_ground_auto = getView().findViewById(R.id.cones_ground_auto);
        ground_plus_auto = getView().findViewById(R.id.ground_plus_auto);
        ground_minus_auto = getView().findViewById(R.id.ground_minus_auto);

        cones_low_auto = getView().findViewById(R.id.cones_low_auto);
        low_plus_auto = getView().findViewById(R.id.low_plus_auto);
        low_minus_auto = getView().findViewById(R.id.low_minus_auto);

        cones_mid_auto = getView().findViewById(R.id.cones_mid_auto);
        mid_plus_auto = getView().findViewById(R.id.mid_plus_auto);
        mid_minus_auto = getView().findViewById(R.id.mid_minus_auto);

        cones_high_auto = getView().findViewById(R.id.cones_high_auto);
        high_plus_auto = getView().findViewById(R.id.high_plus_auto);
        high_minus_auto = getView().findViewById(R.id.high_minus_auto);

        cones_terminal_teleop = getView().findViewById(R.id.cones_terminal_teleop);
        terminal_plus_teleop = getView().findViewById(R.id.terminal_plus_teleop);
        terrminal_minus_teleop = getView().findViewById(R.id.terminal_minus_teleop);

        cones_ground_teleop = getView().findViewById(R.id.cones_ground_teleop);
        ground_plus_teleop = getView().findViewById(R.id.ground_plus_teleop);
        ground_minus_teleop = getView().findViewById(R.id.ground_minus_teleop);

        cones_low_teleop = getView().findViewById(R.id.cones_low_teleop);
        low_plus_teleop = getView().findViewById(R.id.low_plus_teleop);
        low_minus_teleop = getView().findViewById(R.id.low_minus_teleop);

        cones_mid_teleop = getView().findViewById(R.id.cones_mid_teleop);
        mid_plus_teleop = getView().findViewById(R.id.mid_plus_teleop);
        mid_minus_teleop = getView().findViewById(R.id.mid_minus_teleop);

        cones_high_teleop = getView().findViewById(R.id.cones_high_teleop);
        high_plus_teleop = getView().findViewById(R.id.high_plus_teleop);
        high_minus_teleop = getView().findViewById(R.id.high_minus_teleop);

        topConeNumber = getView().findViewById(R.id.topConeNumber);
        topConeMinus = getView().findViewById(R.id.topConeMinus);
        topConePlus = getView().findViewById(R.id.topConePlus);
        beaconNumber = getView().findViewById(R.id.beaconNumber);
        beaconPlus = getView().findViewById(R.id.beaconPlus);
        beaconMinus = getView().findViewById(R.id.beaconMinus);

        minorPenalties = getView().findViewById(R.id.minorPenalties);
        majorPenalties = getView().findViewById(R.id.majorPenalties);
        minorMinus = getView().findViewById(R.id.minorMinus);
        minorPlus = getView().findViewById(R.id.minorPlus);
        majorMinus = getView().findViewById(R.id.majorMinus);
        majorPlus = getView().findViewById(R.id.majorPlus);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}