import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class FruitCatcher extends JFrame {
    // Window dimensions
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    // Basket dimensions
    private static final int BASKET_WIDTH = 100;
    private static final int BASKET_HEIGHT = 100;

    // Fruit dimensions
    private static final int FRUIT_WIDTH = 50;
    private static final int FRUIT_HEIGHT = 50;

    // Array of basket image file names
    private static final String[] basketImages = {
        "basket1.png",
        "basket2.png",
        "basket3.png",
        "basket4.png"
    };

    // Array of fruit image file names
    private static final String[] fruitImages = {
            "apple.png",
            "banana.png",
            "orange.png",
            "cherry.png",
            "grape.png",
            "kiwifruit.png",
            "mango.png",
            "watermelon.png",
            "grapefruit.png",
            "apricot.png",
            "avocado.png",
            "papaya.png",
            "lemon.png",
            "peach.png",
            "strawberry.png",
            "blueberry.png",
            "plum.png"
    };

    // Initialy show game description
    private boolean showDescription = true;

    // Sound clips for success and failure
    private Clip successSound;
    private Clip failSound;

    // Score label and score value
    private JLabel scoreLabel;
    private int score;

    // Basket properties
    private ImageIcon basketImage;
    private int basketX;
    private int basketY;

    // Fruit properties
    private ImageIcon fruitImage;
    private int fruitX;
    private int fruitY;
    private int fruitDX;
    private int fruitDY;

    // Random number generator
    private Random random;

    // Background color
    private Color backgroundColor;

    public FruitCatcher() {
        setTitle("Fruit Catcher");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        // Initilize random number generator
        random = new Random();

        // Initilize sound clips
        try {
            successSound = AudioSystem.getClip();
            AudioInputStream successStream = AudioSystem.getAudioInputStream(new File("success.wav"));
            successSound.open(successStream);

            failSound = AudioSystem.getClip();
            AudioInputStream failStream = AudioSystem.getAudioInputStream(new File("fail.wav"));
            failSound.open(failStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Initialize fruit movement
        fruitDX = 3;
        fruitDY = 3;

        // Load basket image
        basketImage = new ImageIcon(basketImages[random.nextInt(basketImages.length)]);

        // Initialize basket properties
        basketX = (WINDOW_WIDTH - BASKET_WIDTH) / 2;
        basketY = WINDOW_HEIGHT - BASKET_HEIGHT - 20;

        // Initialize random background color
        getContentPane().setBackground(Color.WHITE);

        // Load fruit image
        fruitImage = new ImageIcon(fruitImages[random.nextInt(fruitImages.length)]);
        generateFruit();

        // Initialize score
        score = 0;
        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 20));
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scoreLabel.setVisible(false);

        // Add score label to the top of the frame
        getContentPane().add(scoreLabel, BorderLayout.NORTH);

        // Add key listener to handle arrow key events
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (!showDescription) {
                    if (keyCode == KeyEvent.VK_LEFT) {
                        moveBasket(-25);
                    } else if (keyCode == KeyEvent.VK_RIGHT) {
                        moveBasket(25);
                    } else if (keyCode == KeyEvent.VK_C) {
                        changeBackgroundColor();
                    } else if (keyCode == KeyEvent.VK_B) {
                        basketImage = new ImageIcon(basketImages[random.nextInt(basketImages.length)]);
                        repaint();
                    }
                } 

                if (keyCode == KeyEvent.VK_SPACE || keyCode == KeyEvent.VK_P || keyCode == KeyEvent.VK_ESCAPE) {
                    showDescription = !showDescription;
                    scoreLabel.setVisible(true);
                    if (showDescription) {
                        scoreLabel.setVisible(false);
                    }
                    repaint();
                }
            }
        });
        setFocusable(true);

        // Add a custom JPanel for drawing game objects
        getContentPane().add(new GamePanel());

        setVisible(true);
    }

    // Change the background color to a random color
    private void changeBackgroundColor() {
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        getContentPane().setBackground(new Color(r, g, b));
        backgroundColor = new Color(r, g, b);
        repaint();
    }

    // Generate a fruit at a random position
    private void generateFruit() {
        fruitX = (int) (Math.random() * (WINDOW_WIDTH - FRUIT_WIDTH));
        fruitY = 0;

        Random rand = new Random();
        if (rand.nextBoolean()) {
            fruitDX = 3; // Set horizontal movement
            fruitDY = 3; // Set vertical movement
        } else {
            fruitDX = 0; // Set only vertical movement
            fruitDY = 3; // Set vertical movement
        }
    }

    // Move the basket horizontally
    private void moveBasket(int dx) {
        basketX += dx;
        if (basketX < 0) {
            basketX = 0;
        } else if (basketX > WINDOW_WIDTH - BASKET_WIDTH) {
            basketX = WINDOW_WIDTH - BASKET_WIDTH;
        }
        repaint();
    }

    

    // Custom JPanel for drawing game objects
    private class GamePanel extends JPanel {
        public GamePanel() {
            setDoubleBuffered(true);
            setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
            setBackground(Color.WHITE);

            addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (!showDescription) {
                        // Check if the click is within the basket's boundaries
                        if (e.getX() >= basketX && e.getX() <= basketX + BASKET_WIDTH && e.getY() >= basketY && e.getY() <= basketY + BASKET_HEIGHT) {
                            // Change the basket image to a random image
                            basketImage = new ImageIcon(basketImages[random.nextInt(basketImages.length)]);
                            repaint();
                        } else {
                            changeBackgroundColor();
                        }
                    }
                }
            });

            // Start the game loop
            Timer timer = new Timer(10, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (!showDescription) {
                        // Update fruit position
                        fruitX += fruitDX;
                        fruitY += fruitDY;

                        if (fruitY > WINDOW_HEIGHT) {
                            score -= random.nextInt(1,5);;
                            if (score < 0) {
                                score = 0;
                            }
                            scoreLabel.setText("Score: " + score);
                            failSound.setFramePosition(0); // Rewind the sound to the beginning
                            failSound.start();
                            fruitImage = new ImageIcon(fruitImages[random.nextInt(fruitImages.length)]);
                            generateFruit();

                        }

                        // Check for fruit-basket collision
                        if (fruitY + FRUIT_HEIGHT > basketY && fruitY + FRUIT_HEIGHT < basketY + BASKET_HEIGHT &&
                                fruitX + FRUIT_WIDTH > basketX && fruitX < basketX + BASKET_WIDTH) {
                            score += random.nextInt(1,5);;
                            scoreLabel.setText("Score: " + score);
                            successSound.setFramePosition(0); // Rewind the sound to the beginning
                            successSound.start();
                            fruitImage = new ImageIcon(fruitImages[random.nextInt(fruitImages.length)]);
                            generateFruit();
                        }

                        // Check for fruit hitting the edges of the screen
                        if (fruitX <= 0 || fruitX + FRUIT_WIDTH >= WINDOW_WIDTH) {
                            fruitDX *= -1; // Reverse the horizontal direction
                        }

                        repaint();
                    }
                }
            });
            timer.start();
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(backgroundColor);
        
            if (showDescription) {
                g.setColor(Color.BLACK);
                g.setFont(new Font("Arial", Font.BOLD, 30));
                FontMetrics fm = g.getFontMetrics();
                int x = (getWidth() - fm.stringWidth("Fruit Catcher 2023")) / 2;
                int y = getHeight() / 2;
                g.drawString("Fruit Catcher 2023", x, y);

                g.setFont(new Font("Arial", Font.BOLD, 15));
                x = x + (fm.stringWidth("Press Space to Start") / 5);
                y = y + 30;
                g.drawString("Press Space to Start", x, y);
            } else {
                // Draw basket
                g.drawImage(basketImage.getImage(), basketX, basketY, BASKET_WIDTH, BASKET_HEIGHT, null);
                // Draw fruit
                g.drawImage(fruitImage.getImage(), fruitX, fruitY, FRUIT_WIDTH, FRUIT_HEIGHT, null);
            }
        }
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FruitCatcher::new);
    }
}