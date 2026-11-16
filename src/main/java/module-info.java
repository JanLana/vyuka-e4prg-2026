module vyuka.e4prg {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;

    opens cz.gyarab.prg.e4.s1 to javafx.fxml;
    exports cz.gyarab.prg.e4.s1;
}