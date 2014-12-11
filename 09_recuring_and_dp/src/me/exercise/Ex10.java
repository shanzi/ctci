package me.exercise;

import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Chase_Zhang on 12/11/14.
 */
public class Ex10 {
    // put boxes
    public class Box {
        int width;
        int height;
        int depth;

        public Box(int width, int height, int depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        public boolean canPutAbove(Box box) {
            if (box == null) return true;
            return width < box.width && height < box.height && depth < box.depth;
        }
    }

    public static int stackHeight(ArrayList<Box> stack) {
        int height = 0;
        for (Box box : stack) height += box.height;
        return height;
    }

    private static ArrayList<Box> maxHeightStack(Box[] boxes, Box bottom, HashMap<Box, ArrayList<Box>> cache) {
        if (bottom != null && cache.containsKey(bottom)) {
            return (ArrayList<Box>)cache.get(bottom).clone();
        }

        int maxHeight = 0;
        ArrayList<Box> maxHeightStack = null;

        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i].canPutAbove(bottom)) {
                ArrayList<Box> subMaxStack = maxHeightStack(boxes, boxes[i], cache);
                int subMaxHeight = stackHeight(subMaxStack);
                if (subMaxHeight > maxHeight) {
                    maxHeight = subMaxHeight;
                    maxHeightStack = subMaxStack;
                }
            }
        }

        if (maxHeightStack == null) maxHeightStack = new ArrayList<Box>();
        if (bottom != null) {
            maxHeightStack.add(0, bottom);
            cache.put(bottom, (ArrayList<Box>) maxHeightStack.clone());
        }

        return maxHeightStack;
    }

    public static ArrayList<Box> maxHeightStack(Box[] boxes) {
        HashMap<Box, ArrayList<Box>> cache = new HashMap<Box, ArrayList<Box>>();
        return maxHeightStack(boxes, null, cache);
    }

    public Box[] makeBoxes() {
        Box[] boxes = new Box[4];
        boxes[0] = new Box(3, 10, 3);
        boxes[1] = new Box(5, 6, 5);
        boxes[2] = new Box(3, 4, 3);
        boxes[3] = new Box(4, 5, 4);
        return boxes;
    }
}
