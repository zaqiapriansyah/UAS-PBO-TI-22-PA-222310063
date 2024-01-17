package Survey;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class AkhirPanel extends JPanel {
    public AkhirPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel akhirLabel = new JLabel("Terima kasih telah mengisi survey!");
        add(akhirLabel);
    }
}
