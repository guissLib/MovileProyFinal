package cleanTest;

import activity.ToDo.CreateListForm;
import activity.ToDo.MainScreen;
import activity.ToDo.FinishedTaskForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class ListTaskTest {
    MainScreen mainScreen = new MainScreen();
    CreateListForm createListForm = new CreateListForm();
    FinishedTaskForm finishedTaskForm= new FinishedTaskForm();


    @Test
    public void verifyTaskNew(){

        String task="Ir al cine";

        mainScreen.addTaskButton.click();
        createListForm.taskTxtBox.setText(task);
        createListForm.saveTaskTxtBox.click();
      Assertions.assertTrue(mainScreen.isNoteDisplayed(task),
         "ERROR, the note was not created");

        finishedTaskForm.titleTxtBox.click();
        finishedTaskForm.finishedCheckBox.click();
        finishedTaskForm.saveButton.click();

        Assertions.assertFalse(mainScreen.isNoteDisplayed(task),
                "ERROR, the note was not created");

    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }



}
