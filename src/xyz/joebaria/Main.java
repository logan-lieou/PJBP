package xyz.joebaria;

import processing.core.PApplet;

public class Main extends PApplet {
    float t = 0;

    public void settings() {
        size(400, 400);
    }

    public void draw() {
        background(0);
        fill(255);
        float x = noise(t);
        x = map(x, 0, 1, 0, width);

        t = t + 0.01f;

        ellipse(x, height/2, 40, 40);
    }

    public static void main(String... args) {
        PApplet.runSketch(new String[]{"Title!"}, new Main());
    }
}
