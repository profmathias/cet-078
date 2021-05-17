package org.example;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class App extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane painel = new GridPane();
        Label label = new Label("Nome: ");
        TextField campoDeTexto = new TextField();
        Button botao = new Button("Cadastrar...");
        botao.setOnMouseClicked(new ManipuladorBotao());

        painel.add(label, 0, 0);
        painel.add(campoDeTexto, 1, 0);
        painel.add(botao, 1, 1);


        Scene scene = new Scene(painel, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Meu App");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


class ManipuladorBotao implements EventHandler<MouseEvent> {

    @Override
    public void handle(MouseEvent event) {
        System.out.println("Botão clicado...");
    }
}