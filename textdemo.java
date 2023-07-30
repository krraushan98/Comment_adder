import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TextDemo extends Frame {
    Label lb = new Label("Comment");
    TextArea ta = new TextArea(5, 40);
    Button addButton = new Button("Add to Bottom");
    Label bottomLabel = new Label();

    TextDemo() {
        setLayout(new FlowLayout());
        setVisible(true);
        add(lb);
        add(ta);
        add(addButton);
        add(bottomLabel); // Add the Label to the frame to show the added text

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textToAdd = ta.getText();
                bottomLabel.setText(textToAdd);
            }
        });

        setSize(400, 400);
    }

    public static void main(String args[]) {
        new TextDemo();
    }
}
