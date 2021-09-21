package PacManGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.AttributedString;
import java.util.Random;
import javax.swing.Timer;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

public final class GraphicsPanel extends javax.swing.JPanel implements ActionListener {

    private Integer x;
    private Integer y;
    private int redghostX;
    private int redghostY;
    private int pinkghostX;
    private int pinkghostY;
    private int orangeghostX;
    private int orangeghostY;
    private int cyanghostX;
    private int cyanghostY;
    private int redghostX2;
    private int redghostY2;
    private int pinkghostX2;
    private int pinkghostY2;
    private int orangeghostX2;
    private int orangeghostY2;
    private int cyanghostX2;
    private int cyanghostY2;
    private int redghostX3;
    private int redghostY3;
    private int pinkghostX3;
    private int pinkghostY3;
    private int orangeghostX3;
    private int orangeghostY3;
    private int cyanghostX3;
    private int cyanghostY3;
    private int redghostX4;
    private int redghostY4;
    private int pinkghostX4;
    private int pinkghostY4;
    private int orangeghostX4;
    private int orangeghostY4;
    private int cyanghostX4;
    private int cyanghostY4;
    private int redghostXoffset;
    private int redghostYoffset;
    private int pinkghostXoffset;
    private int pinkghostYoffset;
    private int orangeghostXoffset;
    private int orangeghostYoffset;
    private int cyanghostXoffset;
    private int cyanghostYoffset;
    private int ghostDirection;
    private int mouthMovement;
    private int pacManX;
    private int pacManY;
    private int lives;
    private int redlastMove;
    private int pinklastMove;
    private int orangelastMove;
    private int cyanlastMove;
    private boolean redhit;
    boolean hasMoved;
    boolean extraLife;
    private boolean pinkhit;
    private boolean orangehit;
    private boolean cyanhit;
    private boolean pinkrespawned;
    private boolean orangerespawned;
    private boolean cyanrespawned;
    private boolean redrespawned;
    private AttributedString ready;
    private AttributedString score;
    private AttributedString highScore;
    private AttributedString highScoreLabel;
    private AttributedString scoreLabel;
    private AttributedString strlives;
    private AttributedString theName;
    private AttributedString theName1;
    private AttributedString theName2;
    private AttributedString theName3;
    private AttributedString athighscore1;
    private AttributedString athighscore2;
    private AttributedString athighscore3;
    private AttributedString athighscore4;
    private AttributedString athighscore5;
    private AttributedString atuserName1;
    private AttributedString atuserName2;
    private AttributedString atuserName3;
    private AttributedString atuserName4;
    private AttributedString atuserName5;
    private int intscore;
    private int ghostsEaten;
    private String strscore;
    private String strhighScore;
    private int intHighScore;
    private boolean moved;
    private boolean flashTimer;
    private int flashInt;
    private boolean isPacMan;
    private boolean validMove;
    private boolean hitWall;
    private int pelletCount;
    private boolean allPelletsPlace;
    private boolean powerPelletMode;
    Direction direct;
    List<Pellets> pelletsList;
    List<Pellets> powerPelletsList;
    private int level;
    private String highscore1;
    private String userName1;
    private String highscore2;
    private String userName2;
    private String highscore3;
    private String userName3;
    private String highscore4;
    private String userName4;
    private String highscore5;
    private String userName5;
    private String tempScore;
    private String tempString;
    private String yourScore;
    private String yourName;
    private String[] highScoreArray;
    private String[] userNamesArray;
    private boolean letter1;
    private boolean letter2;
    private boolean letter3;
    private boolean endscreen;
    private boolean scoresdisplay;
    private boolean ghostCanMove;
    private boolean pacManCanMove;
    private boolean redCanMove;
    private boolean pinkCanMove;
    private boolean orangeCanMove;
    private boolean cyanCanMove;
    private int shrinkCount;
    private boolean movestart;
    private boolean eyesTime;
    Direction reddirect;
    Direction pinkdirect;
    Direction orangedirect;
    Direction cyandirect;
    private int levelFlasher;
    private int voidSize;
    private boolean voidActive;
    private boolean cherryEaten;
    private boolean orangeEaten;
    private boolean peachEaten;
    private Direction currentDirection;

    public GraphicsPanel() {
        initComponents();
        levelStart();

        lives = 3;

        intscore = 0;
        strscore = "0";
        endscreen = false;
        yourName = "AAA";
        letter1 = true;
        letter2 = false;
        letter3 = false;
        scoresdisplay = false;
        voidSize = 0;

    }

    public void start() {
        Timer timer = new Timer(50, this);
        timer.start();

    }

    public void levelStart() {
        //These values and names are here so that when a new player runs this program 
        //they do not have a null pointer exception
        //after first play these should be deleted
        //start of values
        userName1 = "BUSTERPPT";
        userName2 = "BOT";
        userName3 = "BOT";
        userName4 = "BOT";
        userName5 = "BOT";
        highscore1 = "100000000";
        highscore2 = "0";
        highscore3 = "0";
        highscore4 = "0";
        highscore5 = "0";
        //end of values to be removed

        eyesTime = false;
        currentDirection = null;
        cherryEaten = false;
        orangeEaten = false;
        peachEaten = false;
        levelFlasher = 100;
        moved = false;
        //load();
        shrinkCount = 70;
        movestart = false;
        powerPelletMode = false;
        x = 860;
        y = 300;
        pacManX = 895;
        pacManY = 335;
        redghostX = 0;
        pinkghostX = 0;
        orangeghostX = 0;
        cyanghostX = 0;
        redghostY = -20;
        pinkghostY = -20;
        orangeghostY = -20;
        cyanghostY = -20;
        redghostXoffset = 915;
        pinkghostXoffset = 915;
        orangeghostXoffset = 915;
        cyanghostXoffset = 915;
        redghostYoffset = 515;
        pinkghostYoffset = 515;
        orangeghostYoffset = 515;
        cyanghostYoffset = 515;
        redlastMove = 1;
        pinklastMove = 1;
        cyanlastMove = 1;
        orangelastMove = 1;
        allPelletsPlace = false;
        redhit = false;
        pinkhit = false;
        orangehit = false;
        cyanhit = false;
        pelletsList = new ArrayList();
        powerPelletsList = new ArrayList();
        pelletCount = 232;
        level++;
        pacManCanMove = true;
        ghostCanMove = true;
        placePellets();
        placePowerPellets();
    }

    public void move(Direction direction) {

        if (lives > 0) {
            if (pacManCanMove == true) {
                isPacMan = true;
                switch (direction) {
                    case Left -> {
                        moveCorrection(pacManX - 10, pacManY);
                        if (validMove == true) {
                            x -= 10;
                            pacManX -= 10;
                            mouthMovement++;
                            mouthMovement = mouthMovement % 2;
                            moved = true;
                            this.direct = Direction.Left;
                        }
                    }
                    case Right -> {
                        moveCorrection(pacManX + 10, pacManY);
                        if (validMove == true) {
                            x += 10;
                            pacManX += 10;
                            mouthMovement++;
                            mouthMovement = mouthMovement % 2;
                            moved = true;
                            this.direct = Direction.Right;
                        }
                    }
                    case Up -> {
                        moveCorrection(pacManX, pacManY - 10);
                        if (validMove == true) {
                            y -= 10;
                            pacManY -= 10;
                            mouthMovement++;
                            mouthMovement = mouthMovement % 2;
                            moved = true;
                            this.direct = Direction.Up;
                        }
                    }
                    case Down -> {
                        moveCorrection(pacManX, pacManY + 10);
                        if (validMove == true) {
                            y += 10;
                            pacManY += 10;
                            mouthMovement++;
                            mouthMovement = mouthMovement % 2;
                            moved = true;
                            this.direct = Direction.Down;
                        }
                    }
                }
            }
            isPacMan = false;
        } else if (lives <= 0 && endscreen == true) {
            enterName(direction);
        }
    }

    public void ghostMove() {
        Random random = new Random();
        if (scoresdisplay == false) {
            if (ghostCanMove == true) {
                for (int i = 0; i < 4; i++) {
                    hasMoved = false;
                    hitWall = false;
                    while (hasMoved == false) {
                        switch (i) {
                            case 0 ->
                                randomLocations(redghostXoffset, redghostYoffset);
                            case 1 ->
                                randomLocations(pinkghostXoffset, pinkghostYoffset);
                            case 2 ->
                                randomLocations(orangeghostXoffset, orangeghostYoffset);
                            case 3 ->
                                randomLocations(cyanghostXoffset, cyanghostYoffset);

                        }

                        ghostDirection = random.nextInt(4);
                        if (hitWall == false && i == 0) {
                            ghostDirection = redlastMove;
                        } else if (hitWall == false && i == 1) {
                            ghostDirection = pinklastMove;
                        } else if (hitWall == false && i == 2) {
                            ghostDirection = orangelastMove;
                        } else if (hitWall == false && i == 3) {
                            ghostDirection = cyanlastMove;
                        }
                        switch (i) {
                            case 0 -> {
                                switch (ghostDirection) {
                                    case 0:
                                        moveCorrection(redghostXoffset + 10, redghostYoffset);
                                        if (validMove == true) {
                                            redghostX += 10;
                                            redghostXoffset += 10;
                                            redlastMove = 0;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                        break;
                                    case 1:
                                        moveCorrection(redghostXoffset - 10, redghostYoffset);
                                        if (validMove == true) {
                                            redghostX -= 10;
                                            redghostXoffset -= 10;
                                            redlastMove = 1;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                        break;
                                    case 2:
                                        moveCorrection(redghostXoffset, redghostYoffset + 10);
                                        if (validMove == true) {
                                            redghostY += 10;
                                            redghostYoffset += 10;
                                            redlastMove = 2;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                        break;
                                    case 3:
                                        moveCorrection(redghostXoffset, redghostYoffset - 10);
                                        if (validMove == true) {
                                            redghostY -= 10;
                                            redghostYoffset -= 10;
                                            redlastMove = 3;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            case 1 -> {
                                switch (ghostDirection) {
                                    case 0 -> {
                                        moveCorrection(pinkghostXoffset + 10, pinkghostYoffset);
                                        if (validMove == true) {
                                            pinkghostX += 10;
                                            pinkghostXoffset += 10;
                                            pinklastMove = 0;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                    }
                                    case 1 -> {
                                        moveCorrection(pinkghostXoffset - 10, pinkghostYoffset);
                                        if (validMove == true) {
                                            pinkghostX -= 10;
                                            pinkghostXoffset -= 10;
                                            pinklastMove = 1;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                    }
                                    case 2 -> {
                                        moveCorrection(pinkghostXoffset, pinkghostYoffset + 10);
                                        if (validMove == true) {
                                            pinkghostY += 10;
                                            pinkghostYoffset += 10;
                                            pinklastMove = 2;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                    }
                                    case 3 -> {
                                        moveCorrection(pinkghostXoffset, pinkghostYoffset - 10);
                                        if (validMove == true) {
                                            pinkghostY -= 10;
                                            pinkghostYoffset -= 10;
                                            pinklastMove = 3;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                    }
                                    default -> {
                                    }
                                }
                            }
                            case 2 -> {
                                switch (ghostDirection) {
                                    case 0 -> {
                                        moveCorrection(orangeghostXoffset + 10, orangeghostYoffset);
                                        if (validMove == true) {
                                            orangeghostX += 10;
                                            orangeghostXoffset += 10;
                                            orangelastMove = 0;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                    }
                                    case 1 -> {
                                        moveCorrection(orangeghostXoffset - 10, orangeghostYoffset);
                                        if (validMove == true) {
                                            orangeghostX -= 10;
                                            orangeghostXoffset -= 10;
                                            orangelastMove = 1;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                    }
                                    case 2 -> {
                                        moveCorrection(orangeghostXoffset, orangeghostYoffset + 10);
                                        if (validMove == true) {
                                            orangeghostY += 10;
                                            orangeghostYoffset += 10;
                                            orangelastMove = 2;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                    }
                                    case 3 -> {
                                        moveCorrection(orangeghostXoffset, orangeghostYoffset - 10);
                                        if (validMove == true) {
                                            orangeghostY -= 10;
                                            orangeghostYoffset -= 10;
                                            orangelastMove = 3;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                    }
                                    default -> {
                                    }
                                }
                            }
                            case 3 -> {
                                switch (ghostDirection) {
                                    case 0 -> {
                                        moveCorrection(cyanghostXoffset + 10, cyanghostYoffset);
                                        if (validMove == true) {
                                            cyanghostX += 10;
                                            cyanghostXoffset += 10;
                                            cyanlastMove = 0;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                    }
                                    case 1 -> {
                                        moveCorrection(cyanghostXoffset - 10, cyanghostYoffset);
                                        if (validMove == true) {
                                            cyanghostX -= 10;
                                            cyanghostXoffset -= 10;
                                            cyanlastMove = 1;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                    }
                                    case 2 -> {
                                        moveCorrection(cyanghostXoffset, cyanghostYoffset + 10);
                                        if (validMove == true) {
                                            cyanghostY += 10;
                                            cyanghostYoffset += 10;
                                            cyanlastMove = 2;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                    }
                                    case 3 -> {
                                        moveCorrection(cyanghostXoffset, cyanghostYoffset - 10);
                                        if (validMove == true) {
                                            cyanghostY -= 10;
                                            cyanghostYoffset -= 10;
                                            cyanlastMove = 3;
                                            hasMoved = true;
                                        } else {
                                            hitWall = true;
                                        }
                                    }
                                    default -> {
                                    }
                                }
                            }
                            default -> {
                            }
                        }
                    }
                }
            }
        } else if (movestart == false) {
            redghostX = 350;
            pinkghostX = 350;
            orangeghostX = -350;
            cyanghostX = -350;
            redghostY = -315;
            pinkghostY = 85;
            orangeghostY = -315;
            cyanghostY = 85;

            redghostX2 = 425;
            pinkghostX2 = 425;
            orangeghostX2 = -425;
            cyanghostX2 = -425;
            redghostY2 = -440;
            pinkghostY2 = 210;
            orangeghostY2 = -440;
            cyanghostY2 = 210;

            redghostX3 = -350;
            pinkghostX3 = 0;
            orangeghostX3 = 0;
            cyanghostX3 = 350;
            redghostY3 = -115;
            pinkghostY3 = -315;
            orangeghostY3 = 85;
            cyanghostY3 = -115;

            redghostX4 = -425;
            pinkghostX4 = 0;
            orangeghostX4 = 0;
            cyanghostX4 = 425;
            redghostY4 = -115;
            pinkghostY4 = -425;
            orangeghostY4 = 210;
            cyanghostY4 = -115;

            reddirect = Direction.Left;
            pinkdirect = Direction.Up;
            orangedirect = Direction.Down;
            cyandirect = Direction.Right;
            movestart = true;

        } else {

            if (!(redghostX < -350) && redghostY < -315) {
                reddirect = Direction.Left;
            }
            if (!(redghostX > 350) && redghostY > 85) {
                reddirect = Direction.Right;
            }
            if (!(redghostY > 85) && redghostX < -350) {
                reddirect = Direction.Down;
            }
            if (!(redghostY < -315) && redghostX > 350) {
                reddirect = Direction.Up;
            }

            if (reddirect == Direction.Right) {
                redghostX += 14;
                redghostX2 += 19;
                redghostX3 += 14;
                redghostX4 += 19;
            } else if (reddirect == Direction.Left) {
                redghostX -= 14;
                redghostX2 -= 19;
                redghostX3 -= 14;
                redghostX4 -= 19;
            } else if (reddirect == Direction.Up) {
                redghostY -= 8;
                redghostY2 -= 13;
                redghostY3 -= 8;
                redghostY4 -= 13;
            } else if (reddirect == Direction.Down) {
                redghostY += 8;
                redghostY2 += 13;
                redghostY3 += 8;
                redghostY4 += 13;
            }
            if (!(pinkghostX < -350) && pinkghostY < -315) {
                pinkdirect = Direction.Left;
            }
            if (!(pinkghostX > 350) && pinkghostY > 85) {
                pinkdirect = Direction.Right;
            }
            if (!(pinkghostY > 85) && pinkghostX < -350) {
                pinkdirect = Direction.Down;
            }
            if (!(pinkghostY < -315) && pinkghostX > 350) {
                pinkdirect = Direction.Up;
            }
            if (pinkdirect == Direction.Right) {
                pinkghostX += 14;
                pinkghostX2 += 19;
                pinkghostX3 += 14;
                pinkghostX4 += 19;
            } else if (pinkdirect == Direction.Left) {
                pinkghostX -= 14;
                pinkghostX2 -= 19;
                pinkghostX3 -= 14;
                pinkghostX4 -= 19;
            } else if (pinkdirect == Direction.Up) {
                pinkghostY -= 8;
                pinkghostY2 -= 13;
                pinkghostY3 -= 8;
                pinkghostY4 -= 13;
            } else if (pinkdirect == Direction.Down) {
                pinkghostY += 8;
                pinkghostY2 += 13;
                pinkghostY3 += 8;
                pinkghostY4 += 13;
            }
            if (!(orangeghostX < -350) && orangeghostY < -315) {
                orangedirect = Direction.Left;
            }
            if (!(orangeghostX > 350) && orangeghostY > 85) {
                orangedirect = Direction.Right;
            }
            if (!(orangeghostY > 85) && orangeghostX < -350) {
                orangedirect = Direction.Down;
            }
            if (!(orangeghostY < -315) && orangeghostX > 350) {
                orangedirect = Direction.Up;
            }
            if (orangedirect == Direction.Right) {
                orangeghostX += 14;
                orangeghostX2 += 19;
                orangeghostX3 += 14;
                orangeghostX4 += 19;
            } else if (orangedirect == Direction.Left) {
                orangeghostX -= 14;
                orangeghostX2 -= 19;
                orangeghostX3 -= 14;
                orangeghostX4 -= 19;
            } else if (orangedirect == Direction.Up) {
                orangeghostY -= 8;
                orangeghostY2 -= 13;
                orangeghostY3 -= 8;
                orangeghostY4 -= 13;
            } else if (orangedirect == Direction.Down) {
                orangeghostY += 8;
                orangeghostY2 += 13;
                orangeghostY3 += 8;
                orangeghostY4 += 13;
            }
            if (!(cyanghostX < -350) && cyanghostY < -315) {
                cyandirect = Direction.Left;
            }
            if (!(cyanghostX > 350) && cyanghostY > 85) {
                cyandirect = Direction.Right;
            }
            if (!(cyanghostY > 85) && cyanghostX < -350) {
                cyandirect = Direction.Down;
            }
            if (!(cyanghostY < -315) && cyanghostX > 350) {
                cyandirect = Direction.Up;
            }
            if (cyandirect == Direction.Right) {
                cyanghostX += 14;
                cyanghostX2 += 19;
                cyanghostX3 += 14;
                cyanghostX4 += 19;
            } else if (cyandirect == Direction.Left) {
                cyanghostX -= 14;
                cyanghostX2 -= 19;
                cyanghostX3 -= 14;
                cyanghostX4 -= 19;
            } else if (cyandirect == Direction.Up) {
                cyanghostY -= 8;
                cyanghostY2 -= 13;
                cyanghostY3 -= 8;
                cyanghostY4 -= 13;
            } else if (cyandirect == Direction.Down) {
                cyanghostY += 8;
                cyanghostY2 += 13;
                cyanghostY3 += 8;
                cyanghostY4 += 13;
            }
        }
    }

    public void moveCorrection(int x, int y) {
        // other Ts
        if (x < 865 && x > 435 && y > 265 && y < 365) {
            validMove = false;
        } else if (x < 865 && x > 435 && y > 665 && y < 765) {
            validMove = false;
        } else if (x > 605 && y > 265 && x < 705 && y < 435) {
            validMove = false;
        } else if (x > 605 && y > 595 && x < 705 && y < 765) {
            validMove = false;
        } //side  walls
        else if (x < 95) {
            validMove = false;
        } else if (x > 1695) {
            validMove = false;
        } //top  walls
        else if (x > 615 && y > 0 && x < 860 && y < 255 && level != 0) {
            validMove = false;
        } else if (x > 950 && y > 0 && x < 1190 && y < 255) {
            validMove = false;
        } else if (x > 30 && y > 10 && x < 700 && y < 115) {
            validMove = false;
        } else if (x > 1150 && y > -10 && x < 1800 && y < 115) {
            validMove = false;
        } //bottom walls
        else if (x > 615 && y > 775 && x < 860 && y < 1100) {
            validMove = false;
        } else if (x > 950 && y > 775 && x < 1190 && y < 1100) {
            validMove = false;
        } else if (x > 30 && y > 915 && x < 700 && y < 1100) {
            validMove = false;
        } else if (x > 1150 && y > 915 && x < 1800 && y < 1100) {
            validMove = false;
        } //side divider
        else if (x > 0 && y > 465 && x < 315 && y < 565) {
            validMove = false;
        } //top lines
        else if (x > 945 && y > 265 && x < 1195 && y < 365) {
            validMove = false;
        } else if (x > 945 && y > 665 && x < 1195 && y < 765) {
            validMove = false;
        } //middle T
        else if (x > 435 && y > 375 && x < 535 && y < 655) {
            validMove = false;
        } else if (x > 435 && y > 265 && x < 865 && y < 365) {
            validMove = false;
        } else if (x > 435 && y > 465 && x < 705 && y < 565) {
            validMove = false;
        } //top left square
        else if (x > 115 && y > 125 && x < 285 && y < 255) {
            validMove = false;
        } //midtop left square
        else if (x > 115 && y > 265 && x < 385 && y < 455) {
            validMove = false;
        } //top left cetner square
        else if (x > 315 && y > 125 && x < 575 && y < 255) {
            validMove = false;
        } //bottom left square
        else if (x > 115 && y > 775 && x < 285 && y < 905) {
            validMove = false;
        } //midtbottom left square
        else if (x > 115 && y > 575 && x < 385 && y < 765) {
            validMove = false;
        } //bottom left center square
        else if (x > 315 && y > 775 && x < 575 && y < 905) {
            validMove = false;
        } //right middle T
        else if (x > 1085 && y > 375 && x < 1185 && y < 655) {
            validMove = false;
        } else if (x > 1085 && y > 465 && x < 1355 && y < 565) {
            validMove = false;
        } //more right T
        else if (x > 1385 && y > 365 && x < 1485 && y < 665) {
            validMove = false;
        } else if (x > 1385 && y > 465 && x < 1655 && y < 565) {
            validMove = false;
        } //right border lines
        else if (x > 1385 && y > -5 && x < 1485 && y < 185) {
            validMove = false;
        } else if (x > 1385 && y > 845 && x < 1485 && y < 1050) {
            validMove = false;
        } //letsL-Ts
        else if (x > 1215 && y > 125 && x < 1315 && y < 435) {
            validMove = false;
        } else if (x > 1215 && y > 205 && x < 1415 && y < 305) {
            validMove = false;
        } else if (x > 1215 && y > 585 && x < 1315 && y < 895) {
            validMove = false;
        } else if (x > 1215 && y > 725 && x < 1415 && y < 825) {
            validMove = false;
        } //far right L-Ts
        else if (x > 1565 && y > 125 && x < 1665 && y < 435) {
            validMove = false;
        } else if (x > 1455 && y > 205 && x < 1665 && y < 305) {
            validMove = false;
        } else if (x > 1565 && y > 585 && x < 1665 && y < 895) {
            validMove = false;
        } else if (x > 1455 && y > 725 && x < 1665 && y < 825) {
            validMove = false;
        } //center square
        else if (x > 765 && y > 525 && x < 1035 && y < 655) {
            validMove = false;
        } else if (x > 765 && y > 375 && x < 1035 && y < 465) {
            validMove = false;
        } else if (x > 765 && y > 375 && x < 865 && y < 505) {
            validMove = false;
        } else if (x > 765 && y > 525 && x < 865 && y < 655) {
            validMove = false;
        } else if (x > 935 && y > 375 && x < 1035 && y < 635) {
            validMove = false;

            //door
        } else {
            validMove = !(x > 775 && y > 435 && x < 875 && y < 595 && ((isPacMan == true && powerPelletMode == false) || (eyesTime == true && isPacMan == false)));
        }

    }

    public void randomLocations(int x, int y) {
        if (x == 1215 && y == 265) {
            hitWall = true;
        } else if (x == 905 && y == 265) {
            hitWall = true;
        } else if (x == 905 && y == 365) {
            hitWall = true;
        } else if (x == 705 && y == 465) {
            hitWall = true;
        } else if (x == 295 && y == 265) {
            hitWall = true;
        } else if (x == 295 && y == 115) {
            hitWall = true;
        } else if (x == 95 && y == 265) {
            hitWall = true;
        } else if (x == 385 && y == 465) {
            hitWall = true;
        } else if (x == 1435 && y == 205) {
            hitWall = true;
        } else if (x == 1695 && y == 455) {
            hitWall = true;
        } else if (x == 385 && y == 565) {
            hitWall = true;
        } else if (x == 305 && y == 765) {
            hitWall = true;
        } else if (x == 95 && y == 775) {
            hitWall = true;
        } else if (x == 305 && y == 915) {
            hitWall = true;
        } else if (x == 705 && y == 585) {
            hitWall = true;
        } else if (x == 905 && y == 665) {
            hitWall = true;
        } else if (x == 905 && y == 765) {
            hitWall = true;
        } else if (x == 1435 && y == 725) {
            hitWall = true;
        } else if (x == 1695 && y == 575) {
            hitWall = true;
        }

    }

    public void save() {
        strhighScore = highscore1 + "," + highscore2 + "," + highscore3 + "," + highscore4 + "," + highscore5;
        try {

            FileOutputStream fos = new FileOutputStream("PacManHighscore.txt");
            OutputStreamWriter outWrite = new OutputStreamWriter(fos);
            outWrite.write(strhighScore);
            outWrite.flush();
            outWrite.close();
            fos.close();
            System.out.println("File Saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
        strhighScore = userName1 + "," + userName2 + "," + userName3 + "," + userName4 + "," + userName5;
        try {

            FileOutputStream fos = new FileOutputStream("PacManUserNames.txt");
            OutputStreamWriter outWrite = new OutputStreamWriter(fos);
            outWrite.write(strhighScore);
            outWrite.flush();
            outWrite.close();
            fos.close();
            System.out.println("File Saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void load() {
        highScoreArray = new String[5];

        try {
            FileInputStream fis = new FileInputStream("PacManHighscore.txt");
            InputStreamReader inread = new InputStreamReader(fis);
            BufferedReader buffread = new BufferedReader(inread);
            String savedArray = buffread.readLine();
            buffread.close();
            inread.close();
            fis.close();
            strhighScore = savedArray;
            highScoreArray = strhighScore.split(",");
            highscore1 = highScoreArray[0];
            highscore2 = highScoreArray[1];
            highscore3 = highScoreArray[2];
            highscore4 = highScoreArray[3];
            highscore5 = highScoreArray[4];
        } catch (Exception e) {
            e.printStackTrace();
        }
        userNamesArray = new String[5];
        try {
            FileInputStream fis = new FileInputStream("PacManUserNames.txt");
            InputStreamReader inread = new InputStreamReader(fis);
            BufferedReader buffread = new BufferedReader(inread);
            String savedArray = buffread.readLine();
            buffread.close();
            inread.close();
            fis.close();
            strhighScore = savedArray;
            userNamesArray = strhighScore.split(",");
            userName1 = userNamesArray[0];
            userName2 = userNamesArray[1];
            userName3 = userNamesArray[2];
            userName4 = userNamesArray[3];
            userName5 = userNamesArray[4];
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (currentDirection != null) {
            move(currentDirection);
            if (endscreen == true) {
                currentDirection = null;
            }
        }
        if (level == 1 && cherryEaten == false && pacManX > 1030 && pacManX < 1100 && pacManY > 450 && pacManY < 570) {
            cherryEaten = true;
            intscore += 200;
            strscore = "";
            strscore = Integer.toString(intscore);
        } else if (level == 2 && orangeEaten == false && pacManX > 1030 && pacManX < 1100 && pacManY > 450 && pacManY < 570) {
            orangeEaten = true;
            intscore += 400;
            strscore = "";
            strscore = Integer.toString(intscore);
        } else if (level == 3 && peachEaten == false && pacManX > 1030 && pacManX < 1100 && pacManY > 450 && pacManY < 570) {
            peachEaten = true;
            intscore += 800;
            strscore = "";
            strscore = Integer.toString(intscore);
        }
        if (x > 820 && y > 440 && x < 980 && y < 600 && voidActive == false) {
            voidSize += 10;
        }

        if (voidSize > 900) {
            voidActive = true;
        }

        if (voidActive == true) {
            voidSize = 0;
            level = -1;
            levelStart();
            voidActive = false;
        }

        flashInt++;
        flashInt = flashInt % 4;
        if (intscore > intHighScore) {
            intHighScore = intscore;
            strhighScore = "";
            strhighScore = Integer.toString(intHighScore);
        }
        if (moved == true && allPelletsPlace == false) {
            allPelletsPlace = true;
            for (int i = 0; i < 4; i++) {
                Pellets pellet = new Pellets(840 + i * 50, 650);
                pelletsList.add(pellet);
            }
        }
        if (intscore > 10000 && extraLife == false) {
            extraLife = true;
            if (lives <= 2) {
                lives++;
            } else if (lives == 3) {
                intscore += 10000;
                strscore = "";
                strscore = Integer.toString(intscore);
            }
        }
        validate();
        repaint();
        if (pacManY < 0) {
            y = 965;
            pacManY = 1000;
        } else if (pacManY > 1010) {
            y = -35;
            pacManY = 0;
        } else if (redghostYoffset < 0) {
            redghostY = 465;
            redghostYoffset = 1000;
        } else if (redghostYoffset > 1010) {
            redghostY = -535;
            redghostYoffset = 0;
        } else if (pinkghostYoffset < 0) {
            pinkghostY = 465;
            pinkghostYoffset = 1000;
        } else if (pinkghostYoffset > 1010) {
            pinkghostY = -535;
            pinkghostYoffset = 0;
        } else if (orangeghostYoffset < 0) {
            orangeghostY = 465;
            orangeghostYoffset = 1000;
        } else if (orangeghostYoffset > 1010) {
            orangeghostY = -535;
            orangeghostYoffset = 0;
        } else if (cyanghostYoffset < 0) {
            cyanghostY = 465;
            cyanghostYoffset = 1000;
        } else if (cyanghostYoffset > 1010) {
            cyanghostY = -535;
            cyanghostYoffset = 0;
        }

        if (moved == true) {
            if (Math.abs(pacManX - redghostXoffset) < 70 && Math.abs(pacManY - redghostYoffset) < 70) {
                redhit = true;
            } else if (Math.abs(pacManX - pinkghostXoffset) < 70 && Math.abs(pacManY - pinkghostYoffset) < 70) {
                pinkhit = true;
            } else if ((Math.abs(pacManX - orangeghostXoffset) < 70 && Math.abs(pacManY - orangeghostYoffset) < 70)) {
                orangehit = true;
            } else if ((Math.abs(pacManX - cyanghostXoffset) < 70 && Math.abs(pacManY - cyanghostYoffset) < 70)) {
                cyanhit = true;
            }

            ghostMove();

            for (int i = 0; i < pelletsList.size(); i++) {
                if ((Math.abs(pacManX - pelletsList.get(i).getX() - 7) < 42) && (Math.abs(pacManY - pelletsList.get(i).getY() - 7) < 42)) {
                    pelletsList.remove(i);
                    intscore += 10;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                    pelletCount--;
                }

            }

            for (int i = 0; i < powerPelletsList.size(); i++) {
                if ((Math.abs(pacManX - powerPelletsList.get(i).getX() - 20) < 55) && (Math.abs(pacManY - powerPelletsList.get(i).getY() - 20) < 55)) {
                    powerPelletsList.remove(i);
                    intscore += 50;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                    powerPelletMode = true;
                    powerPelletTimer();
                }
            }

        }

    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        if (endscreen == false) {
            drawBackGround(graphics);
            drawPellets(graphics);
            drawPowerPellets(graphics);
            drawBoard(graphics);
            if (level == 1 && cherryEaten == false) {
                drawCherry(graphics);
            } else if (level == 2 && orangeEaten == false) {
                drawOrange(graphics);
            } else if (level == 3 && peachEaten == false) {
                drawPeach(graphics);
            }
            drawPacMan(graphics);
            drawGhosts(graphics);
            theVoid(graphics);
        } else {
            drawBackGround(graphics);
            drawGhosts(graphics);
            drawBoard(graphics);

        }
    }

    public void placePowerPellets() {
        for (int i = 0; i < 2; i++) {
            Pellets powerPellet = new Pellets(80, 100 + i * 780);
            powerPelletsList.add(powerPellet);
        }

        for (int i = 0; i < 2; i++) {
            Pellets powerPellet = new Pellets(1670, 100 + i * 780);
            powerPelletsList.add(powerPellet);
        }

    }

    public void placePellets() {

        //row 1
        for (int i = 0; i < 10; i++) {
            Pellets pellet = new Pellets(140 + i * 50, 110);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 5; i++) {
            Pellets pellet = new Pellets(1190 + i * 50, 110);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 4; i++) {
            Pellets pellet = new Pellets(1490 + i * 50, 110);
            pelletsList.add(pellet);
        }
        //row2
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(90 + i * 50, 180);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(290 + i * 50, 180);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(590 + i * 50, 180);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 5; i++) {
            Pellets pellet = new Pellets(1340 + i * 50, 180);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(1190 + i * 50, 180);
            pelletsList.add(pellet);
        }
        //row 3
        for (int i = 0; i < 23; i++) {
            Pellets pellet = new Pellets(90 + i * 50, 250);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(1440 + i * 50, 250);
            pelletsList.add(pellet);
        }
        //row4
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(390 + i * 50, 310);
            pelletsList.add(pellet);
        }

        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(1190 + i * 50, 310);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 5; i++) {
            Pellets pellet = new Pellets(1340 + i * 50, 310);
            pelletsList.add(pellet);
        }

        //row5
        for (int i = 0; i < 5; i++) {
            Pellets pellet = new Pellets(390 + i * 50, 370);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 11; i++) {
            Pellets pellet = new Pellets(690 + i * 50, 370);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 5; i++) {
            Pellets pellet = new Pellets(1340 + i * 50, 370);
            pelletsList.add(pellet);
        }
        //row6
        for (int i = 0; i < 6; i++) {
            Pellets pellet = new Pellets(140 + i * 50, 450);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 5; i++) {
            Pellets pellet = new Pellets(540 + i * 50, 450);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(1040 + i * 50, 450);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 4; i++) {
            Pellets pellet = new Pellets(1190 + i * 50, 450);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 3; i++) {
            Pellets pellet = new Pellets(1490 + i * 50, 450);
            pelletsList.add(pellet);
        }
        //row7
        for (int i = 0; i < 3; i++) {
            Pellets pellet = new Pellets(290 + i * 50, 510);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 2; i++) {
            Pellets pellet = new Pellets(690 + i * 50, 510);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(1040 + i * 50, 510);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(1340 + i * 50, 510);
            pelletsList.add(pellet);
        }
        //row8
        for (int i = 0; i < 6; i++) {
            Pellets pellet = new Pellets(140 + i * 50, 570);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 5; i++) {
            Pellets pellet = new Pellets(540 + i * 50, 570);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(1040 + i * 50, 570);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 4; i++) {
            Pellets pellet = new Pellets(1190 + i * 50, 570);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 3; i++) {
            Pellets pellet = new Pellets(1490 + i * 50, 570);
            pelletsList.add(pellet);
        }
        //row9
        for (int i = 0; i < 5; i++) {
            Pellets pellet = new Pellets(390 + i * 50, 650);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 3; i++) {
            Pellets pellet = new Pellets(690 + i * 50, 650);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 4; i++) {
            Pellets pellet = new Pellets(1040 + i * 50, 650);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 5; i++) {
            Pellets pellet = new Pellets(1340 + i * 50, 650);
            pelletsList.add(pellet);
        }
        //row10
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(390 + i * 50, 705);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(890 + i * 50, 705);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(1190 + i * 50, 705);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 5; i++) {
            Pellets pellet = new Pellets(1340 + i * 50, 705);
            pelletsList.add(pellet);
        }
        //row 11
        for (int i = 0; i < 23; i++) {
            Pellets pellet = new Pellets(90 + i * 50, 760);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(1440 + i * 50, 760);
            pelletsList.add(pellet);
        }
        //row 12
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(290 + i * 50, 840);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(590 + i * 50, 830);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(1190 + i * 50, 830);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 5; i++) {
            Pellets pellet = new Pellets(1340 + i * 50, 830);
            pelletsList.add(pellet);
        }
        //row 13
        for (int i = 0; i < 10; i++) {
            Pellets pellet = new Pellets(140 + i * 50, 900);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 5; i++) {
            Pellets pellet = new Pellets(1190 + i * 50, 900);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 4; i++) {
            Pellets pellet = new Pellets(1490 + i * 50, 900);
            pelletsList.add(pellet);
        }
        //left column
        for (int i = 0; i < 3; i++) {
            Pellets pellet = new Pellets(90, 320 + i * 65);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 3; i++) {
            Pellets pellet = new Pellets(90, 570 + i * 65);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 1; i++) {
            Pellets pellet = new Pellets(90, 830 + i * 65);
            pelletsList.add(pellet);
        }
        //middle column
        for (int i = 0; i < 4; i++) {
            Pellets pellet = new Pellets(890, 0 + i * 60);
            pelletsList.add(pellet);
        }
        for (int i = 0; i < 4; i++) {
            Pellets pellet = new Pellets(890, 820 + i * 60);
            pelletsList.add(pellet);
        }
        //right  column
        for (int i = 0; i < 12; i++) {
            Pellets pellet = new Pellets(1670, 150 + i * 60);
            pelletsList.add(pellet);

        }

    }

    public void drawPacMan(Graphics graphics) {

        if (redhit == true && powerPelletMode == true && redrespawned == false) {
            redghostX = 0;
            redghostY = 0;
            redghostXoffset = 915;
            redghostYoffset = 535;
            switch (ghostsEaten) {
                case 0 -> {
                    ghostsEaten++;
                    intscore += 200;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
                case 1 -> {
                    ghostsEaten++;
                    intscore += 400;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
                case 2 -> {
                    ghostsEaten++;
                    intscore += 800;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
                case 3 -> {
                    ghostsEaten++;
                    intscore += 1600;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
            }
            redhit = false;
            redrespawned = true;
            eyesTime = true;
            respawnTimer();
            PacManDirection(direct, graphics);
        } else if (pinkhit == true && powerPelletMode == true && pinkrespawned == false) {
            pinkghostX = 0;
            pinkghostY = 0;
            pinkghostXoffset = 915;
            pinkghostYoffset = 535;
            switch (ghostsEaten) {
                case 0 -> {
                    ghostsEaten++;
                    intscore += 200;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
                case 1 -> {
                    ghostsEaten++;
                    intscore += 400;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
                case 2 -> {
                    ghostsEaten++;
                    intscore += 800;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
                case 3 -> {
                    ghostsEaten++;
                    intscore += 1600;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
            }
            pinkhit = false;
            pinkrespawned = true;
            eyesTime = true;
            respawnTimer();
            PacManDirection(direct, graphics);
        } else if (orangehit == true && powerPelletMode == true && orangerespawned == false) {
            orangeghostX = 0;
            orangeghostY = 0;
            orangeghostXoffset = 915;
            orangeghostYoffset = 535;
            switch (ghostsEaten) {
                case 0 -> {
                    ghostsEaten++;
                    intscore += 200;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
                case 1 -> {
                    ghostsEaten++;
                    intscore += 400;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
                case 2 -> {
                    ghostsEaten++;
                    intscore += 800;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
                case 3 -> {
                    ghostsEaten++;
                    intscore += 1600;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
            }
            orangehit = false;
            orangerespawned = true;
            eyesTime = true;
            respawnTimer();
            PacManDirection(direct, graphics);
        } else if (cyanhit == true && powerPelletMode == true && cyanrespawned == false) {
            cyanghostX = 0;
            cyanghostY = 0;
            cyanghostXoffset = 915;
            cyanghostYoffset = 535;
            switch (ghostsEaten) {
                case 0 -> {
                    ghostsEaten++;
                    intscore += 200;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
                case 1 -> {
                    ghostsEaten++;
                    intscore += 400;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
                case 2 -> {
                    ghostsEaten++;
                    intscore += 800;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
                case 3 -> {
                    ghostsEaten++;
                    intscore += 1600;
                    strscore = "";
                    strscore = Integer.toString(intscore);
                }
            }
            cyanhit = false;
            cyanrespawned = true;
            eyesTime = true;
            respawnTimer();
            PacManDirection(direct, graphics);
        } else if ((redhit == true || pinkhit == true || orangehit == true || cyanhit == true)) {
            pacManCanMove = false;
            ghostCanMove = false;
            pacManDeathReset(graphics);
        } else if (lives > 0 && pacManCanMove == true) {
            PacManDirection(direct, graphics);
        }

    }

    public void PacManDirection(Direction direction, Graphics graphics) {
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(x, y, 70, 70);
        if (mouthMovement == 0 && direction == Direction.Right) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(x + 30, y + 35, 40, 5);
            graphics.fillRect(x + 35, y + 40, 35, 5);
            graphics.fillRect(x + 35, y + 30, 35, 5);
            graphics.fillRect(x + 40, y + 45, 30, 5);
            graphics.fillRect(x + 40, y + 25, 30, 5);
            graphics.fillRect(x + 45, y + 50, 25, 5);
            graphics.fillRect(x + 45, y + 20, 25, 5);
            graphics.fillRect(x + 50, y + 55, 20, 5);
            graphics.fillRect(x + 50, y + 15, 20, 5);
            graphics.fillRect(x + 55, y + 60, 5, 5);
            graphics.fillRect(x + 55, y + 10, 10, 5);
        } else if (mouthMovement == 0 && direction == Direction.Left) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(x, y + 35, 40, 5);
            graphics.fillRect(x, y + 40, 35, 5);
            graphics.fillRect(x, y + 30, 35, 5);
            graphics.fillRect(x, y + 45, 30, 5);
            graphics.fillRect(x, y + 25, 30, 5);
            graphics.fillRect(x, y + 50, 25, 5);
            graphics.fillRect(x, y + 20, 25, 5);
            graphics.fillRect(x, y + 55, 20, 5);
            graphics.fillRect(x, y + 15, 20, 5);
            graphics.fillRect(x + 10, y + 60, 5, 5);
            graphics.fillRect(x, y + 10, 10, 5);
            graphics.fillRect(x + 10, y + 10, 5, 5);

        } else if (mouthMovement == 0 && direction == Direction.Up) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(x, y, 55, 5);
            graphics.fillRect(x + 3, y + 5, 60, 5);
            graphics.fillRect(x + 8, y + 10, 55, 5);
            graphics.fillRect(x + 13, y + 15, 45, 5);
            graphics.fillRect(x + 18, y + 20, 35, 5);
            graphics.fillRect(x + 23, y + 25, 25, 5);
            graphics.fillRect(x + 28, y + 30, 15, 5);
            graphics.fillRect(x + 33, y + 35, 5, 5);

        } else if (mouthMovement == 0 && direction == Direction.Down) {
            graphics.setColor(Color.BLACK);

            graphics.fillRect(x + 3, y + 65, 60, 5);
            graphics.fillRect(x + 8, y + 60, 55, 5);
            graphics.fillRect(x + 13, y + 55, 45, 5);
            graphics.fillRect(x + 18, y + 50, 35, 5);
            graphics.fillRect(x + 23, y + 45, 25, 5);
            graphics.fillRect(x + 28, y + 40, 15, 5);
            graphics.fillRect(x + 33, y + 35, 5, 5);
        }
    }

    public void drawBoard(Graphics graphics) {

        Font font = new Font("Ariel", Font.PLAIN, 50);

        graphics.setColor(Color.YELLOW);
        switch (lives) {
            case 3 -> {
                graphics.fillOval(200, 10, 30, 30);
                graphics.fillOval(240, 10, 30, 30);
                graphics.fillOval(280, 10, 30, 30);
            }
            case 2 -> {
                graphics.fillOval(200, 10, 30, 30);
                graphics.fillOval(240, 10, 30, 30);
            }
            case 1 ->
                graphics.fillOval(200, 10, 30, 30);
            case 0 -> {
            }
            default -> {
            }
        }
        if (lives <= 0) {
            java.util.Timer timer = new java.util.Timer();

            TimerTask endgametime = new TimerTask() {
                @Override
                public void run() {
                    endscreen = true;

                    //To change body of generated methods, choose Tools | Templates.
                }
            };
            timer.schedule(endgametime, 5000);
        }

        if (endscreen == false) {
            if (pelletCount == 0) {
                levelReset(graphics);

            } else {
                switch (level) {
                    case 0 ->
                        graphics.setColor(Color.GRAY);
                    case 1 ->
                        graphics.setColor(Color.BLUE);
                    case 2 ->
                        graphics.setColor(Color.CYAN);
                    case 3 ->
                        graphics.setColor(Color.GREEN);
                    case 4 ->
                        graphics.setColor(Color.YELLOW);
                    case 5 ->
                        graphics.setColor(Color.ORANGE);
                    case 6 ->
                        graphics.setColor(Color.PINK);
                    case 7 ->
                        graphics.setColor(Color.MAGENTA);
                    case 8 ->
                        graphics.setColor(Color.RED);
                    default -> {
                    }
                }
            }

//side walls
            graphics.fillRect(30, 50, 30, 900);
            graphics.fillRect(1730, 50, 30, 900);
//top walls
            graphics.fillRect(50, 50, 600, 30);
            graphics.fillRect(1130, 50, 600, 30);
//top down walls
            graphics.fillRect(1130, 50, 30, 150);
            graphics.fillRect(650, 50, 30, 150);
//wall across top
            graphics.fillRect(650, 190, 180, 30);
            graphics.fillRect(980, 190, 180, 30);
//run through top
            graphics.fillRect(980, 0, 30, 200);
            graphics.fillRect(800, 0, 30, 200);
//bottom walls
            graphics.fillRect(30, 950, 630, 30);
            graphics.fillRect(1160, 950, 600, 30);
//bottom across walls
            graphics.fillRect(650, 810, 180, 30);
            graphics.fillRect(980, 810, 180, 30);
//bottom passthrough
            graphics.fillRect(980, 810, 30, 240);
            graphics.fillRect(800, 810, 30, 240);
//walls up bottom
            graphics.fillRect(1130, 810, 30, 170);
            graphics.fillRect(650, 810, 30, 170);
//side divider
            graphics.fillRect(30, 500, 250, 30);
// center square
            graphics.fillRect(800, 600, 200, 30);
            graphics.fillRect(800, 410, 200, 30);
            graphics.fillRect(800, 410, 30, 70);
            graphics.fillRect(800, 560, 30, 70);
            graphics.fillRect(970, 410, 30, 200);
//top lines
            graphics.fillRect(980, 300, 180, 30);
            graphics.fillRect(980, 700, 180, 30);
//other Ts
            graphics.fillRect(470, 300, 360, 30);
            graphics.fillRect(470, 700, 360, 30);
            graphics.fillRect(640, 300, 30, 100);
            graphics.fillRect(640, 630, 30, 90);
            graphics.fillRect(470, 300, 360, 30);
//middle T
            graphics.fillRect(470, 410, 30, 210);
            graphics.fillRect(470, 300, 360, 30);
            graphics.fillRect(470, 500, 200, 30);

//top left square
            graphics.fillRect(150, 160, 100, 60);
//midtop left square
            graphics.fillRect(150, 300, 200, 120);
// top left cetner square 
            graphics.fillRect(350, 160, 190, 60);

//bottom left square
            graphics.fillRect(150, 810, 100, 60);
//midbottom left square
            graphics.fillRect(150, 610, 200, 120);
// bottom left center square 
            graphics.fillRect(350, 810, 190, 60);

//right middle T
            graphics.fillRect(1120, 410, 30, 210);
            graphics.fillRect(1120, 500, 200, 30);
//more right middle T
            graphics.fillRect(1420, 400, 30, 230);
            graphics.fillRect(1420, 500, 200, 30);
//left border lines
            graphics.fillRect(1420, 50, 30, 100);
            graphics.fillRect(1420, 880, 30, 100);

//left L-Ts
            graphics.fillRect(1250, 160, 30, 240);
            graphics.fillRect(1250, 240, 130, 30);
            graphics.fillRect(1250, 620, 30, 240);
            graphics.fillRect(1250, 760, 130, 30);
//far right Ts
            graphics.fillRect(1600, 160, 30, 240);
            graphics.fillRect(1490, 240, 140, 30);
            graphics.fillRect(1600, 620, 30, 240);
            graphics.fillRect(1490, 760, 140, 30);
//center square door

//inner layer
            graphics.setColor(Color.BLACK);
            /*if(level==0){
    graphics.setColor(Color.ORANGE);
}*/

//side walls
            graphics.fillRect(40, 60, 10, 900);
            graphics.fillRect(1740, 60, 10, 900);
//top walls
            graphics.fillRect(50, 60, 610, 10);
            graphics.fillRect(1140, 60, 610, 10);
//top down walls
            graphics.fillRect(1140, 60, 10, 140);
            graphics.fillRect(660, 60, 10, 140);
//wall across top
            graphics.fillRect(660, 200, 160, 10);
            graphics.fillRect(990, 200, 160, 10);
//run through top
            graphics.fillRect(990, 10, 10, 190);
            graphics.fillRect(810, 10, 10, 190);
//bottom walls
            graphics.fillRect(40, 960, 620, 10);
            graphics.fillRect(1150, 960, 600, 10);
//bottom across walls
            graphics.fillRect(660, 820, 160, 10);
            graphics.fillRect(990, 820, 160, 10);
//bottom passthrough
            graphics.fillRect(990, 820, 10, 220);
            graphics.fillRect(810, 820, 10, 220);
//walls up bottom
            graphics.fillRect(1140, 820, 10, 150);
            graphics.fillRect(660, 820, 10, 150);
//side divider
            graphics.fillRect(40, 510, 230, 10);
// center square
            graphics.fillRect(810, 610, 180, 10);
            graphics.fillRect(810, 420, 180, 10);
            graphics.fillRect(810, 420, 10, 50);
            graphics.fillRect(810, 570, 10, 50);
            graphics.fillRect(980, 420, 10, 200);
//top lines
            graphics.fillRect(990, 310, 160, 10);
            graphics.fillRect(990, 710, 160, 10);
//other Ts
            graphics.fillRect(480, 310, 340, 10);
            graphics.fillRect(480, 710, 340, 10);
            graphics.fillRect(650, 310, 10, 80);
            graphics.fillRect(650, 640, 10, 70);
            graphics.fillRect(480, 310, 340, 10);
//middle T
            graphics.fillRect(480, 420, 10, 190);
            graphics.fillRect(480, 310, 340, 10);
            graphics.fillRect(480, 510, 180, 10);

//top left square
            graphics.fillRect(160, 170, 80, 40);
//midtop left square
            graphics.fillRect(160, 310, 180, 100);
// top left cetner square 
            graphics.fillRect(360, 170, 170, 40);

//bottom left square
            graphics.fillRect(160, 820, 80, 40);
//midbottom left square
            graphics.fillRect(160, 620, 180, 100);
// bottom left center square 
            graphics.fillRect(360, 820, 170, 40);

//right middle T
            graphics.fillRect(1130, 420, 10, 190);
            graphics.fillRect(1130, 510, 180, 10);
//more right middle T
            graphics.fillRect(1430, 410, 10, 210);
            graphics.fillRect(1430, 510, 180, 10);
//left border lines
            graphics.fillRect(1430, 60, 10, 80);
            graphics.fillRect(1430, 890, 10, 80);

//left L-Ts
            graphics.fillRect(1260, 170, 10, 220);
            graphics.fillRect(1260, 250, 110, 10);
            graphics.fillRect(1260, 630, 10, 220);
            graphics.fillRect(1260, 770, 110, 10);
//far right Ts
            graphics.fillRect(1610, 170, 10, 220);
            graphics.fillRect(1500, 250, 110, 10);
            graphics.fillRect(1610, 630, 10, 220);
            graphics.fillRect(1500, 770, 110, 10);
//center square door

            graphics.setColor(Color.WHITE);
            graphics.fillRect(810, 470, 10, 90);
            if (moved == false) {
                graphics.setColor(Color.YELLOW);
                ready = new AttributedString("Ready!");
                ready.addAttribute(TextAttribute.FONT, font);
                graphics.drawString(ready.getIterator(), 830, 680);
            }
            if (lives == 0) {

                graphics.setColor(Color.YELLOW);
                ready = new AttributedString("Game Over!");
                ready.addAttribute(TextAttribute.FONT, font);
                graphics.drawString(ready.getIterator(), 760, 680);
            }
            if (level == 9) {
                graphics.setColor(Color.YELLOW);
                ready = new AttributedString("You Win!");
                ready.addAttribute(TextAttribute.FONT, font);
                graphics.drawString(ready.getIterator(), 760, 680);
            }
            graphics.setColor(Color.WHITE);
            score = new AttributedString(strscore);
            score.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(score.getIterator(), 550, 40);
            scoreLabel = new AttributedString("Score:");
            scoreLabel.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(scoreLabel.getIterator(), 400, 40);

            highScore = new AttributedString(highscore1);
            highScore.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(highScore.getIterator(), 1320, 40);
            highScoreLabel = new AttributedString("Highscore:");
            highScoreLabel.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(highScoreLabel.getIterator(), 1050, 40);
            highScore = new AttributedString("0");
            highScore.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(highScore.getIterator(), 1610, 40);

            strlives = new AttributedString("Lives: ");
            strlives.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(strlives.getIterator(), 50, 40);

        } else if (endscreen == true && scoresdisplay == false) {

            Font bigFont = new Font("Ariel", Font.PLAIN, 100);
            score = new AttributedString(strscore);
            score.addAttribute(TextAttribute.FONT, bigFont);
            graphics.drawString(score.getIterator(), 650, 550);
            graphics.setColor(Color.YELLOW);
            if (letter1 == true && flashInt % 4 == 0) {
                graphics.setColor(Color.WHITE);
            }
            theName1 = new AttributedString(yourName.substring(0, 1));
            theName1.addAttribute(TextAttribute.FONT, bigFont);
            graphics.drawString(theName1.getIterator(), 1000, 550);
            graphics.setColor(Color.YELLOW);
            if (letter2 == true && flashInt % 4 == 0) {
                graphics.setColor(Color.WHITE);
            }
            theName2 = new AttributedString(yourName.substring(1, 2));
            theName2.addAttribute(TextAttribute.FONT, bigFont);
            graphics.drawString(theName2.getIterator(), 1080, 550);
            graphics.setColor(Color.YELLOW);
            if (letter3 == true && flashInt % 4 == 0) {
                graphics.setColor(Color.WHITE);
            }
            theName3 = new AttributedString(yourName.substring(2, 3));
            theName3.addAttribute(TextAttribute.FONT, bigFont);
            graphics.drawString(theName3.getIterator(), 1160, 550);

            graphics.setColor(Color.YELLOW);
            ready = new AttributedString("Game Over!");
            ready.addAttribute(TextAttribute.FONT, bigFont);
            graphics.drawString(ready.getIterator(), 650, 200);

            strlives = new AttributedString("Enter Name:");
            strlives.addAttribute(TextAttribute.FONT, bigFont);
            graphics.drawString(strlives.getIterator(), 650, 320);

        } else if (endscreen == true && scoresdisplay == true) {

            athighscore1 = new AttributedString(highscore1);
            athighscore1.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(athighscore1.getIterator(), 650, 300);
            atuserName1 = new AttributedString(userName1);
            atuserName1.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(atuserName1.getIterator(), 1000, 300);

            athighscore2 = new AttributedString(highscore2);
            athighscore2.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(athighscore2.getIterator(), 650, 350);
            atuserName2 = new AttributedString(userName2);
            atuserName2.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(atuserName2.getIterator(), 1000, 350);

            athighscore3 = new AttributedString(highscore3);
            athighscore3.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(athighscore3.getIterator(), 650, 400);
            atuserName3 = new AttributedString(userName3);
            atuserName3.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(atuserName3.getIterator(), 1000, 400);

            athighscore4 = new AttributedString(highscore4);
            athighscore4.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(athighscore4.getIterator(), 650, 450);
            atuserName4 = new AttributedString(userName4);
            atuserName4.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(atuserName4.getIterator(), 1000, 450);

            athighscore5 = new AttributedString(highscore5);
            athighscore5.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(athighscore5.getIterator(), 650, 500);
            atuserName5 = new AttributedString(userName5);
            atuserName5.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(atuserName5.getIterator(), 1000, 500);

            score = new AttributedString(strscore);
            score.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(score.getIterator(), 650, 550);

            theName = new AttributedString(yourName);
            theName.addAttribute(TextAttribute.FONT, font);
            graphics.drawString(theName.getIterator(), 1000, 550);
        }

    }

    public void drawBackGround(Graphics graphics) {
        graphics.setColor(Color.BLACK);

//background
        graphics.fillRect(0, 0, 1800, 1100);
    }

    public void drawGhosts(Graphics graphics) {

        if (powerPelletMode == true) {
            if (redrespawned == true) {

                graphics.setColor(Color.RED);
                if (level == 0) {
                    graphics.setColor(Color.WHITE);
                }
                if (eyesTime == false) {

                    graphics.fillOval(880 + redghostX, 500 + redghostY, 70, 60);
                    graphics.fillRect(880 + redghostX, 530 + redghostY, 70, 40);
                }
                graphics.setColor(Color.WHITE);
                graphics.fillOval(895 + redghostX, 520 + redghostY, 15, 15);
                graphics.fillOval(925 + redghostX, 520 + redghostY, 15, 15);
                graphics.setColor(Color.BLUE);
                if (level == 0) {
                    graphics.setColor(Color.RED);
                }
                graphics.fillOval(899 + redghostX, 523 + redghostY, 10, 10);
                graphics.fillOval(929 + redghostX, 523 + redghostY, 10, 10);
                graphics.setColor(Color.BLACK);
                graphics.fillRect(880 + redghostX, 560 + redghostY, 5, 5);
                graphics.fillRect(880 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(885 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(900 + redghostX, 560 + redghostY, 5, 5);
                graphics.fillRect(905 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(900 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(895 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(925 + redghostX, 560 + redghostY, 5, 5);
                graphics.fillRect(930 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(925 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(920 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(945 + redghostX, 560 + redghostY, 5, 5);
                graphics.fillRect(945 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(940 + redghostX, 565 + redghostY, 5, 5);
            } else {

                graphics.setColor(Color.BLUE);

                if (flashTimer == true) {
                    if (flashInt == 1) {
                        graphics.setColor(Color.WHITE);
                    }
                }
                graphics.fillOval(880 + redghostX, 500 + redghostY, 70, 60);
                graphics.fillRect(880 + redghostX, 530 + redghostY, 70, 40);
                graphics.setColor(Color.GRAY);
                graphics.fillOval(895 + redghostX, 520 + redghostY, 15, 15);
                graphics.fillOval(925 + redghostX, 520 + redghostY, 15, 15);
                graphics.fillRect(895 + redghostX, 543 + redghostY, 5, 5);
                graphics.fillRect(900 + redghostX, 540 + redghostY, 5, 5);
                graphics.fillRect(905 + redghostX, 543 + redghostY, 5, 5);
                graphics.fillRect(910 + redghostX, 540 + redghostY, 5, 5);
                graphics.fillRect(915 + redghostX, 543 + redghostY, 5, 5);
                graphics.fillRect(920 + redghostX, 540 + redghostY, 5, 5);
                graphics.fillRect(925 + redghostX, 543 + redghostY, 5, 5);

                graphics.setColor(Color.BLACK);
                graphics.fillRect(880 + redghostX, 560 + redghostY, 5, 5);
                graphics.fillRect(880 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(885 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(900 + redghostX, 560 + redghostY, 5, 5);
                graphics.fillRect(905 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(900 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(895 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(925 + redghostX, 560 + redghostY, 5, 5);
                graphics.fillRect(930 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(925 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(920 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(945 + redghostX, 560 + redghostY, 5, 5);
                graphics.fillRect(945 + redghostX, 565 + redghostY, 5, 5);
                graphics.fillRect(940 + redghostX, 565 + redghostY, 5, 5);

            }
            if (pinkrespawned == true) {
                graphics.setColor(Color.PINK);
                if (level == 0) {
                    graphics.setColor(Color.WHITE);
                } else if (eyesTime == false) {

                    graphics.fillOval(880 + pinkghostX, 500 + pinkghostY, 70, 60);
                    graphics.fillRect(880 + pinkghostX, 530 + pinkghostY, 70, 40);
                }
                graphics.setColor(Color.WHITE);
                graphics.fillOval(895 + pinkghostX, 520 + pinkghostY, 15, 15);
                graphics.fillOval(925 + pinkghostX, 520 + pinkghostY, 15, 15);
                graphics.setColor(Color.BLUE);
                if (level == 0) {
                    graphics.setColor(Color.RED);
                }
                graphics.fillOval(899 + pinkghostX, 523 + pinkghostY, 10, 10);
                graphics.fillOval(929 + pinkghostX, 523 + pinkghostY, 10, 10);
                graphics.setColor(Color.BLACK);
                graphics.fillRect(880 + pinkghostX, 560 + pinkghostY, 5, 5);
                graphics.fillRect(880 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(885 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(900 + pinkghostX, 560 + pinkghostY, 5, 5);
                graphics.fillRect(905 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(900 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(895 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(925 + pinkghostX, 560 + pinkghostY, 5, 5);
                graphics.fillRect(930 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(925 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(920 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(945 + pinkghostX, 560 + pinkghostY, 5, 5);
                graphics.fillRect(945 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(940 + pinkghostX, 565 + pinkghostY, 5, 5);
            } else {
                graphics.setColor(Color.BLUE);
                if (flashTimer == true) {
                    if (flashInt == 1) {
                        graphics.setColor(Color.WHITE);
                    }
                }
                graphics.fillOval(880 + pinkghostX, 500 + pinkghostY, 70, 60);
                graphics.fillRect(880 + pinkghostX, 530 + pinkghostY, 70, 40);
                graphics.setColor(Color.GRAY);
                graphics.fillOval(895 + pinkghostX, 520 + pinkghostY, 15, 15);
                graphics.fillOval(925 + pinkghostX, 520 + pinkghostY, 15, 15);
                graphics.fillRect(895 + pinkghostX, 543 + pinkghostY, 5, 5);
                graphics.fillRect(900 + pinkghostX, 540 + pinkghostY, 5, 5);
                graphics.fillRect(905 + pinkghostX, 543 + pinkghostY, 5, 5);
                graphics.fillRect(910 + pinkghostX, 540 + pinkghostY, 5, 5);
                graphics.fillRect(915 + pinkghostX, 543 + pinkghostY, 5, 5);
                graphics.fillRect(920 + pinkghostX, 540 + pinkghostY, 5, 5);
                graphics.fillRect(925 + pinkghostX, 543 + pinkghostY, 5, 5);
                graphics.setColor(Color.BLACK);
                graphics.fillRect(880 + pinkghostX, 560 + pinkghostY, 5, 5);
                graphics.fillRect(880 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(885 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(900 + pinkghostX, 560 + pinkghostY, 5, 5);
                graphics.fillRect(905 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(900 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(895 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(925 + pinkghostX, 560 + pinkghostY, 5, 5);
                graphics.fillRect(930 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(925 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(920 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(945 + pinkghostX, 560 + pinkghostY, 5, 5);
                graphics.fillRect(945 + pinkghostX, 565 + pinkghostY, 5, 5);
                graphics.fillRect(940 + pinkghostX, 565 + pinkghostY, 5, 5);
            }
            if (orangerespawned == true) {

                graphics.setColor(Color.ORANGE);
                if (level == 0) {
                    graphics.setColor(Color.WHITE);
                } else if (eyesTime == false) {

                    graphics.fillOval(880 + orangeghostX, 500 + orangeghostY, 70, 60);
                    graphics.fillRect(880 + orangeghostX, 530 + orangeghostY, 70, 40);
                }
                graphics.setColor(Color.WHITE);
                graphics.fillOval(895 + orangeghostX, 520 + orangeghostY, 15, 15);
                graphics.fillOval(925 + orangeghostX, 520 + orangeghostY, 15, 15);
                graphics.setColor(Color.BLUE);
                if (level == 0) {
                    graphics.setColor(Color.RED);
                }
                graphics.fillOval(899 + orangeghostX, 523 + orangeghostY, 10, 10);
                graphics.fillOval(929 + orangeghostX, 523 + orangeghostY, 10, 10);
                graphics.setColor(Color.BLACK);
                graphics.fillRect(880 + orangeghostX, 560 + orangeghostY, 5, 5);
                graphics.fillRect(880 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(885 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(900 + orangeghostX, 560 + orangeghostY, 5, 5);
                graphics.fillRect(905 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(900 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(895 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(925 + orangeghostX, 560 + orangeghostY, 5, 5);
                graphics.fillRect(930 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(925 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(920 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(945 + orangeghostX, 560 + orangeghostY, 5, 5);
                graphics.fillRect(945 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(940 + orangeghostX, 565 + orangeghostY, 5, 5);

            } else {
                graphics.setColor(Color.BLUE);

                if (flashTimer == true) {
                    if (flashInt == 1) {
                        graphics.setColor(Color.WHITE);
                    }
                }
                graphics.fillOval(880 + orangeghostX, 500 + orangeghostY, 70, 60);
                graphics.fillRect(880 + orangeghostX, 530 + orangeghostY, 70, 40);
                graphics.setColor(Color.GRAY);
                graphics.fillOval(895 + orangeghostX, 520 + orangeghostY, 15, 15);
                graphics.fillOval(925 + orangeghostX, 520 + orangeghostY, 15, 15);
                graphics.fillRect(895 + orangeghostX, 543 + orangeghostY, 5, 5);
                graphics.fillRect(900 + orangeghostX, 540 + orangeghostY, 5, 5);
                graphics.fillRect(905 + orangeghostX, 543 + orangeghostY, 5, 5);
                graphics.fillRect(910 + orangeghostX, 540 + orangeghostY, 5, 5);
                graphics.fillRect(915 + orangeghostX, 543 + orangeghostY, 5, 5);
                graphics.fillRect(920 + orangeghostX, 540 + orangeghostY, 5, 5);
                graphics.fillRect(925 + orangeghostX, 543 + orangeghostY, 5, 5);
                graphics.setColor(Color.BLACK);
                graphics.fillRect(880 + orangeghostX, 560 + orangeghostY, 5, 5);
                graphics.fillRect(880 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(885 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(900 + orangeghostX, 560 + orangeghostY, 5, 5);
                graphics.fillRect(905 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(900 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(895 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(925 + orangeghostX, 560 + orangeghostY, 5, 5);
                graphics.fillRect(930 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(925 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(920 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(945 + orangeghostX, 560 + orangeghostY, 5, 5);
                graphics.fillRect(945 + orangeghostX, 565 + orangeghostY, 5, 5);
                graphics.fillRect(940 + orangeghostX, 565 + orangeghostY, 5, 5);
            }
            if (cyanrespawned == true) {
                graphics.setColor(Color.CYAN);
                if (level == 0) {
                    graphics.setColor(Color.WHITE);
                } else if (eyesTime == false) {

                    graphics.fillOval(880 + cyanghostX, 500 + cyanghostY, 70, 60);
                    graphics.fillRect(880 + cyanghostX, 530 + cyanghostY, 70, 40);
                }
                graphics.setColor(Color.WHITE);
                graphics.fillOval(895 + cyanghostX, 520 + cyanghostY, 15, 15);
                graphics.fillOval(925 + cyanghostX, 520 + cyanghostY, 15, 15);
                graphics.setColor(Color.BLUE);
                if (level == 0) {
                    graphics.setColor(Color.RED);
                }
                graphics.fillOval(899 + cyanghostX, 523 + cyanghostY, 10, 10);
                graphics.fillOval(929 + cyanghostX, 523 + cyanghostY, 10, 10);
                graphics.setColor(Color.BLACK);
                graphics.fillRect(880 + cyanghostX, 560 + cyanghostY, 5, 5);
                graphics.fillRect(880 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(885 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(900 + cyanghostX, 560 + cyanghostY, 5, 5);
                graphics.fillRect(905 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(900 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(895 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(925 + cyanghostX, 560 + cyanghostY, 5, 5);
                graphics.fillRect(930 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(925 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(920 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(945 + cyanghostX, 560 + cyanghostY, 5, 5);
                graphics.fillRect(945 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(940 + cyanghostX, 565 + cyanghostY, 5, 5);
            } else {
                graphics.setColor(Color.BLUE);

                if (flashTimer == true) {
                    if (flashInt == 1) {
                        graphics.setColor(Color.WHITE);
                    }
                }
                graphics.fillOval(880 + cyanghostX, 500 + cyanghostY, 70, 60);
                graphics.fillRect(880 + cyanghostX, 530 + cyanghostY, 70, 40);
                graphics.setColor(Color.GRAY);
                graphics.fillOval(895 + cyanghostX, 520 + cyanghostY, 15, 15);
                graphics.fillOval(925 + cyanghostX, 520 + cyanghostY, 15, 15);
                graphics.fillRect(895 + cyanghostX, 543 + cyanghostY, 5, 5);
                graphics.fillRect(900 + cyanghostX, 540 + cyanghostY, 5, 5);
                graphics.fillRect(905 + cyanghostX, 543 + cyanghostY, 5, 5);
                graphics.fillRect(910 + cyanghostX, 540 + cyanghostY, 5, 5);
                graphics.fillRect(915 + cyanghostX, 543 + cyanghostY, 5, 5);
                graphics.fillRect(920 + cyanghostX, 540 + cyanghostY, 5, 5);
                graphics.fillRect(925 + cyanghostX, 543 + cyanghostY, 5, 5);
                graphics.setColor(Color.BLACK);
                graphics.fillRect(880 + cyanghostX, 560 + cyanghostY, 5, 5);
                graphics.fillRect(880 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(885 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(900 + cyanghostX, 560 + cyanghostY, 5, 5);
                graphics.fillRect(905 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(900 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(895 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(925 + cyanghostX, 560 + cyanghostY, 5, 5);
                graphics.fillRect(930 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(925 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(920 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(945 + cyanghostX, 560 + cyanghostY, 5, 5);
                graphics.fillRect(945 + cyanghostX, 565 + cyanghostY, 5, 5);
                graphics.fillRect(940 + cyanghostX, 565 + cyanghostY, 5, 5);
            }

        } else {
            graphics.setColor(Color.RED);
            if (level == 0) {
                graphics.setColor(Color.WHITE);
            }
            graphics.fillOval(880 + redghostX, 500 + redghostY, 70, 60);
            graphics.fillRect(880 + redghostX, 530 + redghostY, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + redghostX, 520 + redghostY, 15, 15);
            graphics.fillOval(925 + redghostX, 520 + redghostY, 15, 15);
            graphics.setColor(Color.BLUE);
            if (level == 0) {
                graphics.setColor(Color.RED);
            }
            graphics.fillOval(899 + redghostX, 523 + redghostY, 10, 10);
            graphics.fillOval(929 + redghostX, 523 + redghostY, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + redghostX, 560 + redghostY, 5, 5);
            graphics.fillRect(880 + redghostX, 565 + redghostY, 5, 5);
            graphics.fillRect(885 + redghostX, 565 + redghostY, 5, 5);
            graphics.fillRect(900 + redghostX, 560 + redghostY, 5, 5);
            graphics.fillRect(905 + redghostX, 565 + redghostY, 5, 5);
            graphics.fillRect(900 + redghostX, 565 + redghostY, 5, 5);
            graphics.fillRect(895 + redghostX, 565 + redghostY, 5, 5);
            graphics.fillRect(925 + redghostX, 560 + redghostY, 5, 5);
            graphics.fillRect(930 + redghostX, 565 + redghostY, 5, 5);
            graphics.fillRect(925 + redghostX, 565 + redghostY, 5, 5);
            graphics.fillRect(920 + redghostX, 565 + redghostY, 5, 5);
            graphics.fillRect(945 + redghostX, 560 + redghostY, 5, 5);
            graphics.fillRect(945 + redghostX, 565 + redghostY, 5, 5);
            graphics.fillRect(940 + redghostX, 565 + redghostY, 5, 5);
            graphics.setColor(Color.PINK);
            if (level == 0) {
                graphics.setColor(Color.WHITE);
            }
            graphics.fillOval(880 + pinkghostX, 500 + pinkghostY, 70, 60);
            graphics.fillRect(880 + pinkghostX, 530 + pinkghostY, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + pinkghostX, 520 + pinkghostY, 15, 15);
            graphics.fillOval(925 + pinkghostX, 520 + pinkghostY, 15, 15);
            graphics.setColor(Color.BLUE);
            if (level == 0) {
                graphics.setColor(Color.RED);
            }
            graphics.fillOval(899 + pinkghostX, 523 + pinkghostY, 10, 10);
            graphics.fillOval(929 + pinkghostX, 523 + pinkghostY, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + pinkghostX, 560 + pinkghostY, 5, 5);
            graphics.fillRect(880 + pinkghostX, 565 + pinkghostY, 5, 5);
            graphics.fillRect(885 + pinkghostX, 565 + pinkghostY, 5, 5);
            graphics.fillRect(900 + pinkghostX, 560 + pinkghostY, 5, 5);
            graphics.fillRect(905 + pinkghostX, 565 + pinkghostY, 5, 5);
            graphics.fillRect(900 + pinkghostX, 565 + pinkghostY, 5, 5);
            graphics.fillRect(895 + pinkghostX, 565 + pinkghostY, 5, 5);
            graphics.fillRect(925 + pinkghostX, 560 + pinkghostY, 5, 5);
            graphics.fillRect(930 + pinkghostX, 565 + pinkghostY, 5, 5);
            graphics.fillRect(925 + pinkghostX, 565 + pinkghostY, 5, 5);
            graphics.fillRect(920 + pinkghostX, 565 + pinkghostY, 5, 5);
            graphics.fillRect(945 + pinkghostX, 560 + pinkghostY, 5, 5);
            graphics.fillRect(945 + pinkghostX, 565 + pinkghostY, 5, 5);
            graphics.fillRect(940 + pinkghostX, 565 + pinkghostY, 5, 5);
            graphics.setColor(Color.ORANGE);
            if (level == 0) {
                graphics.setColor(Color.WHITE);
            }
            graphics.fillOval(880 + orangeghostX, 500 + orangeghostY, 70, 60);
            graphics.fillRect(880 + orangeghostX, 530 + orangeghostY, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + orangeghostX, 520 + orangeghostY, 15, 15);
            graphics.fillOval(925 + orangeghostX, 520 + orangeghostY, 15, 15);
            graphics.setColor(Color.BLUE);
            if (level == 0) {
                graphics.setColor(Color.RED);
            }
            graphics.fillOval(899 + orangeghostX, 523 + orangeghostY, 10, 10);
            graphics.fillOval(929 + orangeghostX, 523 + orangeghostY, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + orangeghostX, 560 + orangeghostY, 5, 5);
            graphics.fillRect(880 + orangeghostX, 565 + orangeghostY, 5, 5);
            graphics.fillRect(885 + orangeghostX, 565 + orangeghostY, 5, 5);
            graphics.fillRect(900 + orangeghostX, 560 + orangeghostY, 5, 5);
            graphics.fillRect(905 + orangeghostX, 565 + orangeghostY, 5, 5);
            graphics.fillRect(900 + orangeghostX, 565 + orangeghostY, 5, 5);
            graphics.fillRect(895 + orangeghostX, 565 + orangeghostY, 5, 5);
            graphics.fillRect(925 + orangeghostX, 560 + orangeghostY, 5, 5);
            graphics.fillRect(930 + orangeghostX, 565 + orangeghostY, 5, 5);
            graphics.fillRect(925 + orangeghostX, 565 + orangeghostY, 5, 5);
            graphics.fillRect(920 + orangeghostX, 565 + orangeghostY, 5, 5);
            graphics.fillRect(945 + orangeghostX, 560 + orangeghostY, 5, 5);
            graphics.fillRect(945 + orangeghostX, 565 + orangeghostY, 5, 5);
            graphics.fillRect(940 + orangeghostX, 565 + orangeghostY, 5, 5);
            graphics.setColor(Color.CYAN);
            if (level == 0) {
                graphics.setColor(Color.WHITE);
            }
            graphics.fillOval(880 + cyanghostX, 500 + cyanghostY, 70, 60);
            graphics.fillRect(880 + cyanghostX, 530 + cyanghostY, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + cyanghostX, 520 + cyanghostY, 15, 15);
            graphics.fillOval(925 + cyanghostX, 520 + cyanghostY, 15, 15);
            graphics.setColor(Color.BLUE);
            if (level == 0) {
                graphics.setColor(Color.RED);
            }
            graphics.fillOval(899 + cyanghostX, 523 + cyanghostY, 10, 10);
            graphics.fillOval(929 + cyanghostX, 523 + cyanghostY, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + cyanghostX, 560 + cyanghostY, 5, 5);
            graphics.fillRect(880 + cyanghostX, 565 + cyanghostY, 5, 5);
            graphics.fillRect(885 + cyanghostX, 565 + cyanghostY, 5, 5);
            graphics.fillRect(900 + cyanghostX, 560 + cyanghostY, 5, 5);
            graphics.fillRect(905 + cyanghostX, 565 + cyanghostY, 5, 5);
            graphics.fillRect(900 + cyanghostX, 565 + cyanghostY, 5, 5);
            graphics.fillRect(895 + cyanghostX, 565 + cyanghostY, 5, 5);
            graphics.fillRect(925 + cyanghostX, 560 + cyanghostY, 5, 5);
            graphics.fillRect(930 + cyanghostX, 565 + cyanghostY, 5, 5);
            graphics.fillRect(925 + cyanghostX, 565 + cyanghostY, 5, 5);
            graphics.fillRect(920 + cyanghostX, 565 + cyanghostY, 5, 5);
            graphics.fillRect(945 + cyanghostX, 560 + cyanghostY, 5, 5);
            graphics.fillRect(945 + cyanghostX, 565 + cyanghostY, 5, 5);
            graphics.fillRect(940 + cyanghostX, 565 + cyanghostY, 5, 5);

        }
        if (scoresdisplay == true) {
            graphics.setColor(Color.RED);

            graphics.fillOval(880 + redghostX2, 500 + redghostY2, 70, 60);
            graphics.fillRect(880 + redghostX2, 530 + redghostY2, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + redghostX2, 520 + redghostY2, 15, 15);
            graphics.fillOval(925 + redghostX2, 520 + redghostY2, 15, 15);
            graphics.setColor(Color.BLUE);
            graphics.fillOval(899 + redghostX2, 523 + redghostY2, 10, 10);
            graphics.fillOval(929 + redghostX2, 523 + redghostY2, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + redghostX2, 560 + redghostY2, 5, 5);
            graphics.fillRect(880 + redghostX2, 565 + redghostY2, 5, 5);
            graphics.fillRect(885 + redghostX2, 565 + redghostY2, 5, 5);
            graphics.fillRect(900 + redghostX2, 560 + redghostY2, 5, 5);
            graphics.fillRect(905 + redghostX2, 565 + redghostY2, 5, 5);
            graphics.fillRect(900 + redghostX2, 565 + redghostY2, 5, 5);
            graphics.fillRect(895 + redghostX2, 565 + redghostY2, 5, 5);
            graphics.fillRect(925 + redghostX2, 560 + redghostY2, 5, 5);
            graphics.fillRect(930 + redghostX2, 565 + redghostY2, 5, 5);
            graphics.fillRect(925 + redghostX2, 565 + redghostY2, 5, 5);
            graphics.fillRect(920 + redghostX2, 565 + redghostY2, 5, 5);
            graphics.fillRect(945 + redghostX2, 560 + redghostY2, 5, 5);
            graphics.fillRect(945 + redghostX2, 565 + redghostY2, 5, 5);
            graphics.fillRect(940 + redghostX2, 565 + redghostY2, 5, 5);
            graphics.setColor(Color.PINK);
            graphics.fillOval(880 + pinkghostX2, 500 + pinkghostY2, 70, 60);
            graphics.fillRect(880 + pinkghostX2, 530 + pinkghostY2, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + pinkghostX2, 520 + pinkghostY2, 15, 15);
            graphics.fillOval(925 + pinkghostX2, 520 + pinkghostY2, 15, 15);
            graphics.setColor(Color.BLUE);
            graphics.fillOval(899 + pinkghostX2, 523 + pinkghostY2, 10, 10);
            graphics.fillOval(929 + pinkghostX2, 523 + pinkghostY2, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + pinkghostX2, 560 + pinkghostY2, 5, 5);
            graphics.fillRect(880 + pinkghostX2, 565 + pinkghostY2, 5, 5);
            graphics.fillRect(885 + pinkghostX2, 565 + pinkghostY2, 5, 5);
            graphics.fillRect(900 + pinkghostX2, 560 + pinkghostY2, 5, 5);
            graphics.fillRect(905 + pinkghostX2, 565 + pinkghostY2, 5, 5);
            graphics.fillRect(900 + pinkghostX2, 565 + pinkghostY2, 5, 5);
            graphics.fillRect(895 + pinkghostX2, 565 + pinkghostY2, 5, 5);
            graphics.fillRect(925 + pinkghostX2, 560 + pinkghostY2, 5, 5);
            graphics.fillRect(930 + pinkghostX2, 565 + pinkghostY2, 5, 5);
            graphics.fillRect(925 + pinkghostX2, 565 + pinkghostY2, 5, 5);
            graphics.fillRect(920 + pinkghostX2, 565 + pinkghostY2, 5, 5);
            graphics.fillRect(945 + pinkghostX2, 560 + pinkghostY2, 5, 5);
            graphics.fillRect(945 + pinkghostX2, 565 + pinkghostY2, 5, 5);
            graphics.fillRect(940 + pinkghostX2, 565 + pinkghostY2, 5, 5);
            graphics.setColor(Color.ORANGE);
            graphics.fillOval(880 + orangeghostX2, 500 + orangeghostY2, 70, 60);
            graphics.fillRect(880 + orangeghostX2, 530 + orangeghostY2, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + orangeghostX2, 520 + orangeghostY2, 15, 15);
            graphics.fillOval(925 + orangeghostX2, 520 + orangeghostY2, 15, 15);
            graphics.setColor(Color.BLUE);
            graphics.fillOval(899 + orangeghostX2, 523 + orangeghostY2, 10, 10);
            graphics.fillOval(929 + orangeghostX2, 523 + orangeghostY2, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + orangeghostX2, 560 + orangeghostY2, 5, 5);
            graphics.fillRect(880 + orangeghostX2, 565 + orangeghostY2, 5, 5);
            graphics.fillRect(885 + orangeghostX2, 565 + orangeghostY2, 5, 5);
            graphics.fillRect(900 + orangeghostX2, 560 + orangeghostY2, 5, 5);
            graphics.fillRect(905 + orangeghostX2, 565 + orangeghostY2, 5, 5);
            graphics.fillRect(900 + orangeghostX2, 565 + orangeghostY2, 5, 5);
            graphics.fillRect(895 + orangeghostX2, 565 + orangeghostY2, 5, 5);
            graphics.fillRect(925 + orangeghostX2, 560 + orangeghostY2, 5, 5);
            graphics.fillRect(930 + orangeghostX2, 565 + orangeghostY2, 5, 5);
            graphics.fillRect(925 + orangeghostX2, 565 + orangeghostY2, 5, 5);
            graphics.fillRect(920 + orangeghostX2, 565 + orangeghostY2, 5, 5);
            graphics.fillRect(945 + orangeghostX2, 560 + orangeghostY2, 5, 5);
            graphics.fillRect(945 + orangeghostX2, 565 + orangeghostY2, 5, 5);
            graphics.fillRect(940 + orangeghostX2, 565 + orangeghostY2, 5, 5);
            graphics.setColor(Color.CYAN);
            graphics.fillOval(880 + cyanghostX2, 500 + cyanghostY2, 70, 60);
            graphics.fillRect(880 + cyanghostX2, 530 + cyanghostY2, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + cyanghostX2, 520 + cyanghostY2, 15, 15);
            graphics.fillOval(925 + cyanghostX2, 520 + cyanghostY2, 15, 15);
            graphics.setColor(Color.BLUE);
            graphics.fillOval(899 + cyanghostX2, 523 + cyanghostY2, 10, 10);
            graphics.fillOval(929 + cyanghostX2, 523 + cyanghostY2, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + cyanghostX2, 560 + cyanghostY2, 5, 5);
            graphics.fillRect(880 + cyanghostX2, 565 + cyanghostY2, 5, 5);
            graphics.fillRect(885 + cyanghostX2, 565 + cyanghostY2, 5, 5);
            graphics.fillRect(900 + cyanghostX2, 560 + cyanghostY2, 5, 5);
            graphics.fillRect(905 + cyanghostX2, 565 + cyanghostY2, 5, 5);
            graphics.fillRect(900 + cyanghostX2, 565 + cyanghostY2, 5, 5);
            graphics.fillRect(895 + cyanghostX2, 565 + cyanghostY2, 5, 5);
            graphics.fillRect(925 + cyanghostX2, 560 + cyanghostY2, 5, 5);
            graphics.fillRect(930 + cyanghostX2, 565 + cyanghostY2, 5, 5);
            graphics.fillRect(925 + cyanghostX2, 565 + cyanghostY2, 5, 5);
            graphics.fillRect(920 + cyanghostX2, 565 + cyanghostY2, 5, 5);
            graphics.fillRect(945 + cyanghostX2, 560 + cyanghostY2, 5, 5);
            graphics.fillRect(945 + cyanghostX2, 565 + cyanghostY2, 5, 5);
            graphics.fillRect(940 + cyanghostX2, 565 + cyanghostY2, 5, 5);

            graphics.setColor(Color.RED);
            graphics.fillOval(880 + redghostX3, 500 + redghostY3, 70, 60);
            graphics.fillRect(880 + redghostX3, 530 + redghostY3, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + redghostX3, 520 + redghostY3, 15, 15);
            graphics.fillOval(925 + redghostX3, 520 + redghostY3, 15, 15);
            graphics.setColor(Color.BLUE);
            graphics.fillOval(899 + redghostX3, 523 + redghostY3, 10, 10);
            graphics.fillOval(929 + redghostX3, 523 + redghostY3, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + redghostX3, 560 + redghostY3, 5, 5);
            graphics.fillRect(880 + redghostX3, 565 + redghostY3, 5, 5);
            graphics.fillRect(885 + redghostX3, 565 + redghostY3, 5, 5);
            graphics.fillRect(900 + redghostX3, 560 + redghostY3, 5, 5);
            graphics.fillRect(905 + redghostX3, 565 + redghostY3, 5, 5);
            graphics.fillRect(900 + redghostX3, 565 + redghostY3, 5, 5);
            graphics.fillRect(895 + redghostX3, 565 + redghostY3, 5, 5);
            graphics.fillRect(925 + redghostX3, 560 + redghostY3, 5, 5);
            graphics.fillRect(930 + redghostX3, 565 + redghostY3, 5, 5);
            graphics.fillRect(925 + redghostX3, 565 + redghostY3, 5, 5);
            graphics.fillRect(920 + redghostX3, 565 + redghostY3, 5, 5);
            graphics.fillRect(945 + redghostX3, 560 + redghostY3, 5, 5);
            graphics.fillRect(945 + redghostX3, 565 + redghostY3, 5, 5);
            graphics.fillRect(940 + redghostX3, 565 + redghostY3, 5, 5);
            graphics.setColor(Color.PINK);
            graphics.fillOval(880 + pinkghostX3, 500 + pinkghostY3, 70, 60);
            graphics.fillRect(880 + pinkghostX3, 530 + pinkghostY3, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + pinkghostX3, 520 + pinkghostY3, 15, 15);
            graphics.fillOval(925 + pinkghostX3, 520 + pinkghostY3, 15, 15);
            graphics.setColor(Color.BLUE);
            graphics.fillOval(899 + pinkghostX3, 523 + pinkghostY3, 10, 10);
            graphics.fillOval(929 + pinkghostX3, 523 + pinkghostY3, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + pinkghostX3, 560 + pinkghostY3, 5, 5);
            graphics.fillRect(880 + pinkghostX3, 565 + pinkghostY3, 5, 5);
            graphics.fillRect(885 + pinkghostX3, 565 + pinkghostY3, 5, 5);
            graphics.fillRect(900 + pinkghostX3, 560 + pinkghostY3, 5, 5);
            graphics.fillRect(905 + pinkghostX3, 565 + pinkghostY3, 5, 5);
            graphics.fillRect(900 + pinkghostX3, 565 + pinkghostY3, 5, 5);
            graphics.fillRect(895 + pinkghostX3, 565 + pinkghostY3, 5, 5);
            graphics.fillRect(925 + pinkghostX3, 560 + pinkghostY3, 5, 5);
            graphics.fillRect(930 + pinkghostX3, 565 + pinkghostY3, 5, 5);
            graphics.fillRect(925 + pinkghostX3, 565 + pinkghostY3, 5, 5);
            graphics.fillRect(920 + pinkghostX3, 565 + pinkghostY3, 5, 5);
            graphics.fillRect(945 + pinkghostX3, 560 + pinkghostY3, 5, 5);
            graphics.fillRect(945 + pinkghostX3, 565 + pinkghostY3, 5, 5);
            graphics.fillRect(940 + pinkghostX3, 565 + pinkghostY3, 5, 5);
            graphics.setColor(Color.ORANGE);
            graphics.fillOval(880 + orangeghostX3, 500 + orangeghostY3, 70, 60);
            graphics.fillRect(880 + orangeghostX3, 530 + orangeghostY3, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + orangeghostX3, 520 + orangeghostY3, 15, 15);
            graphics.fillOval(925 + orangeghostX3, 520 + orangeghostY3, 15, 15);
            graphics.setColor(Color.BLUE);
            graphics.fillOval(899 + orangeghostX3, 523 + orangeghostY3, 10, 10);
            graphics.fillOval(929 + orangeghostX3, 523 + orangeghostY3, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + orangeghostX3, 560 + orangeghostY3, 5, 5);
            graphics.fillRect(880 + orangeghostX3, 565 + orangeghostY3, 5, 5);
            graphics.fillRect(885 + orangeghostX3, 565 + orangeghostY3, 5, 5);
            graphics.fillRect(900 + orangeghostX3, 560 + orangeghostY3, 5, 5);
            graphics.fillRect(905 + orangeghostX3, 565 + orangeghostY3, 5, 5);
            graphics.fillRect(900 + orangeghostX3, 565 + orangeghostY3, 5, 5);
            graphics.fillRect(895 + orangeghostX3, 565 + orangeghostY3, 5, 5);
            graphics.fillRect(925 + orangeghostX3, 560 + orangeghostY3, 5, 5);
            graphics.fillRect(930 + orangeghostX3, 565 + orangeghostY3, 5, 5);
            graphics.fillRect(925 + orangeghostX3, 565 + orangeghostY3, 5, 5);
            graphics.fillRect(920 + orangeghostX3, 565 + orangeghostY3, 5, 5);
            graphics.fillRect(945 + orangeghostX3, 560 + orangeghostY3, 5, 5);
            graphics.fillRect(945 + orangeghostX3, 565 + orangeghostY3, 5, 5);
            graphics.fillRect(940 + orangeghostX3, 565 + orangeghostY3, 5, 5);
            graphics.setColor(Color.CYAN);
            graphics.fillOval(880 + cyanghostX3, 500 + cyanghostY3, 70, 60);
            graphics.fillRect(880 + cyanghostX3, 530 + cyanghostY3, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + cyanghostX3, 520 + cyanghostY3, 15, 15);
            graphics.fillOval(925 + cyanghostX3, 520 + cyanghostY3, 15, 15);
            graphics.setColor(Color.BLUE);
            graphics.fillOval(899 + cyanghostX3, 523 + cyanghostY3, 10, 10);
            graphics.fillOval(929 + cyanghostX3, 523 + cyanghostY3, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + cyanghostX3, 560 + cyanghostY3, 5, 5);
            graphics.fillRect(880 + cyanghostX3, 565 + cyanghostY3, 5, 5);
            graphics.fillRect(885 + cyanghostX3, 565 + cyanghostY3, 5, 5);
            graphics.fillRect(900 + cyanghostX3, 560 + cyanghostY3, 5, 5);
            graphics.fillRect(905 + cyanghostX3, 565 + cyanghostY3, 5, 5);
            graphics.fillRect(900 + cyanghostX3, 565 + cyanghostY3, 5, 5);
            graphics.fillRect(895 + cyanghostX3, 565 + cyanghostY3, 5, 5);
            graphics.fillRect(925 + cyanghostX3, 560 + cyanghostY3, 5, 5);
            graphics.fillRect(930 + cyanghostX3, 565 + cyanghostY3, 5, 5);
            graphics.fillRect(925 + cyanghostX3, 565 + cyanghostY3, 5, 5);
            graphics.fillRect(920 + cyanghostX3, 565 + cyanghostY3, 5, 5);
            graphics.fillRect(945 + cyanghostX3, 560 + cyanghostY3, 5, 5);
            graphics.fillRect(945 + cyanghostX3, 565 + cyanghostY3, 5, 5);
            graphics.fillRect(940 + cyanghostX3, 565 + cyanghostY3, 5, 5);

            graphics.setColor(Color.RED);
            graphics.fillOval(880 + redghostX4, 500 + redghostY4, 70, 60);
            graphics.fillRect(880 + redghostX4, 530 + redghostY4, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + redghostX4, 520 + redghostY4, 15, 15);
            graphics.fillOval(925 + redghostX4, 520 + redghostY4, 15, 15);
            graphics.setColor(Color.BLUE);
            graphics.fillOval(899 + redghostX4, 523 + redghostY4, 10, 10);
            graphics.fillOval(929 + redghostX4, 523 + redghostY4, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + redghostX4, 560 + redghostY4, 5, 5);
            graphics.fillRect(880 + redghostX4, 565 + redghostY4, 5, 5);
            graphics.fillRect(885 + redghostX4, 565 + redghostY4, 5, 5);
            graphics.fillRect(900 + redghostX4, 560 + redghostY4, 5, 5);
            graphics.fillRect(905 + redghostX4, 565 + redghostY4, 5, 5);
            graphics.fillRect(900 + redghostX4, 565 + redghostY4, 5, 5);
            graphics.fillRect(895 + redghostX4, 565 + redghostY4, 5, 5);
            graphics.fillRect(925 + redghostX4, 560 + redghostY4, 5, 5);
            graphics.fillRect(930 + redghostX4, 565 + redghostY4, 5, 5);
            graphics.fillRect(925 + redghostX4, 565 + redghostY4, 5, 5);
            graphics.fillRect(920 + redghostX4, 565 + redghostY4, 5, 5);
            graphics.fillRect(945 + redghostX4, 560 + redghostY4, 5, 5);
            graphics.fillRect(945 + redghostX4, 565 + redghostY4, 5, 5);
            graphics.fillRect(940 + redghostX4, 565 + redghostY4, 5, 5);
            graphics.setColor(Color.PINK);
            graphics.fillOval(880 + pinkghostX4, 500 + pinkghostY4, 70, 60);
            graphics.fillRect(880 + pinkghostX4, 530 + pinkghostY4, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + pinkghostX4, 520 + pinkghostY4, 15, 15);
            graphics.fillOval(925 + pinkghostX4, 520 + pinkghostY4, 15, 15);
            graphics.setColor(Color.BLUE);
            graphics.fillOval(899 + pinkghostX4, 523 + pinkghostY4, 10, 10);
            graphics.fillOval(929 + pinkghostX4, 523 + pinkghostY4, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + pinkghostX4, 560 + pinkghostY4, 5, 5);
            graphics.fillRect(880 + pinkghostX4, 565 + pinkghostY4, 5, 5);
            graphics.fillRect(885 + pinkghostX4, 565 + pinkghostY4, 5, 5);
            graphics.fillRect(900 + pinkghostX4, 560 + pinkghostY4, 5, 5);
            graphics.fillRect(905 + pinkghostX4, 565 + pinkghostY4, 5, 5);
            graphics.fillRect(900 + pinkghostX4, 565 + pinkghostY4, 5, 5);
            graphics.fillRect(895 + pinkghostX4, 565 + pinkghostY4, 5, 5);
            graphics.fillRect(925 + pinkghostX4, 560 + pinkghostY4, 5, 5);
            graphics.fillRect(930 + pinkghostX4, 565 + pinkghostY4, 5, 5);
            graphics.fillRect(925 + pinkghostX4, 565 + pinkghostY4, 5, 5);
            graphics.fillRect(920 + pinkghostX4, 565 + pinkghostY4, 5, 5);
            graphics.fillRect(945 + pinkghostX4, 560 + pinkghostY4, 5, 5);
            graphics.fillRect(945 + pinkghostX4, 565 + pinkghostY4, 5, 5);
            graphics.fillRect(940 + pinkghostX4, 565 + pinkghostY4, 5, 5);
            graphics.setColor(Color.ORANGE);
            graphics.fillOval(880 + orangeghostX4, 500 + orangeghostY4, 70, 60);
            graphics.fillRect(880 + orangeghostX4, 530 + orangeghostY4, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + orangeghostX4, 520 + orangeghostY4, 15, 15);
            graphics.fillOval(925 + orangeghostX4, 520 + orangeghostY4, 15, 15);
            graphics.setColor(Color.BLUE);
            graphics.fillOval(899 + orangeghostX4, 523 + orangeghostY4, 10, 10);
            graphics.fillOval(929 + orangeghostX4, 523 + orangeghostY4, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + orangeghostX4, 560 + orangeghostY4, 5, 5);
            graphics.fillRect(880 + orangeghostX4, 565 + orangeghostY4, 5, 5);
            graphics.fillRect(885 + orangeghostX4, 565 + orangeghostY4, 5, 5);
            graphics.fillRect(900 + orangeghostX4, 560 + orangeghostY4, 5, 5);
            graphics.fillRect(905 + orangeghostX4, 565 + orangeghostY4, 5, 5);
            graphics.fillRect(900 + orangeghostX4, 565 + orangeghostY4, 5, 5);
            graphics.fillRect(895 + orangeghostX4, 565 + orangeghostY4, 5, 5);
            graphics.fillRect(925 + orangeghostX4, 560 + orangeghostY4, 5, 5);
            graphics.fillRect(930 + orangeghostX4, 565 + orangeghostY4, 5, 5);
            graphics.fillRect(925 + orangeghostX4, 565 + orangeghostY4, 5, 5);
            graphics.fillRect(920 + orangeghostX4, 565 + orangeghostY4, 5, 5);
            graphics.fillRect(945 + orangeghostX4, 560 + orangeghostY4, 5, 5);
            graphics.fillRect(945 + orangeghostX4, 565 + orangeghostY4, 5, 5);
            graphics.fillRect(940 + orangeghostX4, 565 + orangeghostY4, 5, 5);
            graphics.setColor(Color.CYAN);
            graphics.fillOval(880 + cyanghostX4, 500 + cyanghostY4, 70, 60);
            graphics.fillRect(880 + cyanghostX4, 530 + cyanghostY4, 70, 40);
            graphics.setColor(Color.WHITE);
            graphics.fillOval(895 + cyanghostX4, 520 + cyanghostY4, 15, 15);
            graphics.fillOval(925 + cyanghostX4, 520 + cyanghostY4, 15, 15);
            graphics.setColor(Color.BLUE);
            graphics.fillOval(899 + cyanghostX4, 523 + cyanghostY4, 10, 10);
            graphics.fillOval(929 + cyanghostX4, 523 + cyanghostY4, 10, 10);
            graphics.setColor(Color.BLACK);
            graphics.fillRect(880 + cyanghostX4, 560 + cyanghostY4, 5, 5);
            graphics.fillRect(880 + cyanghostX4, 565 + cyanghostY4, 5, 5);
            graphics.fillRect(885 + cyanghostX4, 565 + cyanghostY4, 5, 5);
            graphics.fillRect(900 + cyanghostX4, 560 + cyanghostY4, 5, 5);
            graphics.fillRect(905 + cyanghostX4, 565 + cyanghostY4, 5, 5);
            graphics.fillRect(900 + cyanghostX4, 565 + cyanghostY4, 5, 5);
            graphics.fillRect(895 + cyanghostX4, 565 + cyanghostY4, 5, 5);
            graphics.fillRect(925 + cyanghostX4, 560 + cyanghostY4, 5, 5);
            graphics.fillRect(930 + cyanghostX4, 565 + cyanghostY4, 5, 5);
            graphics.fillRect(925 + cyanghostX4, 565 + cyanghostY4, 5, 5);
            graphics.fillRect(920 + cyanghostX4, 565 + cyanghostY4, 5, 5);
            graphics.fillRect(945 + cyanghostX4, 560 + cyanghostY4, 5, 5);
            graphics.fillRect(945 + cyanghostX4, 565 + cyanghostY4, 5, 5);
            graphics.fillRect(940 + cyanghostX4, 565 + cyanghostY4, 5, 5);
        }
    }

    public void drawPellets(Graphics graphics) {
        pelletsList.forEach(pel -> {
            graphics.setColor(Color.WHITE);
            graphics.fillOval(pel.getX(), pel.getY(), 15, 15);
        });
    }

    public void drawPowerPellets(Graphics graphics) {
        powerPelletsList.forEach(pel -> {
            graphics.setColor(Color.WHITE);
            graphics.fillOval(pel.getX(), pel.getY(), 40, 40);
        });
    }

    public void powerPelletTimer() {
        java.util.Timer timer = new java.util.Timer();

        TimerTask end = new TimerTask() {
            @Override
            public void run() {
                redrespawned = false;
                pinkrespawned = false;
                orangerespawned = false;
                cyanrespawned = false;
                ghostsEaten = 0;
                flashTimer = false;
                powerPelletMode = false;
                //To change body of generated methods, choose Tools | Templates.
            }
        };
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                flashTimer = true;
                timer.schedule(end, 2000);
                //To change body of generated methods, choose Tools | Templates.
            }
        };
        timer.schedule(task, 8000);
    }

    public void enterName(Direction direction) {
        if (letter1 == true && direction == Direction.Right) {
            letter1 = false;
            letter2 = true;

        } else if (letter2 == true && direction == Direction.Right) {
            letter2 = false;
            letter3 = true;

        } else if (letter3 == true && direction == Direction.Left) {
            letter3 = false;
            letter2 = true;

        } else if (letter2 == true && direction == Direction.Left) {
            letter2 = false;
            letter1 = true;

        } else if (letter3 == true && direction == Direction.Right) {
            letter3 = false;

            endTheGame();
        }
        if (direction == Direction.Up && letter1 == true) {
            chooseLetter(Direction.Up, yourName, 1);
        } else if (direction == Direction.Up && letter2 == true) {
            chooseLetter(Direction.Up, yourName, 2);
        } else if (direction == Direction.Up && letter3 == true) {
            chooseLetter(Direction.Up, yourName, 3);
        } else if (direction == Direction.Down && letter1 == true) {
            chooseLetter(Direction.Down, yourName, 1);
        } else if (direction == Direction.Down && letter2 == true) {
            chooseLetter(Direction.Down, yourName, 2);
        } else if (direction == Direction.Down && letter3 == true) {
            chooseLetter(Direction.Down, yourName, 3);
        }

    }

    public void chooseLetter(Direction direction, String string, int i) {
        if (i == 1 && direction == Direction.Up) {
            switch (string.substring(0, 1)) {
                case "A" ->
                    string = "B" + string.substring(1);
                case "B" ->
                    string = "C" + string.substring(1);
                case "C" ->
                    string = "D" + string.substring(1);
                case "D" ->
                    string = "E" + string.substring(1);
                case "E" ->
                    string = "F" + string.substring(1);
                case "F" ->
                    string = "G" + string.substring(1);
                case "G" ->
                    string = "H" + string.substring(1);
                case "H" ->
                    string = "I" + string.substring(1);
                case "I" ->
                    string = "J" + string.substring(1);
                case "J" ->
                    string = "K" + string.substring(1);
                case "K" ->
                    string = "L" + string.substring(1);
                case "L" ->
                    string = "M" + string.substring(1);
                case "M" ->
                    string = "N" + string.substring(1);
                case "N" ->
                    string = "O" + string.substring(1);
                case "O" ->
                    string = "P" + string.substring(1);
                case "P" ->
                    string = "Q" + string.substring(1);
                case "Q" ->
                    string = "R" + string.substring(1);
                case "R" ->
                    string = "S" + string.substring(1);
                case "S" ->
                    string = "T" + string.substring(1);
                case "T" ->
                    string = "U" + string.substring(1);
                case "U" ->
                    string = "V" + string.substring(1);
                case "V" ->
                    string = "W" + string.substring(1);
                case "W" ->
                    string = "X" + string.substring(1);
                case "X" ->
                    string = "Y" + string.substring(1);
                case "Y" ->
                    string = "Z" + string.substring(1);
                case "Z" ->
                    string = "A" + string.substring(1);
            }
            System.out.println("1");
        } else if (i == 1 && direction == Direction.Down) {
            switch (string.substring(0, 1)) {
                case "A" ->
                    string = "Z" + string.substring(1);
                case "B" ->
                    string = "A" + string.substring(1);
                case "C" ->
                    string = "B" + string.substring(1);
                case "D" ->
                    string = "C" + string.substring(1);
                case "E" ->
                    string = "D" + string.substring(1);
                case "F" ->
                    string = "E" + string.substring(1);
                case "G" ->
                    string = "F" + string.substring(1);
                case "H" ->
                    string = "G" + string.substring(1);
                case "I" ->
                    string = "H" + string.substring(1);
                case "J" ->
                    string = "I" + string.substring(1);
                case "K" ->
                    string = "J" + string.substring(1);
                case "L" ->
                    string = "K" + string.substring(1);
                case "M" ->
                    string = "L" + string.substring(1);
                case "N" ->
                    string = "M" + string.substring(1);
                case "O" ->
                    string = "N" + string.substring(1);
                case "P" ->
                    string = "O" + string.substring(1);
                case "Q" ->
                    string = "P" + string.substring(1);
                case "R" ->
                    string = "Q" + string.substring(1);
                case "S" ->
                    string = "R" + string.substring(1);
                case "T" ->
                    string = "S" + string.substring(1);
                case "U" ->
                    string = "T" + string.substring(1);
                case "V" ->
                    string = "U" + string.substring(1);
                case "W" ->
                    string = "V" + string.substring(1);
                case "X" ->
                    string = "W" + string.substring(1);
                case "Y" ->
                    string = "X" + string.substring(1);
                case "Z" ->
                    string = "Y" + string.substring(1);
            }
            System.out.println("2");
        } else if (i == 2 && direction == Direction.Up) {
            switch (string.substring(1, 2)) {
                case "A" ->
                    string = string.substring(0, 1) + "B" + string.substring(2, 3);
                case "B" ->
                    string = string.substring(0, 1) + "C" + string.substring(2, 3);
                case "C" ->
                    string = string.substring(0, 1) + "D" + string.substring(2, 3);
                case "D" ->
                    string = string.substring(0, 1) + "E" + string.substring(2, 3);
                case "E" ->
                    string = string.substring(0, 1) + "F" + string.substring(2, 3);
                case "F" ->
                    string = string.substring(0, 1) + "G" + string.substring(2, 3);
                case "G" ->
                    string = string.substring(0, 1) + "H" + string.substring(2, 3);
                case "H" ->
                    string = string.substring(0, 1) + "I" + string.substring(2, 3);
                case "I" ->
                    string = string.substring(0, 1) + "J" + string.substring(2, 3);
                case "J" ->
                    string = string.substring(0, 1) + "K" + string.substring(2, 3);
                case "K" ->
                    string = string.substring(0, 1) + "L" + string.substring(2, 3);
                case "L" ->
                    string = string.substring(0, 1) + "M" + string.substring(2, 3);
                case "M" ->
                    string = string.substring(0, 1) + "N" + string.substring(2, 3);
                case "N" ->
                    string = string.substring(0, 1) + "O" + string.substring(2, 3);
                case "O" ->
                    string = string.substring(0, 1) + "P" + string.substring(2, 3);
                case "P" ->
                    string = string.substring(0, 1) + "Q" + string.substring(2, 3);
                case "Q" ->
                    string = string.substring(0, 1) + "R" + string.substring(2, 3);
                case "R" ->
                    string = string.substring(0, 1) + "S" + string.substring(2, 3);
                case "S" ->
                    string = string.substring(0, 1) + "T" + string.substring(2, 3);
                case "T" ->
                    string = string.substring(0, 1) + "U" + string.substring(2, 3);
                case "U" ->
                    string = string.substring(0, 1) + "V" + string.substring(2, 3);
                case "V" ->
                    string = string.substring(0, 1) + "W" + string.substring(2, 3);
                case "W" ->
                    string = string.substring(0, 1) + "X" + string.substring(2, 3);
                case "X" ->
                    string = string.substring(0, 1) + "Y" + string.substring(2, 3);
                case "Y" ->
                    string = string.substring(0, 1) + "Z" + string.substring(2, 3);
                case "Z" ->
                    string = string.substring(0, 1) + "A" + string.substring(2, 3);
            }
            System.out.println("3");
        } else if (i == 2 && direction == Direction.Down) {
            switch (string.substring(1, 2)) {
                case "A" ->
                    string = string.substring(0, 1) + "Z" + string.substring(2, 3);
                case "B" ->
                    string = string.substring(0, 1) + "A" + string.substring(2, 3);
                case "C" ->
                    string = string.substring(0, 1) + "B" + string.substring(2, 3);
                case "D" ->
                    string = string.substring(0, 1) + "C" + string.substring(2, 3);
                case "E" ->
                    string = string.substring(0, 1) + "D" + string.substring(2, 3);
                case "F" ->
                    string = string.substring(0, 1) + "E" + string.substring(2, 3);
                case "G" ->
                    string = string.substring(0, 1) + "F" + string.substring(2, 3);
                case "H" ->
                    string = string.substring(0, 1) + "G" + string.substring(2, 3);
                case "I" ->
                    string = string.substring(0, 1) + "H" + string.substring(2, 3);
                case "J" ->
                    string = string.substring(0, 1) + "I" + string.substring(2, 3);
                case "K" ->
                    string = string.substring(0, 1) + "J" + string.substring(2, 3);
                case "L" ->
                    string = string.substring(0, 1) + "K" + string.substring(2, 3);
                case "M" ->
                    string = string.substring(0, 1) + "L" + string.substring(2, 3);
                case "N" ->
                    string = string.substring(0, 1) + "M" + string.substring(2, 3);
                case "O" ->
                    string = string.substring(0, 1) + "N" + string.substring(2, 3);
                case "P" ->
                    string = string.substring(0, 1) + "O" + string.substring(2, 3);
                case "Q" ->
                    string = string.substring(0, 1) + "P" + string.substring(2, 3);
                case "R" ->
                    string = string.substring(0, 1) + "Q" + string.substring(2, 3);
                case "S" ->
                    string = string.substring(0, 1) + "R" + string.substring(2, 3);
                case "T" ->
                    string = string.substring(0, 1) + "S" + string.substring(2, 3);
                case "U" ->
                    string = string.substring(0, 1) + "T" + string.substring(2, 3);
                case "V" ->
                    string = string.substring(0, 1) + "U" + string.substring(2, 3);
                case "W" ->
                    string = string.substring(0, 1) + "V" + string.substring(2, 3);
                case "X" ->
                    string = string.substring(0, 1) + "W" + string.substring(2, 3);
                case "Y" ->
                    string = string.substring(0, 1) + "X" + string.substring(2, 3);
                case "Z" ->
                    string = string.substring(0, 1) + "Y" + string.substring(2, 3);
            }
            System.out.println("4");
        } else if (i == 3 && direction == Direction.Up) {
            switch (string.substring(2, 3)) {
                case "A" ->
                    string = string.substring(0, 2) + "B";
                case "B" ->
                    string = string.substring(0, 2) + "C";
                case "C" ->
                    string = string.substring(0, 2) + "D";
                case "D" ->
                    string = string.substring(0, 2) + "E";
                case "E" ->
                    string = string.substring(0, 2) + "F";
                case "F" ->
                    string = string.substring(0, 2) + "G";
                case "G" ->
                    string = string.substring(0, 2) + "H";
                case "H" ->
                    string = string.substring(0, 2) + "I";
                case "I" ->
                    string = string.substring(0, 2) + "J";
                case "J" ->
                    string = string.substring(0, 2) + "K";
                case "K" ->
                    string = string.substring(0, 2) + "L";
                case "L" ->
                    string = string.substring(0, 2) + "M";
                case "M" ->
                    string = string.substring(0, 2) + "N";
                case "N" ->
                    string = string.substring(0, 2) + "O";
                case "O" ->
                    string = string.substring(0, 2) + "P";
                case "P" ->
                    string = string.substring(0, 2) + "Q";
                case "Q" ->
                    string = string.substring(0, 2) + "R";
                case "R" ->
                    string = string.substring(0, 2) + "S";
                case "S" ->
                    string = string.substring(0, 2) + "T";
                case "T" ->
                    string = string.substring(0, 2) + "U";
                case "U" ->
                    string = string.substring(0, 2) + "V";
                case "V" ->
                    string = string.substring(0, 2) + "W";
                case "W" ->
                    string = string.substring(0, 2) + "X";
                case "X" ->
                    string = string.substring(0, 2) + "Y";
                case "Y" ->
                    string = string.substring(0, 2) + "Z";
                case "Z" ->
                    string = string.substring(0, 2) + "A";
            }
            System.out.println("5");
        } else if (i == 3 && direction == Direction.Down) {
            switch (string.substring(2, 3)) {
                case "A" ->
                    string = string.substring(0, 2) + "Z";
                case "B" ->
                    string = string.substring(0, 2) + "A";
                case "C" ->
                    string = string.substring(0, 2) + "B";
                case "D" ->
                    string = string.substring(0, 2) + "C";
                case "E" ->
                    string = string.substring(0, 2) + "D";
                case "F" ->
                    string = string.substring(0, 2) + "E";
                case "G" ->
                    string = string.substring(0, 2) + "F";
                case "H" ->
                    string = string.substring(0, 2) + "G";
                case "I" ->
                    string = string.substring(0, 2) + "H";
                case "J" ->
                    string = string.substring(0, 2) + "I";
                case "K" ->
                    string = string.substring(0, 2) + "J";
                case "L" ->
                    string = string.substring(0, 2) + "K";
                case "M" ->
                    string = string.substring(0, 2) + "L";
                case "N" ->
                    string = string.substring(0, 2) + "M";
                case "O" ->
                    string = string.substring(0, 2) + "N";
                case "P" ->
                    string = string.substring(0, 2) + "O";
                case "Q" ->
                    string = string.substring(0, 2) + "P";
                case "R" ->
                    string = string.substring(0, 2) + "Q";
                case "S" ->
                    string = string.substring(0, 2) + "R";
                case "T" ->
                    string = string.substring(0, 2) + "S";
                case "U" ->
                    string = string.substring(0, 2) + "T";
                case "V" ->
                    string = string.substring(0, 2) + "U";
                case "W" ->
                    string = string.substring(0, 2) + "V";
                case "X" ->
                    string = string.substring(0, 2) + "W";
                case "Y" ->
                    string = string.substring(0, 2) + "X";
                case "Z" ->
                    string = string.substring(0, 2) + "Y";
            }
            System.out.println("6");
        }
        yourName = "";
        yourName = string;
    }

    public void swapOrder() {

        if (Integer.parseInt(highscore1) < Integer.parseInt(strscore)) {
            tempScore = highscore1;
            highscore1 = strscore;
            strscore = tempScore;
            tempString = userName1;
            userName1 = yourName;
            yourName = tempString;
        }
        if (Integer.parseInt(highscore2) < Integer.parseInt(strscore)) {
            tempScore = highscore2;
            highscore2 = strscore;
            strscore = tempScore;
            tempString = userName2;
            userName2 = yourName;
            yourName = tempString;
        }
        if (Integer.parseInt(highscore3) < Integer.parseInt(strscore)) {
            tempScore = highscore3;
            highscore3 = strscore;
            strscore = tempScore;
            tempString = userName3;
            userName3 = yourName;
            yourName = tempString;
        }
        if (Integer.parseInt(highscore4) < Integer.parseInt(strscore)) {
            tempScore = highscore4;
            highscore4 = strscore;
            strscore = tempScore;
            tempString = userName4;
            userName4 = yourName;
            yourName = tempString;
        }
        if (Integer.parseInt(highscore5) < Integer.parseInt(strscore)) {
            tempScore = highscore5;
            highscore5 = strscore;
            strscore = tempScore;
            tempString = userName5;
            userName5 = yourName;
            yourName = tempString;
        }
    }

    public void pacManDeathReset(Graphics graphics) {
        graphics.setColor(Color.YELLOW);
        if (shrinkCount > 0) {
            graphics.fillOval(x, y, shrinkCount, shrinkCount);
            shrinkCount -= 2;
            x++;
            y++;
        } else if (shrinkCount <= 0) {
            shrinkCount = 70;
            x = 860;
            y = 100;
            pacManX = 895;
            pacManY = 135;
            redghostX = 0;
            pinkghostX = 0;
            orangeghostX = 0;
            cyanghostX = 0;
            redghostY = -20;
            pinkghostY = -20;
            orangeghostY = -20;
            cyanghostY = -20;
            redghostXoffset = 915;
            pinkghostXoffset = 915;
            orangeghostXoffset = 915;
            cyanghostXoffset = 915;
            redghostYoffset = 515;
            pinkghostYoffset = 515;
            orangeghostYoffset = 515;
            cyanghostYoffset = 515;
            redhit = false;
            pinkhit = false;
            orangehit = false;
            cyanhit = false;
            pacManCanMove = true;
            ghostCanMove = true;
            lives--;
            currentDirection = null;
        }
    }

    public void levelReset(Graphics graphics) {
        pacManCanMove = false;
        ghostCanMove = false;
        if (levelFlasher > 50 && levelFlasher % 4 == 0) {
            switch (level + 1) {
                case 1 ->
                    graphics.setColor(Color.BLUE);
                case 2 ->
                    graphics.setColor(Color.CYAN);
                case 3 ->
                    graphics.setColor(Color.GREEN);
                case 4 ->
                    graphics.setColor(Color.YELLOW);
                case 5 ->
                    graphics.setColor(Color.ORANGE);
                case 6 ->
                    graphics.setColor(Color.PINK);
                case 7 ->
                    graphics.setColor(Color.MAGENTA);
                case 8 ->
                    graphics.setColor(Color.RED);
                default -> {
                }
            }
            levelFlasher--;
        } else if (levelFlasher > 50 && levelFlasher % 4 != 0) {
            switch (level) {
                case 1 ->
                    graphics.setColor(Color.BLUE);
                case 2 ->
                    graphics.setColor(Color.CYAN);
                case 3 ->
                    graphics.setColor(Color.GREEN);
                case 4 ->
                    graphics.setColor(Color.YELLOW);
                case 5 ->
                    graphics.setColor(Color.ORANGE);
                case 6 ->
                    graphics.setColor(Color.PINK);
                case 7 ->
                    graphics.setColor(Color.MAGENTA);
                case 8 ->
                    graphics.setColor(Color.RED);
                default -> {
                }
            }

            levelFlasher--;
        } else if (levelFlasher > 0 && levelFlasher % 2 == 0) {
            switch (level + 1) {
                case 1 ->
                    graphics.setColor(Color.BLUE);
                case 2 ->
                    graphics.setColor(Color.CYAN);
                case 3 ->
                    graphics.setColor(Color.GREEN);
                case 4 ->
                    graphics.setColor(Color.YELLOW);
                case 5 ->
                    graphics.setColor(Color.ORANGE);
                case 6 ->
                    graphics.setColor(Color.PINK);
                case 7 ->
                    graphics.setColor(Color.MAGENTA);
                case 8 ->
                    graphics.setColor(Color.RED);
                default -> {
                }
            }
            levelFlasher--;
        } else if (levelFlasher > 0 && levelFlasher % 2 != 0) {
            switch (level) {
                case 1 ->
                    graphics.setColor(Color.BLUE);
                case 2 ->
                    graphics.setColor(Color.CYAN);
                case 3 ->
                    graphics.setColor(Color.GREEN);
                case 4 ->
                    graphics.setColor(Color.YELLOW);
                case 5 ->
                    graphics.setColor(Color.ORANGE);
                case 6 ->
                    graphics.setColor(Color.PINK);
                case 7 ->
                    graphics.setColor(Color.MAGENTA);
                case 8 ->
                    graphics.setColor(Color.RED);
                default -> {
                }
            }
            levelFlasher--;
        } else if (levelFlasher == 0) {

            levelStart();
        }
    }

    public void endTheGame() {

        swapOrder();
        scoresdisplay = true;
        save();
    }

    public void respawnTimer() {
        java.util.Timer timer = new java.util.Timer();

        TimerTask eyes = new TimerTask() {
            @Override
            public void run() {
                eyesTime = false;

            }
        };
        timer.schedule(eyes, 2000);
    }

    public void drawCherry(Graphics graphics) {
        graphics.setColor(Color.GREEN);

        graphics.fillRect(1045, 501, 4, 4);
        graphics.fillRect(1047, 497, 4, 4);
        graphics.fillRect(1049, 493, 4, 4);
        graphics.fillRect(1051, 489, 4, 4);
        graphics.fillRect(1053, 485, 4, 4);
        graphics.fillRect(1055, 481, 4, 4);

        graphics.fillRect(1057, 481, 4, 4);
        graphics.fillRect(1059, 485, 4, 4);
        graphics.fillRect(1061, 489, 4, 4);
        graphics.fillRect(1063, 493, 4, 4);
        graphics.fillRect(1065, 497, 4, 4);
        graphics.fillRect(1067, 501, 4, 4);
        graphics.setColor(Color.RED);
        graphics.fillOval(1030, 500, 30, 30);
        graphics.fillOval(1060, 500, 30, 30);

    }

    public void drawOrange(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        graphics.fillRect(1053, 496, 4, 6);
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(1030, 500, 50, 50);

    }

    public void drawPeach(Graphics graphics) {

        graphics.setColor(Color.PINK);
        graphics.fillOval(1030, 500, 50, 50);
        graphics.setColor(Color.GREEN);
        graphics.fillOval(1051, 496, 9, 15);
    }

    public void theVoid(Graphics graphics) {
        graphics.fillRect(900 - voidSize, 500 - voidSize, 2 * voidSize, 2 * voidSize);
    }

    public void setCurrentDirection(Direction direction) {
        currentDirection = direction;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
