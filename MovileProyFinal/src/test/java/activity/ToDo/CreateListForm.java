package activity.ToDo;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class CreateListForm {
    public TextBox taskTxtBox= new TextBox(By.id("com.splendapps.splendo:id/edtTaskName"));

    public Button saveTaskTxtBox= new Button(By.id("com.splendapps.splendo:id/fabSaveTask"));


}
