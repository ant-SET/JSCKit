package jsc.exam.jsckit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import jsc.kit.radarview.RadarEntity;
import jsc.kit.radarview.RadarView;

public class RadarViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar_view);

        RadarView radarView = findViewById(R.id.radar_view);
        String[] labels = new String[]{"中单", "射手", "辅助", "打野", "上单"};
        float[] data = new float[]{0.6f, 0.95f, 0.45f, 0.9f, 0.7f};
        int[] align = new int[]{RadarEntity.ALIGN_RIGHT, RadarEntity.ALIGN_BOTTOM, RadarEntity.ALIGN_BOTTOM, RadarEntity.ALIGN_LEFT, RadarEntity.ALIGN_TOP};
        List<RadarEntity> entities = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            RadarEntity entity = new RadarEntity();
            entity.setLabel(labels[i]);
            entity.setValue(data[i]);
            entity.setLabelAlignType(align[i]);
            entities.add(entity);
        }
        radarView.setRadarEntities(entities);
    }
}