/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {

    // @author Derya Cezik
    private final Operations _operations;
    private final Props _props;

    @FXML
    private TextField input;

    public FXMLDocumentController() {
        this._props = new Props();
        this._operations = new Operations();
    }

    // @author Derya Cezik
    public String getFieldText() {
        return input.getText();
    }

    // @author Eda Belge
    public void setDigits() {
        if (_props.Operator.equals("")) {
            _props.Digit1 = Double.parseDouble(getFieldText());
        } else {
            _props.Digit2 = Double.parseDouble(getFieldText());
        }
    }

    // @author Derya Cezik
    public void setFieldText(String text) {

        input.setText(text);
    }

    // @author Derya Cezik
    public void renderBody(ActionEvent event) {
        if (getFieldText().equals("Undefined")) {
            setFieldText("");
        }
        String digit = ((Button) event.getSource()).getText();
        input.setText(input.getText() + digit);
        setDigits();
    }

    // @author Derya Cezik
    public void getOperation(ActionEvent event) {
        _props.Operator = ((Button) event.getSource()).getText();
        setFieldText("");

    }

    // @author Eda Belge
    public void calculate() {
        String operator = _props.Operator;
        Double number1 = _props.Digit1;
        Double number2 = _props.Digit2;
        String result;

        if (!operator.equals("") && !number1.isNaN() && !number2.isNaN()) {
            result = _operations.calculate(operator, number1, number2);
            setFieldText(result);
            if (result.equals("Undefined")) {
                _props.Digit1 = 0.0;
                _props.Operator = "";
            } else {
                _props.Digit1 = Double.parseDouble(result);
            }
        }

    }

    // @author Derya Cezik
    public void clear() {
        _props.Digit1 = 0.0;
        _props.Digit2 = 0.0;
        _props.Operator = "";
        String result = _operations.clear();
        setFieldText(result);

    }

   // @author Eda Belge
    public void delete(ActionEvent event) {
        String result = _operations.delete(getFieldText());
        setFieldText(result);
        setDigits();
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
