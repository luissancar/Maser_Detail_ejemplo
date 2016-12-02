package com.example.luissancar.maser_detail_ejemplo.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

/*
    private static final int COUNT = 3;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }
*/

    static {
        addItem(new DummyItem("1","Marshall", "JMP 800","http://www.drtube.com/schematics/marshall/2959-pic1.jpg"));
        addItem(new DummyItem("2","Vox", "AC30","http://c1.zzounds.com/media/fit,2018by3200/quality,85/AC30_2x12_front-85b8b718f02627d9c08d712573fbccf6.jpg"));
        addItem(new DummyItem("3","Fender", "Bassman","http://www.fmicassets.com/Damroot/ZoomJpg/10001/2171000010_amp_frt_001_nr.jpg"));
    }


    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
/*
    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }*/

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String marca;
        public String modelo;
        public String urlFoto;

        public DummyItem(String id, String marca, String modelo, String urlFoto) {
            this.id = id;
            this.marca = marca;
            this.modelo = modelo;
            this.urlFoto = urlFoto;
        }

        @Override
        public String toString() {
            return marca;
        }
    }
}
