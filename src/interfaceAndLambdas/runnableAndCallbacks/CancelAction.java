package interfaceAndLambdas.runnableAndCallbacks;


import java.awt.event.ActionEvent;

public class CancelAction implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Oh noes!");
    }



}

