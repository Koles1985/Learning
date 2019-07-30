package com.koles.game.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class MyTextButtons {



    private Button textButton;

    public MyTextButtons(String text, Skin skin, String styleName){
        textButton = new TextButton(text, skin, styleName);
        textButton.setSize(1,1);
    }

}
