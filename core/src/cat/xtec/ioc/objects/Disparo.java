package cat.xtec.ioc.objects;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.actions.RepeatAction;
import com.badlogic.gdx.scenes.scene2d.actions.RotateByAction;

import java.util.Random;

import cat.xtec.ioc.helpers.AssetManager;
import cat.xtec.ioc.utils.Methods;
import cat.xtec.ioc.utils.Settings;


public class Disparo extends Actor {

    private Rectangle balaCollision;
    private Vector2 position;
    private int width, height;
    private int direccion;

    public Disparo(float x, float y, int width, int height){
        position = new Vector2(x, y);
        this.width = width;
        this.height = height;

        balaCollision = new Rectangle();
        setBounds(position.x, position.y, width, height);

    }

    public TextureRegion getBalaTexture(){ return AssetManager.bala; }


    @Override
    public void act(float delta) {
        super.act(delta);
        this.position.x += 60*delta;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        batch.draw(getBalaTexture(), position.x, position.y, width, height);
    }


}

