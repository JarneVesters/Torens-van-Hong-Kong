package vesters.jarne.taak.herexamen;

import java.awt.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class FXMLDocumentController {
    
    @FXML
    private AnchorPane paneel;

    @FXML
    private Label label;
    
    @FXML
    private Button resetKnop;
    
    @FXML
    private Button addKnop;

    @FXML
    private void addKnop(ActionEvent event) {
        

    }
    @FXML
    private void resetKnop(ActionEvent event) {
        

    }
    private Spelbord model;
    private SpelbordView view;
    public void setModel(Spelbord model) {
        this.model = model;
        view = new SpelbordView(model);
        paneel.getChildren().add(view);
    }
    
    @FXML
    void initialize() {
        paneel.setFocusTraversable(true);
        resetKnop.setOnAction(event -> reset());
        resetKnop.setFocusTraversable(false);
    }
    public void reset() {
        model.reset();
        update();
    }
    public void update() {
        view.update();
    }
}
