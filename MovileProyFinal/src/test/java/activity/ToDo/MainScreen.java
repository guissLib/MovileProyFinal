package activity.ToDo;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class MainScreen {

    public Button addTaskButton = new Button(By.id("com.splendapps.splendo:id/fabAddTask"));

 public TextBox titleTxtBox= new TextBox(By.xpath("//android.widget.TextView[@text='Nueva tarea']"));
    public MainScreen(){}


    public boolean isNoteDisplayed(String title){
        Label note= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return note.isControlDisplayed();
    }


}
