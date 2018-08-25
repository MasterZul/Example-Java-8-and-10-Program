package com.masterzul.todolist;

import com.masterzul.todolist.datamodel.TodoData;
import com.masterzul.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker dateLinePicker;

    public TodoItem processResults(){
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate dateLineValue = dateLinePicker.getValue();

        TodoItem newItem = new TodoItem(shortDescription, details, dateLineValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;

    }
}
