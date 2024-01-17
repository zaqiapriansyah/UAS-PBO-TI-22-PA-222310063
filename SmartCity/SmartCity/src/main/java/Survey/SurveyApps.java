package Survey;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SurveyApps extends JPanel {
    private CardLayout cardLayout;
    private JPanel introPanel;
    private JPanel surveyPanel;
    private JPanel pertanyaanTambahanPanel;
    private JPanel skorPanel;
    private JPanel akhirPanel; 
    private JTextField jawaban1Field;
    private JTextField jawaban2Field;
    private JTextField jawaban3Field;
    private JTextField jawaban4Field;
    private JTextField jawaban5Field;
    private JTextField jawaban6Field;
    private JTextField jawabanTambahan1Field;
    private JTextField jawabanskor1Field;
    private JTextField jawabanskor2Field;
    private JTextField jawabanskor3Field;
    private JTextField jawabanskor4Field;
    private JTextField jawabanskor5Field;
    private JTextField jawabanskor6Field;

    public SurveyApps() {
        cardLayout = new CardLayout();
        setLayout(cardLayout);

        // Panel Intro
        introPanel = new JPanel();
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
                cardLayout.show(SurveyApps.this, "pertanyaanTambahanPanel");
            }
        });
        buttonPanel.add(nextButton);
        introPanel.add(buttonPanel);

        // Panel Kritik smart device
        pertanyaanTambahanPanel = new JPanel();
        pertanyaanTambahanPanel.setLayout(new BoxLayout(pertanyaanTambahanPanel, BoxLayout.Y_AXIS));

        JLabel tambahanLabel1 = new JLabel("Berikan kritik mengenai 6 Smart Device tersebut!");
        jawabanTambahan1Field = new JTextField();
        pertanyaanTambahanPanel.add(tambahanLabel1);
        pertanyaanTambahanPanel.add(jawabanTambahan1Field);

        JButton nextToSurveyButton = new JButton("Lanjut ke Survey");
        nextToSurveyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(SurveyApps.this, "surveyPanel");
            }
        });
        pertanyaanTambahanPanel.add(nextToSurveyButton);

        // Panel Survey
        surveyPanel = new JPanel();
        surveyPanel.setLayout(new BoxLayout(surveyPanel, BoxLayout.Y_AXIS));

        JLabel label1 = new JLabel("Pertanyaan 1: Apa menurut anda konsep Smart Governance diperlukan di kota Serang? (Ya/Tidak)");
        jawaban1Field = new JTextField();
        surveyPanel.add(label1);
        surveyPanel.add(jawaban1Field);

        JLabel label2 = new JLabel("Pertanyaan 2: Apa menurut anda konsep Smart Mobility diperlukan di kota Serang? (Ya/Tidak)");
        jawaban2Field = new JTextField();
        surveyPanel.add(label2);
        surveyPanel.add(jawaban2Field);

        JLabel label3 = new JLabel("Pertanyaan 3: Apa menurut anda konsep Smart Environment diperlukan di kota Serang? (Ya/Tidak)");
        jawaban3Field = new JTextField();
        surveyPanel.add(label3);
        surveyPanel.add(jawaban3Field);

        JLabel label4 = new JLabel("Pertanyaan 4: Apa menurut anda konsep Smart Economy diperlukan di kota Serang? (Ya/Tidak)");
        jawaban4Field = new JTextField();
        surveyPanel.add(label4);
        surveyPanel.add(jawaban4Field);

        JLabel label5 = new JLabel("Pertanyaan 5: Apa menurut anda konsep Smart Living diperlukan di kota Serang? (Ya/Tidak)");
        jawaban5Field = new JTextField();
        surveyPanel.add(label5);
        surveyPanel.add(jawaban5Field);

        JLabel label6 = new JLabel("Pertanyaan 6: Apa menurut anda konsep Smart People diperlukan di kota Serang? (Ya/Tidak)");
        jawaban6Field = new JTextField();
        surveyPanel.add(label6);
        surveyPanel.add(jawaban6Field);

      
        JButton nextButton2 = new JButton("Next");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(SurveyApps.this, "skorPanel");
            }
        });
        surveyPanel.add(nextButton2);

        JButton backButton = new JButton("Kembali");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(SurveyApps.this, "pertanyaanTambahanPanel");
            }
        });
        surveyPanel.add(backButton);

        // Panel Skor
        skorPanel = new JPanel();
        skorPanel.setLayout(new BoxLayout(skorPanel, BoxLayout.Y_AXIS));

        JLabel label8 = new JLabel("1. Menurut anda seberapa penting Smart Governance di kota serang? (1/10)");
        jawabanskor1Field = new JTextField();
        skorPanel.add(label8);
        skorPanel.add(jawabanskor1Field);

        JLabel labelTambahan1 = new JLabel("2. Menurut anda seberapa penting Smart Mobility di kota serang? (1/10) ");
        jawabanskor2Field = new JTextField();
        skorPanel.add(labelTambahan1);
        skorPanel.add(jawabanskor2Field);

        JLabel labelTambahan2 = new JLabel("3. Menurut anda seberapa penting Smart Environment di kota serang? (1/10) ");
        jawabanskor3Field = new JTextField();
        skorPanel.add(labelTambahan2);
        skorPanel.add(jawabanskor3Field);

        JLabel labelTambahan3 = new JLabel("4. Menurut anda seberapa penting Smart Economy di kota serang? (1/10)");
        jawabanskor4Field = new JTextField();
        skorPanel.add(labelTambahan3);
        skorPanel.add(jawabanskor4Field);

        JLabel labelTambahan4 = new JLabel("5. Menurut anda seberapa penting Smart Living di kota serang? (1/10) ");
        jawabanskor5Field = new JTextField();
        skorPanel.add(labelTambahan4);
        skorPanel.add(jawabanskor5Field);

        JLabel labelTambahan5 = new JLabel("6. Menurut anda seberapa penting Smart People di kota serang? (1/10) ");
        jawabanskor6Field = new JTextField();
        skorPanel.add(labelTambahan5);
        skorPanel.add(jawabanskor6Field);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validasiSkor()) {
                    tampilkanHasilSurvey();
                }
            }
        });
        skorPanel.add(submitButton);
        
        JButton backButton1 = new JButton("Kembali");
        backButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(SurveyApps.this, "surveyPanel");
            }
        });
        skorPanel.add(backButton1);

        // Panel Akhir
        akhirPanel = new JPanel();
        JLabel akhirLabel = new JLabel("Terima kasih telah mengisi survey!");
        akhirPanel.add(akhirLabel);

        add(introPanel, "introPanel");
        add(pertanyaanTambahanPanel, "pertanyaanTambahanPanel");
        add(surveyPanel, "surveyPanel");
        add(skorPanel, "skorPanel");
        add(akhirPanel, "akhirPanel");
    }

    private void tampilkanHasilSurvey() {
        String jawaban1 = jawaban1Field.getText().toLowerCase();
        String jawaban2 = jawaban2Field.getText().toLowerCase();
        String jawaban3 = jawaban3Field.getText().toLowerCase();
        String jawaban4 = jawaban4Field.getText().toLowerCase();
        String jawaban5 = jawaban5Field.getText().toLowerCase();
        String jawaban6 = jawaban6Field.getText().toLowerCase();
        String jawabanTambahan1 = jawabanTambahan1Field.getText();
        int skor1 = Integer.parseInt(jawabanskor1Field.getText());
        int skor2 = Integer.parseInt(jawabanskor2Field.getText());
        int skor3 = Integer.parseInt(jawabanskor3Field.getText());
        int skor4 = Integer.parseInt(jawabanskor4Field.getText());
        int skor5 = Integer.parseInt(jawabanskor5Field.getText());
        int skor6 = Integer.parseInt(jawabanskor6Field.getText());

        // Validasi bahwa semua kolom jawaban telah diisi
        if (jawaban1.isEmpty() ||
            jawaban2.isEmpty() ||
            jawaban3.isEmpty() ||
            jawaban4.isEmpty() ||
            jawaban5.isEmpty() ||
            jawaban6.isEmpty() ||
            jawabanTambahan1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon lengkapi semua pertanyaan.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validasi bahwa jawaban hanya dapat diisi dengan "ya" atau "tidak"
        if (!(jawaban1.equals("ya") || jawaban1.equals("tidak")) ||
            !(jawaban2.equals("ya") || jawaban2.equals("tidak")) ||
            !(jawaban3.equals("ya") || jawaban3.equals("tidak")) ||
            !(jawaban4.equals("ya") || jawaban4.equals("tidak")) ||
            !(jawaban5.equals("ya") || jawaban5.equals("tidak")) ||
            !(jawaban6.equals("ya") || jawaban6.equals("tidak"))) {
            JOptionPane.showMessageDialog(this, "Jawaban pada pertanyaan 1 hingga 6 hanya bisa diisi dengan \"ya\" atau \"tidak\".", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validasi bahwa skor berada dalam rentang 1-10
        if (skor1 < 1 || skor1 > 10 ||
            skor2 < 1 || skor2 > 10 ||
            skor3 < 1 || skor3 > 10 ||
            skor4 < 1 || skor4 > 10 ||
            skor5 < 1 || skor5 > 10 ||
            skor6 < 1 || skor6 > 10) {
            JOptionPane.showMessageDialog(this, "Skor harus berada dalam rentang 1-10.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Tampilkan hasil survey
        int totalskor = skor1 + skor2 + skor3 + skor4 + skor5 + skor6;
        String hasilSurvey = "Terima kasih atas partisipasi Anda dalam survey!\n\n" +
                "Berikut adalah hasil survey Anda:\n" +
                "1. Konsep Smart Governance: " + jawaban1 + " (Skor: " + skor1 + ")\n" +
                "2. Konsep Smart Mobility: " + jawaban2 + " (Skor: " + skor2 + ")\n" +
                "3. Konsep Smart Environment: " + jawaban3 + " (Skor: " + skor3 + ")\n" +
                "4. Konsep Smart Economy: " + jawaban4 + " (Skor: " + skor4 + ")\n" +
                "5. Konsep Smart Living: " + jawaban5 + " (Skor: " + skor5 + ")\n" +
                "6. Konsep Smart People: " + jawaban6 + " (Skor: " + skor6 + ")\n" +
                "totalskor: " + totalskor + "\n"+
                "Kritik terhadap Smart Device: " + jawabanTambahan1;
        JOptionPane.showMessageDialog(this, hasilSurvey, "Hasil Survey", JOptionPane.INFORMATION_MESSAGE);

        // Beralih ke panel akhir setelah menampilkan hasil survey
        cardLayout.show(SurveyApps.this, "akhirPanel");
    }

    private boolean validasiSkor() {
        String skorText1 = jawabanskor1Field.getText();
        String skorText2 = jawabanskor2Field.getText();
        String skorText3 = jawabanskor3Field.getText();
        String skorText4 = jawabanskor4Field.getText();
        String skorText5 = jawabanskor5Field.getText();
        String skorText6 = jawabanskor6Field.getText();

        // Validasi bahwa isian tidak boleh kosong
        if (skorText1.isEmpty() || skorText2.isEmpty() || skorText3.isEmpty() || skorText4.isEmpty() || skorText5.isEmpty() || skorText6.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon isi semua skor.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try {
            // Validasi bahwa isian harus berupa angka
            int skor1 = Integer.parseInt(skorText1);
            int skor2 = Integer.parseInt(skorText2);
            int skor3 = Integer.parseInt(skorText3);
            int skor4 = Integer.parseInt(skorText4);
            int skor5 = Integer.parseInt(skorText5);
            int skor6 = Integer.parseInt(skorText6);

            // Validasi bahwa skor berada dalam rentang 1-10
            if (skor1 < 1 || skor1 > 10 || skor2 < 1 || skor2 > 10 || skor3 < 1 || skor3 > 10 || skor4 < 1 || skor4 > 10 || skor5 < 1 || skor5 > 10 || skor6 < 1 || skor6 > 10) {
                JOptionPane.showMessageDialog(this, "Skor harus berada dalam rentang 1-10.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
             
            
        }
            return true;
        
        }catch (NumberFormatException ex) {
            // Tangkap exception jika isian tidak dapat diubah menjadi angka
            JOptionPane.showMessageDialog(this, "Isian skor harus berupa angka.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
        

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Aplikasi Survey Smart City");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new SurveyApps());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
