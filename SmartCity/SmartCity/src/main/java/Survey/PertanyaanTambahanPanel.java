package Survey;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PertanyaanTambahanPanel extends JPanel {
    private CardLayout cardLayout;
    private JTextField jawabanTambahan1Field;

    public PertanyaanTambahanPanel(CardLayout cardLayout, Surveyy survey) {
        this.cardLayout = cardLayout;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel tambahanLabel1 = new JLabel("Berikan kritik mengenai 6 Smart Device tersebut!");
        jawabanTambahan1Field = new JTextField();
        add(tambahanLabel1);
        add(jawabanTambahan1Field);

        JButton nextToSurveyButton = new JButton("Lanjut ke Survey");
        nextToSurveyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(survey, "surveyPanel");
            }
        });
        add(nextToSurveyButton);
        
    }
    }

