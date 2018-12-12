package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label helloWorld;
    public Label Score;
    private int count = 0;

    public void sayHelloWorld(ActionEvent actionEvent)
    {
        helloWorld.setText("Hello World!");
    }

    public void Score1(ActionEvent actionEvent)
    {
        count++;
        Score.setText(String.valueOf(count));
    }

    public void Score2(ActionEvent actionEvent)
    {
        count= count + 2;
        Score.setText(String.valueOf(count));
    }

    public void Score3(ActionEvent actionEvent)
    {
        count=count+3;
        Score.setText(String.valueOf(count));
    }
}
