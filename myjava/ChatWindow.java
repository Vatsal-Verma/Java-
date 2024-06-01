import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

class SnakeGame extends JFrame implements ActionListener, KeyListener {

    private static final int GRID_SIZE = 20;
    private static final int CELL_SIZE = 20;

    private ArrayList<Point> snake;
    private Point food;
    private char direction;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(GRID_SIZE * CELL_SIZE, GRID_SIZE * CELL_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        snake = new ArrayList<>();
        snake.add(new Point(GRID_SIZE / 2, GRID_SIZE / 2));
        direction = 'R'; // Start moving to the right

        spawnFood();

        Timer timer = new Timer(200, this); // Set the speed of the snake
        timer.start();

        addKeyListener(this);
        setFocusable(true);
    }

    private void spawnFood() {
        Random rand = new Random();
        int x = rand.nextInt(GRID_SIZE);
        int y = rand.nextInt(GRID_SIZE);

        food = new Point(x, y);

        // Make sure the food doesn't spawn on the snake
        while (snake.contains(food)) {
            x = rand.nextInt(GRID_SIZE);
            y = rand.nextInt(GRID_SIZE);
            food.setLocation(x, y);
        }
    }

    private void move() {
        Point head = snake.get(0);

        switch (direction) {
            case 'U':
                head = new Point(head.x, (head.y - 1 + GRID_SIZE) % GRID_SIZE);
                break;
            case 'D':
                head = new Point(head.x, (head.y + 1) % GRID_SIZE);
                break;
            case 'L':
                head = new Point((head.x - 1 + GRID_SIZE) % GRID_SIZE, head.y);
                break;
            case 'R':
                head = new Point((head.x + 1) % GRID_SIZE, head.y);
                break;
        }

        if (head.equals(food)) {
            snake.add(0, food);
            spawnFood();
        } else {
            snake.add(0, head);
            snake.remove(snake.size() - 1);
        }

        checkCollision();
        repaint();
    }

    private void checkCollision() {
        Point head = snake.get(0);

        // Check collision with the body
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                gameOver();
            }
        }

        // Check collision with the walls
        if (head.x < 0 || head.x >= GRID_SIZE || head.y < 0 || head.y >= GRID_SIZE) {
            gameOver();
        }
    }

    private void gameOver() {
        JOptionPane.showMessageDialog(this, "Game Over! Your score: " + (snake.size() - 1));
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (direction != 'D') {
                    direction = 'U';
                }
                break;
            case KeyEvent.VK_DOWN:
                if (direction != 'U') {
                    direction = 'D';
                }
                break;
            case KeyEvent.VK_LEFT:
                if (direction != 'R') {
                    direction = 'L';
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (direction != 'L') {
                    direction = 'R';
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0, 0, getWidth(), getHeight());

        // Draw the food
        g.setColor(Color.RED);
        g.fillRect(food.x * CELL_SIZE, food.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);

        // Draw the snake
        g.setColor(Color.GREEN);
        for (Point point : snake) {
            g.fillRect(point.x * CELL_SIZE, point.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SnakeGame snakeGame = new SnakeGame();
            snakeGame.setVisible(true);
        });
    }
}
