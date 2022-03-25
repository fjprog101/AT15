package org.fundacionjala.at15.pokemon.cli;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
// some exports omitted for the sake of brevity

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

@Command(name = "ASCIIArt", version = "ASCIIArt 1.0", mixinStandardHelpOptions = true)
public class ASCIIArt implements Runnable {

    private static final int DEFAULT_SIZE = 19;
    private static final int DEFAULT_WIDTH = 144;
    private static final int DEFAULT_HEIGHT = 32;

    private static final int X_COORD_TO_DRAW = 6;
    private static final int Y_COORD_TO_DRAW = 24;
    private static final int X_INIT = 0;
    private static final int Y_INIT = 0;

    private static final int RGB_LIMIT = -16777216;

    @Option(names = { "-s", "--font-size" }, description = "Font size")
    private int fontSize = DEFAULT_SIZE;

    @Parameters(paramLabel = "<word>", defaultValue = "Hello, picocli",
               description = "Words to be translated into ASCII art.")
    private String[] words = {"Hello,", "picocli"};

    @Override
    public void run() {
        BufferedImage image = new BufferedImage(DEFAULT_WIDTH, DEFAULT_HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        graphics.setFont(new Font("Dialog", Font.PLAIN, fontSize));
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.drawString(String.join(" ", words), X_COORD_TO_DRAW, Y_COORD_TO_DRAW);

        for (int yIndex = Y_INIT; yIndex < DEFAULT_HEIGHT; yIndex++) {
            StringBuilder builder = new StringBuilder();
            for (int xIndex = X_INIT; xIndex < DEFAULT_WIDTH; xIndex++) {
                builder.append(image.getRGB(xIndex, yIndex) == RGB_LIMIT ? " " : image.getRGB(xIndex, yIndex) == -1 ? "#" : "*");
            }
            if (builder.toString().trim().isEmpty()) {
                continue;
            }
            System.out.println(builder);
        }
    }

    public static void main(String[] args) {
        args = new String[]{"Hello picocli"};
        int exitCode = new CommandLine(new ASCIIArt()).execute(args);
        System.exit(exitCode);
    }
}