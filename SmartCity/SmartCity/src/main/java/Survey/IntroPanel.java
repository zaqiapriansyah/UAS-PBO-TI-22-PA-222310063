package Survey;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IntroPanel extends JPanel {
    private CardLayout cardLayout;

    public IntroPanel(Surveyy surveyy) {
        this.cardLayout = (CardLayout) surveyy.getLayout();

        setLayout(cardLayout);

        JPanel introPanel = new JPanel();
        introPanel.setLayout(new BoxLayout(introPanel, BoxLayout.Y_AXIS));

        JLabel introLabel = new JLabel("Selamat datang di Aplikasi Survey Smart City!");
        JLabel introText = new JLabel("Berikut adalah daftar dari Smart Device Apps : ");
        JLabel introText1 = new JLabel("1. Smart Governance  	: Mengembangkan sistem pemerintahan melalui penggunaan teknologi.");
        JLabel introText2 = new JLabel("2. Smart Mobility          	: Mencakup peningkatan efisiensi dan keselamatan transportasi penggunaan teknologi seperti tranportasi elektronik.");
        JLabel introText3 = new JLabel("3. Smart Environment 	: Mencakup peningkatan penggunaan sumber daya terbaik dalam pengelolaan sampah dan peningkatan kebersihan lingkungan.");
        JLabel introText4 = new JLabel("4. Smart Economy       	: Mencakup peningkatan efisiensi dan competivitas ekonomi melalui penggunaan teknologi seperti IoT, cloud computing dan AI.");
        JLabel introText5 = new JLabel("5. Smart People           	: Mencakup pengembangan SDM dengan menciptakan kemajuan pendidikan, kesehatan, dan kebijakan sosial yang lebih baik.");
        JLabel introText6 = new JLabel("6. Smart Governance 	: Mencakup peningkatan kualitas hidup di sebuah kota dengan menciptakan layanan publik yang lebih mudah dan efisien.");
        introPanel.add(introLabel);
        introPanel.add(Box.createVerticalStrut(10));
        introPanel.add(introText);
        introPanel.add(introText1);
        introPanel.add(introText2);
        introPanel.add(introText3);
        introPanel.add(introText4);
        introPanel.add(introText5);
        introPanel.add(introText6);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton nextButton = new JButton("Lanjut");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                surveyy.pertanyaanTambahanPanel(); // Panggil metode untuk menampilkan pertanyaanTambahanPanel
            }
        });
        buttonPanel.add(nextButton);
        introPanel.add(buttonPanel);

        add(introPanel, "introPanel");
    }
}
