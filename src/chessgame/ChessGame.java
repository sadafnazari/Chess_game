package chessgame;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import static chessgame.ChessGame.finder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;

public class ChessGame extends Application {

    int a, b, x, y, z, t;
    int nobat = 1;
    boolean shah_kish = false;
    boolean mat = false;
    String str = new String();

    public static int[] finder(int a, int s[][]) // mokhtasat e yek khane az array ra midahad
    {
        int m[] = new int[2];
        m[0] = -2;
        m[1] = -2;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (s[i][j] == a) {
                    m[0] = i;
                    m[1] = j;
                }
            }
        }
        return m;
    }

    public void start(Stage primaryStage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("chess game");
        scene.setFill(Color.BLACK);
        int[][] safhe = new int[8][8];
        safhe[0][0] = 111;
        safhe[0][1] = 211;
        safhe[0][2] = 311;
        safhe[0][3] = 411;
        safhe[0][4] = 511;
        safhe[0][5] = 321;
        safhe[0][6] = 221;
        safhe[0][7] = 121;
        for (int i = 0; i < 8; i++) {
            safhe[1][i] = 601 + (i * 10);
        }
        safhe[7][0] = 112;
        safhe[7][1] = 212;
        safhe[7][2] = 312;
        safhe[7][3] = 412;
        safhe[7][4] = 512;
        safhe[7][5] = 322;
        safhe[7][6] = 222;
        safhe[7][7] = 122;
        for (int i = 0; i < 8; i++) {
            safhe[6][i] = 602 + (i * 10);
        }
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                safhe[i][j] = 0;
            }
        }
        int[][] g = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle r = new Rectangle();
                r.setX(50 + i * 62.5);
                r.setY(50 + j * 62.5);
                r.setWidth(62.5);
                r.setHeight(62.5);
                if ((i + j) % 2 == 0) {
                    r.setFill(Color.DARKGREY);
                } else {
                    r.setFill(Color.WHITE);
                }
                root.getChildren().add(r);
            }
        }
        Line l1 = new Line();
        l1.setStartX(50);
        l1.setStartY(50);
        l1.setEndX(550);
        l1.setEndY(50);
        root.getChildren().add(l1);
        Line l2 = new Line();
        l2.setStartX(50);
        l2.setStartY(50);
        l2.setEndX(50);
        l2.setEndY(550);
        root.getChildren().add(l2);
        Line l3 = new Line();
        l3.setStartX(50);
        l3.setStartY(550);
        l3.setEndX(550);
        l3.setEndY(550);
        root.getChildren().add(l3);
        Line l4 = new Line();
        l4.setStartX(550);
        l4.setStartY(50);
        l4.setEndX(550);
        l4.setEndY(550);
        root.getChildren().add(l4);
        Bazikon bazikon1 = new Bazikon();
        Bazikon bazikon2 = new Bazikon();
        bazikon1.namayesh(safhe, root, 1);
        bazikon2.namayesh(safhe, root, 2);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (safhe[i][j] == 0) {
                    g[i][j] = 0;
                } else {
                    g[i][j] = 1;
                }
            }
        }
        int[][] safhe1 = new int[8][8];
        Button continueGame = new Button();
        continueGame.setText("cotinue game");
        continueGame.setLayoutX(85);
        continueGame.setLayoutY(0);
        continueGame.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("enter the name : ");
                Scanner scanner = new Scanner(System.in);
                str = scanner.next();
                str += ".txt";
                File file1 = new File(str);
                try {
                    FileReader fe = new FileReader(file1);
                    BufferedReader br = new BufferedReader(fe);
                    String str1 = br.readLine();
                    int q = 0;
                    while (str1 != null) {
                        String str2[] = new String[8];

                        str2 = str1.split(" ");
                        for (int j = 0; j < 8; j++) {
                            safhe[q][j] = Integer.parseInt(str2[j]);
                        }
                        q++;
                        str1 = br.readLine();
                    }
                    for (int v = 0; v < 8; v++) {
                        for (int j = 0; j < 8; j++) {
                            if (safhe[v][j] > 0) {
                                g[v][j] = 1;
                            } else {
                                g[v][j] = 0;
                            }
                        }
                    }
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            Rectangle r = new Rectangle();
                            r.setX(50 + i * 62.5);
                            r.setY(50 + j * 62.5);
                            r.setWidth(62.5);
                            r.setHeight(62.5);
                            if ((i + j) % 2 == 0) {
                                r.setFill(Color.DARKGREY);
                            } else {
                                r.setFill(Color.WHITE);
                            }
                            root.getChildren().add(r);
                        }
                    }
                    bazikon1.namayesh(safhe, root, 1);
                    bazikon2.namayesh(safhe, root, 2);
                } catch (FileNotFoundException ex) {
                    System.out.println("nist!");
                } catch (IOException ex) {
                    Logger.getLogger(ChessGame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        scene.setOnMouseClicked((MouseEvent e) -> {
            x = -1;
            y = -1;
            z = -1;
            t = -1;
            b = (int) ((int) (e.getX() - 50) / 62.5);
            a = (int) ((int) (e.getY() - 50) / 62.5);
            try {
                if (nobat == 1) {
                    int d = 0;
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (g[i][j] >= 0) {
                                d++;
                            }
                        }
                    }
                    if (d == 64) {
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j < 8; j++) {
                                safhe1[i][j] = safhe[i][j];
                            }
                        }
                        if (shah_kish) {
                            bazikon1.raf_kish(a, b, safhe, g, 1);
                            int m[] = new int[2];
                            m = finder(511, safhe);
                            z = m[0];
                            t = m[1];
                            if (bazikon1.mat(safhe, g, 1)) {
                                System.out.print("bazikon2 barande shod!");
                                mat = true;
                            }
                            shah_kish = false;
                        } else {
                            if (bazikon1.shaheKhodiKish(safhe, g, a, b, 1) > 0) {
                                x = a;
                                y = b;
                            }
                            if (safhe[a][b] == 511) {
                                if (bazikon1.shaheKhodiKish(safhe, g, a, b, 1) > 0) {
                                    bazikon1.gozine_harekat_mohre_jadid(a, b, safhe, g, 1);
                                }
                            } else if (bazikon1.shaheKhodiKish(safhe, g, a, b, 1) == 1) {
                                bazikon1.gozine_harekat_mohre_jadid(a, b, safhe, g, 1);
                            } else if (bazikon1.shaheKhodiKish(safhe, g, a, b, 1) == 0) {
                                bazikon1.gozine_harekat_mohre(safhe[a][b], safhe, g, 1);
                            }
                        }
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j < 8; j++) {
                                Rectangle r = new Rectangle();
                                r.setY(50 + i * 62.5);
                                r.setX(50 + j * 62.5);
                                r.setWidth(62.5);
                                r.setHeight(62.5);
                                if ((i + j) % 2 == 0 && g[i][j] != -1) {
                                    r.setFill(Color.DARKGREY);
                                } else if (g[i][j] != -1 && (i + j) % 2 == 1) {
                                    r.setFill(Color.WHITE);
                                } else if ((i + j) % 2 == 0 && g[i][j] == -1) {
                                    r.setFill(Color.DARKGREEN);
                                } else {
                                    r.setFill(Color.LIGHTGREEN);
                                }
                                if (i == x && j == y) {
                                    r.setFill(Color.YELLOW);
                                }
                                if (i == z && j == t) {
                                    r.setFill(Color.RED);
                                }
                                root.getChildren().add(r);
                            }
                        }
                        bazikon1.namayesh(safhe, root, 1);
                        bazikon2.namayesh(safhe, root, 2);
                    } else if (d != 64) {
                        if (bazikon1.harekat(g, safhe, a, b) == 1) {
                            nobat *= -1;
                        }
                        if (bazikon1.kish(safhe, g, 1)) {
                            int m[] = new int[2];
                            m = finder(512, safhe);
                            z = m[0];
                            t = m[1];
                            shah_kish = true;
                        }
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j < 8; j++) {
                                if (safhe[i][j] > 0) {
                                    g[i][j] = 1;
                                } else {
                                    g[i][j] = 0;
                                }
                            }
                        }
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j < 8; j++) {
                                Rectangle r = new Rectangle();
                                r.setY(50 + i * 62.5);
                                r.setX(50 + j * 62.5);
                                r.setWidth(62.5);
                                r.setHeight(62.5);
                                if ((i + j) % 2 == 0 && g[i][j] != -1) {
                                    r.setFill(Color.DARKGREY);
                                } else if (g[i][j] != -1 && (i + j) % 2 == 1) {
                                    r.setFill(Color.WHITE);
                                } else if ((i + j) % 2 == 0 && g[i][j] == -1) {
                                    r.setFill(Color.DARKGREEN);
                                } else if ((i + j) % 2 == 1 && g[i][j] == -1) {
                                    r.setFill(Color.LIGHTGREEN);
                                }
                                if (i == x && j == y) {
                                    r.setFill(Color.YELLOW);
                                }
                                if (i == z && j == t) {
                                    r.setFill(Color.RED);
                                }
                                if (i == z && j == t) {
                                    r.setFill(Color.RED);
                                }
                                root.getChildren().add(r);
                            }
                        }
                        bazikon1.namayesh(safhe, root, 1);
                        bazikon2.namayesh(safhe, root, 2);
                        //inja mitoonam undo bezaram
                        Button undo = new Button();
                        undo.setLayoutX(40);
                        undo.setLayoutY(0);
                        undo.setText("undo");
                        undo.setOnAction(new EventHandler<ActionEvent>() {

                            @Override
                            public void handle(ActionEvent event) {
                                for (int i = 0; i < 8; i++) {
                                    for (int j = 0; j < 8; j++) {
                                        safhe[i][j] = safhe1[i][j];
                                    }
                                }
                                for (int i = 0; i < 8; i++) {
                                    for (int j = 0; j < 8; j++) {
                                        Rectangle r = new Rectangle();
                                        r.setY(50 + i * 62.5);
                                        r.setX(50 + j * 62.5);
                                        r.setWidth(62.5);
                                        r.setHeight(62.5);
                                        if ((i + j) % 2 == 0 && g[i][j] != -1) {
                                            r.setFill(Color.DARKGREY);
                                        } else if (g[i][j] != -1 && (i + j) % 2 == 1) {
                                            r.setFill(Color.WHITE);
                                        } else if ((i + j) % 2 == 0 && g[i][j] == -1) {
                                            r.setFill(Color.DARKGREEN);
                                        } else if ((i + j) % 2 == 1 && g[i][j] == -1) {
                                            r.setFill(Color.LIGHTGREEN);
                                        }
                                        if (i == x && j == y) {
                                            r.setFill(Color.YELLOW);
                                        }
                                        if (i == z && j == t) {
                                            r.setFill(Color.RED);
                                        }
                                        if (i == z && j == t) {
                                            r.setFill(Color.RED);
                                        }
                                        root.getChildren().add(r);
                                    }
                                }
                                bazikon1.namayesh(safhe, root, 1);
                                bazikon2.namayesh(safhe, root, 2);
                                nobat *= -1;
                            }
                        });
                        root.getChildren().add(undo);
                    }

                } else if (nobat == -1) {
                    int d = 0;
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (g[i][j] >= 0) {
                                d++;
                            }
                        }
                    }
                    if (d == 64) {
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j < 8; j++) {
                                safhe1[i][j] = safhe[i][j];
                            }
                        }
                        if (shah_kish) {
                            int m[] = new int[2];
                            m = finder(512, safhe);
                            z = m[0];
                            t = m[1];
                            bazikon2.raf_kish(a, b, safhe, g, 2);
                            if (bazikon2.mat(safhe, g, 2)) {
                                System.out.print("bazikon1 barande shod!");
                                mat = true;
                            }
                            shah_kish = false;
                        } else {
                            if (bazikon2.shaheKhodiKish(safhe, g, a, b, 2) > 0) {
                                x = a;
                                y = b;
                            }
                            if (safhe[a][b] == 512) {
                                if (bazikon2.shaheKhodiKish(safhe, g, a, b, 2) > 0) {
                                    bazikon2.gozine_harekat_mohre_jadid(a, b, safhe, g, 2);
                                }
                            } else if (bazikon2.shaheKhodiKish(safhe, g, a, b, 2) == 1) {
                                bazikon2.gozine_harekat_mohre_jadid(a, b, safhe, g, 2);
                            } else if (bazikon1.shaheKhodiKish(safhe, g, a, b, 2) == 0) {
                                bazikon2.gozine_harekat_mohre(safhe[a][b], safhe, g, 2);
                            }
                        }
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j < 8; j++) {
                                Rectangle r = new Rectangle();
                                r.setY(50 + i * 62.5);
                                r.setX(50 + j * 62.5);
                                r.setWidth(62.5);
                                r.setHeight(62.5);
                                if ((i + j) % 2 == 0 && g[i][j] != -1) {
                                    r.setFill(Color.DARKGREY);
                                } else if (g[i][j] != -1 && (i + j) % 2 == 1) {
                                    r.setFill(Color.WHITE);
                                } else if ((i + j) % 2 == 0 && g[i][j] == -1) {
                                    r.setFill(Color.DARKGREEN);
                                } else if ((i + j) % 2 == 1 && g[i][j] == -1) {
                                    r.setFill(Color.LIGHTGREEN);
                                }
                                if (i == x && j == y) {
                                    r.setFill(Color.YELLOW);
                                }
                                if (i == z && j == t) {
                                    r.setFill(Color.RED);
                                }
                                root.getChildren().add(r);
                            }
                        }
                        bazikon1.namayesh(safhe, root, 1);
                        bazikon2.namayesh(safhe, root, 2);
                    }
                    if (d != 64) {
                        if (bazikon2.harekat(g, safhe, a, b) == 1) {
                            nobat *= -1;
                        }
                        if (bazikon2.kish(safhe, g, 2)) {
                            int m[] = new int[2];
                            m = finder(511, safhe);
                            z = m[0];
                            t = m[1];
                            shah_kish = true;
                        }
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j < 8; j++) {
                                if (safhe[i][j] > 0) {
                                    g[i][j] = 1;
                                } else {
                                    g[i][j] = 0;
                                }
                            }
                        }
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j < 8; j++) {
                                Rectangle r = new Rectangle();
                                r.setY(50 + i * 62.5);
                                r.setX(50 + j * 62.5);
                                r.setWidth(62.5);
                                r.setHeight(62.5);
                                if ((i + j) % 2 == 0 && g[i][j] != -1) {
                                    r.setFill(Color.DARKGREY);
                                } else if (g[i][j] != -1 && (i + j) % 2 == 1) {
                                    r.setFill(Color.WHITE);
                                }
                                if (i == x && j == y) {
                                    r.setFill(Color.YELLOW);
                                }
                                if (i == z && j == t) {
                                    r.setFill(Color.RED);
                                }
                                root.getChildren().add(r);
                            }
                        }
                        bazikon1.namayesh(safhe, root, 1);
                        bazikon2.namayesh(safhe, root, 2);
                        //undo place
                        Button undo = new Button();
                        undo.setLayoutX(40);
                        undo.setLayoutY(0);
                        undo.setText("undo");
                        undo.setOnAction(new EventHandler<ActionEvent>() {

                            @Override
                            public void handle(ActionEvent event) {
                                for (int i = 0; i < 8; i++) {
                                    for (int j = 0; j < 8; j++) {
                                        safhe[i][j] = safhe1[i][j];
                                    }
                                }
                                for (int i = 0; i < 8; i++) {
                                    for (int j = 0; j < 8; j++) {
                                        Rectangle r = new Rectangle();
                                        r.setY(50 + i * 62.5);
                                        r.setX(50 + j * 62.5);
                                        r.setWidth(62.5);
                                        r.setHeight(62.5);
                                        if ((i + j) % 2 == 0 && g[i][j] != -1) {
                                            r.setFill(Color.DARKGREY);
                                        } else if (g[i][j] != -1 && (i + j) % 2 == 1) {
                                            r.setFill(Color.WHITE);
                                        }
                                        if (i == x && j == y) {
                                            r.setFill(Color.YELLOW);
                                        }
                                        if (i == z && j == t) {
                                            r.setFill(Color.RED);
                                        }
                                        root.getChildren().add(r);
                                    }
                                }
                                bazikon1.namayesh(safhe, root, 1);
                                bazikon2.namayesh(safhe, root, 2);
                                nobat *= -1;
                            }
                        });
                        root.getChildren().add(undo);
                    }

                }
            } catch (ArrayIndexOutOfBoundsException ai) {
                System.out.println("eshteba zadi !");
            }

        });

        Button save = new Button();
        save.setLayoutX(0);
        save.setLayoutY(0);
        save.setText("save");
        save.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    System.out.println("enter the name : ");
                    Scanner scanner = new Scanner(System.in);
                    str = scanner.next();
                    str += ".txt";
                    File file = new File(str);
                    file.createNewFile();
                    FileWriter fw = new FileWriter(file);
                    String str1 = "";
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            str1 += Integer.toString(safhe[i][j]);
                            str1 += " ";
                        }
                        str1 += "\n";
                    }
                    fw.write(str1);
                    fw.flush();
                } catch (IOException ex) {
                    Logger.getLogger(ChessGame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        root.getChildren().add(continueGame);
        root.getChildren().add(save);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
