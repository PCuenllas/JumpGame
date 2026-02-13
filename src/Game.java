import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Game extends JPanel implements ActionListener, KeyListener {
    private int playerX, playerY;
    private int playerVelocityY, playerVelocityX;
    private boolean isJumping, isOnGround, isOnPlat, hasBumpedS, hasBumpedT, isSlidingR,isSlidingL, chargeJ, rightJ, leftJ;
    private int jumpValue, currentLevel, slidingRFinalX, slidingRFinalY,slidingLFinalX, slidingLFinalY, slideLengthR, slideLengthL;
    private List<HorizontalLine> horizontalLines;
    private List<VerticalLine> verticalLines;
    private List<HorizontalLine> horizontalLines1;
    private List<VerticalLine> verticalLines1;
    private List<HorizontalLine> horizontalLines2;
    private List<VerticalLine> verticalLines2;
    private List<HorizontalLine> horizontalLines3;
    private List<VerticalLine> verticalLines3;
    private List<HorizontalLine> horizontalLines4;
    private List<VerticalLine> verticalLines4;
    private List<HorizontalLine> horizontalLines5;
    private List<VerticalLine> verticalLines5;
    private List<HorizontalLine> horizontalLines6;
    private List<VerticalLine> verticalLines6;
    private List<HorizontalLine> horizontalLines7;
    private List<VerticalLine> verticalLines7;
    private List<HorizontalLine> horizontalLines8;
    private List<VerticalLine> verticalLines8;
    private List<HorizontalLine> horizontalLines9;
    private List<VerticalLine> verticalLines9;
    private List<HorizontalLine> horizontalLines10;
    private List<VerticalLine> verticalLines10;
    private List<DiagonalLineR> diagonalLinesR;
    private List<DiagonalLineR> diagonalLinesR1;
    private List<DiagonalLineR> diagonalLinesR2;
    private List<DiagonalLineR> diagonalLinesR3;
    private List<DiagonalLineR> diagonalLinesR4;
    private List<DiagonalLineR> diagonalLinesR5;
    private List<DiagonalLineR> diagonalLinesR6;
    private List<DiagonalLineR> diagonalLinesR7;
    private List<DiagonalLineR> diagonalLinesR8;
    private List<DiagonalLineR> diagonalLinesR9;
    private List<DiagonalLineR> diagonalLinesR10;
    private List<DiagonalLineL> diagonalLinesL;
    private List<DiagonalLineL> diagonalLinesL1;
    private List<DiagonalLineL> diagonalLinesL2;
    private List<DiagonalLineL> diagonalLinesL3;
    private List<DiagonalLineL> diagonalLinesL4;
    private List<DiagonalLineL> diagonalLinesL5;
    private List<DiagonalLineL> diagonalLinesL6;
    private List<DiagonalLineL> diagonalLinesL7;
    private List<DiagonalLineL> diagonalLinesL8;
    private List<DiagonalLineL> diagonalLinesL9;
    private List<DiagonalLineL> diagonalLinesL10;
    private LevelSetUp levelSetUp;
    private BufferedImage playerStandingSprite;
    private BufferedImage playerSquatingSprite;
    private BufferedImage playerCSprite;


    public Game() {
        playerX = 600;
        playerY = 700;
        playerVelocityY = 0;
        isJumping = false;
        rightJ = false;
        leftJ = false;
        isOnGround = false;
        isOnPlat = false;
        hasBumpedS = false;
        hasBumpedT = false;
        chargeJ = false;
        jumpValue = 0;
        currentLevel = 0;
        isSlidingR = false;
        isSlidingL = false;
        slidingRFinalX = 0;
        slidingRFinalY = 0;



        horizontalLines = new ArrayList<>();
        horizontalLines.add(new HorizontalLine(20, 400, 320, 400));
        horizontalLines.add(new HorizontalLine(320, 760, 880, 760));
        horizontalLines.add(new HorizontalLine(880, 400, 1180, 400));
        horizontalLines.add(new HorizontalLine(460, 100, 740, 100));
        horizontalLines.add(new HorizontalLine(460, 220, 740, 220));
        horizontalLines.add(new HorizontalLine(740, 10, 980, 10));

        verticalLines= new ArrayList<>();
        verticalLines.add(new VerticalLine(20, 0, 20, 400));
        verticalLines.add(new VerticalLine(320, 400, 320, 760));
        verticalLines.add(new VerticalLine(880, 400, 880, 760));
        verticalLines.add(new VerticalLine(1180, 0, 1180, 400));
        verticalLines.add(new VerticalLine(460, 100, 460, 220));
        verticalLines.add(new VerticalLine(740, 100, 740, 220));
        verticalLines.add(new VerticalLine(740, -30, 740, 10));
        verticalLines.add(new VerticalLine(980, -30, 980, 10));

        horizontalLines1 = new ArrayList<>();
        horizontalLines1.add(new HorizontalLine(20, 200, 200, 200));
        horizontalLines1.add(new HorizontalLine(20, 420, 200, 420));
        horizontalLines1.add(new HorizontalLine(1020, 580, 1180, 580));
        horizontalLines1.add(new HorizontalLine(1020, 500, 1180, 500));
        horizontalLines1.add(new HorizontalLine(740, 740, 980, 740));
        horizontalLines1.add(new HorizontalLine(740, 820, 980, 820));
        horizontalLines1.add(new HorizontalLine(640, 580, 820, 580));
        horizontalLines1.add(new HorizontalLine(640, 500, 820, 500));
        horizontalLines1.add(new HorizontalLine(300, 420, 480, 420));
        horizontalLines1.add(new HorizontalLine(300, 260, 480, 260));

        verticalLines1= new ArrayList<>();
        verticalLines1.add(new VerticalLine(20, -10, 20, 200));
        verticalLines1.add(new VerticalLine(200, 200, 200, 420));
        verticalLines1.add(new VerticalLine(20, 420, 20, 900));
        verticalLines1.add(new VerticalLine(1180, 580, 1180, 900));
        verticalLines1.add(new VerticalLine(1020, 500, 1020, 580));
        verticalLines1.add(new VerticalLine(1180, 0, 1180, 500));
        verticalLines1.add(new VerticalLine(980, 740, 980, 820));
        verticalLines1.add(new VerticalLine(740, 740, 740, 820));
        verticalLines1.add(new VerticalLine(640, 500, 640, 580));
        verticalLines1.add(new VerticalLine(820, 500, 820, 580));
        verticalLines1.add(new VerticalLine(300, 260, 300, 420));
        verticalLines1.add(new VerticalLine(480, 260, 480, 420));

        horizontalLines2 = new ArrayList<>();
        horizontalLines2.add(new HorizontalLine(560, 680, 660, 680));
        horizontalLines2.add(new HorizontalLine(560, 660, 660, 660));
        horizontalLines2.add(new HorizontalLine(760, 660, 860, 660));
        horizontalLines2.add(new HorizontalLine(760, 680, 860, 680));
        horizontalLines2.add(new HorizontalLine(1080, 630, 1180, 630));
        horizontalLines2.add(new HorizontalLine(1080, 660, 1180, 660));
        horizontalLines2.add(new HorizontalLine(550, 560, 830, 560));
        horizontalLines2.add(new HorizontalLine(730, 440, 830, 440));
        horizontalLines2.add(new HorizontalLine(550, 490, 730, 490));
        horizontalLines2.add(new HorizontalLine(400, 280, 550, 280));
        horizontalLines2.add(new HorizontalLine(400, 380, 550, 380));
        horizontalLines2.add(new HorizontalLine(20, 250, 120, 250));
        horizontalLines2.add(new HorizontalLine(20, 280, 120, 280));
        horizontalLines2.add(new HorizontalLine(310,35,460,35));
        horizontalLines2.add(new HorizontalLine(310,-150,460,-150));

        verticalLines2= new ArrayList<>();
        verticalLines2.add(new VerticalLine(20, -10, 20, 250));
        verticalLines2.add(new VerticalLine(20, 280, 20, 900));
        verticalLines2.add(new VerticalLine(1180, 0, 1180, 630));
        verticalLines2.add(new VerticalLine(1180, 660, 1180, 800));
        verticalLines2.add(new VerticalLine(1080, 630, 1080, 660));
        verticalLines2.add(new VerticalLine(560, 660, 560, 680));
        verticalLines2.add(new VerticalLine(660, 660, 660, 680));
        verticalLines2.add(new VerticalLine(760, 660, 760, 680));
        verticalLines2.add(new VerticalLine(860, 660, 860, 680));
        verticalLines2.add(new VerticalLine(550, 490, 550, 560));
        verticalLines2.add(new VerticalLine(830, 440, 830, 560));
        verticalLines2.add(new VerticalLine(730, 440, 730, 490));
        verticalLines2.add(new VerticalLine(400, 280, 400, 380));
        verticalLines2.add(new VerticalLine(550, 280, 550, 380));
        verticalLines2.add(new VerticalLine(120, 250, 120, 280));
        verticalLines2.add(new VerticalLine(460, -150, 460, 35));
        verticalLines2.add(new VerticalLine(310, -150, 310, 35));

        horizontalLines3 = new ArrayList<>();
        horizontalLines3.add(new HorizontalLine(310,800,460,800));
        horizontalLines3.add(new HorizontalLine(310,740,460,740));
        horizontalLines3.add(new HorizontalLine(20,490,160,490));
        horizontalLines3.add(new HorizontalLine(20,520,160,520));
        horizontalLines3.add(new HorizontalLine(310,520,460,520));
        horizontalLines3.add(new HorizontalLine(310,490,460,490));
        horizontalLines3.add(new HorizontalLine(310,390,390,390));
        horizontalLines3.add(new HorizontalLine(340,190,390,190));
        horizontalLines3.add(new HorizontalLine(750,520,850,520));
        horizontalLines3.add(new HorizontalLine(750,350,820,350));
        horizontalLines3.add(new HorizontalLine(820,155,975,155));
        horizontalLines3.add(new HorizontalLine(850,180,975,180));
        horizontalLines3.add(new HorizontalLine(820,35,850,35));
        horizontalLines3.add(new HorizontalLine(1100,300,1180,300));
        horizontalLines3.add(new HorizontalLine(1100,330,1180,330));

        verticalLines3= new ArrayList<>();
        verticalLines3.add(new VerticalLine(20, -10, 20, 490));
        verticalLines3.add(new VerticalLine(20, 520, 20, 900));
        verticalLines3.add(new VerticalLine(1180, -10, 1180, 300));
        verticalLines3.add(new VerticalLine(1180, 330, 1180, 900));
        verticalLines3.add(new VerticalLine(1100, 300, 1100, 330));
        verticalLines3.add(new VerticalLine(460, 740, 460, 820));
        verticalLines3.add(new VerticalLine(310, 740, 310, 820));
        verticalLines3.add(new VerticalLine(160, 490, 160, 520));
        verticalLines3.add(new VerticalLine(310, 490, 310, 520));
        verticalLines3.add(new VerticalLine(460, 490, 460, 520));
        verticalLines3.add(new VerticalLine(310, -25, 310, 390));
        verticalLines3.add(new VerticalLine(390, 190, 390, 390));
        verticalLines3.add(new VerticalLine(340, -25, 340, 190));
        verticalLines3.add(new VerticalLine(750, 350, 750, 520));
        verticalLines3.add(new VerticalLine(850, 180, 850, 520));
        verticalLines3.add(new VerticalLine(820, 155, 820, 350));
        verticalLines3.add(new VerticalLine(975, 155, 975, 180));
        verticalLines3.add(new VerticalLine(820, -10, 820, 35));
        verticalLines3.add(new VerticalLine(850, -10, 850, 35));

        horizontalLines4 = new ArrayList<>();
        horizontalLines4.add(new HorizontalLine(820,750,900,750));
        horizontalLines4.add(new HorizontalLine(260,750,340,750));
        horizontalLines4.add(new HorizontalLine(850,780,900,780));
        horizontalLines4.add(new HorizontalLine(260,780,310,780));
        horizontalLines4.add(new HorizontalLine(820,600,900,600));
        horizontalLines4.add(new HorizontalLine(820,630,900,630));
        horizontalLines4.add(new HorizontalLine(20,600,80,600));
        horizontalLines4.add(new HorizontalLine(20,630,80,630));
        horizontalLines4.add(new HorizontalLine(1120,400,1180,400));
        horizontalLines4.add(new HorizontalLine(1120,430,1180,430));
        horizontalLines4.add(new HorizontalLine(330,50,820,50));
        horizontalLines4.add(new HorizontalLine(740,220,810,220));
        horizontalLines4.add(new HorizontalLine(740,250,810,250));
        horizontalLines4.add(new HorizontalLine(550,220,620,220));
        horizontalLines4.add(new HorizontalLine(550,190,620,190));
        horizontalLines4.add(new HorizontalLine(360,190,430,190));
        horizontalLines4.add(new HorizontalLine(360,160,430,160));
        horizontalLines4.add(new HorizontalLine(90,250,160,250));
        horizontalLines4.add(new HorizontalLine(90,220,160,220));

        verticalLines4 = new ArrayList<>();
        verticalLines4.add(new VerticalLine(20, -10, 20, 600));
        verticalLines4.add(new VerticalLine(20, 630, 20, 900));
        verticalLines4.add(new VerticalLine(1180, -10, 1180, 400));
        verticalLines4.add(new VerticalLine(1180, 430, 1180, 900));
        verticalLines4.add(new VerticalLine(1120, 400, 1120, 430));
        verticalLines4.add(new VerticalLine(820, 750, 820, 910));
        verticalLines4.add(new VerticalLine(850, 780, 850, 910));
        verticalLines4.add(new VerticalLine(900, 750, 900, 780));
        verticalLines4.add(new VerticalLine(340, 750, 340, 910));
        verticalLines4.add(new VerticalLine(310, 780, 310, 910));
        verticalLines4.add(new VerticalLine(260, 750, 260, 780));
        verticalLines4.add(new VerticalLine(820, 600, 820, 630));
        verticalLines4.add(new VerticalLine(900, 600, 900, 630));
        verticalLines4.add(new VerticalLine(80, 600, 80, 630));
        verticalLines4.add(new VerticalLine(330, -30, 330, 50));
        verticalLines4.add(new VerticalLine(820, -30, 820, 50));
        verticalLines4.add(new VerticalLine(810, 220, 810, 250));
        verticalLines4.add(new VerticalLine(740, 220, 740, 250));
        verticalLines4.add(new VerticalLine(620, 190, 620, 220));
        verticalLines4.add(new VerticalLine(550, 190, 550, 220));
        verticalLines4.add(new VerticalLine(430, 160, 430, 190));
        verticalLines4.add(new VerticalLine(360, 160, 360, 190));
        verticalLines4.add(new VerticalLine(90, 220, 90, 250));
        verticalLines4.add(new VerticalLine(160, 220, 160, 250));

        horizontalLines5 = new ArrayList<>();
        horizontalLines5.add(new HorizontalLine(330, 750, 820, 750));
        horizontalLines5.add(new HorizontalLine(730, 570, 1180, 570));
        horizontalLines5.add(new HorizontalLine(730, 160, 1180, 160));
        horizontalLines5.add(new HorizontalLine(330, 570, 430, 570));
        horizontalLines5.add(new HorizontalLine(330, 550, 430, 550));
        horizontalLines5.add(new HorizontalLine(20, 450, 120, 450));
        horizontalLines5.add(new HorizontalLine(20, 475, 120, 475));
        horizontalLines5.add(new HorizontalLine(120, 155, 200, 155));
        horizontalLines5.add(new HorizontalLine(120, 185, 170, 185));
        horizontalLines5.add(new HorizontalLine(200, 235, 460, 235));
        horizontalLines5.add(new HorizontalLine(170, 265, 460, 265));
        horizontalLines5.add(new HorizontalLine(20, 55, 280, 55));
        horizontalLines5.add(new HorizontalLine(280, 130, 460, 130));
        horizontalLines5.add(new HorizontalLine(730, 40, 810, 40));
        horizontalLines5.add(new HorizontalLine(810, 70, 1060, 70));

        verticalLines5 = new ArrayList<>();
        verticalLines5.add(new VerticalLine(20, 55, 20, 450));
        verticalLines5.add(new VerticalLine(20, 475, 20, 850));
        verticalLines5.add(new VerticalLine(120, 450, 120, 475));
        verticalLines5.add(new VerticalLine(1180, -10, 1180, 160));
        verticalLines5.add(new VerticalLine(730, 160, 730, 570));
        verticalLines5.add(new VerticalLine(1180, 570, 1180, 870));
        verticalLines5.add(new VerticalLine(330, 750, 330, 850));
        verticalLines5.add(new VerticalLine(820, 750, 820, 850));
        verticalLines5.add(new VerticalLine(330, 550, 330, 570));
        verticalLines5.add(new VerticalLine(430, 550, 430, 570));
        verticalLines5.add(new VerticalLine(120, 155, 120, 185));
        verticalLines5.add(new VerticalLine(200, 155, 200, 235));
        verticalLines5.add(new VerticalLine(170, 185, 170, 265));
        verticalLines5.add(new VerticalLine(460, 235, 460, 265));
        verticalLines5.add(new VerticalLine(280, 55, 280, 130));
        verticalLines5.add(new VerticalLine(460, -10, 460, 130));
        verticalLines5.add(new VerticalLine(730, -10, 730, 40));
        verticalLines5.add(new VerticalLine(810, 40, 810, 70));
        verticalLines5.add(new VerticalLine(1060, -10, 1060, 70));


        horizontalLines6 = new ArrayList<>();
        horizontalLines6.add(new HorizontalLine(910,750,1060,750));
        horizontalLines6.add(new HorizontalLine(730,475,1060,475));
        horizontalLines6.add(new HorizontalLine(910,500,1060,500));
        horizontalLines6.add(new HorizontalLine(930,325,1180,325));
        horizontalLines6.add(new HorizontalLine(730,365,930,365));
        horizontalLines6.add(new HorizontalLine(450,645,460,645));
        horizontalLines6.add(new HorizontalLine(460,565,490,565));
        horizontalLines6.add(new HorizontalLine(350,535,490,535));
        horizontalLines6.add(new HorizontalLine(20,355,80,355));
        horizontalLines6.add(new HorizontalLine(20,30,220,30));
        horizontalLines6.add(new HorizontalLine(465,365,555,365));
        horizontalLines6.add(new HorizontalLine(375,455,465,455));
        horizontalLines6.add(new HorizontalLine(275,245,375,245));
        horizontalLines6.add(new HorizontalLine(325,135,375,135));

        verticalLines6 = new ArrayList<>();
        verticalLines6.add(new VerticalLine(1180, 325, 1180, 800));
        verticalLines6.add(new VerticalLine(20, 30, 20, 355));
        verticalLines6.add(new VerticalLine(220, -10, 220, 30));
        verticalLines6.add(new VerticalLine(1060, 750, 1060, 800));
        verticalLines6.add(new VerticalLine(910, 500, 910, 750));
        verticalLines6.add(new VerticalLine(730, 475, 730, 800));
        verticalLines6.add(new VerticalLine(1060, 475, 1060, 500));
        verticalLines6.add(new VerticalLine(930, 325, 930, 365));
        verticalLines6.add(new VerticalLine(730, 275, 730, 365));
        verticalLines6.add(new VerticalLine(930, -10, 930, 75));
        verticalLines6.add(new VerticalLine(350, 535, 350, 545));
        verticalLines6.add(new VerticalLine(460, 565, 460, 645));
        verticalLines6.add(new VerticalLine(490, 535, 490, 565));
        verticalLines6.add(new VerticalLine(260, 535, 260, 580));
        verticalLines6.add(new VerticalLine(705, -10, 705, 75));
        verticalLines6.add(new VerticalLine(555, 225, 555, 365));
        verticalLines6.add(new VerticalLine(465, 365, 465, 455));
        verticalLines6.add(new VerticalLine(375, 245, 375, 455));
        verticalLines6.add(new VerticalLine(375, -10, 375, 135));
        verticalLines6.add(new VerticalLine(275, 185, 275, 245));

        diagonalLinesR = new ArrayList<>();
        diagonalLinesR1 = new ArrayList<>();
        diagonalLinesR2 = new ArrayList<>();
        diagonalLinesR3 = new ArrayList<>();
        diagonalLinesR4 = new ArrayList<>();
        diagonalLinesR5 = new ArrayList<>();
        diagonalLinesR6 = new ArrayList<>();
        diagonalLinesR6.add(new DiagonalLineR(930,75,730,275));
        diagonalLinesR6.add(new DiagonalLineR(705,75,555,225));
        diagonalLinesR6.add(new DiagonalLineR(325,135,275,185));

        diagonalLinesL = new ArrayList<>();
        diagonalLinesL1 = new ArrayList<>();
        diagonalLinesL2 = new ArrayList<>();
        diagonalLinesL3 = new ArrayList<>();
        diagonalLinesL4 = new ArrayList<>();
        diagonalLinesL5 = new ArrayList<>();
        diagonalLinesL6 = new ArrayList<>();
        diagonalLinesL6.add(new DiagonalLineL(260,580,470,790));
        diagonalLinesL6.add(new DiagonalLineL(350,545,450,645));
        diagonalLinesL6.add(new DiagonalLineL(80,355,260,535));

        horizontalLines7 = new ArrayList<>();
        horizontalLines7.add(new HorizontalLine(70,760,220,760));
        horizontalLines7.add(new HorizontalLine(70,565,200,565));
        horizontalLines7.add(new HorizontalLine(375,535,575,535));
        horizontalLines7.add(new HorizontalLine(200,415,575,415));
        horizontalLines7.add(new HorizontalLine(100,335,575,335));
        horizontalLines7.add(new HorizontalLine(1060,485,1140,485));
        horizontalLines7.add(new HorizontalLine(1060,205,1140,205));
        horizontalLines7.add(new HorizontalLine(220,225,575,225));
        horizontalLines7.add(new HorizontalLine(40,135,100,135));

        verticalLines7 = new ArrayList<>();
        verticalLines7.add(new VerticalLine(220,760,220,800));
        verticalLines7.add(new VerticalLine(70,565,70,760));
        verticalLines7.add(new VerticalLine(200,415,200,565));
        verticalLines7.add(new VerticalLine(575,335,575,415));
        verticalLines7.add(new VerticalLine(375,535,375,800));
        verticalLines7.add(new VerticalLine(705,705,705,800));
        verticalLines7.add(new VerticalLine(930,705,930,800));
        verticalLines7.add(new VerticalLine(575,535,575,575));
        verticalLines7.add(new VerticalLine(1060,485,1060,575));
        verticalLines7.add(new VerticalLine(1140,205,1140,485));
        verticalLines7.add(new VerticalLine(1060,-10,1060,205));
        verticalLines7.add(new VerticalLine(575,60,575,225));
        verticalLines7.add(new VerticalLine(220,-10,220,225));
        verticalLines7.add(new VerticalLine(100,135,100,335));
        verticalLines7.add(new VerticalLine(40,-10,40,135));

        diagonalLinesR7 = new ArrayList<>();
        diagonalLinesR7.add(new DiagonalLineR(1060,575,930,705));

        diagonalLinesL7 = new ArrayList<>();
        diagonalLinesL7.add(new DiagonalLineL(575,575,705,705));
        diagonalLinesL7.add(new DiagonalLineL(505,-10,575,60));

        horizontalLines8 = new ArrayList<>();
        horizontalLines8.add(new HorizontalLine(160,650,220,650));
        horizontalLines8.add(new HorizontalLine(160,700,220,700));
        horizontalLines8.add(new HorizontalLine(40,420,100,420));
        horizontalLines8.add(new HorizontalLine(40,30,250,30));
        horizontalLines8.add(new HorizontalLine(40,370,100,370));
        horizontalLines8.add(new HorizontalLine(220,225,250,225));
        horizontalLines8.add(new HorizontalLine(250,450,315,450));
        horizontalLines8.add(new HorizontalLine(980,30,1180,30));
        horizontalLines8.add(new HorizontalLine(370,30,520,30));
        horizontalLines8.add(new HorizontalLine(460,300,520,300));
        horizontalLines8.add(new HorizontalLine(460,340,610,340));
        horizontalLines8.add(new HorizontalLine(550,220,610,220));
        horizontalLines8.add(new HorizontalLine(500,450,570,450));
        horizontalLines8.add(new HorizontalLine(500,600,570,600));
        horizontalLines8.add(new HorizontalLine(760,600,830,600));
        horizontalLines8.add(new HorizontalLine(760,450,830,450));
        horizontalLines8.add(new HorizontalLine(1015,600,1085,600));
        horizontalLines8.add(new HorizontalLine(1015,450,1085,450));
        horizontalLines8.add(new HorizontalLine(1015,220,1085,220));
        horizontalLines8.add(new HorizontalLine(1015,290,1085,290));

        verticalLines8 = new ArrayList<>();
        verticalLines8.add(new VerticalLine(40,30,40,370));
        verticalLines8.add(new VerticalLine(1180,30,1180,670));
        verticalLines8.add(new VerticalLine(980,-10,980,30));
        verticalLines8.add(new VerticalLine(250,-10,250,30));
        verticalLines8.add(new VerticalLine(370,-10,370,30));
        verticalLines8.add(new VerticalLine(520,30,520,300));
        verticalLines8.add(new VerticalLine(460,300,460,340));
        verticalLines8.add(new VerticalLine(40,420,40,800));
        verticalLines8.add(new VerticalLine(100,370,100,420));
        verticalLines8.add(new VerticalLine(220,225,220,650));
        verticalLines8.add(new VerticalLine(220,700,220,800));
        verticalLines8.add(new VerticalLine(160,650,160,700));
        verticalLines8.add(new VerticalLine(250,225,250,450));
        verticalLines8.add(new VerticalLine(315,450,315,600));
        verticalLines8.add(new VerticalLine(550,-10,550,220));
        verticalLines8.add(new VerticalLine(610,220,610,340));
        verticalLines8.add(new VerticalLine(500,450,500,600));
        verticalLines8.add(new VerticalLine(570,450,570,600));
        verticalLines8.add(new VerticalLine(760,450,760,600));
        verticalLines8.add(new VerticalLine(830,450,830,600));
        verticalLines8.add(new VerticalLine(1015,450,1015,600));
        verticalLines8.add(new VerticalLine(1085,450,1085,600));
        verticalLines8.add(new VerticalLine(1085,220,1085,290));
        verticalLines8.add(new VerticalLine(1015,220,1015,290));

        diagonalLinesR8 = new ArrayList<>();
        diagonalLinesR8.add(new DiagonalLineR(1180,670,1060,790));

        diagonalLinesL8 = new ArrayList<>();
        diagonalLinesL8.add(new DiagonalLineL(315,600,505,790));

        horizontalLines9 = new ArrayList<>();
        horizontalLines9.add(new HorizontalLine(980,740,1180,740));
        horizontalLines9.add(new HorizontalLine(370,525,550,525));
        horizontalLines9.add(new HorizontalLine(20,425,120,425));
        horizontalLines9.add(new HorizontalLine(370,295,1180,295));
        horizontalLines9.add(new HorizontalLine(370,250,450,250));
        horizontalLines9.add(new HorizontalLine(450,275,545,275));
        horizontalLines9.add(new HorizontalLine(545,225,630,225));
        horizontalLines9.add(new HorizontalLine(630,275,710,275));

        verticalLines9 = new ArrayList<>();
        verticalLines9.add(new VerticalLine(20,-10,20,425));
        verticalLines9.add(new VerticalLine(1180,295,1180,740));
        verticalLines9.add(new VerticalLine(980,740,980,800));
        verticalLines9.add(new VerticalLine(250,735,250,800));
        verticalLines9.add(new VerticalLine(120,425,120,605));
        verticalLines9.add(new VerticalLine(370,525,370,800));
        verticalLines9.add(new VerticalLine(550,525,550,800));
        verticalLines9.add(new VerticalLine(370,250,370,295));
        verticalLines9.add(new VerticalLine(450,250,450,275));
        verticalLines9.add(new VerticalLine(545,225,545,275));
        verticalLines9.add(new VerticalLine(630,225,630,275));

        diagonalLinesR9 = new ArrayList<>();
        diagonalLinesL9 = new ArrayList<>();
        diagonalLinesL9.add(new DiagonalLineL(120,605,250,735));

        horizontalLines10 = new ArrayList<>();
        verticalLines10 = new ArrayList<>();
        diagonalLinesR10 = new ArrayList<>();
        diagonalLinesL10 = new ArrayList<>();

        levelSetUp = new LevelSetUp(horizontalLines, verticalLines, diagonalLinesR, diagonalLinesL);
        levelSetUp.addLevel(horizontalLines, verticalLines, diagonalLinesR, diagonalLinesL);
        levelSetUp.addLevel(horizontalLines1,verticalLines1, diagonalLinesR1, diagonalLinesL1);
        levelSetUp.addLevel(horizontalLines2,verticalLines2, diagonalLinesR2, diagonalLinesL2);
        levelSetUp.addLevel(horizontalLines3,verticalLines3, diagonalLinesR3, diagonalLinesL3);
        levelSetUp.addLevel(horizontalLines4,verticalLines4, diagonalLinesR4, diagonalLinesL4);
        levelSetUp.addLevel(horizontalLines5,verticalLines5, diagonalLinesR5, diagonalLinesL5);
        levelSetUp.addLevel(horizontalLines6,verticalLines6, diagonalLinesR6, diagonalLinesL6);
        levelSetUp.addLevel(horizontalLines7,verticalLines7, diagonalLinesR7, diagonalLinesL7);
        levelSetUp.addLevel(horizontalLines8,verticalLines8, diagonalLinesR8, diagonalLinesL8);
        levelSetUp.addLevel(horizontalLines9,verticalLines9, diagonalLinesR9, diagonalLinesL9);
        levelSetUp.addLevel(horizontalLines10,verticalLines10, diagonalLinesR10, diagonalLinesL10);
        loadCurrentLevel();

        // Set up the game loop
        Timer timer = new Timer(15, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        try {
            // We use getClass().getResource() to find the path inside the JAR
            playerStandingSprite = ImageIO.read(getClass().getResource("/player/idle.png"));
            playerSquatingSprite = ImageIO.read(getClass().getResource("/player/squat.png"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Could not find the image file inside the JAR!");
            e.printStackTrace();
        }

    }

    public void loadCurrentLevel() {
        levelSetUp.loadLevel(currentLevel);
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the appropriate sprite based on the player's action
        if (chargeJ){
            playerCSprite = playerSquatingSprite;
        }
        else{
            playerCSprite = playerStandingSprite;
        }
        BufferedImage playerSprite = playerCSprite;

        g.drawImage(playerSprite, playerX, playerY, 45, 60, null);


        //draws Hlines
        for (HorizontalLine line : horizontalLines) {
            line.draw(g);
        }

        //draws Vlines
        for (VerticalLine line : verticalLines) {
            line.draw(g);
        }

        for (DiagonalLineR line : diagonalLinesR){
            line.draw(g);
        }

        for (DiagonalLineL line : diagonalLinesL){
            line.draw(g);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //checking for horizontal lines
        if (!isOnGround && !isSlidingR && !isSlidingL){
            for (HorizontalLine line : horizontalLines) {
                if ((playerY + 64 >= line.getBounds().y && playerY + 48 <= line.getBounds().y + 1)) {
                    if (playerX + 42 >= line.getBounds().x && playerX + 3 <= line.getBounds().x + line.getBounds().width) {
                        isJumping = false;
                        isOnGround = true;
                        playerVelocityY = 0;
                        playerVelocityX = 0;
                        playerY = line.getBounds().y - 60;
                        break; // Exit the loop if a collision is found
                    }
                }
                else if ((playerY + 24 >= line.getBounds().y && playerY - 2 <= line.getBounds().y + 1 && !hasBumpedT)) {
                    if (playerX + 44 >= line.getBounds().x && playerX + 1 <= line.getBounds().x + line.getBounds().width) {
                        playerVelocityY = -playerVelocityY;
                        playerY = line.getBounds().y+8;
                        playerVelocityY = -6;
                        hasBumpedT = true;
                    }
                }
            }
            for (DiagonalLineR line : diagonalLinesR){
                if (playerX + 43 <= line.getBounds().x && playerX + 45 >= line.getBounds().x + line.getBounds().width){
                    if((playerY+60 - line.getBounds().y)+10  >= -playerX-45+(line.getBounds().x) && (playerY+60 - line.getBounds().y)-10  <= -playerX-45+line.getBounds().x){
                        isSlidingR = true;
                        isJumping = false;
                        slideLengthR = line.getBounds().height;
                        slidingRFinalX = line.getBounds().x +line.getBounds().width - 45;
                        slidingRFinalY = line.getBounds().height + line.getBounds().y - 60;
                        playerVelocityY = 0;
                    }
                }
            }
            for (DiagonalLineL line : diagonalLinesL){
                if (playerX >= line.getBounds().x && playerX-2 <= line.getBounds().x + line.getBounds().width){
                    if((playerY+60 - line.getBounds().y +10 >= playerX - line.getBounds().x)&&(playerY+60 - line.getBounds().y -10 <= playerX - line.getBounds().x)){
                        isSlidingL = true;
                        isJumping = false;
                        slideLengthL = line.getBounds().height;
                        slidingLFinalX = line.getBounds().width+line.getBounds().x;
                        slidingLFinalY = line.getBounds().height+line.getBounds().y;
                        playerVelocityY = 0;
                    }
                }
            }
        }

        if (!isOnGround){
            for (VerticalLine line : verticalLines) {
                if (playerX + 46 >= line.getBounds().x && playerX + 35 <= line.getBounds().x) {
                    if (playerY + 60 >= line.getBounds().y && playerY <= line.getBounds().y + line.getBounds().height) {
                        playerVelocityX = -playerVelocityX;
                        playerX = line.getBounds().x - 50;
                        hasBumpedS = true;
                    }

                }
                else if (playerX + 11 >= line.getBounds().x && playerX - 1 <= line.getBounds().x) {
                    if (playerY + 60 >= line.getBounds().y && playerY <= line.getBounds().y + line.getBounds().height) {
                        playerVelocityX = -playerVelocityX;
                        playerX = line.getBounds().x +5;
                        hasBumpedS = true;
                    }

                }
            }
        }

        //checking if the player walks of a platform
        if (isOnGround == true){
            isOnPlat = false;
            for (HorizontalLine line : horizontalLines){
                if ((playerY + 60 >= line.getBounds().y && playerY + 59 <= line.getBounds().y + 1)) {
                    if (playerX + 43 >= line.getBounds().x && playerX <= line.getBounds().x + line.getBounds().width) {
                        isOnPlat = true;
                        break;
                    }
                }
            }
            if (isOnPlat == false){
                isJumping = true;
                if (rightJ == true){
                    playerVelocityX = 5;
                }
                else if (leftJ == true) {
                    playerVelocityX = -5;
                }
            }
            for (VerticalLine line : verticalLines) {
                if ((playerY + 58 >= line.getBounds().y && playerY <= line.getBounds().y + line.getBounds().height)) {
                    if (playerX + 45 >= line.getBounds().x && playerX + 36 <= line.getBounds().x + line.getBounds().width) {
                        if (rightJ == true){
                            playerX = line.getBounds().x - 47;
                        }
                    }
                    if (playerX + 11 >= line.getBounds().x && playerX - 2 <= line.getBounds().x + line.getBounds().width) {
                        if (leftJ == true) {
                            playerX = line.getBounds().x + 2;
                        }
                    }
                }

            }
        }



        //gravity
        if (isJumping == true) {
            if (playerVelocityY > -15) {
                playerVelocityY -= 1;
            }
            isOnGround = false;
            playerY -= playerVelocityY;
        }

        if (chargeJ == true && jumpValue < 30){
            jumpValue+=1;
        }

        if(isSlidingR){
            if(slidingRFinalX<playerX+45 && slidingRFinalY>playerY-60 && slidingRFinalX+slideLengthR>playerX && slidingRFinalY-slideLengthR<playerY || slidingRFinalX<playerX+45 && slidingRFinalY>playerY-60 && playerVelocityX<0){
                if (playerVelocityX>-5){
                    playerX = playerX + playerVelocityX;
                    playerY = playerY - playerVelocityX;
                    playerVelocityX = playerVelocityX-1;
                }
                else{
                    playerX = playerX-7;
                    playerY = playerY +7;
                }

            }
            else if(slidingRFinalX+slideLengthR<=playerX+45 && slidingRFinalY-slideLengthR>=playerY-60 && playerVelocityX>0){
                playerX = slidingRFinalX + slideLengthR+10;
                playerY = slidingRFinalY - slideLengthR;
                isJumping = true;
                isSlidingR = false;
                playerVelocityY = 0;
                slideLengthR = 0;
                slidingRFinalX = 0;
                slidingRFinalY = 0;

            }
            else{
                playerX = slidingRFinalX-45;
                playerY = slidingRFinalY+60;
                isJumping = true;
                isSlidingR = false;
                playerVelocityY = 0;
                playerVelocityX = -5;
                slideLengthR = 0;
                slidingRFinalX = 0;
                slidingRFinalY = 0;
            }

        }

        if(isSlidingL){
            if(slidingLFinalX>playerX && slidingLFinalY>playerY+60 && slidingLFinalX - slideLengthL< playerX && slidingLFinalY - slideLengthL < playerY+60 || slidingLFinalX>playerX && slidingLFinalY>playerY+60 && playerVelocityX>0){
                if(playerVelocityX<5){
                    playerX = playerX + playerVelocityX;
                    playerY = playerY + playerVelocityX;
                    playerVelocityX = playerVelocityX+1;
                }
                else{
                    playerX = playerX+7;
                    playerY = playerY +7;
                }
            }
            else if(slidingLFinalX - slideLengthL >= playerX && slidingLFinalY - slideLengthL >= playerY && playerVelocityX<0){
                playerX = slidingLFinalX - slideLengthL-10;
                playerY = slidingLFinalY - slideLengthL-60;
                isJumping = true;
                isSlidingL = false;
                playerVelocityY = 0;
                slideLengthL = 0;
                slidingLFinalX = 0;
                slidingLFinalY = 0;
            }
            else{
                playerX = slidingLFinalX;
                playerY = slidingLFinalY;
                isJumping = true;
                isSlidingL = false;
                playerVelocityY = 0;
                playerVelocityX = 5;
                slideLengthL = 0;
                slidingLFinalX = 0;
                slidingLFinalY = 0;
            }
        }

        if (hasBumpedS){
            playerX += playerVelocityX/2;
            playerVelocityX = (playerVelocityX*2)/5;
            hasBumpedS = false;
        }
        if (hasBumpedT == true){
            hasBumpedT = false;
        }

        if (playerY < -60) {
            levelSetUp.nextLevel();
            playerY = 730;
        }
        else if (playerY > 790){
            levelSetUp.previousLevel();
            playerY = -60;
        }

        if(!isSlidingR && !isSlidingL) {
            playerX += playerVelocityX;
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE && !isJumping && !isSlidingR && !isSlidingL && jumpValue<30) {
            chargeJ = true;
        }
        else if ((key == KeyEvent.VK_LEFT) && (jumpValue == 0) && isJumping == false) {
            playerX -= 7;
        }
        else if ((key == KeyEvent.VK_RIGHT) && (jumpValue == 0) && isJumping == false) {
            playerX += 7;
        }
        if (key == KeyEvent.VK_RIGHT && rightJ == false){
            rightJ = true;
        }
        else if (key == KeyEvent.VK_LEFT && leftJ == false){
            leftJ = true;
        }
        if (key == KeyEvent.VK_N){
            playerY = playerY - 500;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE && isJumping == false && !isSlidingR && !isSlidingL){
            chargeJ = false;
            isJumping = true;
            if (jumpValue <= 4){
                playerVelocityY = 8;
            }
            else if ((4 < jumpValue) && (jumpValue <=6)){
                playerVelocityY = 10;
            }
            else if ((6 < jumpValue) && (jumpValue <=9)){
                playerVelocityY = 13;
            }
            else if ((9 < jumpValue) && (jumpValue <=15)){
                playerVelocityY = 16;
            }
            else if ((15 < jumpValue) && (jumpValue <=20)){
                playerVelocityY = 20;
            }
            else if ((20 < jumpValue) && (jumpValue <=25)){
                playerVelocityY = 23;
            }
            else if (jumpValue <=29){
                playerVelocityY = 25;
            }
            else if ((29 < jumpValue) && (jumpValue <=30)){
                playerVelocityY = 28;
            }
            if (rightJ == true){
                playerVelocityX = 10;
            }
            else if (leftJ == true){
                playerVelocityX = -10;
            }
            jumpValue = 0;

        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            rightJ = false;
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            leftJ = false;
        }

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Jumping Game");
        Game game = new Game();
        frame.add(game);
        frame.setSize(1220, 820);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
