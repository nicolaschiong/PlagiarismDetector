package main;

import io.Files;
import java.io.File;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.Highlighter;
import model.Text;
import process.Replacement;
import process.StopWords;
import process.Tokenizer;
import process.WordSequenceAligner;
import process.WordSequenceAligner.Alignment;

/**
 *
 * @author Nick
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnTest = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tab_Compare = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnotherText = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtFirstText = new javax.swing.JTextArea();
        btnChooseFileFirst = new javax.swing.JButton();
        btnChooseFileAnother = new javax.swing.JButton();
        btnClearFirstTextField = new javax.swing.JButton();
        btnClearAnotherTextField = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tab_Preprocessing = new javax.swing.JTabbedPane();
        tab_SentenceSegment = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtSentenceSegmentation2 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtSentenceSegmentation1 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtSentenceSegment_SegmentCount1 = new javax.swing.JLabel();
        txtSentenceSegment_SegmentCount2 = new javax.swing.JLabel();
        tab_Tokenization = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtTokenization2 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtTokenization1 = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtTokenization_TokenCount1 = new javax.swing.JLabel();
        txtTokenization_TokenCount2 = new javax.swing.JLabel();
        tab_StopwordRemoval = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtStopWordRemoval2 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtStopWordRemoval1 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtStopWordRemoval_TokenCount1 = new javax.swing.JLabel();
        txtStopWordRemoval_TokenCount2 = new javax.swing.JLabel();
        tab_NumberReplacement = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtReplacement2 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtReplacement1 = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tab_ShallowNLP = new javax.swing.JTabbedPane();
        tab_PartOfSpeechTagging = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtPOSTagging2 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        txtPOSTagging1 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtSentenceSegment_SegmentCount3 = new javax.swing.JLabel();
        txtSentenceSegment_SegmentCount4 = new javax.swing.JLabel();
        tab_Stemming = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtPOSTagging3 = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        txtPOSTagging4 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtSentenceSegment_SegmentCount5 = new javax.swing.JLabel();
        txtSentenceSegment_SegmentCount6 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_TextAlignment = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLogs = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plagiarism Detection");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel1.setText("PREPROCESSING");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel2.setText("Setence Segmentation");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel3.setText("Tokenization");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel4.setText("Lowercasing");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel5.setText("Stopword Removal");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel6.setText("Punctuation Removal");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel7.setText("Number Replacement");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel8.setText("SHALLOW TECHNIQUES");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel9.setText("Part of Speech Tagging");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel10.setText("Stemming");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel11.setText("Lemmatisation");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel12.setText("Chunking");

        btnTest.setText("Test for Plagiarism");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel14.setText("METRICS");

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel15.setText("Levenshtein");

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel26.setText("Word Error Rate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel26))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTest, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N

        txtAnotherText.setColumns(20);
        txtAnotherText.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtAnotherText.setLineWrap(true);
        txtAnotherText.setRows(5);
        jScrollPane2.setViewportView(txtAnotherText);

        txtFirstText.setColumns(20);
        txtFirstText.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtFirstText.setLineWrap(true);
        txtFirstText.setRows(5);
        jScrollPane3.setViewportView(txtFirstText);

        btnChooseFileFirst.setText("File...");
        btnChooseFileFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileFirstActionPerformed(evt);
            }
        });

        btnChooseFileAnother.setText("File...");
        btnChooseFileAnother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileAnotherActionPerformed(evt);
            }
        });

        btnClearFirstTextField.setText("Clear");
        btnClearFirstTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFirstTextFieldActionPerformed(evt);
            }
        });

        btnClearAnotherTextField.setText("Clear");
        btnClearAnotherTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAnotherTextFieldActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel16.setText("First Text");

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel17.setText("Second Text");

        javax.swing.GroupLayout tab_CompareLayout = new javax.swing.GroupLayout(tab_Compare);
        tab_Compare.setLayout(tab_CompareLayout);
        tab_CompareLayout.setHorizontalGroup(
            tab_CompareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_CompareLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_CompareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_CompareLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                        .addComponent(btnClearFirstTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChooseFileFirst))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_CompareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tab_CompareLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(401, 401, 401)
                        .addComponent(btnClearAnotherTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChooseFileAnother))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        tab_CompareLayout.setVerticalGroup(
            tab_CompareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_CompareLayout.createSequentialGroup()
                .addGroup(tab_CompareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_CompareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClearAnotherTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tab_CompareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnChooseFileFirst)
                        .addComponent(btnChooseFileAnother)
                        .addComponent(btnClearFirstTextField)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("COMPARE", tab_Compare);

        tab_Preprocessing.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        txtSentenceSegmentation2.setEditable(false);
        txtSentenceSegmentation2.setColumns(20);
        txtSentenceSegmentation2.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtSentenceSegmentation2.setLineWrap(true);
        txtSentenceSegmentation2.setRows(5);
        jScrollPane9.setViewportView(txtSentenceSegmentation2);

        txtSentenceSegmentation1.setEditable(false);
        txtSentenceSegmentation1.setColumns(20);
        txtSentenceSegmentation1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtSentenceSegmentation1.setLineWrap(true);
        txtSentenceSegmentation1.setRows(5);
        jScrollPane10.setViewportView(txtSentenceSegmentation1);

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel18.setText("First Text");

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel19.setText("Second Text");

        txtSentenceSegment_SegmentCount1.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        txtSentenceSegment_SegmentCount1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSentenceSegment_SegmentCount1.setText("Number of Segments: ");

        txtSentenceSegment_SegmentCount2.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        txtSentenceSegment_SegmentCount2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSentenceSegment_SegmentCount2.setText("Number of Segments: ");

        javax.swing.GroupLayout tab_SentenceSegmentLayout = new javax.swing.GroupLayout(tab_SentenceSegment);
        tab_SentenceSegment.setLayout(tab_SentenceSegmentLayout);
        tab_SentenceSegmentLayout.setHorizontalGroup(
            tab_SentenceSegmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_SentenceSegmentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_SentenceSegmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_SentenceSegmentLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSentenceSegment_SegmentCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_SentenceSegmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_SentenceSegmentLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSentenceSegment_SegmentCount2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        tab_SentenceSegmentLayout.setVerticalGroup(
            tab_SentenceSegmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_SentenceSegmentLayout.createSequentialGroup()
                .addGroup(tab_SentenceSegmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(jScrollPane9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_SentenceSegmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSentenceSegment_SegmentCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSentenceSegment_SegmentCount2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tab_Preprocessing.addTab("SENTENCE SEGMENT", tab_SentenceSegment);

        txtTokenization2.setEditable(false);
        txtTokenization2.setColumns(20);
        txtTokenization2.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtTokenization2.setLineWrap(true);
        txtTokenization2.setRows(5);
        jScrollPane11.setViewportView(txtTokenization2);

        txtTokenization1.setEditable(false);
        txtTokenization1.setColumns(20);
        txtTokenization1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtTokenization1.setLineWrap(true);
        txtTokenization1.setRows(5);
        jScrollPane12.setViewportView(txtTokenization1);

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel20.setText("First Text");

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel21.setText("Second Text");

        txtTokenization_TokenCount1.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        txtTokenization_TokenCount1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTokenization_TokenCount1.setText("Number of Tokens: ");

        txtTokenization_TokenCount2.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        txtTokenization_TokenCount2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTokenization_TokenCount2.setText("Number of Tokens: ");

        javax.swing.GroupLayout tab_TokenizationLayout = new javax.swing.GroupLayout(tab_Tokenization);
        tab_Tokenization.setLayout(tab_TokenizationLayout);
        tab_TokenizationLayout.setHorizontalGroup(
            tab_TokenizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_TokenizationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_TokenizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addGroup(tab_TokenizationLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTokenization_TokenCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_TokenizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_TokenizationLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(285, 285, 285)
                        .addComponent(txtTokenization_TokenCount2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        tab_TokenizationLayout.setVerticalGroup(
            tab_TokenizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_TokenizationLayout.createSequentialGroup()
                .addGroup(tab_TokenizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(jScrollPane11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_TokenizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTokenization_TokenCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTokenization_TokenCount2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tab_Preprocessing.addTab("TOKENIZATION", tab_Tokenization);

        txtStopWordRemoval2.setEditable(false);
        txtStopWordRemoval2.setColumns(20);
        txtStopWordRemoval2.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtStopWordRemoval2.setLineWrap(true);
        txtStopWordRemoval2.setRows(5);
        txtStopWordRemoval2.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        txtStopWordRemoval2.setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));
        jScrollPane13.setViewportView(txtStopWordRemoval2);

        txtStopWordRemoval1.setEditable(false);
        txtStopWordRemoval1.setColumns(20);
        txtStopWordRemoval1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtStopWordRemoval1.setLineWrap(true);
        txtStopWordRemoval1.setRows(5);
        jScrollPane14.setViewportView(txtStopWordRemoval1);

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel22.setText("First Text");

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel23.setText("Second Text");

        txtStopWordRemoval_TokenCount1.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        txtStopWordRemoval_TokenCount1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtStopWordRemoval_TokenCount1.setText("Number of Tokens: ");

        txtStopWordRemoval_TokenCount2.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        txtStopWordRemoval_TokenCount2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtStopWordRemoval_TokenCount2.setText("Number of Tokens: ");

        javax.swing.GroupLayout tab_StopwordRemovalLayout = new javax.swing.GroupLayout(tab_StopwordRemoval);
        tab_StopwordRemoval.setLayout(tab_StopwordRemovalLayout);
        tab_StopwordRemovalLayout.setHorizontalGroup(
            tab_StopwordRemovalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_StopwordRemovalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_StopwordRemovalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_StopwordRemovalLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtStopWordRemoval_TokenCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_StopwordRemovalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_StopwordRemovalLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(285, 285, 285)
                        .addComponent(txtStopWordRemoval_TokenCount2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        tab_StopwordRemovalLayout.setVerticalGroup(
            tab_StopwordRemovalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_StopwordRemovalLayout.createSequentialGroup()
                .addGroup(tab_StopwordRemovalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(jScrollPane13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_StopwordRemovalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStopWordRemoval_TokenCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStopWordRemoval_TokenCount2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tab_Preprocessing.addTab("STOPWORD REMOVAL", tab_StopwordRemoval);

        txtReplacement2.setEditable(false);
        txtReplacement2.setColumns(20);
        txtReplacement2.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtReplacement2.setLineWrap(true);
        txtReplacement2.setRows(5);
        jScrollPane15.setViewportView(txtReplacement2);

        txtReplacement1.setEditable(false);
        txtReplacement1.setColumns(20);
        txtReplacement1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtReplacement1.setLineWrap(true);
        txtReplacement1.setRows(5);
        jScrollPane16.setViewportView(txtReplacement1);

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel24.setText("First Text");

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel25.setText("Second Text");

        javax.swing.GroupLayout tab_NumberReplacementLayout = new javax.swing.GroupLayout(tab_NumberReplacement);
        tab_NumberReplacement.setLayout(tab_NumberReplacementLayout);
        tab_NumberReplacementLayout.setHorizontalGroup(
            tab_NumberReplacementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_NumberReplacementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_NumberReplacementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(tab_NumberReplacementLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_NumberReplacementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addContainerGap())
        );
        tab_NumberReplacementLayout.setVerticalGroup(
            tab_NumberReplacementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_NumberReplacementLayout.createSequentialGroup()
                .addGroup(tab_NumberReplacementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(jScrollPane15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_NumberReplacementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tab_Preprocessing.addTab("NUMBER REPLACEMENT", tab_NumberReplacement);

        jTabbedPane1.addTab("PREPROCESSING", tab_Preprocessing);

        tab_ShallowNLP.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        txtPOSTagging2.setEditable(false);
        txtPOSTagging2.setColumns(20);
        txtPOSTagging2.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtPOSTagging2.setLineWrap(true);
        txtPOSTagging2.setRows(5);
        jScrollPane17.setViewportView(txtPOSTagging2);

        txtPOSTagging1.setEditable(false);
        txtPOSTagging1.setColumns(20);
        txtPOSTagging1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtPOSTagging1.setLineWrap(true);
        txtPOSTagging1.setRows(5);
        jScrollPane18.setViewportView(txtPOSTagging1);

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel27.setText("First Text");

        jLabel28.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel28.setText("Second Text");

        txtSentenceSegment_SegmentCount3.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        txtSentenceSegment_SegmentCount3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSentenceSegment_SegmentCount3.setText("Number of Segments: ");

        txtSentenceSegment_SegmentCount4.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        txtSentenceSegment_SegmentCount4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSentenceSegment_SegmentCount4.setText("Number of Segments: ");

        javax.swing.GroupLayout tab_PartOfSpeechTaggingLayout = new javax.swing.GroupLayout(tab_PartOfSpeechTagging);
        tab_PartOfSpeechTagging.setLayout(tab_PartOfSpeechTaggingLayout);
        tab_PartOfSpeechTaggingLayout.setHorizontalGroup(
            tab_PartOfSpeechTaggingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_PartOfSpeechTaggingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_PartOfSpeechTaggingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_PartOfSpeechTaggingLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSentenceSegment_SegmentCount3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_PartOfSpeechTaggingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_PartOfSpeechTaggingLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSentenceSegment_SegmentCount4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        tab_PartOfSpeechTaggingLayout.setVerticalGroup(
            tab_PartOfSpeechTaggingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_PartOfSpeechTaggingLayout.createSequentialGroup()
                .addGroup(tab_PartOfSpeechTaggingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(jScrollPane17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_PartOfSpeechTaggingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSentenceSegment_SegmentCount3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSentenceSegment_SegmentCount4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tab_ShallowNLP.addTab("POS TAGGING", tab_PartOfSpeechTagging);

        txtPOSTagging3.setEditable(false);
        txtPOSTagging3.setColumns(20);
        txtPOSTagging3.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtPOSTagging3.setLineWrap(true);
        txtPOSTagging3.setRows(5);
        jScrollPane19.setViewportView(txtPOSTagging3);

        txtPOSTagging4.setEditable(false);
        txtPOSTagging4.setColumns(20);
        txtPOSTagging4.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtPOSTagging4.setLineWrap(true);
        txtPOSTagging4.setRows(5);
        jScrollPane20.setViewportView(txtPOSTagging4);

        jLabel29.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel29.setText("First Text");

        jLabel30.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel30.setText("Second Text");

        txtSentenceSegment_SegmentCount5.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        txtSentenceSegment_SegmentCount5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSentenceSegment_SegmentCount5.setText("Number of Segments: ");

        txtSentenceSegment_SegmentCount6.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        txtSentenceSegment_SegmentCount6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSentenceSegment_SegmentCount6.setText("Number of Segments: ");

        javax.swing.GroupLayout tab_StemmingLayout = new javax.swing.GroupLayout(tab_Stemming);
        tab_Stemming.setLayout(tab_StemmingLayout);
        tab_StemmingLayout.setHorizontalGroup(
            tab_StemmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_StemmingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_StemmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_StemmingLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSentenceSegment_SegmentCount5, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_StemmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_StemmingLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSentenceSegment_SegmentCount6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        tab_StemmingLayout.setVerticalGroup(
            tab_StemmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_StemmingLayout.createSequentialGroup()
                .addGroup(tab_StemmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(jScrollPane19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_StemmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSentenceSegment_SegmentCount5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSentenceSegment_SegmentCount6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tab_ShallowNLP.addTab("LEMMATIZATION", tab_Stemming);

        jTabbedPane1.addTab("NORMALIZATION", tab_ShallowNLP);

        jTabbedPane2.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        txt_TextAlignment.setEditable(false);
        txt_TextAlignment.setColumns(20);
        txt_TextAlignment.setRows(5);
        jScrollPane4.setViewportView(txt_TextAlignment);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("TEXT ALIGNMENT", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1156, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("SYNTACTIC CHANGES", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1156, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("SEMANTIC CHANGES", jPanel6);

        jTabbedPane1.addTab("RESULTS", jTabbedPane2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtLogs.setColumns(20);
        txtLogs.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtLogs.setLineWrap(true);
        txtLogs.setRows(5);
        jScrollPane1.setViewportView(txtLogs);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel13.setText("LOGS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        Text textFirst = new Text();
        Text textAnother = new Text();

        Tokenizer tokenizer = new Tokenizer();

        String text = txtFirstText.getText();
        String anotherText = txtAnotherText.getText();

        if (text.isEmpty() || anotherText.isEmpty()) {
            txtLogs.append("Text field to compare must not be empty!\n");
            JOptionPane.showMessageDialog(null, "Text field to compare must not be empty!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txtLogs.append("***************** INITIALIZING PREPROCESSING *****************.\n");
            //SENTENCE SEGMENTATION
            String[] firstSentenceSegementized = tokenizer.initSentenceSegmention(text);
            textFirst.setSentenceSegments(firstSentenceSegementized);
            String[] anotherSentenceSegementized = tokenizer.initSentenceSegmention(anotherText);
            textAnother.setSentenceSegments(anotherSentenceSegementized);
            prepareSentenceSegmentation(firstSentenceSegementized, anotherSentenceSegementized);

            //TOKENIZATION
            String[] firstTokenized = tokenizer.initTokenization(text);
            textFirst.setTokens(firstTokenized);
            String[] anotherTokenized = tokenizer.initTokenization(anotherText);
            textAnother.setTokens(anotherTokenized);
            prepareTokens(firstTokenized, anotherTokenized);

            //STOP WORD REMOVAL
            StopWords stopwords = new StopWords();
            String[] firstTokenizedWithoutStopWords = tokenizer.initTokenization(stopwords.processStopWordRemoval(textFirst.getTokens()));
            textFirst.setTokensWithoutStopWords(firstTokenizedWithoutStopWords);
            String[] anotherTokenizedWithoutStopWords = tokenizer.initTokenization(stopwords.processStopWordRemoval(textAnother.getTokens()));
            textAnother.setTokensWithoutStopWords(anotherTokenizedWithoutStopWords);
            prepareStopWords(firstTokenizedWithoutStopWords, anotherTokenizedWithoutStopWords);

            //NUMBER AND SPECIAL CHARACTER REPLACEMENT
            Replacement replaceNum = new Replacement();
            textFirst.setSentenceSegments_replaced(replaceNum.replace(textFirst.getSentenceSegments()));
            textAnother.setSentenceSegments_replaced(replaceNum.replace(textAnother.getSentenceSegments()));
            print_prepareReplacement(textFirst.getSentenceSegments_replaced(), textAnother.getSentenceSegments_replaced());

            txtLogs.append("***************** INITIALIZING NORMALIZATION *****************.\n");

            //WORD ALIGNMENT
            WordSequenceAligner werEval = new WordSequenceAligner();
            String[] ref = textFirst.getSentenceSegments_replaced();
            String[] hyp = textAnother.getSentenceSegments_replaced();
            Alignment a = werEval.align(ref, hyp);
            System.out.println(a);
            txt_TextAlignment.setText(a + "");
        }
    }//GEN-LAST:event_btnTestActionPerformed

    private void btnClearAnotherTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAnotherTextFieldActionPerformed
        txtAnotherText.setText("");
        txtLogs.append("Cleared Field.\n");
    }//GEN-LAST:event_btnClearAnotherTextFieldActionPerformed

    private void btnClearFirstTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFirstTextFieldActionPerformed
        txtFirstText.setText("");
        txtLogs.append("Cleared Field.\n");
    }//GEN-LAST:event_btnClearFirstTextFieldActionPerformed

    private void btnChooseFileAnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileAnotherActionPerformed
        Files files = new Files();
        String textFromAnotherFile = files.readFile(filechooser());
        txtAnotherText.setText(textFromAnotherFile);
        txtLogs.append("Successfully Read File.\n");
    }//GEN-LAST:event_btnChooseFileAnotherActionPerformed

    private void btnChooseFileFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileFirstActionPerformed
        Files files = new Files();
        String textFromFirstFile = files.readFile(filechooser());
        txtFirstText.setText(textFromFirstFile);
        txtLogs.append("Successfully Read File.\n");
    }//GEN-LAST:event_btnChooseFileFirstActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseFileAnother;
    private javax.swing.JButton btnChooseFileFirst;
    private javax.swing.JButton btnClearAnotherTextField;
    private javax.swing.JButton btnClearFirstTextField;
    private javax.swing.JButton btnTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel tab_Compare;
    private javax.swing.JPanel tab_NumberReplacement;
    private javax.swing.JPanel tab_PartOfSpeechTagging;
    private javax.swing.JTabbedPane tab_Preprocessing;
    private javax.swing.JPanel tab_SentenceSegment;
    private javax.swing.JTabbedPane tab_ShallowNLP;
    private javax.swing.JPanel tab_Stemming;
    private javax.swing.JPanel tab_StopwordRemoval;
    private javax.swing.JPanel tab_Tokenization;
    private javax.swing.JTextArea txtAnotherText;
    private javax.swing.JTextArea txtFirstText;
    private javax.swing.JTextArea txtLogs;
    private javax.swing.JTextArea txtPOSTagging1;
    private javax.swing.JTextArea txtPOSTagging2;
    private javax.swing.JTextArea txtPOSTagging3;
    private javax.swing.JTextArea txtPOSTagging4;
    private javax.swing.JTextArea txtReplacement1;
    private javax.swing.JTextArea txtReplacement2;
    private javax.swing.JLabel txtSentenceSegment_SegmentCount1;
    private javax.swing.JLabel txtSentenceSegment_SegmentCount2;
    private javax.swing.JLabel txtSentenceSegment_SegmentCount3;
    private javax.swing.JLabel txtSentenceSegment_SegmentCount4;
    private javax.swing.JLabel txtSentenceSegment_SegmentCount5;
    private javax.swing.JLabel txtSentenceSegment_SegmentCount6;
    private javax.swing.JTextArea txtSentenceSegmentation1;
    private javax.swing.JTextArea txtSentenceSegmentation2;
    private javax.swing.JTextArea txtStopWordRemoval1;
    private javax.swing.JTextArea txtStopWordRemoval2;
    private javax.swing.JLabel txtStopWordRemoval_TokenCount1;
    private javax.swing.JLabel txtStopWordRemoval_TokenCount2;
    private javax.swing.JTextArea txtTokenization1;
    private javax.swing.JTextArea txtTokenization2;
    private javax.swing.JLabel txtTokenization_TokenCount1;
    private javax.swing.JLabel txtTokenization_TokenCount2;
    private javax.swing.JTextArea txt_TextAlignment;
    // End of variables declaration//GEN-END:variables

    private String filechooser() {
        String path = "";
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            path = selectedFile.getAbsolutePath();
        }
        return path;
    }

    private void prepareSentenceSegmentation(String[] printThis, String[] printAnother) {
        txtSentenceSegmentation1.setText("");
        txtSentenceSegmentation2.setText("");

        for (int x = 0; x < printThis.length; x++) {
            txtSentenceSegmentation1.append("[" + x + "] " + printThis[x] + "\n\n");
        }
        txtSentenceSegment_SegmentCount1.setText("Number of Tokens: " + printThis.length);
        txtLogs.append("Successfull Sentence Segmentation for First Text\n");

        for (int x = 0; x < printAnother.length; x++) {
            txtSentenceSegmentation2.append("[" + x + "] " + printAnother[x] + "\n\n");
        }
        txtSentenceSegment_SegmentCount2.setText("Number of Tokens: " + printAnother.length);
        txtLogs.append("Successfull Sentence Segmentation for Another Text\n");

    }

    private void prepareTokens(String[] firstTokenized, String[] anotherTokenized) {
        txtTokenization1.setText("");
        txtTokenization2.setText("");

        for (int x = 0; x < firstTokenized.length; x++) {
            txtTokenization1.append("[" + x + "] " + firstTokenized[x] + "\n\n");
        }
        txtTokenization_TokenCount1.setText("Number of Tokens: " + firstTokenized.length);
        txtLogs.append("Successfull Tokenization for First Text\n");

        for (int x = 0; x < anotherTokenized.length; x++) {
            txtTokenization2.append("[" + x + "] " + anotherTokenized[x] + "\n\n");
        }
        txtTokenization_TokenCount2.setText("Number of Tokens: " + anotherTokenized.length);
        txtLogs.append("Successfull Tokenization for Another Text\n");
    }

    private void prepareStopWords(String[] firstTokenizedWithoutStopWords, String[] anotherTokenizedWithoutStopWords) {
        txtStopWordRemoval1.setText("");
        txtStopWordRemoval2.setText("");

        for (int x = 0; x < firstTokenizedWithoutStopWords.length; x++) {
            txtStopWordRemoval1.append("[" + x + "] " + firstTokenizedWithoutStopWords[x] + "\n\n");
        }
        txtStopWordRemoval_TokenCount1.setText("Number of Tokens: " + firstTokenizedWithoutStopWords.length);
        txtLogs.append("Successfull Stop Word Removal for First Text\n");

        for (int x = 0; x < anotherTokenizedWithoutStopWords.length; x++) {
            txtStopWordRemoval2.append("[" + x + "] " + anotherTokenizedWithoutStopWords[x] + "\n\n");
        }
        txtStopWordRemoval_TokenCount2.setText("Number of Tokens: " + anotherTokenizedWithoutStopWords.length);
        txtLogs.append("Successfull Stop Word Removal for Another Text\n");
    }

    private void print_prepareReplacement(String[] firstReplacement, String[] anotherReplacement) {
        txtReplacement1.setText("");
        txtReplacement2.setText("");

        for (int x = 0; x < firstReplacement.length; x++) {
            txtReplacement1.append("[" + x + "] " + firstReplacement[x] + "\n\n");
        }
        txtLogs.append("Successfull Number and Special Character Removal and Replacement for First Text\n");

        for (int x = 0; x < anotherReplacement.length; x++) {
            txtReplacement2.append("[" + x + "] " + anotherReplacement[x] + "\n\n");
        }

        txtLogs.append("Successfull Number and Special Character Removal and Replacement for Another Text\n");

    }
}
