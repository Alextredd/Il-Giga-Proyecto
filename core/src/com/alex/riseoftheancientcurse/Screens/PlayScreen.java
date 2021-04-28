package com.alex.riseoftheancientcurse.Screens;

import com.alex.riseoftheancientcurse.RiseOfTheAncientCurse;
import com.alex.riseoftheancientcurse.Scenes.Hud;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class PlayScreen implements Screen {
    private RiseOfTheAncientCurse game;
    private OrthographicCamera gameCam;
    private Viewport gamePort;
    private Hud hud;

    /////////////////// Need to modify

    private TmxMapLoader mapLoader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    public PlayScreen(RiseOfTheAncientCurse game){
        this.game = game;
        gameCam = new OrthographicCamera();
        //gamePort = new ScreenViewport(gameCam); //Better render imo
        //gamePort = new StretchViewport(800, 480, gameCam); //Thinks the ratio is always 800 by 480
        gamePort = new FitViewport(RiseOfTheAncientCurse.V_WIDTH, RiseOfTheAncientCurse.V_HEIGHT, gameCam); //Maintains the aspect ratio
        hud = new Hud(game.batch);

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();

    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
