namespace ATM
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            label2 = new Label();
            cmd_depostit = new Button();
            button2 = new Button();
            button3 = new Button();
            label3 = new Label();
            label4 = new Label();
            textBox1 = new TextBox();
            label5 = new Label();
            radioButton1 = new RadioButton();
            radioButton2 = new RadioButton();
            comboBox1 = new ComboBox();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(12, 9);
            label1.Name = "label1";
            label1.Size = new Size(143, 17);
            label1.TabIndex = 0;
            label1.Text = "Account Holders Name";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(15, 36);
            label2.Name = "label2";
            label2.Size = new Size(43, 17);
            label2.TabIndex = 4;
            label2.Text = "label2";
            // 
            // cmd_depostit
            // 
            cmd_depostit.Location = new Point(15, 498);
            cmd_depostit.Name = "cmd_depostit";
            cmd_depostit.Size = new Size(288, 40);
            cmd_depostit.TabIndex = 5;
            cmd_depostit.Text = "Deposit";
            cmd_depostit.UseVisualStyleBackColor = true;
            cmd_depostit.Click += button1_Click;
            // 
            // button2
            // 
            button2.Location = new Point(15, 544);
            button2.Name = "button2";
            button2.Size = new Size(288, 40);
            button2.TabIndex = 6;
            button2.Text = "Withdraw";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // button3
            // 
            button3.Location = new Point(15, 590);
            button3.Name = "button3";
            button3.Size = new Size(288, 40);
            button3.TabIndex = 7;
            button3.Text = "Statement";
            button3.UseVisualStyleBackColor = true;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(12, 95);
            label3.Name = "label3";
            label3.Size = new Size(43, 17);
            label3.TabIndex = 9;
            label3.Text = "label3";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(12, 65);
            label4.Name = "label4";
            label4.Size = new Size(52, 17);
            label4.TabIndex = 10;
            label4.Text = "Balance";
            // 
            // textBox1
            // 
            textBox1.Location = new Point(15, 435);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(288, 25);
            textBox1.TabIndex = 13;
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Location = new Point(18, 672);
            label5.Name = "label5";
            label5.Size = new Size(48, 17);
            label5.TabIndex = 14;
            label5.Text = "Output";
            // 
            // radioButton1
            // 
            radioButton1.AutoSize = true;
            radioButton1.Location = new Point(12, 133);
            radioButton1.Name = "radioButton1";
            radioButton1.Size = new Size(120, 21);
            radioButton1.TabIndex = 15;
            radioButton1.TabStop = true;
            radioButton1.Text = "Savings Account";
            radioButton1.UseVisualStyleBackColor = true;
            // 
            // radioButton2
            // 
            radioButton2.AutoSize = true;
            radioButton2.Location = new Point(11, 167);
            radioButton2.Name = "radioButton2";
            radioButton2.Size = new Size(121, 21);
            radioButton2.TabIndex = 16;
            radioButton2.TabStop = true;
            radioButton2.Text = "Deposit Account";
            radioButton2.UseVisualStyleBackColor = true;
            // 
            // comboBox1
            // 
            comboBox1.FormattingEnabled = true;
            comboBox1.Items.AddRange(new object[] { "Sofie", "Anne", "Ben", "Gewn" });
            comboBox1.Location = new Point(11, 207);
            comboBox1.Name = "comboBox1";
            comboBox1.Size = new Size(289, 25);
            comboBox1.TabIndex = 17;
            comboBox1.SelectedIndexChanged += comboBox1_SelectedIndexChanged;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 17F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(312, 708);
            Controls.Add(comboBox1);
            Controls.Add(radioButton2);
            Controls.Add(radioButton1);
            Controls.Add(label5);
            Controls.Add(textBox1);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(button3);
            Controls.Add(button2);
            Controls.Add(cmd_depostit);
            Controls.Add(label2);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private Button cmd_depostit;
        private Button button2;
        private Button button3;
        private Label label3;
        private Label label4;
        private TextBox textBox1;
        private Label label5;
        private RadioButton radioButton1;
        private RadioButton radioButton2;
        private ComboBox comboBox1;
    }
}
