package Survey;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SurveyPanel extends JPanel {
    private CardLayout cardLayout;
    private JTextField jawaban1Field;
    private JTextField jawaban2Field;
    private JTextField jawaban3Field;
    private JTextField jawaban4Field;
    private JTextField jawaban5Field;
    private JTextField jawaban6Field;

    public SurveyPanel(CardLayout cardLayout, Surveyy survey) {
        this.cardLayout = cardLayout;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel label1 = new JLabel("Pertanyaan 1: Apa menurut anda konsep Smart Governance diperlukan di kota Serang? (Ya/Tidak)");
        jawaban1Field = new JTextField();
        add(label1);
        add(jawaban1Field);

        JLabel label2 = new JLabel("Pertanyaan 2: Apa menurut anda konsep Smart Mobility diperlukan di kota Serang? (Ya/Tidak)");
        jawaban2Field = new JTextField();
        add(label2);
        add(jawaban2Field);

        JLabel label3 = new JLabel("Pertanyaan 3: Apa menurut anda konsep Smart Environment diperlukan di kota Serang? (Ya/Tidak)");
        jawaban3Field = new JTextField();
        add(label3);
        add(jawaban3Field);

        JLabel label4 = new JLabel("Pertanyaan 4: Apa menurut anda konsep Smart Economy diperlukan di kota Serang? (Ya/Tidak)");
        jawaban4Field = new JTextField();
        add(label4);
        add(jawaban4Field);

        JLabel label5 = new JLabel("Pertanyaan 5: Apa menurut anda konsep Smart Living diperlukan di kota Serang? (Ya/Tidak)");
        jawaban5Field = new JTextField();
        add(label5);
        add(jawaban5Field);

        JLabel label6 = new JLabel("Pertanyaan 6: Apa menurut anda konsep Smart People diperlukan di kota Serang? (Ya/Tidak)");
        jawaban6Field = new JTextField();
        add(label6);
        add(jawaban6Field);

        JButton nextButton2 = new JButton("Next");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(survey, "skorPanel");
            }
        });
        add(nextButton2);

        JButton backButton = new JButton("Kembali");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(survey, "pertanyaanTambahanPanel");
            }
        });
        add(backButton);
    }
}