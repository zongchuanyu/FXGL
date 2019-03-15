/*
 * FXGL - JavaFX Game Library. The MIT License (MIT).
 * Copyright (c) AlmasB (almaslvl@gmail.com).
 * See LICENSE for details.
 */

package s02entities;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class MyEntityFactory implements EntityFactory {

    @Spawns("r,rect,type1")
    public Entity newRectangle(SpawnData data) {
        return FXGL.entityBuilder()
                .from(data)
                .view(new Rectangle(30, 30))
                .build();
    }

    @Spawns("")
    public Entity newEmpty(SpawnData data) {
        return FXGL.entityBuilder()
                .from(data)
                .view(new Rectangle(30, 30, Color.RED))
                .build();
    }

    @Spawns("c,circle,type2,type3")
    public Entity newCircle(SpawnData data) {
        return FXGL.entityBuilder()
                .from(data)
                .view(new Circle(15))
                .build();
    }

    @Spawns("Wall,Player,Coin")
    public Entity newObjectgid(SpawnData data) {
        return FXGL.entityBuilder()
                .from(data)
                .build();
    }
}
