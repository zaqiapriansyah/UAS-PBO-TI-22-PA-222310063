package Survey;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Surveyy extends JPanel {
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

    public Surveyy() {
        cardLayout = new CardLayout();
        setLayout(cardLayout);

        introPanel = new IntroPanel(this);
        pertanyaanTambahanPanel = new PertanyaanTambahanPanel(cardLayout, this);
        surveyPanel = new SurveyPanel(cardLayout, this);
        skorPanel = new SkorPanel(this);
        akhirPanel = new AkhirPanel();

        add(introPanel, "introPanel");
        add(pertanyaanTambahanPanel, "pertanyaanTambahanPanel");
        add(surveyPanel, "surveyPanel");
        add(skorPanel, "skorPanel");
        add(akhirPanel, "akhirPanel");
    }

    public void introPanel() {
        cardLayout.show(this, "introPanel");
    }
    
    public void pertanyaanTambahanPanel() {
        cardLayout.show(this, "pertanyaanTambahanPanel");
    }
    
    public void showsurveyPanel() {
        cardLayout.show(this, "surveyPanel");
    }

    public void showskorPanel() {
        cardLayout.show(this, "skorPanel");
    }

    public void showakhirPanel() {
        cardLayout.show(this, "akhirPanel");
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
                "total skor : " + totalskor + "\n"+
                "Kritik terhadap Smart Device: " + jawabanTambahan1;
        JOptionPane.showMessageDialog(this, hasilSurvey, "Hasil Survey", JOptionPane.INFORMATION_MESSAGE);

        // Beralih ke panel akhir setelah menampilkan hasil survey
        cardLayout.show(Surveyy.this, "AkhirPanel");
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
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Aplikasi Survey Smart City");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Surveyy surveyApp = new Surveyy();
            surveyApp.introPanel();

            frame.getContentPane().add(surveyApp);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
		
	}