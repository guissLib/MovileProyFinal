package activity.ToDo;

import appiumControl.Button;
import appiumControl.CheckBox;
import appiumControl.TextBox;
import org.openqa.selenium.By;


public class FinishedTaskForm {
    public TextBox titleTxtBox= new TextBox(By.id("com.splendapps.splendo:id/task_name"));
    public CheckBox finishedCheckBox= new CheckBox(By.id("com.splendapps.splendo:id/checkFinished"));
    public Button saveButton = new Button(By.id("com.splendapps.splendo:id/fabSaveTask"));
}
