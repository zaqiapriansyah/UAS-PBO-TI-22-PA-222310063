package Survey;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SkorPanel extends JPanel {
    private CardLayout cardLayout;
    private JTextField jawabanskor1Field;
    private JTextField jawabanskor2Field;
    private JTextField jawabanskor3Field;
    private JTextField jawabanskor4Field;
    private JTextField jawabanskor5Field;
    private JTextField jawabanskor6Field;
	private String jawaban2;
	private String jawaban1;
	private String jawaban3;
	private String jawaban4;
	private String jawaban5;
	private String jawaban6;
	private String jawabanTambahan1;

    public SkorPanel(Surveyy Surveyy) {
        this.cardLayout = cardLayout;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel label8 = new JLabel("1. Menurut anda seberapa penting Smart Governance di kota Serang? (1/10)");
        jawabanskor1Field = new JTextField();
        add(label8);
        add(jawabanskor1Field);

        JLabel labelTambahan1 = new JLabel("2. Menurut anda seberapa penting Smart Mobility di kota Serang? (1/10) ");
        jawabanskor2Field = new JTextField();
        add(labelTambahan1);
        add(jawabanskor2Field);

        JLabel labelTambahan2 = new JLabel("3. Menurut anda seberapa penting Smart Environment di kota Serang? (1/10) ");
        jawabanskor3Field = new JTextField();
        add(labelTambahan2);
        add(jawabanskor3Field);

        JLabel labelTambahan3 = new JLabel("4. Menurut anda seberapa penting Smart Economy di kota Serang? (1/10)");
        jawabanskor4Field = new JTextField();
        add(labelTambahan3);
        add(jawabanskor4Field);

        JLabel labelTambahan4 = new JLabel("5. Menurut anda seberapa penting Smart Living di kota Serang? (1/10) ");
        jawabanskor5Field = new JTextField();
        add(labelTambahan4);
        add(jawabanskor5Field);

        JLabel labelTambahan5 = new JLabel("6. Menurut anda seberapa penting Smart People di kota Serang? (1/10) ");
        jawabanskor6Field = new JTextField();
        add(labelTambahan5);
        add(jawabanskor6Field);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
 
                    tampilkanHasilSurvey();
                }
        });
        add(submitButton);

        JButton backButton1 = new JButton("Kembali");
        backButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(SkorPanel.this.getParent(), "surveyPanel");
            }
        });
        add(backButton1);
    }


	private void tampilkanHasilSurvey() {
            try {
                // Ambil nilai dari setiap JTextField
                int skor1 = Integer.parseInt(jawabanskor1Field.getText());
                int skor2 = Integer.parseInt(jawabanskor2Field.getText());
                int skor3 = Integer.parseInt(jawabanskor3Field.getText());
                int skor4 = Integer.parseInt(jawabanskor4Field.getText());
                int skor5 = Integer.parseInt(jawabanskor5Field.getText());
                int skor6 = Integer.parseInt(jawabanskor6Field.getText());

                // Hitung rata-rata skor
                double rataRataSkor = (skor1 + skor2 + skor3 + skor4 + skor5 + skor6) / 6.0;

                // Tampilkan hasil survey
                JOptionPane.showMessageDialog(null, "Hasil Survey: Rata-rata Skor = " + rataRataSkor, "Hasil Survey", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Masukkan skor dengan format angka", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

	private boolean validasiskor() {
		if (jawaban1.isEmpty() ||
	            jawaban2.isEmpty() ||
	            jawaban3.isEmpty() ||
	            jawaban4.isEmpty() ||
	            jawaban5.isEmpty() ||
	            jawaban6.isEmpty() ||
	            jawabanTambahan1.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Mohon lengkapi semua pertanyaan.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
	            return false;
	        }
		return false;
	}
}