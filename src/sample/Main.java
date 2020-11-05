package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {

        Application.launch();
    }

    @Override
    public void start(Stage stage) {
        Text teksts1 = new Text("ENTRY");
        teksts1.setFont(Font.font(null, FontWeight.BOLD, 20));
        teksts1.setX(195);
        teksts1.setY(30);

        Line linija1 = new Line(230, 32, 230, 56);
        linija1.setStrokeWidth(2.0);

        Polygon trissturis1 = new Polygon();
        trissturis1.getPoints().addAll(222.0, 42.0, 238.0, 42.0, 230.0, 56.0);
        trissturis1.setFill(Color.BLACK);

        Ellipse elipse1 = new Ellipse(230, 105, 150, 50);
        elipse1.setFill(Color.TRANSPARENT);
        elipse1.setStroke(Color.BLACK);
        elipse1.setStrokeWidth(3.0);

        Text teksts2 = new Text("Euclid's algorithm for the");
        teksts2.setFont(Font.font(null, FontWeight.BOLD, 17));
        teksts2.setX(123);
        teksts2.setY(95);

        Text teksts3 = new Text("greatest common divisor (gcd)");
        teksts3.setFont(Font.font(null, FontWeight.BOLD, 17));
        teksts3.setX(110);
        teksts3.setY(115);

        Text teksts4 = new Text("of two numbers");
        teksts4.setFont(Font.font(null, FontWeight.BOLD, 17));
        teksts4.setX(150);
        teksts4.setY(135);

        Line linija2 = new Line(230, 155, 230, 180);
        linija2.setStrokeWidth(2.0);

        Polygon trissturis2 = new Polygon();
        trissturis2.getPoints().addAll(222.0, 166.0, 238.0, 166.0, 230.0, 180.0);
        trissturis2.setFill(Color.BLACK);

        Rectangle taisnsturis1 = new Rectangle(155, 180, 150, 40);
        taisnsturis1.setFill(Color.TRANSPARENT);
        taisnsturis1.setStroke(Color.BLACK);
        taisnsturis1.setStrokeWidth(3.0);

        Text teksts5 = new Text("INPUT A, B");
        teksts5.setFont(Font.font(null, FontWeight.BOLD, 20));
        teksts5.setX(175);
        teksts5.setY(207);

        Line linija3 = new Line(230, 222, 230, 245);
        linija3.setStrokeWidth(2.0);

        Polygon trissturis3 = new Polygon();
        trissturis3.getPoints().addAll(222.0, 231.0, 238.0, 231.0, 230.0, 245.0);
        trissturis3.setFill(Color.BLACK);

        Circle aplis1 = new Circle(230, 255, 10);
        aplis1.setFill(Color.TRANSPARENT);
        aplis1.setStroke(Color.BLACK);
        aplis1.setStrokeWidth(3.0);

        Line linija4 = new Line(230, 265, 230, 290);
        linija4.setStrokeWidth(2.0);

        Polygon trissturis4 = new Polygon();
        trissturis4.getPoints().addAll(222.0, 276.0, 238.0, 276.0, 230.0, 290.0);
        trissturis4.setFill(Color.BLACK);

        Circle aplis2 = new Circle(330, 255, 10);
        aplis2.setFill(Color.BLACK);
        aplis2.setStrokeWidth(3.0);

        Polygon rombs1 = new Polygon();
        rombs1.getPoints().addAll(150.0, 315.0, 230.0, 290.0, 310.0, 315.0, 230.0, 340.0);
        rombs1.setFill(Color.TRANSPARENT);
        rombs1.setStroke(Color.BLACK);
        rombs1.setStrokeWidth(3.0);

        Text teksts6 = new Text("B = 0?");
        teksts6.setFont(Font.font(null, FontWeight.BOLD, 20));
        teksts6.setX(205);
        teksts6.setY(322);

        Line linija5 = new Line(230, 340, 230, 365);
        linija5.setStrokeWidth(2.0);

        Polygon trissturis5 = new Polygon();
        trissturis5.getPoints().addAll(222.0, 356.0, 238.0, 356.0, 230.0, 370.0);
        trissturis5.setFill(Color.BLACK);

        Polygon rombs2 = new Polygon();
        rombs2.getPoints().addAll(150.0, 395.0, 230.0, 370.0, 310.0, 395.0, 230.0, 420.0);
        rombs2.setFill(Color.TRANSPARENT);
        rombs2.setStroke(Color.BLACK);
        rombs2.setStrokeWidth(3.0);

        Text teksts7 = new Text("A > B?");
        teksts7.setFont(Font.font(null, FontWeight.BOLD, 20));
        teksts7.setX(205);
        teksts7.setY(402);

        Line linija6 = new Line(230, 420, 230, 435);
        linija6.setStrokeWidth(2.0);

        Polygon trissturis6 = new Polygon();
        trissturis6.getPoints().addAll(222.0, 428.0, 238.0, 428.0, 230.0, 440.0);
        trissturis6.setFill(Color.BLACK);

        Rectangle taisnsturis2 = new Rectangle(155, 440, 150, 30);
        taisnsturis2.setFill(Color.TRANSPARENT);
        taisnsturis2.setStroke(Color.BLACK);
        taisnsturis2.setStrokeWidth(3.0);

        Text teksts8 = new Text("B <- B - A");
        teksts8.setFont(Font.font(null, FontWeight.BOLD, 20));
        teksts8.setX(185);
        teksts8.setY(462);

        Line linija7 = new Line(230, 470, 230, 480);
        linija7.setStrokeWidth(2.0);

        Rectangle taisnsturis3 = new Rectangle(155, 480, 150, 30);
        taisnsturis3.setFill(Color.TRANSPARENT);
        taisnsturis3.setStroke(Color.BLACK);
        taisnsturis3.setStrokeWidth(3.0);

        Text teksts9 = new Text("GOTO 2");
        teksts9.setFont(Font.font(null, FontWeight.BOLD, 20));
        teksts9.setX(193);
        teksts9.setY(502);

        Rectangle taisnsturis4 = new Rectangle(155, 540, 150, 30);
        taisnsturis4.setFill(Color.TRANSPARENT);
        taisnsturis4.setStroke(Color.BLACK);
        taisnsturis4.setStrokeWidth(3.0);

        Text teksts10 = new Text("A <- A - B");
        teksts10.setFont(Font.font(null, FontWeight.BOLD, 20));
        teksts10.setX(185);
        teksts10.setY(562);

        Line linija8 = new Line(230, 570, 230, 580);
        linija8.setStrokeWidth(2.0);

        Rectangle taisnsturis5 = new Rectangle(155, 580, 150, 30);
        taisnsturis5.setFill(Color.TRANSPARENT);
        taisnsturis5.setStroke(Color.BLACK);
        taisnsturis5.setStrokeWidth(3.0);

        Text teksts11 = new Text("GOTO 2");
        teksts11.setFont(Font.font(null, FontWeight.BOLD, 20));
        teksts11.setX(193);
        teksts11.setY(602);

        Rectangle taisnsturis6 = new Rectangle(155, 650, 150, 40);
        taisnsturis6.setFill(Color.TRANSPARENT);
        taisnsturis6.setStroke(Color.BLACK);
        taisnsturis6.setStrokeWidth(3.0);

        Text teksts12 = new Text("PRINT A");
        teksts12.setFont(Font.font(null, FontWeight.BOLD, 20));
        teksts12.setX(190);
        teksts12.setY(675);

        Line linija9 = new Line(230, 690, 230, 730);
        linija9.setStrokeWidth(2.0);

        Polygon trissturis7 = new Polygon();
        trissturis7.getPoints().addAll(222.0, 721.0, 238.0, 721.0, 230.0, 735.0);
        trissturis7.setFill(Color.BLACK);

        Ellipse elipse2 = new Ellipse(230, 755, 40, 20);
        elipse2.setFill(Color.TRANSPARENT);
        elipse2.setStroke(Color.BLACK);
        elipse2.setStrokeWidth(3.0);

        Text teksts13 = new Text("END");
        teksts13.setFont(Font.font(null, FontWeight.BOLD, 20));
        teksts13.setX(210);
        teksts13.setY(760);

        //----kr bulta1
        Line linija10 = new Line(150, 315, 90, 315);
        linija10.setStrokeWidth(2.0);

        Text teksts14 = new Text("yes");
        teksts14.setFont(Font.font(null, FontWeight.BOLD, 17));
        teksts14.setX(115);
        teksts14.setY(305);

        Line linija11 = new Line(90, 315, 90, 635);
        linija11.setStrokeWidth(2.0);

        Line linija12 = new Line(90, 635, 230, 635);
        linija12.setStrokeWidth(2.0);

        Line linija13 = new Line(230, 635, 230, 645);
        linija13.setStrokeWidth(2.0);

        Polygon trissturis8 = new Polygon();
        trissturis8.getPoints().addAll(222.0, 639.0, 238.0, 639.0, 230.0, 650.0);
        trissturis8.setFill(Color.BLACK);

        Group krbulta1 = new Group();
        krbulta1.getChildren().addAll(linija10, linija11, linija12, linija13, trissturis8, teksts14);

//----kr bulta2
        Line linija14 = new Line(150, 395, 110, 395);
        linija14.setStrokeWidth(2.0);

        Text teksts15 = new Text("yes");
        teksts15.setFont(Font.font(null, FontWeight.BOLD, 17));
        teksts15.setX(115);
        teksts15.setY(385);

        Line linija15 = new Line(110, 395, 110, 527);
        linija15.setStrokeWidth(2.0);

        Line linija16 = new Line(110, 527, 230, 527);
        linija16.setStrokeWidth(2.0);

        Line linija17 = new Line(230, 527, 230, 540);
        linija17.setStrokeWidth(2.0);

        Polygon trissturis9 = new Polygon();
        trissturis9.getPoints().addAll(222.0, 530.0, 238.0, 530.0, 230.0, 540.0);
        trissturis9.setFill(Color.BLACK);

        Group krbulta2 = new Group();
        krbulta2.getChildren().addAll(linija14, linija15, linija17, linija16, trissturis9, teksts15);

        //----lab bulta1
        Line linija18 = new Line(230, 510, 230, 520);
        linija18.setStrokeWidth(2.0);

        Line linija19 = new Line(230, 520, 330, 520);
        linija19.setStrokeWidth(2.0);

        Line linija20 = new Line(330, 520, 330, 250);
        linija20.setStrokeWidth(2.0);

        Polygon trissturis10 = new Polygon();
        trissturis10.getPoints().addAll(323.0, 275.0, 337.0, 275.0, 330.0, 265.0);
        trissturis10.setFill(Color.BLACK);

        Text teksts16 = new Text("no (< or =)");
        teksts16.setFont(Font.font(null, FontWeight.BOLD, 15));
        teksts16.setX(244);
        teksts16.setY(432);

        Group labbulta1 = new Group();
        labbulta1.getChildren().addAll(linija18, linija19, linija20, trissturis10, teksts16);

        //----lab bulta2
        Line linija21 = new Line(230, 610, 230, 625);
        linija21.setStrokeWidth(2.0);

        Line linija22 = new Line(230, 625, 370, 625);
        linija22.setStrokeWidth(2.0);

        Line linija23 = new Line(370, 625, 370, 255);
        linija23.setStrokeWidth(2.0);

        Line linija24 = new Line(370, 255, 330, 255);
        linija24.setStrokeWidth(2.0);

        Polygon trissturis11 = new Polygon();
        trissturis11.getPoints().addAll(339.0, 255.0, 346.0, 248.0, 346.0, 262.0);
        trissturis11.setFill(Color.BLACK);

        Line linija25 = new Line(320, 255, 240, 255);
        linija25.setStrokeWidth(2.0);

        Polygon trissturis12 = new Polygon();
        trissturis12.getPoints().addAll(240.0, 255.0, 247.0, 248.0, 247.0, 262.0);
        trissturis12.setFill(Color.BLACK);

        Group labbulta2 = new Group();
        labbulta2.getChildren().addAll(linija21, linija22, linija23,
                linija24, trissturis11, linija25, trissturis12);

        //----kvadrati
        Rectangle taisnsturis7 = new Rectangle(45, 190, 20, 20);
        taisnsturis7.setFill(Color.TRANSPARENT);
        taisnsturis7.setStroke(Color.BLACK);
        taisnsturis7.setStrokeWidth(1.0);

        Text teksts17 = new Text("1");
        teksts17.setFont(Font.font(null, FontWeight.BOLD, 16));
        teksts17.setX(50);
        teksts17.setY(205);

        Rectangle taisnsturis8 = new Rectangle(45, 305, 20, 20);
        taisnsturis8.setFill(Color.TRANSPARENT);
        taisnsturis8.setStroke(Color.BLACK);
        taisnsturis8.setStrokeWidth(1.0);

        Text teksts18 = new Text("2");
        teksts18.setFont(Font.font(null, FontWeight.BOLD, 16));
        teksts18.setX(50);
        teksts18.setY(320);

        Rectangle taisnsturis9 = new Rectangle(45, 390, 20, 20);
        taisnsturis9.setFill(Color.TRANSPARENT);
        taisnsturis9.setStroke(Color.BLACK);
        taisnsturis9.setStrokeWidth(1.0);

        Text teksts19 = new Text("3");
        teksts19.setFont(Font.font(null, FontWeight.BOLD, 16));
        teksts19.setX(50);
        teksts19.setY(405);

        Rectangle taisnsturis10 = new Rectangle(45, 445, 20, 20);
        taisnsturis10.setFill(Color.TRANSPARENT);
        taisnsturis10.setStroke(Color.BLACK);
        taisnsturis10.setStrokeWidth(1.0);

        Text teksts20 = new Text("4");
        teksts20.setFont(Font.font(null, FontWeight.BOLD, 16));
        teksts20.setX(50);
        teksts20.setY(460);

        Rectangle taisnsturis11 = new Rectangle(45, 485, 20, 20);
        taisnsturis11.setFill(Color.TRANSPARENT);
        taisnsturis11.setStroke(Color.BLACK);
        taisnsturis11.setStrokeWidth(1.0);

        Text teksts21 = new Text("5");
        teksts21.setFont(Font.font(null, FontWeight.BOLD, 16));
        teksts21.setX(50);
        teksts21.setY(500);

        Rectangle taisnsturis12 = new Rectangle(45, 545, 20, 20);
        taisnsturis12.setFill(Color.TRANSPARENT);
        taisnsturis12.setStroke(Color.BLACK);
        taisnsturis12.setStrokeWidth(1.0);

        Text teksts22 = new Text("6");
        teksts22.setFont(Font.font(null, FontWeight.BOLD, 16));
        teksts22.setX(50);
        teksts22.setY(560);

        Rectangle taisnsturis13 = new Rectangle(45, 585, 20, 20);
        taisnsturis13.setFill(Color.TRANSPARENT);
        taisnsturis13.setStroke(Color.BLACK);
        taisnsturis13.setStrokeWidth(1.0);

        Text teksts23 = new Text("7");
        teksts23.setFont(Font.font(null, FontWeight.BOLD, 16));
        teksts23.setX(50);
        teksts23.setY(600);

        Rectangle taisnsturis14 = new Rectangle(45, 660, 20, 20);
        taisnsturis14.setFill(Color.TRANSPARENT);
        taisnsturis14.setStroke(Color.BLACK);
        taisnsturis14.setStrokeWidth(1.0);

        Text teksts24 = new Text("8");
        teksts24.setFont(Font.font(null, FontWeight.BOLD, 16));
        teksts24.setX(50);
        teksts24.setY(675);

        Rectangle taisnsturis15 = new Rectangle(45, 745, 20, 20);
        taisnsturis15.setFill(Color.TRANSPARENT);
        taisnsturis15.setStroke(Color.BLACK);
        taisnsturis15.setStrokeWidth(1.0);

        Text teksts25 = new Text("9");
        teksts25.setFont(Font.font(null, FontWeight.BOLD, 16));
        teksts25.setX(50);
        teksts25.setY(760);

        Group kvadrati = new Group();
        kvadrati.getChildren().addAll(taisnsturis7, teksts17, taisnsturis8, teksts18, taisnsturis9, teksts19,
                taisnsturis10, teksts20, taisnsturis11, teksts21, taisnsturis12, teksts22,
                taisnsturis13, teksts23, taisnsturis14, teksts24, taisnsturis15, teksts25);

        Pane pane = new Pane();
        pane.getChildren().addAll(elipse1, teksts1, teksts2, teksts3, teksts4, teksts5, taisnsturis1,
                aplis1, linija1, aplis2, rombs1, teksts9, trissturis1, linija2, trissturis2, linija3,
                trissturis3, linija4, trissturis4, linija5, trissturis5, linija6, trissturis6,
                linija7, krbulta2, taisnsturis4, teksts10, linija8, teksts11, taisnsturis5,
                taisnsturis6, teksts12, linija9, trissturis7, elipse2, teksts13,
                teksts6, teksts7, rombs2, taisnsturis2, teksts8, taisnsturis3,
                krbulta1, labbulta1, labbulta2, kvadrati);
        pane.setPadding(new Insets(1));
        pane.setStyle(
                "-fx-border-style:solid inside;" +
                        "-fx-border-width: 4;" +
                        "-fx-border-insets: 5;" +
                        "-fx-border-radius: 5;" +
                        "-fx-border-color: blue;");
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("24. patstāvīgā darba uzdevums");
        stage.show();
    }
}
