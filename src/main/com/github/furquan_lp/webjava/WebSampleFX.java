package com.github.furquan_lp.webjava;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.javafx.BrowserView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class WebSampleFX extends Application {
   @Override
   public void start(Stage primaryStage) {
       Browser jbrowser = new Browser();
       BrowserView browserView = new BrowserView(jbrowser);

       StackPane pane = new StackPane();
       pane.getChildren().add(browserView);
       Scene scene = new Scene(pane, 1024, 768);
       primaryStage.setScene(scene);
       primaryStage.show();

       browser.loadURL("http://www.google.com/");
   }

   public static void main(String[] args) {
       launch(args);
   }
}
