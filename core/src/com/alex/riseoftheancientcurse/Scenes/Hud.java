package com.alex.riseoftheancientcurse.Scenes;

import com.alex.riseoftheancientcurse.RiseOfTheAncientCurse;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class Hud {
    public Stage stage;
    private Viewport viewPort;
    private Integer worldTimer;
    private Integer score;
    private float timeCount;

    /*

    Label countdownLabel;
    Label scoreLabel;
    Label timeLabel;
    Label levelLabel;
    Label worldLabel;
    Label rotacLabel;

     */

    Label inventoryLabel;
    Label mapLabel;
    Label characteristicsLabel;

    public Hud(SpriteBatch sb){
        viewPort = new FitViewport(RiseOfTheAncientCurse.V_WIDTH, RiseOfTheAncientCurse.V_HEIGHT, new OrthographicCamera());
        stage = new Stage(viewPort, sb);

        Table table = new Table();
        table.top();
        table.setFillParent(true);

        table.row();

        characteristicsLabel = new Label("Caracteristics", new Label.LabelStyle(new BitmapFont(), Color.BLUE));
        table.add(characteristicsLabel).expandY().padBottom(10);

        inventoryLabel = new Label("Inventory", new Label.LabelStyle(new BitmapFont(), Color.BLACK));
        table.add(inventoryLabel).expandY().padBottom(10);
        table.add(inventoryLabel).expandX().padBottom(10);


        /*

        countdownLabel = new Label(String.format("%03d", worldTimer), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        scoreLabel = new Label(String.format("%06d", score), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        timeLabel = new Label("TIME", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        levelLabel = new Label("1-1", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        worldLabel = new Label("WORLD", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        rotacLabel = new Label("ROTAC", new Label.LabelStyle(new BitmapFont(), Color.WHITE));

        table.add(rotacLabel).expandX().padTop(10);
        table.add(worldLabel).expandX().padTop(10);
        table.add(timeLabel).expandX().padTop(10);
        table.row();
        table.add(scoreLabel).expandX();
        table.add(levelLabel).expandX();
        table.add(countdownLabel).expandX();

        */

        stage.addActor(table);
    }
}
